package liveCodingJava.it;

import java.time.LocalDateTime;
import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		System.out.println("inserici il tuo password");
		
		Scanner input = new Scanner(System.in);
		String password = input.nextLine();
		
		System.out.println("inserici il tuo nome");
		String nome = input.nextLine();
		
		System.out.println("inserirre il giorno della nascita");
		int giorno  = input.nextInt();
		
		System.out.println("inserirre il mese della nascita");
		int mese  = input.nextInt();
		
		System.out.println("inserirre il anno della nascita");
		int anno  = input.nextInt();
		
		LocalDateTime dataRifermento = LocalDateTime.of(anno, mese, giorno, 0, 0);

		System.out.println("il mio nome e " + nome + "e il mio password e " +password + " " +dataRifermento);
	}
}
