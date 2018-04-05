package com.winwin.picreport.Bcontroller.access_token;

import com.alibaba.fastjson.JSONObject;
import com.winwin.picreport.AllConstant.C;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Futils.hanhan.p;
import com.winwin.picreport.Futils.hanhan.stra;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

/**
 *所有接口的调用需要先获取access_token，access_token在2小时内有效，
 过期需要重新获取，但1天内获取次数有限，开发者需自行存储
 * */


@Order(1)
@Component
public class Access_token {
private  org.apache.log4j.Logger l = org.apache.log4j.LogManager.getLogger(this.getClass().getName());

@Autowired
private Cnst cnst;

public String accessToken="";



//延迟2小时再加载,服务器启动需要手动在index.html进行各种生成,其他的
    @Scheduled(fixedDelay = 7100*1000,initialDelay = 7100*1000)//2小时一次,为了安全,提前100秒
    public  String get() throws IOException {

        //创建文件,将来把accessToken放进来
        File file = new File(C.accessTokenTxt);

            if (file.exists()) {
                p.p(C.accessTokenTxt+"存储器存在");
            } else {
                file.createNewFile();
            }



        CloseableHttpClient httpCilent2 = HttpClients.createDefault();
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(5000)   //设置连接超时时间
                .setConnectionRequestTimeout(5000) // 设置请求超时时间
                .setSocketTimeout(5000)
                .setRedirectsEnabled(true)//默认允许自动重定向
                .build();
        String url= stra.b().a(cnst.c.accessTokenGetUrl)
                .a(p.eeh).a("grant_type=").a(cnst.c.grant_type)
                .a(p.qdz).a("appid=").a(cnst.c.AppID)
                .a(p.qdz).a("secret=").a(cnst.c.AppSecret).g();
        p.p("-------------------------------------------------------");
        p.p(url);
        p.p("-------------------------------------------------------");
        HttpGet httpGet2 = new HttpGet(url);
        httpGet2.setConfig(requestConfig);

        String srtResult = "";
        try {
            HttpResponse httpResponse = httpCilent2.execute(httpGet2);
            if(httpResponse.getStatusLine().getStatusCode() == 200){
                srtResult = EntityUtils.toString(httpResponse.getEntity());//获得返回的结果
                p.p("-------------------------------------------------------");
                p.p(srtResult);
                p.p("-------------------------------------------------------");
                JSONObject jb = JSONObject.parseObject(srtResult);
                this.accessToken = jb.getString("access_token");

                p.writeToTxt(p.strNullToSpace(accessToken),C.accessTokenTxt);

            }else if(httpResponse.getStatusLine().getStatusCode() == 400){
                //..........
            }else if(httpResponse.getStatusLine().getStatusCode() == 500){
                //.............
            }
        } catch (IOException e) {
            e.printStackTrace();
            l.error(e.getMessage(),e);
            p.throwE("http请求accessToken异常");
        }finally {
            try {
                httpCilent2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




        return this.accessToken;
    }



    public static void main(String[]args) throws IOException {
            new Access_token().get();
    }


}
