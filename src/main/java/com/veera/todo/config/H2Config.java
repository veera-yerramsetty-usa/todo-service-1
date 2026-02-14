package com.veera.todo.config;

import org.h2.server.web.JakartaWebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class H2Config {

    @Bean
    public ServletRegistrationBean<JakartaWebServlet> h2ConsoleRegistrationBean() {
        ServletRegistrationBean<JakartaWebServlet> registrationBean = new ServletRegistrationBean<>(new JakartaWebServlet());
        registrationBean.addUrlMappings("/h2-console/*");
        registrationBean.addInitParameter("webAllowOthers", "");
        return registrationBean;
    }
}
