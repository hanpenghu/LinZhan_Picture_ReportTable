package com.winwin.picreport.Edto;

public class MfIcWithBLOBs extends MfIc {
    private String rem;

    private String adr;

    public String getRem() {
        return rem;
    }

    public void setRem(String rem) {
        this.rem = rem == null ? null : rem.trim();
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr == null ? null : adr.trim();
    }
}