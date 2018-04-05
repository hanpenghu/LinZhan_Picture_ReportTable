package com.winwin.picreport.Bcontroller.用接口实现微信的各种创建的调用;


import com.winwin.picreport.AllConstant.C;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Futils.hanhan.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;

@RestController
@CrossOrigin
public class Test生成JS票据 {

    @Autowired
    private Cnst cnst;

    @RequestMapping(value="gJsTicket",method= RequestMethod.POST)
    public String  f(){

        try {
            //创建文件,将来把accessToken放进来
            File file = new File(C.accessTokenTxt);

            if (file.exists()) {
                p.p(C.accessTokenTxt+"存储器存在");
            } else {
                file.createNewFile();
            }
            String s = cnst.jsTicket.get();
            p.p("-----------------jsticket--------------------------------------");
            p.p(s);
            p.p("-------------------------------------------------------");
            return "生成jsTicket成功";
        } catch (IOException e) {
            e.printStackTrace();
            return "生成jsTicket失败"+e.getMessage();
        }


    }


}
