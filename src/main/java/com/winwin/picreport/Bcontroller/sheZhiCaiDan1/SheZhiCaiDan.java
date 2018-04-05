package com.winwin.picreport.Bcontroller.sheZhiCaiDan1;

import com.winwin.picreport.AllConstant.C;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Futils.hanhan.p;
import com.winwin.picreport.Futils.hanhan.stra;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Properties;


@Component
public class SheZhiCaiDan {
private  org.apache.log4j.Logger l = org.apache.log4j.LogManager.getLogger(this.getClass().getName());

    @Autowired
    private Cnst cnst;

//    https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN
    private String url1="https://api.weixin.qq.com/cgi-bin/menu/create";

    private String url= stra.b().a(url1).a(p.eeh).a("access_token=").a(p.readAllTxt(C.accessTokenTxt)).g();

    private String json="";

//    public static void main(String[]args){
//       new SheZhiCaiDan().f();
//    }

//    @Scheduled(initialDelay = 5*1000,fixedDelay = 1000*100)
    public  void  f() throws IOException {

        try {
            //这种读法,必须打包后才生效
            json=p.readAllTxt(C.menu);
            json=json.replace("\"url\": \"\"","\"url\": \""+cnst.c.urlWhoShare+"\"");
            p.p("----------读取json文件后得到的json---------------------------------------------");
            p.p(json);
            p.p("-------------------------------------------------------");
            if(p.empty(json))json="{\"button\":[{\"name\":\"菜单\",\"type\":\"view\",\"name\":\"确认收货\",\"url\":\""+cnst.c.urlWhoShare+"\"}]}";
        } catch (Exception e) {
            json="{\"button\":[{\"name\":\"菜单\",\"type\":\"view\",\"name\":\"确认收货\",\"url\":\""+cnst.c.urlWhoShare+"\"}]}";


        }

        p.p("-------------------------最后得到的json------------------------------");
        p.p(json);
        p.p("-------------------------------------------------------");
        //删除原来菜单
        new DeleteCaiDan().f();


        //下面是设置新的菜单
        //获取可关闭的 httpCilent

        CloseableHttpClient httpClient = HttpClients.createDefault();

        //配置超时时间

        RequestConfig requestConfig = RequestConfig.custom().

                setConnectTimeout(1000).setConnectionRequestTimeout(1000)

                .setSocketTimeout(1000).setRedirectsEnabled(true).build();


        p.p("----------------------url---------------------------------");
        p.p(url);
        p.p("-------------------------------------------------------");
        HttpPost httpPost = new HttpPost(url);

        //设置超时时间

        httpPost.setConfig(requestConfig);

        httpPost.addHeader("Content-type","application/json; charset=utf-8");

        httpPost.setHeader("Accept", "application/json");

        //装配post请求参数



        try {



//            Stringparameters="{\"dingDanHao\":\"PO79070001\"}";

            //设置post求情参数

            httpPost.setEntity(new StringEntity(json, Charset.forName("UTF-8")));

            HttpResponse httpResponse = httpClient.execute(httpPost);

            String strResult = "";

            if(httpResponse != null){

                System.out.println(httpResponse.getStatusLine().getStatusCode());

                if (httpResponse.getStatusLine().getStatusCode() == 200) {

                    strResult = EntityUtils.toString(httpResponse.getEntity());

                } else if (httpResponse.getStatusLine().getStatusCode()== 400) {

                    strResult = "ErrorResponse: " +httpResponse.getStatusLine().toString();

                } else if (httpResponse.getStatusLine().getStatusCode()== 500) {

                    strResult = "ErrorResponse: " +httpResponse.getStatusLine().toString();

                } else {

                    strResult = "ErrorResponse: " +httpResponse.getStatusLine().toString();

                }

            }else{



            }

            p.p("-------------------------------------------------------");
            p.p(strResult);
            p.p("-------------------------------------------------------");

        } catch (Exception e) {

            e.printStackTrace();
            l.error(e.getMessage(),e);
            p.throwE("http请求异常设置菜单异常");

        }finally {

            try {

                if(httpClient != null){

                    httpClient.close(); //释放资源

                }

            } catch (IOException e) {

                e.printStackTrace();

            }

        }





    }













}
