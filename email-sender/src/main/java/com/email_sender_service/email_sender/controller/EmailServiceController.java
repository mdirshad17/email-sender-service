package com.email_sender_service.email_sender.controller;

import com.email_sender_service.email_sender.Entity.EmailDetails;
import com.email_sender_service.email_sender.service.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmailServiceController {

    @Autowired
    private EmailServiceImpl emailService;
    @PostMapping("/sendMail")
    public String sendMail(@RequestBody  EmailDetails emailDetails){
        return emailService.sendEmail(emailDetails);
    }

    @PostMapping("/sendMailWithAttachment")
    public String sendMailWithAttachment(@RequestBody EmailDetails emailDetails){
        return emailService.sendEmailWithAttachement(emailDetails);
    }

    @PostMapping("/sendBulkMail")
    public String sendBulkMail(@RequestBody List<EmailDetails> emailDetailsList){
        return emailService.sendBulkMail(emailDetailsList);
    }

}
