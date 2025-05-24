package mail_bd.mail_2.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import mail_bd.mail_2.domain.MailDto;
import mail_bd.mail_2.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Consumer {

    private static final String orderTopic = "${topic.name}";

    private final ObjectMapper objectMapper;
    private final MailService mailService;

    @Autowired
    public Consumer(ObjectMapper objectMapper, MailService mailService) {
        this.objectMapper = objectMapper;
        this.mailService = mailService;
    }

    @KafkaListener(topics = orderTopic)
    public void consumeMessage(String message) throws JsonProcessingException {
        log.info("message consumed {}", message);

        MailDto mailDto = objectMapper.readValue(message, MailDto.class);
//        mailService.persistFoodOrder(foodOrderDto);
    }

}