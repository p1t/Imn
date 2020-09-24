# Demo for springDoc

1. Create spring boot project
2. Add dependencies

```
    spring-boot-starter-web
    javax.servlet-api
    springdoc-openapi-ui
```
    
3. Add some metadata, inject a bean returning an **OpenAPI** object

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
