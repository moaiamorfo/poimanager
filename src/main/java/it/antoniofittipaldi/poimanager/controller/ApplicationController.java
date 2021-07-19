package it.antoniofittipaldi.poimanager.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import it.antoniofittipaldi.poimanager.model.POI;

@Controller
public class ApplicationController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/mappa")
	@ResponseBody
	public POI mappa() {
		POI punto = new POI(
				1,
				"Teatro",
				10.000,
				20.000,
				"Teatro di origine settecentesca",
				new ArrayList()
				);
		return punto;
		// return "mappa";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

}