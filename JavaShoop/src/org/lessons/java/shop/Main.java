package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Prodotto testProdotto = new Prodotto("Tazza", "Tazza da the",7.50f,22);
		
		System.out.println(testProdotto.getNomeConCodice());
		System.out.println(testProdotto.getPrezzo());
		System.out.println(testProdotto.getPrezzoConIva());


	}

}

