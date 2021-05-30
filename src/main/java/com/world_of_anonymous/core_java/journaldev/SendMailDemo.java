package com.world_of_anonymous.core_java.journaldev;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendMailDemo {
  public static void main(String[] args) throws MessagingException {
    String from = "dhwanil@weetechsolution.com";
    String to = "vijayrathod@weetechsolution.com";
    String host = "localhost";

    Properties properties = new Properties();
    properties.setProperty("mail.smtp.host", host);
    Session session = Session.getDefaultInstance(properties);

    MimeMessage mimeMessage = new MimeMessage(session);
    mimeMessage.setText("My email subject");
    mimeMessage.setSubject("My email subject");
    mimeMessage.setFrom(new InternetAddress(from));
    mimeMessage.addRecipients(Message.RecipientType.TO, String.valueOf(new InternetAddress(to)));

    Transport.send(mimeMessage);
    System.out.println("Mail sent successfully.");
  }
}
