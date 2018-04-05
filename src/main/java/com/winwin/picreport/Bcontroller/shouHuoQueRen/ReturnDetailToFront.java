package com.winwin.picreport.Bcontroller.shouHuoQueRen;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Bcontroller.I;
import com.winwin.picreport.Edto.Data;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.hanhan.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;


/**
 *这个类里的接口主要是返回单号的详情给前端
 * */
@CrossOrigin
@RestController
public class ReturnDetailToFront {


    @Autowired
   private Cnst cnst;

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

     参数

     ["单号"]

但是我只接收一个单号
     集合长度1

     这个接口是在对方扫描完二维码后得到单号后就调取的
     调取的结果是我返回给前端详细信息


     得到详细信息之后

     前端将再调取一次接口  receiveConfirm 将图片和单号穿过来,我将图片保存在本地文件夹,将图片路径保存在
     数据库对应字段


     * */

    @RequestMapping(value= I.returnMsg,method= RequestMethod.POST)
    public @ResponseBody Msg f(@RequestBody List<String> nos){
        try {

            if(p.empty(nos)){
                p.throwE("前端传过来的《单号》数组是空的"+p.knownExceptionSign);
            }

            //得到当前单号
            String s = nos.get(0);
            List<Detail>details=cnst.a001TongYongMapper.getShouHuoMingXiOfYunRui(s);

            Data data=new Data();
            data.setList(details);

            return Msg.gmg().setMsg("成功"+p.noExceptionSign).setStatus(p.s1).setData(data);
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


/**
 返回结果

 {
 "data": {
 "list": [
 {
 "icNo": "IO011801010001",
 "cusNo2": "130-1001-27",
 "name": "京客隆华威",
 "prdName": "云蕾铝箔保鲜纸盒装装30*5米",
 "qty": "15.000"
 },
 {
 "icNo": "IO011801010001",
 "cusNo2": "130-1001-27",
 "name": "京客隆华威",
 "prdName": "云蕾一次性台布1.8*1.8",
 "qty": "10.000"
 },
 {
 "icNo": "IO011801010001",
 "cusNo2": "130-1001-27",
 "name": "京客隆华威",
 "prdName": "云蕾氯丁双色手套",
 "qty": "10.000"
 },
 {
 "icNo": "IO011801010001",
 "cusNo2": "130-1001-27",
 "name": "京客隆华威",
 "prdName": "云蕾加长加厚型橡胶手套中号",
 "qty": "10.000"
 },
 {
 "icNo": "IO011801010001",
 "cusNo2": "130-1001-27",
 "name": "京客隆华威",
 "prdName": "云蕾超薄乳胶手套(6只装)",
 "qty": "10.000"
 },
 {
 "icNo": "IO011801010001",
 "cusNo2": "130-1001-27",
 "name": "京客隆华威",
 "prdName": "云蕾韩式手套(中号)",
 "qty": "10.000"
 },
 {
 "icNo": "IO011801010001",
 "cusNo2": "130-1001-27",
 "name": "京客隆华威",
 "prdName": "云蕾中砂两用搓澡手套",
 "qty": "10.000"
 },
 {
 "icNo": "IO011801010001",
 "cusNo2": "130-1001-27",
 "name": "京客隆华威",
 "prdName": "云蕾泡泡爽高级浴帽",
 "qty": "10.000"
 },
 {
 "icNo": "IO011801010001",
 "cusNo2": "130-1001-27",
 "name": "京客隆华威",
 "prdName": "云蕾高级沐浴条",
 "qty": "10.000"
 },
 {
 "icNo": "IO011801010001",
 "cusNo2": "130-1001-27",
 "name": "京客隆华威",
 "prdName": "云蕾金属钢丝球2个装送菜瓜布",
 "qty": "10.000"
 },
 {
 "icNo": "IO011801010001",
 "cusNo2": "130-1001-27",
 "name": "京客隆华威",
 "prdName": "云蕾金属钢丝球4个装",
 "qty": "20.000"
 },
 {
 "icNo": "IO011801010001",
 "cusNo2": "130-1001-27",
 "name": "京客隆华威",
 "prdName": "云蕾神奇抹布23*26",
 "qty": "20.000"
 }
 ]
 },
 "status": "1",
 "xiaoHaoShiJian": "",
 "msg": "成功《没有异常》",




 "chMsg": "",
 "otherMsg": "",
 "token": "",
 "tenantId": "",
 "tenantName": "",
 "userEmail": "",
 "auth": {
 "logistics": {
 "salesorder": {
 "page": "F"
 },
 "salesorderForSAP": {
 "page": "F"
 },
 "salesDetail": {
 "page": "F"
 },
 "productCode": {
 "page": "F"
 },
 "purchasePricing": {
 "page": "F"
 },
 "salesPricing": {
 "page": "F",
 "part": {
 "purchasePrice": "F",
 "salesPrice": "F"
 }
 },
 "sampleConfirm": {
 "page": "F"
 }
 }
 }
 }
 * */