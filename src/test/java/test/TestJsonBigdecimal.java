package test;


import com.alibaba.fastjson.JSON;
import com.winwin.picreport.Futils.hanhan.p;

public class TestJsonBigdecimal {
    public static void main(String[]args){
        String str="{\"bd\":\"123242\"}";
        D d = JSON.parseObject(str,D.class);
        p.p(d);
    }
}
