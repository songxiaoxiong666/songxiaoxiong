package com.example.love.sxx;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 类名称：启动类
 * 类描述：
 *
 * @author sxx
 * @Date 2020/6/19
 */
@SpringBootApplication
@EnableSwagger2

public class SxxApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SxxApplication.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringApplication.class);
    }


}
