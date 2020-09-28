# Demo for API Doc

### springDoc

1. Create spring boot project.
2. Add dependencies.

```
    spring-boot-starter-web
    javax.servlet-api
    springdoc-openapi-ui
```
    
3. Add some metadata, inject a bean returning an **OpenAPI** object.

```
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
```

4. Build and run application in IDE or execute command ```mvn spring-boot:run``` using maven.

### springFox

1. Create spring boot project.
2. Add dependencies.

```
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-boot-starter</artifactId>
    <version>3.0.0</version>
</dependency>
```

3. Add some metadata, inject a bean returning an **Docket** object.

```
    @Bean
    public Docket buildDocket() {
        return new Docket(DocumentationType.OAS_30)
                .securitySchemes(Arrays.asList(new ApiKey("Token Access", HttpHeaders.AUTHORIZATION, In.HEADER.name())))
                .apiInfo(buildApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.kuan.demo"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo buildApiInfo() {
        return new ApiInfoBuilder()
                .title("System RESTful API documentation")
                .description("For more information please visit Confluence.")
                .termsOfServiceUrl("https://about.crunchbase.com/terms-of-service/")
                .license("epl-2.0")
                .contact(new Contact("p1t", "https://springfox.github.io/springfox/", "p1t@github.com"))
                .version("1.0")
                .build();
    }
```

4. Build and run application.