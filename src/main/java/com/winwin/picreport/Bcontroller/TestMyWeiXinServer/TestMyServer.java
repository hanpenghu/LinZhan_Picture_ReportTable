package com.winwin.picreport.Bcontroller.TestMyWeiXinServer;


import com.alibaba.fastjson.JSON;
import com.winwin.picreport.AllConstant.C;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Futils.hanhan.linklistT;
import com.winwin.picreport.Futils.hanhan.p;
import com.winwin.picreport.Futils.hanhan.pp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class TestMyServer {

    @Autowired
    private Cnst cnst;
    //token  hanpenghulimengruhanjiacheng123
    //外网url  http://hanpenghu123.picp.io/
    //EncodingAESKey  hanpenghulimengruhanjiacheng123hanpenghu123
    //value为空就是为了直接访问域名就访问到这里
    @RequestMapping(value="",method= RequestMethod.GET )
    public String  f(WeiXinTestInfo wi){


        p.p("---------------------微信服务器和我们服务器连接----------------------------------");
        p.p(JSON.toJSONString(wi));
        p.p("-------------------------------------------------------");

        /**
         *下面代码是注册一个服务器的有效性的时候用的
         * */
        try {

            String token = cnst.c.token;
            String timestamp = wi.getTimestamp();
            String nonce = wi.getNonce();
            String echostr = wi.getEchostr();
            String signature = wi.getSignature();

            p.p(signature);

            List list = new linklistT<String>()
                    .a(token).a(timestamp).a(nonce).g();

            String s = p.ziDianPaiXuBingPinJie(list);

            String signatureMyself= pp.sha1(s);


            if(p.dy(signatureMyself,signature)){
                return echostr;//此时返回给微信一个信号
            }else{
                return "";//返回错误信号给微信
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "";//返回错误信号给微信
        }

//        return "";
    }



}
