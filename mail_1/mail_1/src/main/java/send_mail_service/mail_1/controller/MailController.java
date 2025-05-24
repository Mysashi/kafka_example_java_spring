package send_mail_service.mail_1.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import send_mail_service.mail_1.domain.Mail;
import send_mail_service.mail_1.service.MailService;

@Slf4j
@RestController
@RequestMapping("/mail")
public class MailController {

    private final MailService mailService;


    @Autowired
    public MailController(MailService mailService) {
        this.mailService = mailService;
    }


    @PostMapping
    public HttpStatus sendMail(@RequestBody Mail mail) {
        System.out.println("Request achieved");
        mailService.sendMail(mail);
        return HttpStatus.OK;
    }

}
