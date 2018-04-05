package com.winwin.picreport.Edto;

public class TfIcKey {
    private String icId;

    private String icNo;

    private Integer itm;

    public String getIcId() {
        return icId;
    }

    public void setIcId(String icId) {
        this.icId = icId == null ? null : icId.trim();
    }

    public String getIcNo() {
        return icNo;
    }

    public void setIcNo(String icNo) {
        this.icNo = icNo == null ? null : icNo.trim();
    }

    public Integer getItm() {
        return itm;
    }

    public void setItm(Integer itm) {
        this.itm = itm;
    }
}