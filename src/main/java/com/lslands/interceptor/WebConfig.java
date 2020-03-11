package com.lslands.interceptor;

/**
 * Created by lslands on 2020/03/03.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * Created by lslands on 20120/03/02.
 *  <version>2.2.5.RELEASE</version>
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {


        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/admin/**")
                .excludePathPatterns("/admin","/admin/login")
                .excludePathPatterns("/static/**");
    }

}


/**
 * Created by lslands on 20120/03/06.
 *  <version>1.5.7.RELEASE</version>
 */
/*
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/static/**")
                .excludePathPatterns("/admin","/admin/login");
    }
}
*/
