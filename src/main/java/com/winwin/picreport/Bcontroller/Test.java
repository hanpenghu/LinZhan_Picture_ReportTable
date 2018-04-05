package com.winwin.picreport.Bcontroller;


import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Futils.hanhan.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class Test {

@Autowired
private Cnst cnst;


    @RequestMapping(value="t",method = RequestMethod.GET)
    public String f(){
//        List<String> strings = cnst.a001TongYongMapper.selectTenantName("ipace");

//        p.p(strings);

        return "好了";
    }




}
