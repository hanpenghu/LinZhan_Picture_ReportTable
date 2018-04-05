package com.winwin.picreport.Futils.hanhan;


import org.apache.commons.codec.digest.DigestUtils;

import java.util.Arrays;
import java.util.List;

/**
 *注意 p类是专门封装java  虚拟机自带  工具的
 * pp类是专门封装java虚拟机以外的包工具的
 * */

public class pp {
 //////////////////////////////////////////////////////////////////////////////////////////
    /**
     *封装log4j的得到实例
     * */
    public static org.apache.log4j.Logger getLogger(Object o){
        return org.apache.log4j.LogManager.getLogger(o.getClass().getName());
    }


    /**
     *封装apahce包的sha1加密
     * */
    public static String sha1(String s){

        return DigestUtils.shaHex(s);
    }










///////////////////////////////////////////////////////////////////////////////////
private final static String[] hexDigits = { "0", "1", "2", "3", "4", "5",
        "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };//md5用

    private final static String phonePattern =
            "^1[3|4|5|7|8][0-9]\\d{8}$";

    private final static String emailPattern1 =
            "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

    private final static String emailPattern2 =
            "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";

    public static final String knownExceptionSign ="《已知异常》";
    public static final String gq="_____________________RuanJianGuoQi__________________________The software has expired, please contact the supplier_____________________RuanJianGuoQi__________________________";//过期提醒
    public static final String NULL1="NULL";
    public static final String null1="null";
    public static final String excel="excel";
    public static final String zhifgf="~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";//至分隔符
    public static final String zhi="~";//至符号
    public static final String dexhx="_________________";//短英文下划线
    public static final String cexhx="____________________________________________";//长英文下划线
    public static final String dzwxhx="————————————————";//短中文下划线
    public static final String hlfgxd="…………………………………………";//就是^的中文状态多个组合
    public static final String zwh="？";//中文问号
    public static final String eeh="?";//英文问号
    public static final String xh="*";
    public static final String qdz="&";//and符号或者取地址符号
    public static final String zcf="……";//中文状态下的次方符号
    public static final String cf="^";//excel中的次方符号
    public static final String jnh="#";
    public static final String zgth="！";//中文感叹号
    public static final String egth="!";//英文感叹号
    public static final String at="@";
    public static final String rmb="￥";
    public static final String dollor="$";
    public static final String bfh="%";
    public static final String zmh="：";//中文冒号
    public static final String emh=":";//英文冒号
    public static final String zdh="、";//顿号、,只有中文有,英文没有
    public static final String fxg="\\";//这个其实代表一个\,因为第一个\是转义符号
    public static final String ys="|";//一竖
    public static final String edyh="'";//英文单引号的一半
    public static final String esyh="\"";//英文双引号的一半
    public static final String huanHangfu="\n";
    public static final String ejh=".";//英文句号
    public static final String zjh="。";//中文句号
    public static final String zd="，";//中文逗号
    public static final String ed=",";//英文逗号
    public static final String xyh="<";
    public static final String dyh=">";
    public static final String dh="=";//等号
    public static final String j="+";//加号
    public static final String xhx="_";//下划线
    public static final String jh="-";//减号
    public final static String fh=";";//分好
    public final static String space="";//空字符串
    public static final String  enCodeSpace="%20";
    public final static String spac=" ";//空格
    public static final String undefined="undefined";
    //_________________2017-12-29 19:10:52.717_________________
    public final static String d1="yyyy-MM-dd HH:mm:ss.SS";//最后的SS是毫秒//like//2017-12-16 16:19:23.670
    //_________________2017-12-29 19:10:52.717_________________
    public final static String d16="yyyy-MM-dd HH:mm:ss.SSS";
    //_________________2017-12-29 19:10:52,717_________________
    public final static String d17="yyyy-MM-dd HH:mm:ss,SSS";
    public final static String d2="yyyy-MM-dd HH:mm:ss";
    public final static String d3="yyyy-MM-dd";

    public final static String d4="yyyy/MM/dd HH:mm:ss.SS";
    public final static String d5="yyyy/MM/dd HH:mm:ss";
    public final static String d6="yyyy/MM/dd";

    public final static String d7="yyyy.MM.dd HH:mm:ss.SS";
    public final static String d8="yyyy.MM.dd HH:mm:ss";
    public final static String d9="yyyy.MM.dd";

    public final static String d10="yyyyMMddHHmmssSS";
    public final static String d11="yyyyMMddHHmmss";
    public final static String d12="yyyyMMdd";

    public final static String fail="fail";
    public final static String FAIL="FAIL";
    public final static String success="success";
    public final static String SUCCESS="SUCCESS";

    public final static String d13="yyyy.MM.dd HH.mm.ss.SS";
    public final static String d14="yyyy.MM.dd.HH.mm.ss.SS";
    public final static String d15="yyyy.MM.dd.HH.mm.ss";
    public static final String unixBir="1970-01-01";
    public final static String hanhanBirthday_="1986-12-26";
    public final static String hanhanBirthday="1986/12/26";

    public final static String DateType="java.util.Date";
    public final static String StringType="java.lang.String";
    public final static String BigDecimalType="java.math.BigDecimal";

    public final static List<String> numberTypelist
            = Arrays.asList(new String[]{"int","java.lang.Integer",
            "double","java.lang.Double",
            "float","java.lang.Float","java.lang.Long"
            ,"long","java.lang.Short","short"});

    public final static String intType="int";
    public final static String IntegerType="java.lang.Integer";
    public final static String doubleType="double";
    public final static String DoubleType="java.lang.Double";
    public final static String floatType="float";
    public final static String FloatType="java.lang.Float";
    public final static String LongType="java.lang.Long";
    public final static String longType="long";
    public final static String ShortType="java.lang.Short";
    public final static String shortType="short";

    final static int[] sizeTable = { 9, 99, 999, 9999, 99999, 999999, 9999999,
            99999999, 999999999, Integer.MAX_VALUE };

    public final static String baoCunShiBai="baoCunShiBai";
    public final static String baoCunShiBaiCh="保存失败";
    public final static String baoCunChengGong="baoCunChengGong";
    public final static String baoCunChengGongCh="保存成功";
    public final static String charsetUtf8="application/json;charset=utf-8";
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public	final	static	int	n0	=	0	;
    public	final	static	int	n1	=	1	;
    public	final	static	int	n2	=	2	;
    public	final	static	int	n3	=	3	;
    public	final	static	int	n4	=	4	;
    public	final	static	int	n5	=	5	;
    public	final	static	int	n6	=	6	;
    public	final	static	int	n7	=	7	;
    public	final	static	int	n8	=	8	;
    public	final	static	int	n9	=	9	;
    public	final	static	int	n10	=	10	;
    public	final	static	int	n11	=	11	;
    public	final	static	int	n12	=	12	;
    public	final	static	int	n13	=	13	;
    public	final	static	int	n14	=	14	;
    public	final	static	int	n15	=	15	;
    public	final	static	int	n16	=	16	;
    public	final	static	int	n17	=	17	;
    public	final	static	int	n18	=	18	;
    public	final	static	int	n19	=	19	;
    public	final	static	int	n20	=	20	;
    public	final	static	int	n21	=	21	;
    public	final	static	int	n22	=	22	;
    public	final	static	int	n23	=	23	;
    public	final	static	int	n24	=	24	;
    public	final	static	int	n25	=	25	;
    public	final	static	int	n26	=	26	;
    public	final	static	int	n27	=	27	;
    public	final	static	int	n28	=	28	;
    public	final	static	int	n29	=	29	;
    public	final	static	int	n30	=	30	;
    public	final	static	int	n31	=	31	;
    public	final	static	int	n32	=	32	;
    public	final	static	int	n33	=	33	;
    public	final	static	int	n34	=	34	;
    public	final	static	int	n35	=	35	;
    public	final	static	int	n36	=	36	;
    public	final	static	int	n37	=	37	;
    public	final	static	int	n38	=	38	;
    public	final	static	int	n39	=	39	;
    public	final	static	int	n40	=	40	;
    public	final	static	int	n41	=	41	;
    public	final	static	int	n42	=	42	;
    public	final	static	int	n43	=	43	;
    public	final	static	int	n44	=	44	;
    public	final	static	int	n45	=	45	;
    public	final	static	int	n46	=	46	;
    public	final	static	int	n47	=	47	;
    public	final	static	int	n48	=	48	;
    public	final	static	int	n49	=	49	;
    public	final	static	int	n50	=	50	;
    public	final	static	int	n51	=	51	;
    public	final	static	int	n52	=	52	;
    public	final	static	int	n53	=	53	;
    public	final	static	int	n54	=	54	;
    public	final	static	int	n55	=	55	;
    public	final	static	int	n56	=	56	;
    public	final	static	int	n57	=	57	;
    public	final	static	int	n58	=	58	;
    public	final	static	int	n59	=	59	;
    public	final	static	int	n60	=	60	;
    public	final	static	int	n61	=	61	;
    public	final	static	int	n62	=	62	;
    public	final	static	int	n63	=	63	;
    public	final	static	int	n64	=	64	;
    public	final	static	int	n65	=	65	;
    public	final	static	int	n66	=	66	;
    public	final	static	int	n67	=	67	;
    public	final	static	int	n68	=	68	;
    public	final	static	int	n69	=	69	;
    public	final	static	int	n70	=	70	;
    public	final	static	int	n71	=	71	;
    public	final	static	int	n72	=	72	;
    public	final	static	int	n73	=	73	;
    public	final	static	int	n74	=	74	;
    public	final	static	int	n75	=	75	;
    public	final	static	int	n76	=	76	;
    public	final	static	int	n77	=	77	;
    public	final	static	int	n78	=	78	;
    public	final	static	int	n79	=	79	;
    public	final	static	int	n80	=	80	;
    public	final	static	int	n81	=	81	;
    public	final	static	int	n82	=	82	;
    public	final	static	int	n83	=	83	;
    public	final	static	int	n84	=	84	;
    public	final	static	int	n85	=	85	;
    public	final	static	int	n86	=	86	;
    public	final	static	int	n87	=	87	;
    public	final	static	int	n88	=	88	;
    public	final	static	int	n89	=	89	;
    public	final	static	int	n90	=	90	;
    public	final	static	int	n91	=	91	;
    public	final	static	int	n92	=	92	;
    public	final	static	int	n93	=	93	;
    public	final	static	int	n94	=	94	;
    public	final	static	int	n95	=	95	;
    public	final	static	int	n96	=	96	;
    public	final	static	int	n97	=	97	;
    public	final	static	int	n98	=	98	;
    public	final	static	int	n99	=	99	;
    public	final	static	int	n100	=	100	;

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public	final	static	String	s0	=	"0"	;
    public	final	static	String	s1	=	"1"	;
    public	final	static	String	s2	=	"2"	;
    public	final	static	String	s3	=	"3"	;
    public	final	static	String	s4	=	"4"	;
    public	final	static	String	s5	=	"5"	;
    public	final	static	String	s6	=	"6"	;
    public	final	static	String	s7	=	"7"	;
    public	final	static	String	s8	=	"8"	;
    public	final	static	String	s9	=	"9"	;
    public	final	static	String	s10	=	"10"	;
    public	final	static	String	s11	=	"11"	;
    public	final	static	String	s12	=	"12"	;
    public	final	static	String	s13	=	"13"	;
    public	final	static	String	s14	=	"14"	;
    public	final	static	String	s15	=	"15"	;
    public	final	static	String	s16	=	"16"	;
    public	final	static	String	s17	=	"17"	;
    public	final	static	String	s18	=	"18"	;
    public	final	static	String	s19	=	"19"	;
    public	final	static	String	s20	=	"20"	;
    public	final	static	String	s21	=	"21"	;
    public	final	static	String	s22	=	"22"	;
    public	final	static	String	s23	=	"23"	;
    public	final	static	String	s24	=	"24"	;
    public	final	static	String	s25	=	"25"	;
    public	final	static	String	s26	=	"26"	;
    public	final	static	String	s27	=	"27"	;
    public	final	static	String	s28	=	"28"	;
    public	final	static	String	s29	=	"29"	;
    public	final	static	String	s30	=	"30"	;
    public	final	static	String	s31	=	"31"	;
    public	final	static	String	s32	=	"32"	;
    public	final	static	String	s33	=	"33"	;
    public	final	static	String	s34	=	"34"	;
    public	final	static	String	s35	=	"35"	;
    public	final	static	String	s36	=	"36"	;
    public	final	static	String	s37	=	"37"	;
    public	final	static	String	s38	=	"38"	;
    public	final	static	String	s39	=	"39"	;
    public	final	static	String	s40	=	"40"	;
    public	final	static	String	s41	=	"41"	;
    public	final	static	String	s42	=	"42"	;
    public	final	static	String	s43	=	"43"	;
    public	final	static	String	s44	=	"44"	;
    public	final	static	String	s45	=	"45"	;
    public	final	static	String	s46	=	"46"	;
    public	final	static	String	s47	=	"47"	;
    public	final	static	String	s48	=	"48"	;
    public	final	static	String	s49	=	"49"	;
    public	final	static	String	s50	=	"50"	;
    public	final	static	String	s51	=	"51"	;
    public	final	static	String	s52	=	"52"	;
    public	final	static	String	s53	=	"53"	;
    public	final	static	String	s54	=	"54"	;
    public	final	static	String	s55	=	"55"	;
    public	final	static	String	s56	=	"56"	;
    public	final	static	String	s57	=	"57"	;
    public	final	static	String	s58	=	"58"	;
    public	final	static	String	s59	=	"59"	;
    public	final	static	String	s60	=	"60"	;
    public	final	static	String	s61	=	"61"	;
    public	final	static	String	s62	=	"62"	;
    public	final	static	String	s63	=	"63"	;
    public	final	static	String	s64	=	"64"	;
    public	final	static	String	s65	=	"65"	;
    public	final	static	String	s66	=	"66"	;
    public	final	static	String	s67	=	"67"	;
    public	final	static	String	s68	=	"68"	;
    public	final	static	String	s69	=	"69"	;
    public	final	static	String	s70	=	"70"	;
    public	final	static	String	s71	=	"71"	;
    public	final	static	String	s72	=	"72"	;
    public	final	static	String	s73	=	"73"	;
    public	final	static	String	s74	=	"74"	;
    public	final	static	String	s75	=	"75"	;
    public	final	static	String	s76	=	"76"	;
    public	final	static	String	s77	=	"77"	;
    public	final	static	String	s78	=	"78"	;
    public	final	static	String	s79	=	"79"	;
    public	final	static	String	s80	=	"80"	;
    public	final	static	String	s81	=	"81"	;
    public	final	static	String	s82	=	"82"	;
    public	final	static	String	s83	=	"83"	;
    public	final	static	String	s84	=	"84"	;
    public	final	static	String	s85	=	"85"	;
    public	final	static	String	s86	=	"86"	;
    public	final	static	String	s87	=	"87"	;
    public	final	static	String	s88	=	"88"	;
    public	final	static	String	s89	=	"89"	;
    public	final	static	String	s90	=	"90"	;
    public	final	static	String	s91	=	"91"	;
    public	final	static	String	s92	=	"92"	;
    public	final	static	String	s93	=	"93"	;
    public	final	static	String	s94	=	"94"	;
    public	final	static	String	s95	=	"95"	;
    public	final	static	String	s96	=	"96"	;
    public	final	static	String	s97	=	"97"	;
    public	final	static	String	s98	=	"98"	;
    public	final	static	String	s99	=	"99"	;
    public	final	static	String	s100	=	"100"	;
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public	final	static	int	n_100	=	-100	;
    public	final	static	int	n_99	=	-99	;
    public	final	static	int	n_98	=	-98	;
    public	final	static	int	n_97	=	-97	;
    public	final	static	int	n_96	=	-96	;
    public	final	static	int	n_95	=	-95	;
    public	final	static	int	n_94	=	-94	;
    public	final	static	int	n_93	=	-93	;
    public	final	static	int	n_92	=	-92	;
    public	final	static	int	n_91	=	-91	;
    public	final	static	int	n_90	=	-90	;
    public	final	static	int	n_89	=	-89	;
    public	final	static	int	n_88	=	-88	;
    public	final	static	int	n_87	=	-87	;
    public	final	static	int	n_86	=	-86	;
    public	final	static	int	n_85	=	-85	;
    public	final	static	int	n_84	=	-84	;
    public	final	static	int	n_83	=	-83	;
    public	final	static	int	n_82	=	-82	;
    public	final	static	int	n_81	=	-81	;
    public	final	static	int	n_80	=	-80	;
    public	final	static	int	n_79	=	-79	;
    public	final	static	int	n_78	=	-78	;
    public	final	static	int	n_77	=	-77	;
    public	final	static	int	n_76	=	-76	;
    public	final	static	int	n_75	=	-75	;
    public	final	static	int	n_74	=	-74	;
    public	final	static	int	n_73	=	-73	;
    public	final	static	int	n_72	=	-72	;
    public	final	static	int	n_71	=	-71	;
    public	final	static	int	n_70	=	-70	;
    public	final	static	int	n_69	=	-69	;
    public	final	static	int	n_68	=	-68	;
    public	final	static	int	n_67	=	-67	;
    public	final	static	int	n_66	=	-66	;
    public	final	static	int	n_65	=	-65	;
    public	final	static	int	n_64	=	-64	;
    public	final	static	int	n_63	=	-63	;
    public	final	static	int	n_62	=	-62	;
    public	final	static	int	n_61	=	-61	;
    public	final	static	int	n_60	=	-60	;
    public	final	static	int	n_59	=	-59	;
    public	final	static	int	n_58	=	-58	;
    public	final	static	int	n_57	=	-57	;
    public	final	static	int	n_56	=	-56	;
    public	final	static	int	n_55	=	-55	;
    public	final	static	int	n_54	=	-54	;
    public	final	static	int	n_53	=	-53	;
    public	final	static	int	n_52	=	-52	;
    public	final	static	int	n_51	=	-51	;
    public	final	static	int	n_50	=	-50	;
    public	final	static	int	n_49	=	-49	;
    public	final	static	int	n_48	=	-48	;
    public	final	static	int	n_47	=	-47	;
    public	final	static	int	n_46	=	-46	;
    public	final	static	int	n_45	=	-45	;
    public	final	static	int	n_44	=	-44	;
    public	final	static	int	n_43	=	-43	;
    public	final	static	int	n_42	=	-42	;
    public	final	static	int	n_41	=	-41	;
    public	final	static	int	n_40	=	-40	;
    public	final	static	int	n_39	=	-39	;
    public	final	static	int	n_38	=	-38	;
    public	final	static	int	n_37	=	-37	;
    public	final	static	int	n_36	=	-36	;
    public	final	static	int	n_35	=	-35	;
    public	final	static	int	n_34	=	-34	;
    public	final	static	int	n_33	=	-33	;
    public	final	static	int	n_32	=	-32	;
    public	final	static	int	n_31	=	-31	;
    public	final	static	int	n_30	=	-30	;
    public	final	static	int	n_29	=	-29	;
    public	final	static	int	n_28	=	-28	;
    public	final	static	int	n_27	=	-27	;
    public	final	static	int	n_26	=	-26	;
    public	final	static	int	n_25	=	-25	;
    public	final	static	int	n_24	=	-24	;
    public	final	static	int	n_23	=	-23	;
    public	final	static	int	n_22	=	-22	;
    public	final	static	int	n_21	=	-21	;
    public	final	static	int	n_20	=	-20	;
    public	final	static	int	n_19	=	-19	;
    public	final	static	int	n_18	=	-18	;
    public	final	static	int	n_17	=	-17	;
    public	final	static	int	n_16	=	-16	;
    public	final	static	int	n_15	=	-15	;
    public	final	static	int	n_14	=	-14	;
    public	final	static	int	n_13	=	-13	;
    public	final	static	int	n_12	=	-12	;
    public	final	static	int	n_11	=	-11	;
    public	final	static	int	n_10	=	-10	;
    public	final	static	int	n_9	=	-9	;
    public	final	static	int	n_8	=	-8	;
    public	final	static	int	n_7	=	-7	;
    public	final	static	int	n_6	=	-6	;
    public	final	static	int	n_5	=	-5	;
    public	final	static	int	n_4	=	-4	;
    public	final	static	int	n_3	=	-3	;
    public	final	static	int	n_2	=	-2	;
    public	final	static	int	n_1	=	-1	;
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public	final	static	String	s_100	=	"-100"	;
    public	final	static	String	s_99	=	"-99"	;
    public	final	static	String	s_98	=	"-98"	;
    public	final	static	String	s_97	=	"-97"	;
    public	final	static	String	s_96	=	"-96"	;
    public	final	static	String	s_95	=	"-95"	;
    public	final	static	String	s_94	=	"-94"	;
    public	final	static	String	s_93	=	"-93"	;
    public	final	static	String	s_92	=	"-92"	;
    public	final	static	String	s_91	=	"-91"	;
    public	final	static	String	s_90	=	"-90"	;
    public	final	static	String	s_89	=	"-89"	;
    public	final	static	String	s_88	=	"-88"	;
    public	final	static	String	s_87	=	"-87"	;
    public	final	static	String	s_86	=	"-86"	;
    public	final	static	String	s_85	=	"-85"	;
    public	final	static	String	s_84	=	"-84"	;
    public	final	static	String	s_83	=	"-83"	;
    public	final	static	String	s_82	=	"-82"	;
    public	final	static	String	s_81	=	"-81"	;
    public	final	static	String	s_80	=	"-80"	;
    public	final	static	String	s_79	=	"-79"	;
    public	final	static	String	s_78	=	"-78"	;
    public	final	static	String	s_77	=	"-77"	;
    public	final	static	String	s_76	=	"-76"	;
    public	final	static	String	s_75	=	"-75"	;
    public	final	static	String	s_74	=	"-74"	;
    public	final	static	String	s_73	=	"-73"	;
    public	final	static	String	s_72	=	"-72"	;
    public	final	static	String	s_71	=	"-71"	;
    public	final	static	String	s_70	=	"-70"	;
    public	final	static	String	s_69	=	"-69"	;
    public	final	static	String	s_68	=	"-68"	;
    public	final	static	String	s_67	=	"-67"	;
    public	final	static	String	s_66	=	"-66"	;
    public	final	static	String	s_65	=	"-65"	;
    public	final	static	String	s_64	=	"-64"	;
    public	final	static	String	s_63	=	"-63"	;
    public	final	static	String	s_62	=	"-62"	;
    public	final	static	String	s_61	=	"-61"	;
    public	final	static	String	s_60	=	"-60"	;
    public	final	static	String	s_59	=	"-59"	;
    public	final	static	String	s_58	=	"-58"	;
    public	final	static	String	s_57	=	"-57"	;
    public	final	static	String	s_56	=	"-56"	;
    public	final	static	String	s_55	=	"-55"	;
    public	final	static	String	s_54	=	"-54"	;
    public	final	static	String	s_53	=	"-53"	;
    public	final	static	String	s_52	=	"-52"	;
    public	final	static	String	s_51	=	"-51"	;
    public	final	static	String	s_50	=	"-50"	;
    public	final	static	String	s_49	=	"-49"	;
    public	final	static	String	s_48	=	"-48"	;
    public	final	static	String	s_47	=	"-47"	;
    public	final	static	String	s_46	=	"-46"	;
    public	final	static	String	s_45	=	"-45"	;
    public	final	static	String	s_44	=	"-44"	;
    public	final	static	String	s_43	=	"-43"	;
    public	final	static	String	s_42	=	"-42"	;
    public	final	static	String	s_41	=	"-41"	;
    public	final	static	String	s_40	=	"-40"	;
    public	final	static	String	s_39	=	"-39"	;
    public	final	static	String	s_38	=	"-38"	;
    public	final	static	String	s_37	=	"-37"	;
    public	final	static	String	s_36	=	"-36"	;
    public	final	static	String	s_35	=	"-35"	;
    public	final	static	String	s_34	=	"-34"	;
    public	final	static	String	s_33	=	"-33"	;
    public	final	static	String	s_32	=	"-32"	;
    public	final	static	String	s_31	=	"-31"	;
    public	final	static	String	s_30	=	"-30"	;
    public	final	static	String	s_29	=	"-29"	;
    public	final	static	String	s_28	=	"-28"	;
    public	final	static	String	s_27	=	"-27"	;
    public	final	static	String	s_26	=	"-26"	;
    public	final	static	String	s_25	=	"-25"	;
    public	final	static	String	s_24	=	"-24"	;
    public	final	static	String	s_23	=	"-23"	;
    public	final	static	String	s_22	=	"-22"	;
    public	final	static	String	s_21	=	"-21"	;
    public	final	static	String	s_20	=	"-20"	;
    public	final	static	String	s_19	=	"-19"	;
    public	final	static	String	s_18	=	"-18"	;
    public	final	static	String	s_17	=	"-17"	;
    public	final	static	String	s_16	=	"-16"	;
    public	final	static	String	s_15	=	"-15"	;
    public	final	static	String	s_14	=	"-14"	;
    public	final	static	String	s_13	=	"-13"	;
    public	final	static	String	s_12	=	"-12"	;
    public	final	static	String	s_11	=	"-11"	;
    public	final	static	String	s_10	=	"-10"	;
    public	final	static	String	s_9	=	"-9"	;
    public	final	static	String	s_8	=	"-8"	;
    public	final	static	String	s_7	=	"-7"	;
    public	final	static	String	s_6	=	"-6"	;
    public	final	static	String	s_5	=	"-5"	;
    public	final	static	String	s_4	=	"-4"	;
    public	final	static	String	s_3	=	"-3"	;
    public	final	static	String	s_2	=	"-2"	;
    public	final	static	String	s_1	=	"-1"	;
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public	final	static	String	stra	=	"a"	;
    public	final	static	String	strb	=	"b"	;
    public	final	static	String	strc	=	"c"	;
    public	final	static	String	strd	=	"d"	;
    public	final	static	String	stre	=	"e"	;
    public	final	static	String	strf	=	"f"	;
    public	final	static	String	strg	=	"g"	;
    public	final	static	String	strh	=	"h"	;
    public	final	static	String	stri	=	"i"	;
    public	final	static	String	strj	=	"j"	;
    public	final	static	String	strk	=	"k"	;
    public	final	static	String	strl	=	"l"	;
    public	final	static	String	strm	=	"m"	;
    public	final	static	String	strn	=	"n"	;
    public	final	static	String	stro	=	"o"	;
    public	final	static	String	strp	=	"p"	;
    public	final	static	String	strq	=	"q"	;
    public	final	static	String	strr	=	"r"	;
    public	final	static	String	strs	=	"s"	;
    public	final	static	String	strt	=	"t"	;
    public	final	static	String	stru	=	"u"	;
    public	final	static	String	strv	=	"v"	;
    public	final	static	String	strw	=	"w"	;
    public	final	static	String	strx	=	"x"	;
    public	final	static	String	stry	=	"y"	;
    public	final	static	String	strz	=	"z"	;
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public	final	static	String	strA	=	"A"	;
    public	final	static	String	strB	=	"B"	;
    public	final	static	String	strC	=	"C"	;
    public	final	static	String	strD	=	"D"	;
    public	final	static	String	strE	=	"E"	;
    public	final	static	String	strF	=	"F"	;
    public	final	static	String	strG	=	"G"	;
    public	final	static	String	strH	=	"H"	;
    public	final	static	String	strI	=	"I"	;
    public	final	static	String	strJ	=	"J"	;
    public	final	static	String	strK	=	"K"	;
    public	final	static	String	strL	=	"L"	;
    public	final	static	String	strM	=	"M"	;
    public	final	static	String	strN	=	"N"	;
    public	final	static	String	strO	=	"O"	;
    public	final	static	String	strP	=	"P"	;
    public	final	static	String	strQ	=	"Q"	;
    public	final	static	String	strR	=	"R"	;
    public	final	static	String	strS	=	"S"	;
    public	final	static	String	strT	=	"T"	;
    public	final	static	String	strU	=	"U"	;
    public	final	static	String	strV	=	"V"	;
    public	final	static	String	strW	=	"W"	;
    public	final	static	String	strX	=	"X"	;
    public	final	static	String	strY	=	"Y"	;
    public	final	static	String	strZ	=	"Z"	;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////
}
