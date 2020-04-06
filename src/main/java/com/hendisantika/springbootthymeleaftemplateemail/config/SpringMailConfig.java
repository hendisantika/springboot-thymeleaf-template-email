package com.hendisantika.springbootthymeleaftemplateemail.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-template-email
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/04/20
 * Time: 06.57
 */
@Configuration
public class SpringMailConfig {
    @Bean
    public JavaMailSender mailSender() {

        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

        mailSender.setHost("smtp.host"); //change or read from properties
        mailSender.setPort(25);
        mailSender.setProtocol("smtp");

        // create java mail properties
        Properties mailProperties = new Properties();
        mailProperties.put("mail.smtp.auth", false);
        mailProperties.put("mail.smtp.starttls.enable", true);
        mailProperties.put("mail.smtp.timeout", 5000);
        mailProperties.put("mail.smtp.connectiontimeout", 5000);
        mailSender.setJavaMailProperties(mailProperties);

        return mailSender;

    }
}
