package com.email_sender_service.email_sender.service;

import com.email_sender_service.email_sender.Entity.EmailDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService{
    @Autowired private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}") private String sender;

    @Override
    public String sendEmail(EmailDetails emailDetails) {
        try {
            SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
            simpleMailMessage.setFrom(sender);
            simpleMailMessage.setTo(emailDetails.getRecipient());
            simpleMailMessage.setText(emailDetails.getMsgBody());
            simpleMailMessage.setSubject(emailDetails.getSubject());
            javaMailSender.send(simpleMailMessage);
            return "Mail Sent successfully";
        }
        catch(Exception e){
            throw e;
        }
    }

    @Override
    public String sendEmailWithAttachement(EmailDetails emailDetails) {
        return "";
    }
}
