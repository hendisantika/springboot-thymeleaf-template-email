package com.hendisantika.springbootthymeleaftemplateemail.controller;

import com.hendisantika.springbootthymeleaftemplateemail.dto.EmailDto;
import com.hendisantika.springbootthymeleaftemplateemail.service.EmailerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-template-email
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/04/20
 * Time: 07.04
 */
@RestController
public class EmailerController {

    @Autowired
    EmailerService emailerService;

    @PostMapping(value = "/sendemail")
    public EmailDto emailHtmlTemplate(@RequestBody EmailDto email) throws IOException, MessagingException {

        emailerService.sendEmail(email);

        return email;
    }

    @PostMapping(value = "/sendtextemail")
    public EmailDto emailTextTemplate(@RequestBody EmailDto email) throws IOException, MessagingException {

        emailerService.sendTextTemplateEmail(email);

        return email;
    }

}
