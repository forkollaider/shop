package com.khimin.shop;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by tikhon on 11/11/18.
 */
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/", "product/products");
        registry.addRedirectViewController("/home", "product/products");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/accessDenied").setViewName("errors/accessDenied");
        registry.addViewController("/default").setViewName("default");
    }
}
