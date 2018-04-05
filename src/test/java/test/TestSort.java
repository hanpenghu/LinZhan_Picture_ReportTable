package test;

import com.winwin.picreport.Futils.hanhan.p;

import java.util.Collections;
import java.util.List;

public class TestSort {
    public static void main(String[]args){

        List<String> arl = p.gp().setArl("111").setArl("12345678").setArl("2222").setArl("4444").setArl("3333").getArl();
        Collections.sort(arl,(v1, v2)->{
            long long1 = new Long(v1);
            long long2 = new Long(v2);
            if(long1<long2){
                return 1;
            } else if(long1==long2){
                return 0;
            }else{return -1;}

        });
        p.p(arl);
    }
}
