package com.winwin.picreport.Bcontroller;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.AllConstant.InterFaceCnst;
import com.winwin.picreport.Edto.PrdtSamp;
import com.winwin.picreport.Edto.PrdtSamp0;
import com.winwin.picreport.Edto.PrdtSamp1;
import com.winwin.picreport.Edto.UpDefMy01;
import com.winwin.picreport.Futils.FenYe;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@CrossOrigin
@RestController
public class D1DaYang2Controller {
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Autowired
    private Cnst cnst;
    /**
     *根据条件查询产品编码建档
     * sql
     * chanPinBianMaJianDangTiaoJianChaXun
     * 此接口时间默认传时间戳(str格式)
     * //此接口已经用了动态sql,当不传入isConfirm 参数的时候,相当于查询所有符合条件的信息
     * 当传入isConfirm参数是0的时候,会查询所有未打样的符合条件的信息
     * */
    @RequestMapping(value= InterFaceCnst.chanPinBianMaJianDangTiaoJianChaXun,method = RequestMethod.POST)
    public @ResponseBody
    FenYe f(@RequestBody FenYe fenYe){
        if(fenYe==null){
            FenYe f=new FenYe();
            ArrayList<PrdtSamp0> prdtSamps = new ArrayList<>();
            f.setPrdtSampList(prdtSamps);
            return f;
        }else{
            try {
                return  this.manyConditionSearchOfPrdtFiltList(fenYe);
            } catch (IllegalAccessException e) {
                FenYe f1=new FenYe();
                ArrayList<PrdtSamp0> prdtSamps1 = new ArrayList<>();
                f1.setPrdtSampList(prdtSamps1);
                return f1;
            }
        }
    }



    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     *多条件产品打样列表
     * */
    private FenYe manyConditionSearchOfPrdtFiltList(FenYe f) throws IllegalAccessException {
        PrdtSamp1 p1 = f.getPrdtSamp1();
        //注意,Select,不用写在service里面也可以
        //得到创建开始时间时间戳
        String insertdateStr = p1.getInsertdateStr();
        //将创建开始时间戳转换为Date格式
        Date date = p.sjc2Date(insertdateStr);
        //得到创建结束时间时间戳
        String insertdateStrEnd = p1.getInsertdateStrEnd();
        //将创建结束时间戳转换成Date
        Date date1 = p.sjc2Date(insertdateStrEnd);
        //得到确认开始时间str
        String confirmtimestr = p1.getConfirmtimestr();
        //将确认开始时间戳转换成Date
        Date date2 = p.sjc2Date(confirmtimestr);
        //得到确认结束时间戳str
        String confirmtimestrEnd = p1.getConfirmtimestrEnd();
        //得到确认结束时间date
        Date date3 = p.sjc2Date(confirmtimestrEnd);

        p1.setInsertdate(date);
        p1.setInsertdateEnd(date1);
        p1.setConfirmtime(date2);
        p1.setConfirmtimeEnd(date3);
        //从新定义p1的时间戳str为一定格式的时间  带-时间,将来在sql里要用这个str时间
        p1.setInsertdateStr(p.dtoStr(date,p.d2));
        p1.setInsertdateStrEnd(p.dtoStr(date1,p.d2));
        p1.setConfirmtimestr(p.dtoStr(date2,p.d2));
        p1.setConfirmtimestrEnd(p.dtoStr(date3,p.d2));
        p1 = (PrdtSamp1) p.StringTypeNull2Space(p1);
        //把每页显示数和当前页设置进去
        p1.setMeiYeXianShiShu(f.getMeiYeXianShiShu());
        p1.setDangQianYe(f.getDangQianYe());
        List<PrdtSamp0> prdtSampList = cnst.a001TongYongMapper.chanPinBianMaJianDangTiaoJianChaXun(p1);
        f.setPrdtSampList(prdtSampList);
        //我在这个方法中顺便调了setZongYeShu()方法
        f.setZongJiLuShu(cnst.a001TongYongMapper.getCountOfDuoTiaoJianChaXunZongJiLuShu(p1));
        return f;


    }




    /**
     *采购价格和销售价格的保存放在一个接口
     * //不含运费单价的采购价格//up_def中bil_type=01
     BigDecimal noTransUpBuy;//
     //含运费单价采购价格//up_def中bil_type!=01
     BigDecimal haveTransUpBuy;//


     //不含运费单价的销售价格//up_def中bil_type=01
     BigDecimal noTransUpSale;//
     //含运费单价销售价格//up_def中bil_type!=01
     BigDecimal haveTransUpSale;//

     上面四个字段可以区分采购和销售,
     比如当noTransUpBuy和haveTransUpBuy都为null的时候肯定是  销售的要保存
     销售 传入方式


     {"uuid":"填入给前端的唯一标识","noTransUpSale":"没有运费的销售定价",
     "haveTransUpSale":"有运费的销售定价","curId":"RMB","curName":"人民币","remFront":"客户备注","qty":"数量","unit":""}


    采购传入方式


     {"uuid":"填入给前端的唯一标识","noTransUpBuy":"没有运费的采购定价",
     "haveTransUpBuy":"有运费的采购定价","curId":"RMB","curName":"人民币","remFront":"客户备注","qty":"数量","unit":""}


     //地址   ip地址:8070/saveSaleOrBuyPrice
     * */

    //通过路径后面跟一个  ?usr=登录的那个会员名
    @RequestMapping(value= InterFaceCnst.saveSaleOrBuyPrice,method = RequestMethod.POST)
    public @ResponseBody  Msg saveSaleOrBuyPrice(@RequestBody UpDefMy01 up, HttpServletRequest r){
        String usr = r.getParameter("usr");
        Msg msg1 = cnst.saveSaleOrBuyPrice.saveSaleOrBuyPrice(up,usr);
        return msg1;

    }














































































//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////