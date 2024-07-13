package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	private int codice;
	private float prezzo;
	private int iva;
	
	private String nome;
    private String descrizione;
    

    
    public Prodotto(String nome, String descrizione, float prezzo, int iva) {
    	
    	Random random = new Random();
    	
    	this.codice = random.nextInt(99999);
    	this.prezzo = prezzo;
    	this.iva = iva;
    	this.nome = nome;
    	this.descrizione = descrizione;
    }
	public float getPrezzo() {
		return this.prezzo;
	}
	public float getPrezzoConIva() {
		return	prezzo + (prezzo * iva /100);
	}
	public String getNomeConCodice() {
		return nome + "-" + codice;
	}
}
