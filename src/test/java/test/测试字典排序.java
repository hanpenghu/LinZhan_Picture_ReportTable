package test;

import com.winwin.picreport.Futils.hanhan.arraylist;
import com.winwin.picreport.Futils.hanhan.arraylistT;
import com.winwin.picreport.Futils.hanhan.p;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class 测试字典排序 {



    //需要 Apache Commons Codec工具
    public static void main(String [] args){
/*
* 规则描述
*1. 将token、timestamp、nonce三个参数进行字典序排序
*2. 将三个参数字符串拼接成一个字符串进行sha1加密
*3. 开发者获得加密后的字符串可与signature对比，标识该请求来源于微信
*/

        String signature="0f829ac4e6689efbd338abda4c090f90bab60725";
        String timestamp="1455868453";
        String nonce="1677866950";
        String token="weixin";


        String s = p.ziDianPaiXuBingPinJie(new arraylistT<String>().a(nonce).a(timestamp).a(token).g());
        String signature2= DigestUtils.shaHex(s);



        System.out.println(signature2);
    }









}
