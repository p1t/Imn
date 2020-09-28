package com.kuan.demo.config;

//import io.swagger.models.auth.In;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpHeaders;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.ApiKey;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;

import java.util.Arrays;

@Configuration
public class SwaggerConfig {

    /**
     * SpringDoc configuration - http://localhost:8080/swagger-ui.html
     */
    @Bean
    public OpenAPI imnAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Kuan API")
                        .description("Spring doc sample application")
                        .version("v0.0.1")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("Kuan Wiki Documentation")
                        .url("https://kuan.com"));
    }

    /**
     * SpringFox configuration - http://localhost:8080/swagger-ui/index.html
     */
//    @Bean
//    public Docket buildDocket() {
//        return new Docket(DocumentationType.OAS_30)
//                .securitySchemes(Arrays.asList(new ApiKey("Token Access", HttpHeaders.AUTHORIZATION, In.HEADER.name())))
//                // 提供 API 相關的資訊，不想設定可以跳過這個 apiInfo call
//                .apiInfo(buildApiInfo())
//                .select()
//                // 設定 base package，只有在這個 package 底下的 REST API 才會加入 Swagger 中
//                // 如果不想指定，也可以用 RequestHandlerSelectors.any() 代表所有的 REST API
//                .apis(RequestHandlerSelectors.basePackage("com.kuan.demo"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    private ApiInfo buildApiInfo() {
//        return new ApiInfoBuilder()
//                .title("System RESTful API documentation")
//                .description("For more information please visit Confluence.")
//                .termsOfServiceUrl("https://about.crunchbase.com/terms-of-service/")
//                .license("epl-2.0")
//                .contact(new Contact("p1t", "https://springfox.github.io/springfox/", "p1t@github.com"))
//                .version("1.0")
//                .build();
//    }
}
