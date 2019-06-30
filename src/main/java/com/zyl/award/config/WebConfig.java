package com.zyl.award.config;

import com.zyl.award.interceptor.AuthenticationInterceptor;
import com.zyl.award.interceptor.ResponseResultInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;


@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    ResponseResultInterceptor responseResultInterceptor;

    @Autowired
    AuthenticationInterceptor authenticationInterceptor;

    @Autowired
    ProjectConfig projectConfig;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static").setCachePeriod(0);
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
        registry.addResourceHandler("/swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");

    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String url = "/**";
        registry.addInterceptor(responseResultInterceptor).addPathPatterns(url);
        if(!projectConfig.isDebug()) {
            registry.addInterceptor(authenticationInterceptor).addPathPatterns(url).excludePathPatterns(projectConfig.getAnonymousApi());
        }
    }

    @Bean
    public ResponseResultInterceptor responseResultInterceptor(){
        return new ResponseResultInterceptor();
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins("*")
                .allowCredentials(true)
                .allowedMethods("GET", "POST", "DELETE", "PUT","PATCH")
                .maxAge(3600);
    }
}
