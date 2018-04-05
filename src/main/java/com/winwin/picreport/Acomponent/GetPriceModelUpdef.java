//package com.winwin.picreport.Acomponent;
//import com.winwin.picreport.AllConstant.Cnst;
//import com.winwin.picreport.Edto.PrdtSamp0;
//import com.winwin.picreport.Edto.UpDefMy01;
//import com.winwin.picreport.Futils.NotEmpty;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.*;
//
//@Component
//public class GetPriceModelUpdef {
//    @Autowired
//   private Cnst cnst;
//    public void GetPriceModel(PrdtSamp0 prdtSampX) {
//        String prdNo=prdtSampX.getPrdNo();
//        //动态sql,如果第二个参数是null的话就选出来所有的
//        List<UpDefMy01> upDefMyList1= cnst.a001TongYongMapper.getUpDefMy(prdNo,Cnst.salPriceId);//这个其实变成销售的了
//        ////动态sql,如果第二个参数不是null的话就选出来对应的priceId
//        List<UpDefMy01> upDefMyListBuy1= cnst.a001TongYongMapper.getUpDefMy(prdNo,Cnst.buyPriceId);//这个其实变成采购的了
//        //走一遍 get方法,等于给该赋值的字段赋值,因为我在get方法里面做了赋值运算
//        //最后把up设置成null是为了在接口返回给前端再调get方法的时候不再计算了
//        upDefMyListBuy1.forEach(v->{v.getNoTransUpBuy();v.getHaveTransUpBuy();v.getNoTransUpSale();v.getHaveTransUpSale();v.setUp(null);});
//        upDefMyList1.forEach(v->{v.getNoTransUpBuy();v.getHaveTransUpBuy();v.getNoTransUpSale();v.getHaveTransUpSale();v.setUp(null);});
//        //接下来是把时间完全一样的带运费和不带运费的合并成一项
//        List<UpDefMy01> upDefMyList = this.merageSameTimeUpDefMy01(upDefMyList1);
//        List<UpDefMy01> upDefMyListBuy=this.merageSameTimeUpDefMy01(upDefMyListBuy1);
//
////
////        if(NotEmpty.empty(upDefMyList)){
////            UpDefMy01 upDefMy01=new UpDefMy01();
////            upDefMy01.setCurId(Cnst.testDataCurrentCode);
////            upDefMy01.setCurName(Cnst.testDataCurrentName);
////            upDefMy01.setQty(new BigDecimal(1111110));
////            upDefMy01.setSDd(p.tod(p.unixBir,p.d3));
////            upDefMy01.setUp(new BigDecimal(0));
////            //为了给徐勇做实验用
////            upDefMyList.addAll(p.gp().setArl(upDefMy01).getArl());
////        }
////
////        if(NotEmpty.empty(upDefMyListBuy)){
////            UpDefMy01 upDefMy01=new UpDefMy01();
////            upDefMy01.setCurId(Cnst.testDataCurrentCode);
////            upDefMy01.setCurName(Cnst.testDataCurrentName);
////            upDefMy01.setQty(new BigDecimal(1110));
////            upDefMy01.setSDd(p.tod(p.unixBir,p.d3));
////            upDefMy01.setUp(new BigDecimal(99));
////            //为了给徐勇做实验用
////            upDefMyList.addAll(p.gp().setArl(upDefMy01).getArl());
////        }
//
//        prdtSampX.setUpDefMyList(upDefMyList);
//        prdtSampX.setUpDefMyListBuy(upDefMyListBuy);
//    }
//
//    private List<UpDefMy01> merageSameTimeUpDefMy01(List<UpDefMy01> upDefMyList) {
//        //储存处理过后的UpDefMy01
//        Map<Date, UpDefMy01> map = new HashMap();
//        for(UpDefMy01 upDefMy01:upDefMyList){
//            Date key=upDefMy01.getSDd();
//            if(map.containsKey(key)){
//                //此时有一样进行有一样的处理
//                UpDefMy01 upDefMy012=new UpDefMy01();
//                BeanUtils.copyProperties(upDefMy01,upDefMy012);
//                //处理   upDefMy01和upDefMy011到upDefMy012
//                UpDefMy01 upDefMy011 = map.get(key);
//                if(NotEmpty.notEmpty(upDefMy01.getHaveTransUpBuy())){
//                    upDefMy012.setHaveTransUpBuy(upDefMy01.getHaveTransUpBuy());
//                }
//                if(NotEmpty.notEmpty(upDefMy011.getHaveTransUpBuy())){
//                    upDefMy012.setHaveTransUpBuy(upDefMy011.getHaveTransUpBuy());
//                }
//
//
//                if(NotEmpty.notEmpty(upDefMy011.getNoTransUpBuy())){
//                    upDefMy012.setNoTransUpBuy(upDefMy011.getNoTransUpBuy());
//                }
//                if(NotEmpty.notEmpty(upDefMy01.getNoTransUpBuy())){
//                    upDefMy012.setNoTransUpBuy(upDefMy01.getNoTransUpBuy());
//                }
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//                if(NotEmpty.notEmpty(upDefMy01.getHaveTransUpSale())){
//                    upDefMy012.setHaveTransUpSale(upDefMy01.getHaveTransUpSale());
//                }
//                if(NotEmpty.notEmpty(upDefMy011.getHaveTransUpSale())){
//                    upDefMy012.setHaveTransUpSale(upDefMy011.getHaveTransUpSale());
//                }
//
//
//                if(NotEmpty.notEmpty(upDefMy011.getNoTransUpSale())){
//                    upDefMy012.setNoTransUpSale(upDefMy011.getNoTransUpSale());
//                }
//                if(NotEmpty.notEmpty(upDefMy01.getNoTransUpSale())){
//                    upDefMy012.setNoTransUpSale(upDefMy01.getNoTransUpSale());
//                }
//
//                map.put(key,upDefMy012);
//            }else{
//                //此时没有一样的进行没有一样的处理
//                map.put(key,upDefMy01);
//            }
//
//        }
//        List<UpDefMy01> upDefMyList1=new LinkedList<>();
//        map.forEach((key,value)->upDefMyList1.add(value));
//        //按时间从新排序
//        this.sortBySdd(upDefMyList1);
//        return upDefMyList1;
//    }
//
//
//    private void sortBySdd(List<UpDefMy01> list){
//        Collections.sort(list,(o1,o2)->{
//            long time1 = o1.getSDd().getTime();
//            long time2 = o2.getSDd().getTime();
//            if(time1<time2){//desc
//                return 1;
//            }else if(time1==time2){
//                return 0;
//            }else{
//                return -1;
//            }
//        });
//    }
//
//
//
//}
