package me.datajpa.swaggerconfig;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

  @Bean
  public OpenAPI api() {
    return new OpenAPI()
            .info(new Info()
                    .title("Spring com swaggerV3")
                    .description("Usando o swagger com opnapi-ui")
                    .version("v1.0.0")
                    .contact(new Contact()
                            .name("Lex")
                            .url("lex.com")
                            .email("lex@lex.com")));
  }
}
