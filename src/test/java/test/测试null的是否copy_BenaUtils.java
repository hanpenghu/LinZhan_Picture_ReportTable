package test;

import com.winwin.picreport.Futils.hanhan.p;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;

public class 测试null的是否copy_BenaUtils {
    class A{
        public String str1;
        public String str2;
    }

    @Test
    public void f(){
        A aa=new A();
        aa.str1=null;
        aa.str2="str2";
        A ab=new A();
        ab.str1="str11";
        ab.str2="str22";
        BeanUtils.copyProperties(ab,aa);
        p.p(aa.str1);//NULL
        p.p(aa.str2);//str2


    }



}
