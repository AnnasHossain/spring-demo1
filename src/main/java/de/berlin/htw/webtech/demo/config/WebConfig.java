package de.berlin.htw.webtech.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedMethods("*")
                .allowedOrigins(
                        "http://localhost:3000",
                        "https://findingfood-spots-project-annas-hossains-projects.vercel.app",
                        "https://spring-demo-1-findingfoodspot-523727a174f4.herokuapp.com"
                );
    }
}
