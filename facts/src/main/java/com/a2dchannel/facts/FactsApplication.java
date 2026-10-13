package com.a2dchannel.facts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FactsApplication {

public 	ConfigRunner configrunner;
	public static void main(String[] args) {
			System.out.println("so this is the entry in the Spring boot project too");
	ConfigurableApplicationContext cntx=	SpringApplication.run(FactsApplication.class, args);
	ConfigRunner runner=cntx.getBean(ConfigRunner.class);
	runner.getName();
		new Student();
		
	}

}
