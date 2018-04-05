package com.winwin.picreport.Bcontroller.sheZhiCaiDan1;


import com.alibaba.fastjson.JSONObject;
import com.winwin.picreport.AllConstant.C;
import com.winwin.picreport.Futils.hanhan.p;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class DeleteCaiDan {
private  org.apache.log4j.Logger l = org.apache.log4j.LogManager.getLogger(this.getClass().getName());
    //https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=ACCESS_TOKEN
    private   String url1=C.deleteMenu+ p.readAllTxt(C.accessTokenTxt);

    public  void f(){



        CloseableHttpClient httpCilent2 = HttpClients.createDefault();
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(5000)   //设置连接超时时间
                .setConnectionRequestTimeout(5000) // 设置请求超时时间
                .setSocketTimeout(5000)
                .setRedirectsEnabled(true)//默认允许自动重定向
                .build();



        HttpGet httpGet2 = new HttpGet(url1);
        httpGet2.setConfig(requestConfig);

        String srtResult = "";
        try {
            HttpResponse httpResponse = httpCilent2.execute(httpGet2);
            if(httpResponse.getStatusLine().getStatusCode() == 200){
                srtResult = EntityUtils.toString(httpResponse.getEntity());//获得返回的结果
                p.p("-------------------------------------------------------");
                p.p(srtResult);
                p.p("-------------------------------------------------------");
            }else if(httpResponse.getStatusLine().getStatusCode() == 400){
                //..........
            }else if(httpResponse.getStatusLine().getStatusCode() == 500){
                //.............
            }
        } catch (IOException e) {
            e.printStackTrace();
            l.error(e.getMessage(),e);
            p.throwE("删除菜单异常");
        }finally {
            try {
                httpCilent2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }








    }





}
