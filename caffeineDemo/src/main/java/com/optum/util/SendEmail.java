package com.optum.util;

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
	
	
	
	public  void mailme(String to,
			/*String cc1,String cc2, String cc3, String cc4,*/
			String subject,String emailBodyText, String filename) throws MessagingException
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

	     
	         // Create a default MimeMessage object.
	         MimeMessage message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));

	         // Set To: header field of the header.
	         message.addRecipient(Message.RecipientType.TO,
	                                  new InternetAddress(to));
	         //Adding cc
	     /*    if (cc1.length() > 5) {
	        	  message.addRecipient(Message.RecipientType.CC,
	        	 new InternetAddress(cc1));
	        }
	        if (cc2.length() > 5) {
	        	 message.addRecipient(Message.RecipientType.BCC,
	        	 new InternetAddress(cc2));
	        }
	        if (cc3.length() > 5) {
	        	 message.addRecipient(Message.RecipientType.BCC,
	        	new InternetAddress(cc3));
	        }
	        if (cc4.length() > 5) {
		        	 message.addRecipient(Message.RecipientType.BCC,
		        	new InternetAddress(cc4));
		    }
	         */
	         // Set Subject: header field
	         message.setSubject(subject);
	         

	     	String bodyText = emailBodyText;
	         
	         // Now set the actual message
	         message.setText(bodyText);
	         
	         
	      // Create the message part
	         BodyPart messageBodyPart = new MimeBodyPart();

	         // Now set the actual message
	         messageBodyPart.setText(bodyText);

	         // Send message
	         Transport.send(message);
	         
	         

	 		System.out.print("SendEmail util ended");
	      
	   }
}

