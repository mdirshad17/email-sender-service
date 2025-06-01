package com.email_sender_service.email_sender.Entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmailDetails {
    private String recipient;
    private String msgBody;
    private String subject;
    private String attachment;

    public String getAttachment() {
        return attachment;
    }

    public String getSubject() {
        return subject;
    }

    public String getMsgBody() {
        return msgBody;
    }

    public String getRecipient() {
        return recipient;
    }
}
