package com.example.Dine_Circle_Platform.Config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("DineCircle Enterprise API")
                        .version("1.0")
                        .description("API documentation for the DineCircle Platform"));
    }
}
