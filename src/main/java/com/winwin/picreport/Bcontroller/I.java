package com.winwin.picreport.Bcontroller;

public interface I {


    //微信页面跳转所需验证接口,主要是验证跳转后的url
    String signToJs="signToJs";

    //下面2个都是收获确认的接口,第一个是返回信息给前端单号对应的详情,第二个是保存对应的图片
    //微信跳转页面后,  前端传过来单号,我传过去的单号详情
    String returnMsg="returnMsg";
    //收获确认主接口//post 返回json
    String saveImg="saveImg";
}
