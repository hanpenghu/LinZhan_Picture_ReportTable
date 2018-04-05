package test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.winwin.picreport.Futils.hanhan.p;

public class testJson {

    public static void main(String[]args){
        String s = p.readAllTxt("E:\\1\\work_space\\LinZhan_Picture_ReportTable\\src\\main\\java\\com\\winwin\\picreport\\Bcontroller\\loginRegistModul\\auth\\权限的json.json");
        p.p(p.replaceBlank(s));
        p.p("修改-----");
        JSONObject jsonObject = JSON.parseObject(s);
        System.out.println(jsonObject);


//        String ss="[\"1\",\"2\",\"3\"]";
//        JSONArray jsonArray1 = JSON.parseArray(ss);
//        System.out.println(jsonArray1);


    }
}
