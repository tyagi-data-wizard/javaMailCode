package com.optum.caffeineDemo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;


import com.optum.util.SendEmail;

public class mailDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("--------------------------------------------------");
		
		 System.out.print("Mail Delegate Class Called");
		
         String subject = "The process is running";
		 String toEmail = "";
		 String cc1Email = ""; 
		 String cc2Email = "";
		 String cc3Email = "";
		 String cc4Email = "";
		 String emailBodyText = "Hello,\n This is an auto-generated mail.\n Thanks";
		 String resultsFileName = "";
		 SendEmail sendEmail = new SendEmail();
		 
		 sendEmail.mailme(toEmail,
				 /*cc1Email,cc2Email,cc3Email,cc4Email,*/
				    subject, emailBodyText, resultsFileName);
				  
		 System.out.println("--------------------------------------------------");
     
   	System.out.println( "Process ended" );
		
	}

}
