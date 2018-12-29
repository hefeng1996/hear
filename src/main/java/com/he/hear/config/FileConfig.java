package com.he.hear.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.MultipartConfigElement;

@Configuration
public class FileConfig implements WebMvcConfigurer {

/*    @Value("${web.upload-path}")
    private String path;

    @Bean
    public MultipartConfigElement multipartConfigElement(){
        MultipartConfigFactory factory =new MultipartConfigFactory();
        factory.setMaxFileSize("200MB");
        factory.setMaxRequestSize("200MB");
        return factory.createMultipartConfig();
    }*/

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/html/**").addResourceLocations("classpath:/html/*");
//        registry.addResourceHandler("/upload/**").addResourceLocations("file:D:/Hear/");
        registry.addResourceHandler("/Hear/**").addResourceLocations("file:D:/Hear/");
    }


}

