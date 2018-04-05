package com.winwin.picreport.Edto;

import java.util.LinkedList;
import java.util.List;

public class Data {



    private List list=new LinkedList();

    public List getList() {
        return list;
    }

    public Data setList(List list) {
        this.list = list;
        return this;
    }

    /*private List<String> unitList;
    public static Data gD(){
        return new Data();
    }
    private List<CurrentType> currentTypeList=new ArrayList<>();
    private List<Object>objs=new ArrayList<>();

    public List<CurrentType> getCurrentTypeList() {
        return currentTypeList;
    }

    public Data setCurrentTypeList(List<CurrentType> currentTypeList) {
        this.currentTypeList = currentTypeList;
        return this;
    }

    public List<String> getUnitList() {
        return unitList;
    }

    public Data setUnitList(List<String> unitList) {
        this.unitList = unitList;
        return this;
    }

    public List<Object> getObjs() {
        return objs;
    }

    public Data setObjs(List<Object> objs) {
        this.objs = objs;
        return this;
    }*/
}
