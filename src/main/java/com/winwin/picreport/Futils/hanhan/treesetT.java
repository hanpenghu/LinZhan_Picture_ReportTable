package com.winwin.picreport.Futils.hanhan;

import java.util.Set;
import java.util.TreeSet;

public class treesetT<T> {


    private Set<T> s=null;

    public treesetT(){
        s=new TreeSet<T>();
    }


    public treesetT<T> a(T o) {
        s.add(o);
        return this;
    }

    public Set<T> g(){
        return s;
    }


}
