package com.optum.Util;


import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;

public class SendEmail {
	
	
	public void sendEmail(String to, String cc1, String subject, 
			   String emailBodyText, String filename)
	   {    
		
		System.out.print("SendEmail util Called");
	      // Sender's email ID needs to be mentioned
	      String from = "noreply@uhc.com";
		
		
	      // Assuming you are sending email from localhost
	      String host = "mailo2.uhc.com";
	      //inbound.uhc.com
	      
	      // Get system properties
	      Properties properties = System.getProperties();

	      // Setup mail server
	      properties.setProperty("mail.smtp.host", host);

	      // Get the default Session object.
	      Session session = Session.getDefaultInstance(properties);

	      try{
	         // Create a default MimeMessage object.
	         MimeMessage message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));

	         // Set To: header field of the header.
	         message.addRecipient(Message.RecipientType.TO,
	                                  new InternetAddress(to));

	         if (cc1.length() > 5) {
	        	 message.addRecipient(Message.RecipientType.CC,
	                     new InternetAddress(cc1)); 
	         }
	         
	     
	         
	         // Set Subject: header field
	         message.setSubject(subject);
	         
//	         Iterator itr = emailBodyText.iterator();
//	         String tempLine = "\r\n";
//	     	 //use hasNext() and next() methods of Iterator to iterate through the elements
//	     	 while(itr.hasNext()) {
//	     	 	tempLine = tempLine + itr.next().toString() + "\r\n";
//	     	 }
	     	
	     	String bodyText = "Hello,/n Demo Mail from Team Caffeine";
	         
	         // Now set the actual message
	         message.setText(bodyText);
	         
	         
	      // Create the message part
	         BodyPart messageBodyPart = new MimeBodyPart();

	         // Now set the actual message
	         messageBodyPart.setText(bodyText);

	         // Send message
	         Transport.send(message);
	      }catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
	   }

}
