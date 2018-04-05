package com.winwin.picreport.AllConstant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class C {

    //删除菜单
    public static final String deleteMenu="https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=";


    //accToken存储的文本名字,默认路径
    public static final String accessTokenTxt="accessToken.txt";
    //jsApiTicketTxt存储的文本名字,默认路径
    public static  final String  jsApiTicketTxt="jsApiTicket.txt";
    //创建存储生成菜单的json文件
    public static final String menu="menu.json";


    //系统级参数
    @Value("${gongZhongHao}")
    public  String gongZhongHao="gh_044e597d568e";
    @Value("${AppID}")
    public  String AppID="wx3eb9d8abbeba9645";
    @Value("${AppSecret}")
    public  String AppSecret="423b7a3ff07123b6f784e3da8f8d36f8";
    @Value("${serverUrl}")
    public  String serverUrl="http://hanpenghu123.picp.io/";
    @Value("${token}")
    public  String token="hanpenghulimengruhanjiacheng123";




    //消息加解密密钥
    @Value("${EncodingAESKey}")
    public  String EncodingAESKey="";
    @Value("${grant_type}")
    public  String grant_type="client_credential";
    @Value("${accessTokenGetUrl}")
    public  String accessTokenGetUrl="https://api.weixin.qq.com/cgi-bin/token";
    @Value("${jsapi_ticketUrl}")
    public  String jsapi_ticketUrl="https://api.weixin.qq.com/cgi-bin/ticket/getticket";

    //当前需要分享的网页的URL
    @Value("${urlWhoShare}")
    public  String urlWhoShare="http://xywait.imwork.net";


    public static String getAccessTokenTxt() {
        return accessTokenTxt;
    }

    public static String getJsApiTicketTxt() {
        return jsApiTicketTxt;
    }

    public String getGongZhongHao() {
        return gongZhongHao;
    }

    public C setGongZhongHao(String gongZhongHao) {
        this.gongZhongHao = gongZhongHao;
        return this;
    }

    public String getAppID() {
        return AppID;
    }

    public C setAppID(String appID) {
        AppID = appID;
        return this;
    }

    public String getAppSecret() {
        return AppSecret;
    }

    public C setAppSecret(String appSecret) {
        AppSecret = appSecret;
        return this;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public C setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
        return this;
    }

    public String getToken() {
        return token;
    }

    public C setToken(String token) {
        this.token = token;
        return this;
    }

    public String getEncodingAESKey() {
        return EncodingAESKey;
    }

    public C setEncodingAESKey(String encodingAESKey) {
        EncodingAESKey = encodingAESKey;
        return this;
    }

    public String getGrant_type() {
        return grant_type;
    }

    public C setGrant_type(String grant_type) {
        this.grant_type = grant_type;
        return this;
    }

    public String getAccessTokenGetUrl() {
        return accessTokenGetUrl;
    }

    public C setAccessTokenGetUrl(String accessTokenGetUrl) {
        this.accessTokenGetUrl = accessTokenGetUrl;
        return this;
    }

    public String getJsapi_ticketUrl() {
        return jsapi_ticketUrl;
    }

    public C setJsapi_ticketUrl(String jsapi_ticketUrl) {
        this.jsapi_ticketUrl = jsapi_ticketUrl;
        return this;
    }

    public String getUrlWhoShare() {
        return urlWhoShare;
    }

    public C setUrlWhoShare(String urlWhoShare) {
        this.urlWhoShare = urlWhoShare;
        return this;
    }
}
