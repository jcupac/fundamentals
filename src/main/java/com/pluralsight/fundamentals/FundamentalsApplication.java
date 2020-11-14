package com.pluralsight.fundamentals;

import com.pluralsight.fundamentals.entity.Application;
import com.pluralsight.fundamentals.repository.ApplicationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FundamentalsApplication {

	private static final Logger log = LoggerFactory.getLogger((FundamentalsApplication.class));

	public static void main(String[] args) {
		SpringApplication.run(FundamentalsApplication.class, args);
		System.out.println("Hello everyone!");
	}

	@Bean
	public CommandLineRunner demo(ApplicationRepository repository) {
		return args -> {
			repository.save(new Application("App1", "jelena.cupac", "short description"));
			repository.save(new Application("App2", "j.cupac", "another description"));
			repository.save(new Application("App3", "anna.vo", "about this app"));

			for (Application application : repository.findAll()) {
				log.info("The app is: " + application.toString());
			}
		};
	}

}
