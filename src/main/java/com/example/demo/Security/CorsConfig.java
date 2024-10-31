package com.example.demo.Security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")  // Apply CORS settings for your API paths
            .allowedOrigins("http://localhost:4200")  // Front-end URL
            .allowedMethods("GET", "POST", "PUT", "DELETE")  // Allowed HTTP methods
            .allowedHeaders("*")
            .allowCredentials(true);
    }
}