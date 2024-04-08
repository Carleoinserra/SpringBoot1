package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@SpringBootApplication
public class DiExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiExampleApplication.class, args);
		
		
		
		 // Creiamo il contesto dell'applicazione utilizzando la configurazione definita in AppConfig
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Otteniamo un'istanza di Logger dal contesto
        Logger logger = context.getBean(Logger.class);
       
        
     
        
        
        
        

        // Utilizziamo il logger per registrare un messaggio
        logger.log("Hello");
        
	}

}
