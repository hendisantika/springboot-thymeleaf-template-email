package com.hendisantika.springbootthymeleaftemplateemail.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-template-email
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/04/20
 * Time: 07.00
 */
@Service
public class EmailerService {
    private static final Logger log = LoggerFactory.getLogger(EmailerService.class);

    @Autowired
    JavaMailSender mailSender;

    @Autowired
    TemplateEngine templateEngine;

    @Autowired
    TemplateEngine textTemplateEngine;

    @Autowired
    TemplateEngine htmlTemplateEngine;

    @Autowired
    TemplateEngine fileTemplateEngine;

}
