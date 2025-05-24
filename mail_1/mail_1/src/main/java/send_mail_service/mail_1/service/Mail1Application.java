package send_mail_service.mail_1.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("send_mail_service.mail_1")
public class Mail1Application {

	public static void main(String[] args) {
		SpringApplication.run(Mail1Application.class, args);
	}

}
