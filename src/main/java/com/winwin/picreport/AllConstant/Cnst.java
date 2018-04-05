package com.winwin.picreport.AllConstant;
//import com.winwin.picreport.Acomponent.GetPriceModelUpdef;
//import com.winwin.picreport.Acomponent.SapsoChongfu;
//import com.winwin.picreport.Bcontroller.xiaoShouDingDanDaoRuDaoChuExcel.servicesBatchRefactor.OrderToErp.CommonDaoRuDBZhiQianZhengLi;
//import com.winwin.picreport.Bcontroller.xiaoShouDingDanDaoRuDaoChuExcel.servicesBatchRefactor.OrderToErp.CommonOrderBatchToDb;
//import com.winwin.picreport.Cservice.*;
import com.winwin.picreport.Bcontroller.DeDao_Js_DiaoYong_sheXiangTou_De_CanShu.SignParamGet;
import com.winwin.picreport.Bcontroller.access_token.Access_token;
import com.winwin.picreport.Bcontroller.jsAPI_ticket.JsTicket;
import com.winwin.picreport.Bcontroller.sheZhiCaiDan1.SheZhiCaiDan;
import com.winwin.picreport.Ddao.reportxmlmapper.*;
import com.winwin.picreport.Futils.GeneratePrdNo.GPrdNo;
import com.winwin.picreport.Futils.GeneratePrdNo.GetMaxPrdNo;
import com.winwin.picreport.Futils.SpringbootJarPath;
import com.winwin.picreport.Futils.hanhan.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.Date;

@Order(0)
@Component("cnst")
public class Cnst {
    public static final String SamplesSys="SamplesSys";//产品打样的时候我们插入系统表prdt和up_def(定价)的时候做的标记,该标记证明了是打样系统产生的记录
    public static final String imgUrl="imgUrl";
    public static final String salPriceId="1";//销售的定价表中的priceId是1
    public static final String buyPriceId="2";//采购的是2
    public static final String deskPath="C:\\Users\\Administrator\\Desktop\\";
    public static final String  xlsHouZhuiWuDian="xls";
    public static final String  javaXieGang="/";
    public static final String  shuangMsXieGang="\\";
    public static final String  xlsxHouZhuiWuDian="xlsx";
    public static final String  pngWuDian="png";
    public static final String  xlsxHouZhui=".xlsx";
    //保存excel中的数据为打样数据的时候一般是第0个sheet
    public static final String  sheetNo="0";
    //保存excel中的数据为打样数据的时候图片固定在第5列(从0)
    public static final String  picColumn="5";
    //保存excel中的数据为打样数据的时候图片位置三维分隔符,网上复制的代码用的这个分隔符
    public static final String  picFgf="_";

    public static final String  dian=".";
    public static final String emptyStr ="";
    public static final String spaceStr =" ";
    public static final String  ganTanHao="!";
    public static final String  fenHao=";";
    public static final String  enCodeSpace="%20";
    public static final String fenLeiNo="fenLeiNo";
    public static final String fenLeiName="fenLeiName";
    public static final String ten0="0000000000";
    public static final String dingJiaXiuGai="dingJiaXiuGai";
    public static final String bilType="bilType";
    public static final String curId="curId";
    public static final String dingJiaGuanLian="dingJiaGuanLian";
    public static final String qty="qty";
    public static final String up="up";
    public static final String unit="unit";
    public static final String remFront="remFront";//对应up_def的rem
    public static final String sDd="sDd";
    public static final String dingJiaZhuJian="dingJiaZhuJian";
    public static final String zhu="主:";
    public static final String fu="副:";
    public static final String curIdBefore="curIdBefore";


    /**
     *创建云蕊存放图片的根目录
     *pic
     * 我在资源文件中已经将pic内部设置为静态资源path,可以直接127.0.0.1:80/1.png 访问资源1.png
     * 每10秒钟检查一次,如果文件夹不存在,就创建一个pic文件夹
     * */
    @Scheduled(initialDelay = 3*1000,fixedDelay = 10*1000)
    public  void picDirCreate(){
            File file=new File("pic");
            if(file.exists()){
                //存在就不管
            }else{
                //不存在就创建一个
                file.mkdir();
            }
    }


