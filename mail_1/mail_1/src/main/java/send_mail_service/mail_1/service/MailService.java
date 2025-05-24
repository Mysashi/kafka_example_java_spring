package send_mail_service.mail_1.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.stereotype.Service;
import send_mail_service.mail_1.config.Producer;
import send_mail_service.mail_1.domain.Mail;

@Service
public class MailService {

    @Autowired
   private final Producer producer;


    public MailService(Producer producer) {
        this.producer = producer;
    }

    public void sendMail(Mail mail) {
        try {
            producer.sendMessage(mail);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
