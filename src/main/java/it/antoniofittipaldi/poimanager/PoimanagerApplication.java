package it.antoniofittipaldi.poimanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class PoimanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoimanagerApplication.class, args);
	}
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}

}
