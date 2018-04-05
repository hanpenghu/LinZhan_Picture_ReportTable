//package com.winwin.picreport.Acomponent;
//import com.winwin.picreport.AllConstant.Cnst;
//import com.winwin.picreport.Edto.Sapso;
//import com.winwin.picreport.Edto.ShouDingDanFromExcel;
//import com.winwin.picreport.Futils.NotEmpty;
//import com.winwin.picreport.Futils.hanhan.p;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//import java.math.BigDecimal;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//import java.util.UUID;
//@Component
//@Transactional
//public class SapsoChongfu {
//    @Autowired
//    private Cnst cnst;
//
//    public boolean ishave(List<List<ShouDingDanFromExcel>> samePrdNoList){
//        for (List<ShouDingDanFromExcel> listx : samePrdNoList) {
//            String dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS").format(new Date());
//            String uuid = UUID.randomUUID().toString();//uuid相同代表  单号+货号+成分代码  相同
//            for (ShouDingDanFromExcel shouDingDanFromExcel : listx) {
//                try {
//                    //首先判断os_no在mf_pos里面有没有,有的话说明已经导入过了,就不需要再导入
//                   /* MfPosExample mfe=new MfPosExample();
//                    mfe.createCriteria().andOsNoEqualTo(shouDingDanFromExcel.getOsNo());
//                    long l101 = mfPosMapper.countByExample(mfe);
//                    if(l101==0){*/
//                    Sapso b = new Sapso();
//                    b.setOsno(shouDingDanFromExcel.getOsNo());
//                    b.setPrdno(shouDingDanFromExcel.getPrdNo());
//                    b.setQty(new BigDecimal(shouDingDanFromExcel.getQty()));
//                    b.setCaigouno(shouDingDanFromExcel.getCaiGouNo());
//                    b.setEbno(shouDingDanFromExcel.getEbNo());
//                    b.setMaitouno(shouDingDanFromExcel.getMaiTouNo());
//                    b.setSaphh(shouDingDanFromExcel.getSaphh());
//                    b.setSapph(shouDingDanFromExcel.getSapph());
//                    b.setSapwlm(shouDingDanFromExcel.getSapwlm());
//                    b.setLuohao(shouDingDanFromExcel.getLuoHao());
//                    b.setGanghao(shouDingDanFromExcel.getGangHao());
//                    b.setReallength(shouDingDanFromExcel.getRealLength());
//                    b.setRealwidth(shouDingDanFromExcel.getRealWidth());
//                    //20171108加了成分代码
//                    b.setChengFenDaiMa(shouDingDanFromExcel.getCfdm());
//                    b.setTimesamebatch(dateStr);
//                    b.setUuid(uuid);//uuid相同代表  单号+货号+成分代码  相同
//                    /**
//                     *在插入之前判断是否有重复的,有重复的就不插入,因为之前林展的出现过这种导入重复的情况
//                     * */
//
//
//                    Integer kk;
//                    try {
//                        kk= cnst.a001TongYongMapper.countIfSapsoExist(b);
//                    } catch (Exception e) {
//                        p.p(p.gp().sad(p.dexhx)
//                                .sad("Integer kk= cnst.a001TongYongMapper.countIfSapsoExist(b) error")
//                                .sad(p.dexhx).gad());
//                        throw  new RuntimeException(e.toString());
//                    }
//
//                    if(NotEmpty.notEmpty(kk)&&kk==0){
//                        //不存在//可以让插入,但是还要检测其他的
//                    }else{
//                        return true;//只要走到某条存在,然后就打住,不让再进行下面的任何插入
//                    }
//
////                    }
//                } catch (Exception e) {
//
//                }
//            }
//        }
//        return false;//如果能走完程序,就代表都不存在,可以继续插入
//    }
//
//
//
//}
