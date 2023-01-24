package com.example.atelier1.Configuration;

import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

public class Configuration {
    public class SpringDocConfig {
        @Bean
        public OpenAPI springShopOpenAPI() {
            return new OpenAPI()
                    .info(infoAPI());
        }
        public Info infoAPI() {
            return new Info().title("SpringDoc-Demo")
                    .description("TP étude de cas")
                    .contact(contactAPI());
        }

        public Contact contactAPI() {
            Contact contact = new Contact()
                    .name("Equipe ASI II").email("*************@esprit.tn")
                    .url("https://www.linkedin.com/in/**********/");
            return contact;
        }
}

    @Bean
    public GroupedOpenApi productPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only Product Management API")
                                .pathsToMatch("/product/**")
                                .pathsToExclude("**")
                                .build();
    }

}
