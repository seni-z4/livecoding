package it.prova;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jsnacks2 bank = new Jsnacks2(12223344, 150);

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("welcome to senz bank");
			System.out.println("chose a action");
			System.out.println("1.check balance");
			System.out.println("2.deposto");
			System.out.println("3.withdraw");
			System.out.println("4.exit");

			int choice = input.nextInt();

			switch (choice) {
			case 1:
				System.out.println("current balabce is " + bank.getBalance());
				break;

			case 2:
				System.out.println("enter the amount you want to deposit : ");
				long depositamount = input.nextLong();
				bank.deposit(depositamount);
				break;

			case 3:
				System.out.println("enter withdrwa amount : ");
				long withdrawamount = input.nextLong();
				bank.withdraw(withdrawamount);
				break;

			case 4:
				System.out.println("thanks you");
				input.close();
				System.exit(0);

			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}

	}

}