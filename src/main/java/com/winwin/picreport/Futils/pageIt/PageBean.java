//package com.winwin.picreport.Futils.pageIt;
//
//
///**
// * 分页bean
// */
//import com.winwin.picreport.Edto.PrdtSamp;
//import com.winwin.picreport.Edto.PrdtSamp1;
//
//import java.util.ArrayList;
//import java.util.List;
//public class PageBean<T> {
//    // 当前页
//    private Integer dangQianYe = 1;
//    // 每页显示的总条数
//    private Integer meiYeXianShiShu = 10;
//    // 总条数
//    private Integer zongJiLuShu;
//    // 总页数
//    private Integer zongYeShu;
//    // 是否有下一页
//    private Integer isMore;
//    // 开始索引的地方//指的是当前页开始索引的数据库ORDER by以后的地方
//    private Integer startIndex;//从0开始
//    // 分页结果
//    private List<T> items=new ArrayList<>();
//    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    //下面2个分页结果是因为要兼容原来的程序才这样写的,其实可以直接用上面的那个items完全代替
//    private List<PrdtSamp> prdtSampList=new ArrayList<>();//第一次需要传入的数据
//    private PrdtSamp1 prdtSamp1;
//    //上面2个分页结果是因为要兼容原来的程序才这样写的,其实可以直接用上面的那个items完全代替
//    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    public PageBean() {
//        super();
//    }
//
//    public PageBean(Integer dangQianYe, Integer meiYeXianShiShu, Integer zongJiLuShu) {
//        super();
//        this.dangQianYe = dangQianYe;
//        this.meiYeXianShiShu = meiYeXianShiShu;
//        this.zongJiLuShu = zongJiLuShu;
//        this.zongYeShu = (this.zongJiLuShu+this.meiYeXianShiShu-1)/this.meiYeXianShiShu;
//        this.startIndex = (this.dangQianYe-1)*this.meiYeXianShiShu;
//        this.isMore = ((this.dangQianYe >= this.zongYeShu)?0:1);
//    }
//
//    public Integer getCurrentPage() {
//        return dangQianYe;
//    }
//
//    public void setCurrentPage(Integer currentPage) {
//        this.dangQianYe = currentPage;
//    }
//
//    public Integer getPageSize() {
//        return meiYeXianShiShu;
//    }
//
//    public void setPageSize(Integer pageSize) {
//        this.meiYeXianShiShu = pageSize;
//    }
//
//    public Integer getTotalNum() {
//        return zongJiLuShu;
//    }
//
//    public void setTotalNum(Integer totalNum) {
//        this.zongJiLuShu = totalNum;
//    }
//
//    public Integer getIsMore() {
//        return isMore;
//    }
//
//    public void setIsMore(Integer isMore) {
//        this.isMore = isMore;
//    }
//
//    public Integer getTotalPage() {
//        return zongYeShu;
//    }
//
//    public void setTotalPage(Integer totalPage) {
//        this.zongYeShu = totalPage;
//    }
//
//    public Integer getStartIndex() {
//        return startIndex;
//    }
//
//    public void setStartIndex(Integer startIndex) {
//        this.startIndex = startIndex;
//    }
//
//    public List<T> getItems() {
//        return items;
//    }
//
//    public void setItems(List<T> items) {
//        this.items = items;
//    }
//
//    public List<PrdtSamp> getPrdtSampList() {
//        return prdtSampList;
//    }
//
//    public PageBean setPrdtSampList(List<PrdtSamp> prdtSampList) {
//        this.prdtSampList = prdtSampList;
//        return this;
//    }
//
//    public PrdtSamp1 getPrdtSamp1() {
//        return prdtSamp1;
//    }
//
//    public PageBean setPrdtSamp1(PrdtSamp1 prdtSamp1) {
//        this.prdtSamp1 = prdtSamp1;
//        return this;
//    }
//}