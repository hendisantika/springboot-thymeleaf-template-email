package com.hendisantika.springbootthymeleaftemplateemail.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-template-email
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/04/20
 * Time: 06.50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailDto {
    @NotNull(message = "From email address cannot be null")
    @Email(message = "From email address is not valid")
    private String from;

    @NotEmpty(message = "To email address cannot be empty")
    @Email(message = "To email address is not valid")
    private String[] to;


    @Email(message = "Cc email address is not valid")
    private String[] cc;

    @Email(message = "Bcc email address is not valid")
    private String[] bcc;

    @NotNull(message = "Email subject cannot be null")
    private String subject;

    @NotNull(message = "Email message cannot be null")
    private String message;

    private boolean isHtml;

    private boolean isTemplate;

    private boolean hasAttachment;

    private String pathToAttachment;

    private String attachmentName;

    private String templateName;

    private String templateLocation;

    private Map<String, Object> parameterMap;

    private Map<String, Object> staticResourceMap;

    private String emailedMessage;

    public EmailDto(String from, String toList, String subject, String message) {
        this();
        this.from = from;
        this.subject = subject;
        this.message = message;
        this.to = splitByComma(toList);
    }


    public EmailDto(String from, String toList, String ccList) {
        this();
        this.from = from;
        this.to = splitByComma(toList);
        this.cc = splitByComma(ccList);
    }

    public EmailDto(String from, String toList) {
        this();
        this.from = from;
        this.to = splitByComma(toList);
    }

    public EmailDto(String from, String toList, String ccList, String subject, String message) {
        this();
        this.from = from;
        this.subject = subject;
        this.message = message;
        this.to = splitByComma(toList);
        this.cc = splitByComma(ccList);
    }

    private String[] splitByComma(String toMultiple) {
        String[] toSplit = toMultiple.split(",");
        return toSplit;
    }

}
