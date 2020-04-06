package com.hendisantika.springbootthymeleaftemplateemail.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-template-email
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/04/20
 * Time: 06.53
 */
@Configuration
@EnableSwagger2
@ComponentScan("com.hendisantika.springbootthymeleaftemplateemail")
public class SwaggerConfig extends WebMvcConfigurationSupport {
}
