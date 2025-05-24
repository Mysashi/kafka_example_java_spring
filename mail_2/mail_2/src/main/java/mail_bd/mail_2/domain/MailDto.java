package mail_bd.mail_2.domain;

import lombok.Data;
import lombok.Value;

@Data
@Value
public class MailDto {

    public long id;

    public String name;

    public String context;

    public String sent_date;

    public MailDto(long id, String name, String context, String sentDate) {

        this.id = id;
        this.name = name;
        this.context = context;
        this.sent_date = sentDate;
    }
}
