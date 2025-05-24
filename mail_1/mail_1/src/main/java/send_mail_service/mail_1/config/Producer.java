package send_mail_service.mail_1.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import send_mail_service.mail_1.domain.Mail;


@Component
@Slf4j
public class Producer {

    @Value("${topic.name}")
    private String mailTopic;

    private final ObjectMapper objectMapper;
    private final KafkaTemplate<String, String> kafkaTemplate;



    @Autowired
    public Producer(KafkaTemplate<String, String> kafkaTemplate, ObjectMapper objectMapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
    }

    public String sendMessage(Mail mail) throws JsonProcessingException {
        String mailMessage = objectMapper.writeValueAsString(mail);
        kafkaTemplate.send(mailTopic, mailMessage);

        log.info("SENT");

        return "message sent";
    }
}
