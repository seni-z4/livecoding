package it.prova;

public class Auto {

	public String colore;
	public String marca;
	public int anno;
	
	public Auto(String colore , String marca , int anno) { //questo e il costrutore
		this.colore = colore;
		this.marca = marca;
		this.anno = anno;
		
	}
	
	public void Parti() {
		System.out.println("Accensione incorso");
		System.out.println("Auto di marca " + marca + " e colore " + colore + " del anno " + anno + " e acesso");
	}
	
	
}
