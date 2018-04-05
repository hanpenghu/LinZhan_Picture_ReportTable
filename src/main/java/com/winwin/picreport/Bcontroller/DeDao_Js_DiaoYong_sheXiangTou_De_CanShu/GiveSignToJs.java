package com.winwin.picreport.Bcontroller.DeDao_Js_DiaoYong_sheXiangTou_De_CanShu;


import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Bcontroller.I;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class GiveSignToJs {

    @Autowired
   private Cnst cnst;

    /**
     *传参
     * {"url":""}
     *
     * 注意,徐勇说要用这个参数,实际上我并没有用,因为我感觉不用也可以,用写死的对应
     * 后代部署的那个js域名就行了,如果不行,到时候我再用这个url
     * */
    @RequestMapping(value= I.signToJs,method= RequestMethod.POST)
    public @ResponseBody JsParams f(@RequestBody Url url){
        return  cnst.signParamGet.f(url);
    }




}
