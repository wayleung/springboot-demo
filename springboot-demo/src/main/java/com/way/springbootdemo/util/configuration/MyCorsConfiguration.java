package com.way.springbootdemo.util.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Auther: Way Leung wayleung13@163.com
 * @Date: 10/5/2018 17:29
 * @Description:
 */
@Configuration
public class MyCorsConfiguration {

    @Bean
    public WebMvcConfigurer getWebMvcConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*").allowedMethods("PUT", "DELETE", "GET", "POST")
                        .allowedHeaders("*")
                        .exposedHeaders("access-control-allow-headers",
                                "access-control-allow-methods",
                                "access-control-allow-origin",
                                "access-control-max-age",
                                "X-Frame-Options")
                        .allowCredentials(false).maxAge(3600);
//                //添加映射路径
//                registry.addMapping("/**")
//                        //放行哪些原始域
//                        .allowedOrigins("*")
//                        //是否发送Cookie信息
//                        .allowCredentials(true)
//                        //放行哪些原始域(请求方式)
//                        .allowedMethods("GET","POST", "PUT", "DELETE")
//                        //放行哪些原始域(头部信息)
//                        .allowedHeaders("*")
//                        //暴露哪些头部信息（因为跨域访问默认不能获取全部头部信息）
//                        .exposedHeaders("Header1", "Header2");
            }
        };
    }
}
