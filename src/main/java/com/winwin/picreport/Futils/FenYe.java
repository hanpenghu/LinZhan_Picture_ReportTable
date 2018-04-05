//package com.winwin.picreport.Futils;
//import com.winwin.picreport.Edto.PrdtSamp0;
//import com.winwin.picreport.Edto.PrdtSamp1;
//import java.util.ArrayList;
//import java.util.List;
///**
// *首先set  dangQianYe---前端穿过来
// *
// * 再set  meiYeXianShiShu-----前端穿过来,不传默认写死10
// *
// * 再set   zongJiLuShu-------查数据库的总记录数
// *
// *
// *
// * 再set   zongYeShu------这一步是为了自动计算zongYeShu,
// * 但是这个set可以不用,因为我在上一步set调
// * 了这个set
// *
// *
// * */
//public class FenYe {
//	private List<PrdtSamp0> prdtSampList=new ArrayList<>();//第一次需要传入的数据
//	private Integer dangQianYe;//当前页的页面传过来
//	private Integer meiYeXianShiShu=10;
//	private Integer zongYeShu;
//	private Integer zongJiLuShu;
//	private PrdtSamp1 prdtSamp1;
//	//角色代码,0代表董事长,1表示普通用户,2表示业务员,3表示采购 4,表示销售 5表示财务
//	//具体查看RoleCnst
//	private Integer role;
//
//	public static FenYe g(){
//		return new FenYe();
//	}
//
//
//
//	public PrdtSamp1 getPrdtSamp1() {
//		return prdtSamp1;
//	}
//
//	public FenYe setPrdtSamp1(PrdtSamp1 prdtSamp1) {
//		this.prdtSamp1 = prdtSamp1;
//		return this;
//	}
//
//	public List<PrdtSamp0> getPrdtSampList() {
//		return prdtSampList;
//	}
//
//	public FenYe setPrdtSampList(List<PrdtSamp0> prdtSampList) {
//		this.prdtSampList = prdtSampList;
//		return this;
//	}
//
//	public FenYe setZongYeShu(Integer zongYeShu) {
//		this.zongYeShu = zongYeShu;
//		return this;
//	}
//
//	public Integer getDangQianYe() {
//		return dangQianYe;
//	}
//	public void setDangQianYe(Integer dangQianYe) {
//		this.dangQianYe = dangQianYe;
//	}
//	public Integer getMeiYeXianShiShu() {
//		if(NotEmpty.empty(meiYeXianShiShu)||meiYeXianShiShu==0){
//			meiYeXianShiShu=10;
//		}
//		return meiYeXianShiShu;
//	}
//	public void setMeiYeXianShiShu(Integer meiYeXianShiShu) {
//		if(NotEmpty.empty(meiYeXianShiShu)||meiYeXianShiShu==0){
//			meiYeXianShiShu=10;
//		}
//		this.meiYeXianShiShu = meiYeXianShiShu;
//	}
//	public Integer getZongYeShu() {
//		this.setZongYeShu();
//		return this.zongYeShu;
//	}
//
//	public void setZongYeShu() {
//		this.meiYeXianShiShu=this.getMeiYeXianShiShu();
//		if(this.zongJiLuShu%this.meiYeXianShiShu==0){
//			this.zongYeShu=this.zongJiLuShu/this.meiYeXianShiShu;
//		}else{
//			this.zongYeShu=this.zongJiLuShu/this.meiYeXianShiShu+1;
//		}
//	}
//
//	public Integer getZongJiLuShu() {
//		return zongJiLuShu;
//	}
//	public void setZongJiLuShu(Integer zongJiLuShu) {
//		this.zongJiLuShu = zongJiLuShu;
//		//顺便把总页数也设置一下
//		this.setZongYeShu();
//	}
//
//
//	public Integer getRole() {
//		return role;
//	}
//
//	public FenYe setRole(Integer role) {
//		this.role = role;
//		return this;
//	}
//
//}
