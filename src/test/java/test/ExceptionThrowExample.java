/*
package com.winwin.picreport.test;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
@CrossOrigin
@Controller
public class ExceptionThrowExample {
    @RequestMapping(value="XXX",method= RequestMethod.POST,produces = {"application/json;charset=utf-8"})
    public @ResponseBody Msg f(@RequestBody Map<String,String> map){
        List<String> list= Arrays.asList("exception1","exception2");//统计所有已知异常的list
        Msg msg=new Msg();
        try {
            //这里写调用service层的代码
            //service层每次遇到已知的错误信息,经过判断后
            //再 throw new RuntimeException("exception1");
        } catch (Exception e) {
            //service层抛出的代码来到这里,如果异常在list中,
            // 就抛出这个异常,如果不在,就抛出未知异常
            if(list.contains(e.getMessage())){
                //此时异常是来自已知的自己抛出的异常
                msg.setMsg(e.getMessage());
            }else{
                //此时异常不是自己统计的那些
                msg.setMsg("失败！未知异常！");
            }
        }
        return msg;
    }
}


*/
