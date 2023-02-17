package com.optum.CaffeineDemo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import com.optum.Util.SendEmail;

public class MailDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
	
		String subject = "Error has occurred in file processing";
		 
		 String toEmail = "ujjwal_tyagi@optum.com";
		 String cc1Email = "palki1@optum.com";
		 
		 String emailBodyText = "Hello,/n This is an auto-generated mail from Team Caffeine as part of the demo project./n Thanks";
	

		 String resultsFileName = "ujjwal_tyagi@optum.com";

		 
		 
	    	SendEmail sendEmail = new SendEmail();
			sendEmail.sendEmail(toEmail, cc1Email, subject, 
					emailBodyText, resultsFileName);

	}

}
