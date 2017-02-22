package sb.demo;

import sb.demo.interceptor.MyInter;
import sb.demo.interceptor.MyInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@ComponentScan
@SpringBootApplication
@ServletComponentScan
public class UndertowTestApp extends WebMvcConfigurerAdapter {

    public static void main(String[] args){
        SpringApplication.run(UndertowTestApp.class, args);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(new MyInterceptor()).addPathPatterns("/play/**");
        registry.addInterceptor(new MyInter()).addPathPatterns("/test/**","/zyys/**");
    }

}
