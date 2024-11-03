package liveCodingJava.it;

import java.util.Random;
import java.util.Scanner;

public class EsercizioRandom {

	public static void main(String[] args) {

		String invitati[] = { "messi", "rolando", "speed", "kai" };

		Scanner input = new Scanner(System.in);

		System.out.println("inserici il tuo nome");

		String guestName = input.nextLine();

		boolean found = false;

		for (int i = 0; i < invitati.length; i++) {
			String invitato = invitati[i];
//			System.out.println(invitato);
			if (invitati[i].equals(guestName)) {
				System.out.println("sei stato invitato");
				found = true;
				break;
			}

		}
		if (!found) {
			System.out.println("non sei stato invitato");
		}

		input.close();
	}
}
