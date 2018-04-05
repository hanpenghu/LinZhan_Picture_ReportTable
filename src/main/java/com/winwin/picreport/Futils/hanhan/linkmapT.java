package com.winwin.picreport.Futils.hanhan;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkmapT<T1,T2> {



    private Map<T1,T2> m=null;
    //构造函数
    public linkmapT(){
        m=new LinkedHashMap<T1, T2>();
    }



    //添加者

    public linkmapT a(T1 k,  T2 v){
        m.put(k,v);
        return this;
    }

    //收获者
    public Map<T1,T2> g(){
        return m;
    }




}
