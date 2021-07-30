package it.antoniofittipaldi.poimanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.antoniofittipaldi.poimanager.model.POI;
import it.antoniofittipaldi.poimanager.service.ServizioPOI;

@Controller
public class ApplicationController {

	@Autowired
	ServizioPOI servizioPOI;

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("/nuovopoi")
	public String nuovopoi(Model modello) {
		POI nuovopoi = new POI();
		modello.addAttribute("poi", nuovopoi);
		return "nuovopoi";
	}

	@RequestMapping(path = "/inserimentoPoi", method = RequestMethod.POST)
	public String inserimentoPoi(POI poi) {
		servizioPOI.inserisciNelDb(poi);
		return "redirect:/confermainserimento";
	}

	@RequestMapping(path = "/aggiornamentoPoi", method = RequestMethod.POST)
	public String aggiornamentoPoi(POI poi) {
		servizioPOI.aggiornaNelDb(poi, poi.getId());
		return "redirect:/confermaaggiornamento";
	}

	@RequestMapping("/confermainserimento")
	public String confermainserimento() {
		return "confermainserimento";
	}

	@RequestMapping("/confermaaggiornamento")
	public String confermaaggiornamento() {
		return "confermaaggiornamento";
	}

	@RequestMapping("/mappa")
	public String mappa(Model modello) {
		Iterable<POI> punti = servizioPOI.leggiDb();
		modello.addAttribute("elencopoi", punti);
		return "mappa";
	}

	@RequestMapping("/poi/{id}")
	public String dettaglioPoi(Model modello, @PathVariable("id") Long id) {
		POI poi = servizioPOI.leggiSingoloPoiTramiteIdDb(id);
		modello.addAttribute("poi", poi);
		return "poi";
	}

	@RequestMapping("/modificapoi/{id}")
	public String modificaPoi(Model modello, @PathVariable("id") Long id) {
		POI poi = servizioPOI.leggiSingoloPoiTramiteIdDb(id);
		modello.addAttribute("poi", poi);
		return "modificapoi";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

}