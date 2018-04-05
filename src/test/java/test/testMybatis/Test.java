//package com.winwin.picreport.test.testMybatis;
//
//import com.winwin.picreport.Ddao.reportxmlmapper.PrdtSampMapper;
//import com.winwin.picreport.Edto.PrdtSamp;
//import com.winwin.picreport.Futils.hanhan.p;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Service;
//
//@Service
//public class Test {
//    @Autowired
//    private PrdtSampMapper prdtSampMapper;
//    @Scheduled(fixedDelay =3*1000)
//    public void f(){
//        String s="10478a3d-e981-40d6-92ee-4a07d6bb54b8";
//        PrdtSamp p1=new PrdtSamp();
////        p1.setColour("blue");
//        p1.setId(s);
//        p.p("-------------------------------------------------------");
//        p.p("测试mybatis开始");
//        p.p("-------------------------------------------------------");
//        int i = prdtSampMapper.updateByPrimaryKeySelective(p1);
//        p.p("-------------------------------------------------------");
//        p.p(i);
//        p.p("-------------------------------------------------------");
//    }
//
//
//}
