package com.nike.springbasic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private BusinessLogic businessLogic;

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/* parse this list into the Database - and print the database elements */
		businessLogic.parseMapString("blue:ice, red:wine, green:nature, purple:royalty");

		/* print the whitelisted elements */
		businessLogic.printWhitelisted();
	}
}
