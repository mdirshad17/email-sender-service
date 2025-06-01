package com.email_sender_service.email_sender.controller;

import com.email_sender_service.email_sender.Entity.EmailDetails;
import com.email_sender_service.email_sender.service.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailServiceController {

    @Autowired
    private EmailServiceImpl emailService;
    @PostMapping("/sendMail")
    public String sendMail(@RequestBody  EmailDetails emailDetails){
        String status=emailService.sendEmail(emailDetails);
        return status;
    }

}
