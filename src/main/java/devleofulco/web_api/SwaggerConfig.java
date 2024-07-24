package devleofulco.web_api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Title - Rest API")
                        .version("1.0")
                        .description("API exemplo de uso de Springboot REST API")
                        .termsOfService("Termo de uso: Open Source")
                        .license(new io.swagger.v3.oas.models.info.License().name("Licença - Dev Leo Fulco").url("https://www.linkedin.com/in/devleofulco/"))
                        .contact(new Contact().name("Seu nome").url("https://www.linkedin.com/in/devleofulco/").email("devleofulco@gmail.com"))
                );
    }
}
