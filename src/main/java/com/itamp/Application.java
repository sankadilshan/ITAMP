package com.itamp;


import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;



@SpringBootApplication
@EnableAutoConfiguration
public class Application{
    private final static String ACCOUNT_SID="AC84ad6b9ebd0216c2d81b6ae607c56278";
    private final static String AUTH_ID="45dc82df713c02229458f0c9654ececc";
    
  /* static {
	   Twilio.init(ACCOUNT_SID, AUTH_ID); 
   }*/
 
	public static void main(String[] args){
          SpringApplication.run(Application.class, args);
        
         
      
	}


/*	@Override
	public void run(ApplicationArguments args) throws Exception {
		  Message.creator( 
                 new com.twilio.type.PhoneNumber("+94715837530"), 
                 new com.twilio.type.PhoneNumber("+17016383670"),  
                 "Your")      
             .create(); 
  
        
	}*/

	

}
