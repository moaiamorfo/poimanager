package it.antoniofittipaldi.poimanager.service;

import org.springframework.data.repository.CrudRepository;

import it.antoniofittipaldi.poimanager.model.POI;

public interface RepositoryPOI extends CrudRepository<POI, Long>{

}
