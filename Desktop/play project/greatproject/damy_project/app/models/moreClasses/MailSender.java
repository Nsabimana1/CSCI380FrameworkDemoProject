package models.dummy;

import play.Logger;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;


/**
 * Created by Innocent on 7/9/2018.
 */
public class MailSender {

    public boolean sendMail(final String subject, final String toAddress, final String message) throws Exception {
        Properties props = System.getProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.port", PORT);
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        Session session = Session.getDefaultInstance(props);
        MimeMessage msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(FROM, FROMNAME));
        msg.setRecipient(Message.RecipientType.TO, new InternetAddress(toAddress));
        msg.setSubject(subject);
        msg.setContent(message, "text/html");
        msg.setHeader("X-SES-CONFIGURATION-SET", CONFIGSET);
        Transport transport = session.getTransport();
        try {
            transport.connect(HOST, SMTP_USERNAME, SMTPKEY);
            return Boolean.TRUE;
        } catch (Exception ex) {
            Logger.info(ex.getMessage());
            return Boolean.FALSE;
        } finally {
            transport.close();
        }

    }

    static final String FROM = "dummy@hexakomb.com";
    static final String FROMNAME = "Innocent Dummy Project";
    static final String SMTP_USERNAME = "AKIAIXKJSE7JSVOVNI4Q";
    static final String SMTPKEY = "AukG9S0APw77zSwsvbi13AhHzdl3uiZa5PrSt76WF74D";
    static final String CONFIGSET = "ConfigSet";
    static final String HOST = "email-smtp.us-west-2.amazonaws.com";
    static final int PORT = 587;

}
