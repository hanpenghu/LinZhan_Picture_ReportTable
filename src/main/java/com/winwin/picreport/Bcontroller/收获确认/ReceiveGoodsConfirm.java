package com.winwin.picreport.Bcontroller.收获确认;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.hanhan.p;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ReceiveGoodsConfirm {


    /**
     逻辑:
     1）	扫描单号二维码
     select ic_no,* from mf_ic where ic_no='IO011801010001'
     2）带出收货客户/人名称，cus_no2要从cust.cus_no里转化为客户名称cust.name
     select ic_no,cus_no2,* from mf_ic where ic_no='IO011801010001'
     3）带出发货明细
     select prd_name,qty  from tf_ic where ic_no='IO011801010001'
     4）图片回传到服务器指定文件夹,图片尽量按照这样命名: 单号.jpeg
     网址存进 select ic_no,shqrpz,* from mf_ic_z where ic_no='IO011801010001'

     * */

    @RequestMapping(value="receiveConfirm",method= RequestMethod.POST)
    public @ResponseBody Msg f(@RequestBody List<String> nos){
        try {

            if(p.empty(nos)){
                p.throwE("前端传过来的《单号》数组是空的"+p.knownExceptionSign);
            }

            for(int i=0;i<nos.size();i++){

            }










            return Msg.gmg().setMsg("成功"+p.noExceptionSign).setStatus(p.s1);
        } catch (Exception e) {
            String sss=e.getMessage();
            if(sss.contains(p.knownExceptionSign)){
                return Msg.gmg().setMsg(sss.replace(p.knownExceptionSign,p.space)).setStatus(p.s0).setData(null);
            }else{
                return Msg.gmg().setMsg(p.unKnownExceptionSign).setStatus(p.s0).setData(null);
            }
        }finally{}
    }



}
