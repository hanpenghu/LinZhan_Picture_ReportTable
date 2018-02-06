package com.winwin.picreport.Cservice;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.AllConstant.Constant.msgCnst;
import com.winwin.picreport.AllConstant.StatusCnst;
import com.winwin.picreport.Edto.PrdtSamp;
import com.winwin.picreport.Edto.PrdtSamp0;
import com.winwin.picreport.Edto.UpDef;
import com.winwin.picreport.Edto.UpDefMy01;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.NotEmpty;
import com.winwin.picreport.Futils.p;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
/**
 *注意:如果是我们打样系统流水的货号在进入
 * prdt的时候,会在  rem   字段标注   SamplesSys  标记
 * 在up_def价格表中   hj_no  标注  SamplesSys  标记
 * 这是为了将来好区别好删除,选出来的时候好选出来
 *
 *
 * 还有:
 * 由于打样系统保存的单位可能跟住单位表  prdt表中的对应的prd_no
 * 的单位不同意,所以,现在打样采购或者销售选的单位来自up_def表中的OLEFIELD
 *字段,以后我们保存的时候也把价格保存在这个字段
 * */
@Service
@Transactional
public class SaveSaleOrBuyPrice {
    @Autowired
    private Cnst cnst;
        public Msg saveSaleOrBuyPrice(UpDefMy01 up){

             p.p(p.gp().sad(p.zhifgf).sad(p.zhifgf).sad(p.dexhx).sad(up.toString()).sad(p.dexhx).sad(p.zhifgf).sad(p.zhifgf).gad());

            String usr=up.getUsr();
            String cusNo=up.getCusNo();
            if(null==cusNo){//联合主键之一,不能为null
                cusNo=p.space;
            }
            String chkMan=usr;
            //得到打样唯一标识
            String uuid = up.getUuid();
            //先拿出来需要的全局数据
            BigDecimal qty = up.getQty();
            if(null==qty){qty=new BigDecimal(0);}
            //得到币别代号//RMB
            String curId = up.getCurId();
            if(null==curId){
                curId=p.space;
            }
            //得到币别名字//人民币
            String curName = up.getCurName();
            //前端传过来的备注
            String remFront = up.getRemFront();
            //固定的备注   //"打样系统"
            String rem = up.getRem();
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            //单位
            String unit = up.getUnit();//放入up_def中的OLEFIELD字段中
            //注意:后来加了主单位和副单位,
            //进入up_def之后都存在了OLEFIELD字段中,取出来的时候也取这个
            //但是老郑还要求了,单位分主副进入prdt中
            //prdt中ut字段是主单位,ut1是副单位
            String unitZhu=up.getUnitZhu();//放入prdt中的ut//当对应prdno的这条记录的ut是空的时候
            String unitFu=up.getUnitFu();//放入prdt中的ut1//当对应prdno的这条记录的ut1是空的时候
            if(NotEmpty.notEmpty(unitZhu)){
                unit=unitZhu;
            }else if(NotEmpty.notEmpty(unitFu)){
                unit=unitFu;
            }else{
                unit="前端穿过来的主副单位都是空的";
            }
            //注意:上面 unit是为了将来插入up_def用的
            //unitZhu和unitFu是为了将来给没有单位的prdt中的ut和ut1字段准备的
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


            p.p("~~~~~~~~~~~~~~~~~~~~~~~~采购或者销售保存单位unit="+unit+"~~这个在取出的时候实际上是来自prdt,而这里的实际没有保存~~~~~~~~~~~~~~~~~~~~~~");
            //采购带运费
            BigDecimal haveTransUpBuy = up.getHaveTransUpBuy();
            //采购无运费
            BigDecimal noTransUpBuy = up.getNoTransUpBuy();
           
            //销售有运费
            BigDecimal haveTransUpSale = up.getHaveTransUpSale();
            //销售无运费
            BigDecimal noTransUpSale = up.getNoTransUpSale();

            //处理一下unit,因为unit必须存入一个1或者2


            if(NotEmpty.empty(curId)){
                p.p("~~~~~~~~~~~~~~~~~~~~~~~~TEST~~~~~~~~~~~~~~~~~~~~~~~~");
                p.p("币别代号没有传过来");
                p.p("~~~~~~~~~~~~~~~~~~~~~~~~TEST~~~~~~~~~~~~~~~~~~~~~~~~");
                return Msg.gmg().setStatus(StatusCnst.excelSaveFalse)
                        .setMsg("curId 币别代号没有传过来");
            }
            //把上面的东西放在一个map里面好处理
            Map<String, Object> gmp = p.gp()
                    .smp("uuid", uuid)
                    .smp("qty", qty)
                    .smp("curId", curId)
                    .smp("curName", curName)
                    .smp("remFront", remFront)
                    .smp("rem", rem)
                    .smp("unit", unit)//因为数据库up_def中的unit只能是1或者2这类短的//这个unit负责放入up_def中的OLEFIELD字段以供将来取出来用
                    .smp("unitZhu",unitZhu)//主单位//将来为了检查对应的prdt中prdno的对应的那条记录的ut是否是null,是null的用这个更新
                    .smp("unitFu",unitFu)//副单位//将来为了检查对应的prdt中prdno的对应的那条记录的ut1是否是null,是null的用这个更新
                    .smp("haveTransUpBuy", haveTransUpBuy)
                    .smp("noTransUpBuy", noTransUpBuy)
                    .smp("haveTransUpSale", haveTransUpSale)
                    .smp("noTransUpSale", noTransUpSale)
                    .smp("usr",usr)
                    .smp("chkMan",usr)
                    .smp("cusNo",cusNo)
                    .gmp();
//////////////////////////货号流水模块////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            //获得uuid对应的prdt_no
            String prdNo= cnst.manyTabSerch.selectPrdNoFromPrdtSamp(uuid);
            //如果货号是空的,先流水一下
            if(NotEmpty.empty(prdNo)){
                //下面流水一次单号//注意必须先得到index
                PrdtSamp prdtSamp = cnst.prdtSampMapper.selectByPrimaryKey(uuid);
                PrdtSamp0 prdtSamp0=new PrdtSamp0();
                BeanUtils.copyProperties(prdtSamp,prdtSamp0);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                //给prdtSamp流水prdtNo//下面是prdno流水模块
                cnst.gPrdNo.prdtSampObjGetPrdNo(prdtSamp0);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                
                prdNo=prdtSamp0.getPrdNo();
            }else{
                //此时货号不是空的//曾经出现过PrdtSamp表有货号但是在prdt里面不存在,此时就要再prdt里插入该货号
                //这种情况是老郑认为删除打样流水到prdt里的货号导致的
                PrdtSamp prdtSamp = cnst.prdtSampMapper.selectByPrimaryKey(uuid);
                PrdtSamp0 prdtSamp0=new PrdtSamp0();
                BeanUtils.copyProperties(prdtSamp,prdtSamp0);
                //此时prdNo已经存在存在prdt_Samp,那么我们看看这个prdNo在prdt表是否存在//不存在就插入一个,
                //此时不存在  曾经是老郑认为删除打样流水货号导致的
                //注意我们插入到prdt的记录会带rem字段是SamplesSys的标记,在mapper的sql中可以看到
                cnst.gPrdNo.reSetPrdNo(prdtSamp0);
            }
/////////////prdt表单位对比插入模块/////////////////////////////////////////////////////////////////////////////////
            /**
             *插入主单位到prdt中,条件是prdt中prdno对应ut主单位字段是空的并且前端
             * 传过来的unitZhu不是空的
             * */
            //找到该prdNo对应的ut(就是存的主单位)//如果是空的并且前端传过来的主单位不是空的,就给他插入当前前端传过来的单位
            String ut=cnst.manyTabSerch.selectUtFromPrdt(prdNo);
            if(NotEmpty.empty(ut)&&NotEmpty.notEmpty(unitZhu)){
                p.p(p.gp().sad(p.dexhx).sad("prdtTabHaveNoUt(主单位空)startInsert").sad(p.dexhx).gad());
                //如果是空的,证明prdt表中没有该ut,需要插入该unit
                Integer tt= cnst.manyTabSerch.insertUnitToUtOfPrdt(unitZhu,prdNo);
                if(NotEmpty.notEmpty(tt)&&tt>0){
                    p.p(p.gp().sad(p.dexhx).sad("prdt对应的记录更新ut主单位成功").sad(p.dexhx).gad());
                }else{
                    p.p(p.gp().sad(p.dexhx).sad("prdt对应的记录更新ut主单位失败,更新条件达到,但是没有更新成功").sad(p.dexhx).gad());
                }
            }
            /**
             *插入副单位到prdt中,条件是prdt中prdno对应ut1主单位字段是空的并且前端
             * 传过来的unitFu不是空的
             * */
            //找到该prdNo对应的ut1(就是存的副单位)//如果是空的并且前端传过来的副单位不是空的,就给他插入当前前端传过来的单位
            String ut1=cnst.manyTabSerch.selectUt1FromPrdt(prdNo);
            if(NotEmpty.empty(ut1)&&NotEmpty.notEmpty(unitFu)){
                p.p(p.gp().sad(p.dexhx).sad("prdtTabHaveNoUt1(副单位空)startInsert").sad(p.dexhx).gad());
                //如果是空的,证明prdt表中没有该ut,需要插入该unit
                Integer tt1= cnst.manyTabSerch.insertUnitToUt1OfPrdt(unitFu,prdNo);
                if(NotEmpty.notEmpty(tt1)&&tt1>0){
                    p.p(p.gp().sad(p.dexhx).sad("prdt对应的记录更新ut1副单位成功").sad(p.dexhx).gad());
                }else{
                    p.p(p.gp().sad(p.dexhx).sad("prdt对应的记录更新ut1副单位失败,更新条件达到,但是没有更新成功").sad(p.dexhx).gad());
                }
            }
//////////////////////////////////////////////////////////////////////////////////////////////
            p.p("~~~~~~~~~~~~~~~~~~~~~~~~TEST1~~prdNo=~~"+prdNo+"~~~~~~~~~~~~~~~~~~~~");
            if(NotEmpty.empty(prdNo)){
                p.p("~~~~~~~~~~~~~~~~~~~~~~~~TEST2~~~~~~~~~~~~~~~~~~~~~~~~");
                //空的单号,必须告诉前端终止
                return Msg.gmg().setStatus(StatusCnst.excelSaveFalse)
                        .setMsg(msgCnst.failSave.getValue())
                        .setChMsg(msgCnst.failSave.getValue());
            }else{
                gmp.put("prdNo",prdNo);

                //判断是采购的还是销售的
                //采购的都是0,证明现在是销售的
                if(haveTransUpBuy==null&&noTransUpBuy==null){
                    p.p("~~~~~~~~~~~~~~~~~~~~~~~~TEST3~~~~~~~~~~~~~~~~~~~~~~~~");
                    //按销售保存
                   return this.saveAsSaler(gmp);
                }else{
                    p.p("~~~~~~~~~~~~~~~~~~~~~~~~TEST4~~~~~~~~~~~~~~~~~~~~~~~~");
                    //现在是采购的,按采购保存
                    return this.saveAsBuyer(gmp);

                }

            }
        }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //采购的价格入库
    private Msg saveAsBuyer(Map<String,Object> gmp) {
        String unit=(String)gmp.get("unit");
        UpDef upDef=new UpDef();
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //插入单位, 这个是2018_1_18   weekday(4)   14:17:58郑总说的,把打样的单位
        //暂时放到OLEFIELD字段中,取的时候也取这个,不再取PRDT中的,但是PRDT中的prdno对应的记录如果没有
        //单位(unit为空)上面已经处理了再插入prdt单位的情况
        upDef.setOlefield(unit);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //我们将来取自己添加的价格的标识
        upDef.setHjNo(Cnst.SamplesSys);
        upDef.setsDd(cnst.getDbDate());
        upDef.setQty((BigDecimal) gmp.get("qty"));
        //这个默认字符串"打样系统"
        upDef.setRem((String)gmp.get("rem"));
        //得到币别
        upDef.setCurId((String)gmp.get("curId"));
        //得到单位//updef的unit字段里面1指的是主单位,2指的是副单位而已
        upDef.setUnit("1");
        upDef.setPriceId("2");
        /////////////////////////////////////////////////////////////////////////////////////
        upDef.setCusNo((String)gmp.get("cusNo"));
        upDef.setUsr((String)gmp.get("usr"));
        upDef.setChkMan((String)gmp.get("chkMan"));
        /////////////////////////////////////////////////////////////////////////////////////
        upDef.setPrdMark(p.space);
        upDef.setPrdNo((String)gmp.get("prdNo"));
        upDef.setBzKnd(p.space);
        upDef.setKnd(p.space);
        upDef.setSupPrdNo(p.space);
        upDef.setCusAre(p.space);
        //采购含运费入库
        if(NotEmpty.notEmpty(gmp.get("haveTransUpBuy"))){
            //01代表不含运费//其他代表是含运费的
            upDef.setBilType(p.space);
            upDef.setUp((BigDecimal) gmp.get("haveTransUpBuy"));
            p.p("~~~~~~~~~~~~~~~~~~~~~~~~TEST5~~~~~~~~~~~~~~~~~~~~~~~~");
            //往价格表up_def插入采购价格。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。
            int insert = cnst.upDefMapper.insert(upDef);
            p.p("~~~~~~~~~~~~~~~~~~~~~~~~TEST6~~~~~~~~~~~~~~~~~~~~~~~~");
            if(insert==0) {
                p.p("~~~~~~~~~~~~~~~~~~~~~~~~TEST7~~~~~~~~~~~~~~~~~~~~~~~~");
                return Msg.gmg().setStatus(StatusCnst.excelSaveFalse)
                        .setMsg("保存采购价格含运费的失败");
            }else{

            }
        }
        //采购不含运费入库
        if(NotEmpty.notEmpty( gmp.get("noTransUpBuy"))){
            //01代表不含运费//其他代表是含运费的
            upDef.setBilType("01");
            upDef.setUp((BigDecimal) gmp.get("noTransUpBuy"));
            p.p("~~~~~~~~~~~~~~~~~~~~~~~~TEST9~~~~~~~~~~~~~~~~~~~~~~~~");
            //往价格表up_def插入采购价格。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。
            int insert= cnst.upDefMapper.insert(upDef);
            if(insert==0) {
                p.p("~~~~~~~~~~~~~~~~~~~~~~~~TEST~~~~~~~10~~~~~~~~~~~~~~~~~");
                return Msg.gmg().setStatus(StatusCnst.excelSaveFalse)
                        .setMsg("保存采购价格不含运费的失败");
            }else{
                p.p("~~~~~~~~~~~~~~~~~~~~~~~~TEST~~11~~~~~~~~~~~~~~~~~~~~~~");
                return Msg.gmg().setStatus(StatusCnst.excelSaveSucc)
                        .setMsg("保存采购价格成功");
            }
        }

        return Msg.gmg().setStatus(StatusCnst.excelSaveSucc)
                .setMsg("保存采购价格成功");

    }
    /**
     ****************************************************************************************
     * */

