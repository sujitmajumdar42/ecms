package org.ecms.integration.config;

import java.io.IOException;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.support.ResourcePropertySource;

public class AppCotnexInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

	public void initialize(ConfigurableApplicationContext applicationContext) {
		ConfigurableEnvironment environment = applicationContext.getEnvironment();
        try {
            environment.getPropertySources().addFirst(new ResourcePropertySource("setup","classpath:setup.properties"));
            System.out.println("##"+environment.getPropertySources());
             
            System.out.println("context loaded..."+environment.getPropertySources().get("setup").getProperty("db.Configured"));
            
        } catch (IOException e) {
        	System.out.println("exception occured#######");
        	e.printStackTrace();
        }
	}

}
