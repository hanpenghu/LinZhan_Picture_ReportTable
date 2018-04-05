package com.winwin.picreport.Bcontroller.用接口实现微信的各种创建的调用;


import com.winwin.picreport.AllConstant.C;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Futils.hanhan.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class Test生成菜单按钮 {

    @Autowired
    private Cnst cnst;


    @RequestMapping(value="gMenu",method= RequestMethod.POST)
    public String  f(){
        p.p("-------------------------------------------------------");
        p.p("gMenu生成菜单开始");
        p.p("-------------------------------------------------------");
        try {
           cnst.sheZhiCaiDan.f();
            return "生成菜单成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "生成菜单失败"+e.getMessage();
        }


    }





}
