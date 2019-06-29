package com.zyl.award.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerUiConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
//                .groupName("中石油评奖")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zyl"))
                .paths(PathSelectors.any())
                .build();
    }

//    @Bean
//    public Docket createMonitorRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .groupName("人员管理")
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.zyl.award.business.demo"))
//                .paths(PathSelectors.any())
//                .build();
//    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("中石油评奖系统")
                .description("中石油科技奖励评审")
                .termsOfServiceUrl("http://188.131.135.224/")
                .contact("shj_no_bug@163.com")
                .version("1.0")
                .build();
    }
}
