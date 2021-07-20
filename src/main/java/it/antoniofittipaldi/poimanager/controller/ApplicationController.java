package it.antoniofittipaldi.poimanager.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String mappa(Model modello) {
		POI punto1 = new POI(
				1,
				"Tavole Palatine",
				40.4160721,
				16.8145609,
				"Antichi resti di un tempo greco",
				new ArrayList()
				);
		POI punto2 = new POI(
				2,
				"Sassi di Matera",
				40.6645789,
				16.6115742,
				"Centro storico della città di Matera",
				new ArrayList()
				);
		ArrayList<POI> punti = new ArrayList<POI>();
		punti.add(punto1);
		punti.add(punto2);
		modello.addAttribute("elencopoi", punti);
		return "mappa";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

}