    /**
     *每3秒检查一次生成菜单的的文件是否存在,不存在就创建一个
     * */
    @Scheduled(initialDelay = 3*1000,fixedDelay = 10*1000)
    public  void menuCreate(){
        File file=new File(C.menu);
        if(file.exists()){
            //存在就不管
        }else{
            //不存在就创建一个
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }




    public static String getProjectPath(){
        String jarPath = SpringbootJarPath.JarLuJingGet();
        return jarPath;
    }

    //这个路径是springbootjar运行后深入到缩略图文件夹中的路径最后带个/
    public  String getSpringbootJarSuoLueTuFilePath(){
       return  p.gp().sad(Cnst.getProjectPath())
                .sad(daYangSuoLueTuAndFuJianZongPath.replace(Cnst.dian, Cnst.emptyStr))
                .sad(suoLueTuWenJianJia).gad();
    }


    @Autowired
    public SheZhiCaiDan sheZhiCaiDan;

    @Autowired
    public SignParamGet signParamGet;

    @Autowired
    public C c;

    @Autowired
    public JsTicket jsTicket;
    @Autowired
    public Access_token access_token;

    @Autowired
    public MfIcZMapper mfIcZMapper;
    @Autowired
    public IndxMapper indxMapper;

    @Autowired
    public TfPssMapper tfPssMapper;


    @Autowired
    public TfPssZMapper tfPssZMapper;




    @Autowired
     public  AlterPriceRecMapper alterPriceRecMapper;
    @Autowired
    public GPrdNo gPrdNo;
    @Autowired
    public UpDefMapper upDefMapper;

    @Autowired
    public SapsoMapper sapsoMapper;

    @Autowired
    public GetMaxPrdNo getMaxPrdNo;

//    @Autowired
//    public GetPriceModelUpdef getPriceModelUpdef;




    @Autowired
    public MfPosMapper mfPosMapper;

    @Autowired
    public TfPosMapper tfPosMapper;

    @Autowired
    public TfPosZMapper tfPosZMapper;

    @Autowired
    public A001TongYongMapper a001TongYongMapper;



    public Date getDbDate(){
        return a001TongYongMapper.selectDbDate();
    }

    @Autowired
    public PrdtSampMapper prdtSampMapper;
    @Autowired
    public PrdtMapper prdtMapper;


    @Value("${tokenShiXiaoShiJian_haoMiao}")
    public String tokenShiXiaoShiJian_haoMiao;

    @Value("${excelDaoRuDaYangPicLinShiMulu}")
    public String excelDaoRuDaYangPicLinShiMulu;


    @Value(Cnst.dirUrlStr)
    public String dirUrl;

    public static final String dirUrlStr="${dirUrl}";

    @Value("${suoLueTuWenJianJia}")
    public String suoLueTuWenJianJia;

    @Value("${fuJianWenJianJia}")
    public String fuJianWenJianJia;

    //软件过期时间//字符串毫秒时间戳
    @Value("${fuckTime}")
    public String guoQiShiJian;

    //daYangSuoLueTuAndFuJianZongPath=./daYangSuoLueTuAndFuJianZongPath/
    @Value("${daYangSuoLueTuAndFuJianZongPath}")//./1234567/
    public String daYangSuoLueTuAndFuJianZongPath;


//    @Autowired
//    public SapsoChongfu sapsoChongfu;


    @Autowired
    public ManyTabSerch manyTabSerch;


    //    @Autowired
//    public PrdtSampMapper prdtSampMapper;

    /**
     *下面是mybatis分页插件要用的东西
     * */

    public static final String offsetAsPageNum= "offsetAsPageNum";
    public static final String trueStr= "true";
    public static final String falseStr= "false";
    public static final String rowBoundsWithCount= "rowBoundsWithCount";
    public static final String reasonable= "reasonable";
    public static final String dialect= "dialect";
    public static final String mysql= "mysql";
    public static final String sqlServer= "sqlServer";






    /**
     *下面是杂项
     * */
    public static final String testDataCurrentCode="实验数据货币代号";
    public static final String testDataCurrentName="实验数据货币名称";
    public static final String testDataUnit="实验数据单位";
    
}
