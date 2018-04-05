package com.winwin.picreport.Futils.hanhan;

import java.util.LinkedList;
import java.util.List;

public class linklistT<T> {

    private List<T> list=null;

    public linklistT(){
        list=new LinkedList<T>();
        //构造函数里初始化list
    }



    //持续加入数据的方法//add的意思
    public linklistT a(T o){
        list.add(o);
        return this;
    }

    //加入数据,最后一步调这个方法得到我们想要的加满数据的LinkedList
    //get的意思
    public List<T> g(){
        return list;
    }


}
