package com.winwin.picreport.Bcontroller.jsAPI_ticket;


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

//有效期jsapi_ticket  7200秒  2小时
@Order(2)
@Component
public class JsTicket {
private  org.apache.log4j.Logger l = org.apache.log4j.LogManager.getLogger(this.getClass().getName());

@Autowired
private Cnst cnst;

    public String jsApiticket="";

    @Scheduled(fixedDelay = 7100*1000,initialDelay = 7100*1000)//2小时一次,为了安全,提前100秒
    public String get() throws IOException {

        //创建文件,将来把accessToken放进来
        File file = new File(C.jsApiTicketTxt);

        if (file.exists()) {
            p.p(C.jsApiTicketTxt+"存储器存在");
        } else {
            file.createNewFile();
        }

        //得到已经存储的Accesstoken
        String accessToken = p.readAllTxt(C.accessTokenTxt);




        //拼接获取微信jsTicket的url
        String  url= stra.b().a(cnst.c.jsapi_ticketUrl)
                .a(p.eeh).a("access_token=")
                .a(accessToken).a(p.qdz).a("type=jsapi").g();




        CloseableHttpClient httpCilent2 = HttpClients.createDefault();
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(5000)   //设置连接超时时间
                .setConnectionRequestTimeout(5000) // 设置请求超时时间
                .setSocketTimeout(5000)
                .setRedirectsEnabled(true)//默认允许自动重定向
                .build();

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
                this.jsApiticket = jb.getString("ticket");

                p.writeToTxt(p.strNullToSpace(jsApiticket),C.jsApiTicketTxt);

            }else if(httpResponse.getStatusLine().getStatusCode() == 400){
                //..........
            }else if(httpResponse.getStatusLine().getStatusCode() == 500){
                //.............
            }
        } catch (IOException e) {
            e.printStackTrace();
            l.error(e.getMessage(),e);
        }finally {
            try {
                httpCilent2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }





        return this.jsApiticket;




    }




    public static void main(String[]args) throws IOException {
        new JsTicket().get();
    }







}
