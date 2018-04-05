package test;

import com.winwin.picreport.Futils.hanhan.p;

public class 试验时间戳 {

    public static void main(String[]args){
        p.p("-------------------------------------------------------");
        p.p(Long.toString(System.currentTimeMillis() / 1000));
        p.p("-------------------------------------------------------");

        p.p("-------------------------------------------------------");
        p.p(p.getTimeStamp()/1000);
        p.p("-------------------------------------------------------");
    }
}
