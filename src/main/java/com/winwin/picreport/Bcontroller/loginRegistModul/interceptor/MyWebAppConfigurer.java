package com.winwin.picreport.Bcontroller.loginRegistModul.interceptor;


//import com.ipacedev.tcode.dao.mapperJava01ChanPinKu.A001TongYongMapper;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Ddao.reportxmlmapper.A001TongYongMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {
    @Autowired
    private Cnst cnst;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
       /* registry.addInterceptor(new Interceptor001(cnst))
                .addPathPatterns("/**")
                .excludePathPatterns("/test99")
                .excludePathPatterns("/login")
                .excludePathPatterns("/regist")
                .excludePathPatterns("/logOut")
                 .excludePathPatterns("/test")
                .excludePathPatterns("/d/allfenleitest")
                .excludePathPatterns("/base/*")
                //程序员POSTMAN修改验证模块
                .excludePathPatterns("/authUpdate");
//        registry.addWebRequestInterceptor()
        super.addInterceptors(registry);*/
    }

}