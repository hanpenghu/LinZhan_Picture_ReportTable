package test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.winwin.picreport.Futils.hanhan.p;

import java.math.BigDecimal;
import java.util.Date;

public class D{
//    public static void main(String[]args){
//        try {
//            D d=new D();
//           p.p(new ObjectMapper().writeValueAsString(d));
//        } catch (Exception e) {
//
//        }finally{}
//
//    }


//    @JsonSerialize(include=JsonSeri)
    private Integer i;

    @JsonSerialize(include=JsonSerialize.Inclusion.ALWAYS)//显示nul值
    private String str;
    @JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)//有null值会直接干掉
    private BigDecimal bd;
      @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private Date date=new Date();

    public Date getDate() {
        return date;
    }

    public D setDate(Date date) {
        this.date = date;
        return this;
    }

    public BigDecimal getBd() {
        return bd;
    }

    public D setBd(BigDecimal bd) {
        this.bd = bd;
        return this;
    }

    public Integer getI() {
        return i;
    }

    public D setI(Integer i) {
        this.i = i;
        return this;
    }

    public String getStr() {
        return str;
    }

    public D setStr(String str) {
        this.str = str;
        return this;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.winwin.picreport.test.D{");
        sb.append("i=").append(i);
        sb.append(", str='").append(str).append('\'');
        sb.append(", bd=").append(bd);
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }
}