package com.email_sender_service.email_sender.service;

import com.email_sender_service.email_sender.Entity.EmailDetails;

import java.util.List;

public interface EmailService {
    String sendEmail(EmailDetails emailDetails);
    String sendEmailWithAttachement(EmailDetails emailDetails);
    String sendBulkMail(List<EmailDetails> emailDetailsList);
}
