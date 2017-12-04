package com.winwin.picreport.Futils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ConstantInit {
    @Value("${dirUrl}")
    private  String dirUrl="";

    private static String dirUrl001="";
    @PostConstruct//这个注解是在当构造方法初始化的时候,spring顺便初始化的方法
    public void init(){
        this.dirUrl001=dirUrl;
    }

    public static String getDirUrl001() {
        return dirUrl001;
    }



    public String getDirUrl() {
        return dirUrl;
    }

    public ConstantInit setDirUrl(String dirUrl) {
        this.dirUrl = dirUrl;
        return this;
    }
}
