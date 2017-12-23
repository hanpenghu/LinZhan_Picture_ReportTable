package com.winwin.picreport.Edto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
/**
 *该类只用于产便打样编码建档的时候的前后端条件传输
 * */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PrdtSamp1 {
    /**
     *下面2个时间其实都是传的创建时间条件的开始时间
     * */
    //正规时间格式
    private Date insertdate;
    //固定格式时间格式,2017-12-20,如果前端约定的是时间戳,这个就传时间戳
    private String insertdateStr;
    /**
     *下面2个时间其实都是传的创建时间条件的结束时间
     * */
    //正规时间格式
    private Date insertdateEnd;
    //固定格式时间格式,2017-12-20,如果前端约定的是时间戳,这个就传时间戳
    private String insertdateStrEnd;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *确认时间区段开始时间
     * */
    //确认时间  徐勇说传时间戳
    private String confirmtimestr;
    //确认时间,真正的时间格式
    private Date confirmtime;
    /**
     *确认时间区段结束时间
     * */
    //确认时间  徐勇说传时间戳
    private String confirmtimestrEnd;
    //确认时间,真正的时间格式
    private Date confirmtimeEnd;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //产品名称
    private String idxName;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //产品分类
    private String idxNo;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //产品编码
    private String prdCode;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *产品负责人,传一个过来就行了
     * */
    //产品负责人
    private String salName;
    //产品负责人编码
    private String salNo;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    //由于在查询条件中需要使用  每页显示数和当前页,所以这里添加一下
    private Integer meiYeXianShiShu;
    private Integer dangQianYe;






//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////