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
		 String toEmail = "ujjwal_tyagi@optum.com";
		 String cc1Email = "palki1@optum.com"; 
		 String cc2Email = "amit.bhutani@optum.com";
		 String cc3Email = "shwetabh_srivastava@optum.com";
		 String cc4Email = "ganeshbabu_r@optum.com";
		 String emailBodyText = "Hello,\n This is an auto-generated mail from Team Caffeine as part of the demo project.\n Thanks";
		 String resultsFileName = "ujjwal_tyagi@optum.com";
		 SendEmail sendEmail = new SendEmail();
		 
		 sendEmail.mailme(toEmail,
				 /*cc1Email,cc2Email,cc3Email,cc4Email,*/
				    subject, emailBodyText, resultsFileName);
				  
		 System.out.println("--------------------------------------------------");
     
   	System.out.println( "Process ended" );
		
	}

}
