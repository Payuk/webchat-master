package ua.training.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import ua.training.interceptor.ErrorInterceptor;

/**
 * создать объекты всех классов, где есть аннотации Controller, component, bin, service и т.д.
 */
@EnableWebMvc
//
@Configuration
@ComponentScan({"ua.training.controller", "ua.training.service",
        "ua.training.dao"})
public class WebChatApplicationConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ErrorInterceptor());
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/asserts/**")
                .addResourceLocations("/asserts/");
        registry.addResourceHandler("/node_modules/**")
                .addResourceLocations("/node_modules");
    }
}
