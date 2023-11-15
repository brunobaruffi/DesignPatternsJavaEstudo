package org.example.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI springOpenAPI() {
        String authName = "Authorization";
        return new OpenAPI()
                .info(new Info().title("TesteCompleto API")
                        .description("Aplicação completa de tests")
                        .version("v1.0")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("Qualquer Coisa Wiki Documentation")
                        .url("https://qualquercoisa.wiki.github.org/docs"))
                .addSecurityItem(new SecurityRequirement()
                        .addList(authName))
                .components(
                        new Components()
                                .addSecuritySchemes(authName,
                                        new SecurityScheme()
                                                .name(authName)
                                                .type(SecurityScheme.Type.HTTP)
                                                .scheme("bearer")
                                                .bearerFormat("JWT")
                                ));
    }
}