    //销售的价格入库
    private Msg saveAsSaler(Map<String, Object> gmp) {
        String unit=(String)gmp.get("unit");
        UpDef upDef=new UpDef();
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //插入单位, 这个是2018_1_18   weekday(4)   14:17:58郑总说的,把打样的单位
        //暂时放到OLEFIELD字段中,取的时候也取这个,不再取PRDT中的,但是PRDT中的prdno对应的记录如果没有
        //单位(unit为空)上面已经处理了再插入prdt单位的情况
        upDef.setOlefield(unit);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        upDef.setHjNo(Cnst.SamplesSys);
        upDef.setsDd(cnst.getDbDate());
        upDef.setQty((BigDecimal) gmp.get("qty"));
        //这个默认字符串"打样系统"
        upDef.setRem((String)gmp.get("rem"));
        //得到币别
        upDef.setCurId((String)gmp.get("curId"));
        //得到单位//updef的unit字段里面1指的是主单位,2指的是副单位而已
        upDef.setUnit("1");
        //1代表销售,2代表采购
        upDef.setPriceId("1");


/////////////////////////////////////////////////////////////////////////////////////
        upDef.setCusNo((String)gmp.get("cusNo"));
        upDef.setUsr((String)gmp.get("usr"));
        upDef.setChkMan((String)gmp.get("chkMan"));
        /////////////////////////////////////////////////////////////////////////////////////
        upDef.setPrdMark(p.space);
        upDef.setPrdNo((String)gmp.get("prdNo"));
        upDef.setBzKnd(p.space);
        upDef.setKnd(p.space);
        upDef.setSupPrdNo(p.space);
        upDef.setCusAre(p.space);
        //销售含运费入库
        if(NotEmpty.notEmpty( gmp.get("haveTransUpSale"))){
            p.p("~~~~~~~~~~~~~~~~~~~~~~~~TEST~~~~~~~~~~~~~~12~~~~~~~~~~");
            //01代表不含运费//其他代表是含运费的
            upDef.setBilType(p.space);
            upDef.setUp((BigDecimal) gmp.get("haveTransUpSale"));
            if(null==upDef.getCusNo()){
                upDef.setCusNo(p.space);
            }
            //往价格表up_def插入采购价格
            int insert=cnst.upDefMapper.insert(upDef);//。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。
            p.p("~~~~~~~~~~~~~~~~~~~~~~~~TEST~~~~~~~~13~~~~~~~~~~~~~~~~");
            if(insert==0) {
                p.p("~~~~~~~~~~~~~~~~~~~~~~~~TEST14~~~~~~~~~~~~~~~~~~~~~~~~");
                return Msg.gmg().setStatus(StatusCnst.excelSaveFalse)
                        .setMsg("保存销售价格含运费的失败");
            }else{

            }
        }
        //销售不含运费入库
        if(NotEmpty.notEmpty( gmp.get("noTransUpSale"))){
            p.p("~~~~~~~~~~~~~~~~~~~~~~16~~TEST~~~~~~~~~~~~~~~~~~~~~~~~");
            //01代表不含运费//其他代表是含运费的
            upDef.setBilType("01");
            upDef.setUp((BigDecimal) gmp.get("noTransUpSale"));
            p.p("~~~~~~~~~~~~~~~~~~~~~~17~~TEST~~~~~~~~~~~~~~~~~~~~~~~~");
            if(null==upDef.getCusNo()){
                upDef.setCusNo(p.space);
            }
            //往价格表up_def插入采购价格
            int insert=cnst.upDefMapper.insert(upDef);//。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。
            if(insert==0) {
                p.p("~~~~~~~~~~~~~~~~~~~~~~18~~TEST~~~~~~~~~~~~~~~~~~~~~~~~");
                return Msg.gmg().setStatus(StatusCnst.excelSaveFalse)
                        .setMsg("保存销售价格不含运费的失败");
            }else{
                p.p("~~~~~~~~~~~~~~~~~~~~~~19~~TEST~~~~~~~~~~~~~~~~~~~~~~~~");
                return Msg.gmg().setStatus(StatusCnst.excelSaveSucc)
                        .setMsg("保存销售价格的成功");
            }
        }

        return Msg.gmg().setStatus(StatusCnst.excelSaveSucc)
                .setMsg("保存销售价格的成功");
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


























//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
