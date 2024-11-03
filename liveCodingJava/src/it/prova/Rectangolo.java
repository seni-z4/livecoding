package it.prova;

public class Rectangolo {
	//dichiare i atributi del variabile
	private int base;
	private int altezza;
	
	public Rectangolo( int altezza ,int b) { //costruttore creato con public 
		this.base = b;
		this.altezza = altezza;
	}

	public int area() {
		int area = this.base * this.altezza;
		return area;
	}
	public int parametro() {
		int parametro = (2*this.base) + (2*this.altezza);
		return parametro;
	}
	
	public void disengna() {
		for(int i = 1; i <= this.altezza; i++) { //altezza 4 // base 4
			for(int y=1; y<=this.base; y++) {
			 if(i == 1 || i == this.altezza) {
				 System.out.print("0 ");
			 }else if(y==1 || y == this.base) {
				 System.out.print("0 ");
			 }else {
				 System.out.print("  ");
			 }

			}
			System.out.println();
		}
	}
}
