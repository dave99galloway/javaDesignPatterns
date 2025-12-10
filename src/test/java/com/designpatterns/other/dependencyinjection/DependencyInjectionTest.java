package com.designpatterns.other.dependencyinjection;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class DependencyInjectionTest {
    
    @Test
    void testEmailServiceInjection() {
        MessageService emailService = new EmailService();
        NotificationService notificationService = new NotificationService(emailService);
        
        assertThat(notificationService.getMessageService()).isInstanceOf(EmailService.class);
    }
    
    @Test
    void testSMSServiceInjection() {
        MessageService smsService = new SMSService();
        NotificationService notificationService = new NotificationService(smsService);
        
        assertThat(notificationService.getMessageService()).isInstanceOf(SMSService.class);
    }
}
