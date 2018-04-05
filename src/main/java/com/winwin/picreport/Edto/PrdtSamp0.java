package com.winwin.picreport.Edto;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.AllConstant.Constant.ConstantInit;
//import com.winwin.picreport.Bcontroller.daYang.dto.AlterPriceRecToFront;
import com.winwin.picreport.Futils.hanhan.p;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

//PrdtSamp是原汁原味的自动生成的,  PrdtSamp0是添加的功能
public class PrdtSamp0 extends PrdtSamp {
    private String usr;//登录的会员名不再用了,因为我在PrdtSamp里已经有了UserName(用户名)和tenantId了
    //价格列表,采购和销售合并//其实后来弄成单独销售的了
    private List<UpDefMy01>upDefMyList=new ArrayList<>();

    //价格列表,单独采购的
    private List<UpDefMy01>upDefMyListBuy=new ArrayList<>();
 /////////////////////////////////////////////////////////////////////////////////
    //销售价格修改模块
// List<AlterPriceRecToFront>saleAlterRecList=new ArrayList();

    //采购价格修改模块
//    private List<AlterPriceRecToFront>buyAlterRecList=new ArrayList();
///////////////////////////////////////////////////////////////////////////////////////
    protected String sampMakeStamp;//打样时间戳//传给我这个
    protected String sampSendStamp;//样品寄出时间戳//传给我这个

    //这个是转后的时间String格式,专门给徐勇用的在前端显示的
    protected String sampMakeStr;//给徐勇用
    protected String sampSendStr;//给徐勇用


    //给徐勇显示在前端用的该条记录插入时间
    protected String insertdateStr;


    //该条记录的所有缩略图路径的集合,用上面的dirUrl来拼接
    protected List<String> thumUrlList=new ArrayList<>();
    //该条记录的所有附件路径的集合,用上面的dirUrl来拼接
    protected List<String> attachUrlList=new ArrayList<>();

    //服务器的和图片所在的ip和域名,用于拼接附件和图片的地址
    protected String dirUrl="http://10.0.3.101:8070/";
    //构造函数初始化网址
    public PrdtSamp0(){
        this.dirUrl= ConstantInit.getDirUrl001();
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getUsr() {
        if(p.notEmpty(getUserName())){
            usr=getUserName();
        }
        return usr;
    }

    public PrdtSamp0 setUsr(String usr) {
        this.usr = usr;
        return this;
    }


    //打样时间戳  //前端传过来时间戳的时候变成Date赋给sampMake

    public Date getSampMake() {
        //        String res;
        //        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(this.sampMake!=null){//用于从数据库选出来的时候
            return this.sampMake;
        }
        //下面的步骤是前端穿过来的时候转化完进数据库用的
        Date date = null;
        try {
            long lt = new Long(this.sampMakeStamp);
            date = new Date(lt);
        } catch (Exception e) {
//            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~前端穿过来的打样时间戳无法解析成时间~"+this.sampMakeStamp+"~~~~~~~~~~~~~~~~~~~~~~~");
        }
        //        res = simpleDateFormat.format(date);

        if(date!=null){
            String format1 = new SimpleDateFormat("yyyy-MM-dd").format(date);

            if ("1900-01-01".equals(format1)||"1970-01-01".equals(format1)) {
                date=null;
            }
        }


        this.sampMake=date;
        return date;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////使用转换字段转换过来的时间//////////////////////////////////////////////////////////////////

    //样品寄出时间戳  //前端传过来时间戳的时候变成Date赋给sampSend
    //给数据库用的

    public Date getSampSend() {
        if(this.sampSend!=null){//用于从数据库选出来的时候
            return this.sampSend;
        }
        //下面是插入数据库的时候用的,因为插入的时候徐勇传过来的sampSendStamp,所以此时sampSend肯定是空的
        Date date = null;
        try {
            long lt = new Long(this.sampSendStamp);
            date = new Date(lt);
        } catch (Exception e) {
//            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~前端穿过来的打样时间戳无法解析成时间~"+this.sampSendStamp+"~~~~~~~~~~~~~~~~~~~~~~~");
        }

        if(date!=null){
            String format1 = new SimpleDateFormat("yyyy-MM-dd").format(date);
            if ("1900-01-01".equals(format1)||"1970-01-01".equals(format1)) {
                date=null;
            }
        }


        this.sampSend=date;
        return date;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////



///////////////////////////////////////////////////////////////////////////////////////////////


    public String getSampMakeStr() {
        System.out.println(this.getSampMake());
        String s = null;
        try {
            s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.getSampMake());
//        sampMakeStr=s;
        } catch (Exception e) {

        }
        return s;
    }

    public PrdtSamp setSampMakeStr(String sampMakeStr) {
        this.sampMakeStr = sampMakeStr;
        return this;
    }

    public String getSampSendStr() {
        String s = null;
        try {
            s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.getSampSend());
//        sampSendStr=s;
        } catch (Exception e) {

        }
        return s;
    }

