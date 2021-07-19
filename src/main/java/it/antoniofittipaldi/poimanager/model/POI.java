package it.antoniofittipaldi.poimanager.model;

import java.util.ArrayList;

public class POI {
	
	private long id;
	private String nome;
	private double latitudine;
	private double longitudine;
	private String descrizione;
	private ArrayList immagini;
	
	public POI() {
		
	}

	public POI(long id, String nome, double latitudine, double longitudine, String descrizione, ArrayList immagini) {
		super();
		this.id = id;
		this.nome = nome;
		this.latitudine = latitudine;
		this.longitudine = longitudine;
		this.descrizione = descrizione;
		this.immagini = immagini;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getLatitudine() {
		return latitudine;
	}

	public void setLatitudine(double latitudine) {
		this.latitudine = latitudine;
	}

	public double getLongitudine() {
		return longitudine;
	}

	public void setLongitudine(double longitudine) {
		this.longitudine = longitudine;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public ArrayList getImmagini() {
		return immagini;
	}

	public void setImmagini(ArrayList immagini) {
		this.immagini = immagini;
	}
	
}