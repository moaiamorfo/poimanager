package it.antoniofittipaldi.poimanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.antoniofittipaldi.poimanager.model.POI;

@Service
public class ServizioPOI {

	@Autowired
	RepositoryPOI repositoryPOI;

	public POI inserisciNelDb(POI poi) {
		return repositoryPOI.save(poi);
	}

	public POI aggiornaNelDb(POI poi, Long id) {
		if (repositoryPOI.findById(id).isPresent())
			return repositoryPOI.save(poi);
		else
			return null;
	}

	public Iterable<POI> leggiDb() {
		return repositoryPOI.findAll();
	}

	public POI leggiSingoloPoiTramiteIdDb(Long id) {
		if (repositoryPOI.findById(id).isPresent())
			return repositoryPOI.findById(id).get();
		else
			return null;
	}

}