    public PrdtSamp setSampSendStr(String sampSendStr) {
        this.sampSendStr = sampSendStr;
        return this;
    }



    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////


    public String getInsertdateStr() {
        return insertdateStr;
    }

    public PrdtSamp setInsertdateStr(String insertdateStr) {
        this.insertdateStr = insertdateStr;
        return this;
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public List<String> getThumUrlList() {

        String thum1=this.getThum();
        //把得到的缩略图的一堆路径拆成数组
        if(thum1!=null&&!"".equals(thum1)){
            List<String> strings = Arrays.asList(thum1.split(";"));
            List<String>strList=new ArrayList<>();
            //给每个图片加上地址、
            for(String  str:strings){
                strList.add(dirUrl+str);
            }
            this.thumUrlList=strList;
        }
        return thumUrlList;
    }


    public PrdtSamp setThumUrlList(List<String> thumUrlList) {
        this.thumUrlList = thumUrlList;
        return this;
    }


    public List<String> getAttachUrlList() {
        String attach1=this.getAttach();
        //把得到的缩略图的一堆路径拆成数组
        if(attach1!=null&&!Cnst.emptyStr.equals(attach1)){
            List<String> strings = Arrays.asList(attach1.split(Cnst.fenHao));
            List<String>strList=new ArrayList<>();
            for(String str:strings){
                strList.add(dirUrl+str);
            }
            this.attachUrlList=strList;
        }
        return attachUrlList;
    }

    public PrdtSamp setAttachUrlList(List<String> attachUrlList) {
        this.attachUrlList = attachUrlList;
        return this;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getSampMakeStamp() {
        return sampMakeStamp;
    }

    public PrdtSamp setSampMakeStamp(String sampMakeStamp) {
        this.sampMakeStamp = sampMakeStamp;
        return this;
    }

    public String getSampSendStamp() {
        return sampSendStamp;
    }

    public PrdtSamp setSampSendStamp(String sampSendStamp) {
        this.sampSendStamp = sampSendStamp;
        return this;
    }

    public List<UpDefMy01> getUpDefMyList() {
        return upDefMyList;
    }

    public PrdtSamp0 setUpDefMyList(List<UpDefMy01> upDefMyList) {
        this.upDefMyList = upDefMyList;
        return this;
    }

    public String getDirUrl() {
        return dirUrl;
    }

    public PrdtSamp0 setDirUrl(String dirUrl) {
        this.dirUrl = dirUrl;
        return this;
    }

    public List<UpDefMy01> getUpDefMyListBuy() {
        return upDefMyListBuy;
    }

    public PrdtSamp0 setUpDefMyListBuy(List<UpDefMy01> upDefMyListBuy) {
        this.upDefMyListBuy = upDefMyListBuy;
        return this;
    }


    //    public List<AlterPriceRecToFront> getSaleAlterRecList() {
//        return saleAlterRecList;
//    }
//
//    public PrdtSamp0 setSaleAlterRecList(List<AlterPriceRecToFront> saleAlterRecList) {
//        this.saleAlterRecList = saleAlterRecList;
//        return this;
//    }
//    public List<AlterPriceRecToFront> getBuyAlterRecList() {
//        return buyAlterRecList;
//    }
//
//    public PrdtSamp0 setBuyAlterRecList(List<AlterPriceRecToFront> buyAlterRecList) {
//        this.buyAlterRecList = buyAlterRecList;
//        return this;
//    }
}