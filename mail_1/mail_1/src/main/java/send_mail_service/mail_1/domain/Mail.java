package send_mail_service.mail_1.domain;

import lombok.Data;
import lombok.Value;

import java.util.Date;

@Data
@Value
public class Mail {

    public long id;

    public String name;

    public String context;

    public String sent_date;

    public Mail(long id, String name, String context, String sentDate) {

        this.id = id;
        this.name = name;
        this.context = context;
        this.sent_date = sentDate;
    }


}
