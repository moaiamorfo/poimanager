package it.antoniofittipaldi.poimanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class PoimanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoimanagerApplication.class, args);
	}

}