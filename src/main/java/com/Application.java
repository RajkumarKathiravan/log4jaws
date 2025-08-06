package com;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
static Logger L= Logger.getLogger(Application.class);

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		BasicConfigurator.configure();
		PropertyConfigurator.configure("log4j.properties");
		L.info("main method Executed");
		SpringApplication.run(Application.class, args);
		L.warn("Exception may occur");
	}

}
