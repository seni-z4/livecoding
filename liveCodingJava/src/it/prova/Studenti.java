package it.prova;

public class Studenti {
	private String name;
	private String surname;
	private int age;
	
	public Studenti(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public void DatiUtente() {
		System.out.println("il tuo nome e " + name + " e tuo cognome e " + surname+ " e hai " + age + " anni" );
	}
}
