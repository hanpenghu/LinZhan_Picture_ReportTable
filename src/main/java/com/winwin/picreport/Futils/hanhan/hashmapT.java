package com.winwin.picreport.Futils.hanhan;

import java.util.HashMap;
import java.util.Map;

public class hashmapT<T1,T2> {
    private Map<T1,T2> m=null;
    //构造函数
    public hashmapT(){
        m=new HashMap<T1, T2>();
    }


    //添加者

    public hashmapT a(T1 k, T2 v){
        m.put(k,v);
        return this;
    }

    //收获者
    public Map<T1,T2> g(){
        return m;
    }



}
