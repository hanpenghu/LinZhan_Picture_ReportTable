package com.winwin.picreport.Bcontroller.TestMyWeiXinServer;

public class WeiXinTestInfo {



    private String timestamp ;

    private String nonce ;


    private String echostr ;

    private String signature ;

    public String getTimestamp() {
        return timestamp;
    }

    public WeiXinTestInfo setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getNonce() {
        return nonce;
    }

    public WeiXinTestInfo setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }

    public String getEchostr() {
        return echostr;
    }

    public WeiXinTestInfo setEchostr(String echostr) {
        this.echostr = echostr;
        return this;
    }

    public String getSignature() {
        return signature;
    }

    public WeiXinTestInfo setSignature(String signature) {
        this.signature = signature;
        return this;
    }
}
