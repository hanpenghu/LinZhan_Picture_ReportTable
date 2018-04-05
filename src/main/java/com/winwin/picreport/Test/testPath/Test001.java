package com.winwin.picreport.Test.testPath;

import com.winwin.picreport.Futils.hanhan.p;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;


//@Component
public class Test001 {


    /**
     *经试验,springboot  jar路径这样是不行的
     * 因为 这样读不到打包后的jar内部文件
     * 可能是因为打包对路径做了手脚
     * 我们要想读静态资源,最好的办法是把静态资源放到跟jar同级的目录,直接
     * 用p.duQu就行了
     * */
//    @Scheduled(fixedDelay = 2*1000,initialDelay = 4*1000)
    public  void f() throws IOException {
//        String pa = p.readAllTxt("新建文本文档.bat");
//
//
//        p.p("-------------------------------------------------------");
//
//
////        p.p(p.readAllTxt(new File(pa)));
//        p.p("-------------------------------------------------------");

    }


    public static void main(String[]args) throws IOException {
        //这样读不到资源
        Test001 test001 = new Test001();
        test001.f();
    }

}
