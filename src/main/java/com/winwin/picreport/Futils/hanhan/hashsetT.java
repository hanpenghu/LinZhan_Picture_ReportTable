package com.winwin.picreport.Futils.hanhan;

import java.util.HashSet;
import java.util.Set;

public class hashsetT<T> {


    private Set<T> s=null;

    public hashsetT(){
        s=new HashSet<T>();
    }



    public hashsetT a(T o) {
        s.add(o);
        return this;
    }

    public Set<T> g(){
        return s;
    }




}
