package it.prova;

public class Jsnacks2 {
	private long numeroDiConto;
	private long balance;

	public Jsnacks2(long numeroDiConto, long balance) {
		this.numeroDiConto = numeroDiConto;
		this.balance = balance;

	}

	public long getBalance() {
		return balance;
	}

	public void deposit(long amount) {
		if (amount > 0) {
			amount += balance;
			System.out.println("depodited sussefully here is your balace " + amount);
		} else {
			System.out.println("invalid amount please try again later ");
		}
	}

	public void withdraw(long amount) {
		if (amount > 0 && amount <= balance) {
			amount -= balance;
			System.out.println("you have widthdrwan sussfelly here is ypur account balance " + amount);
		} else if (amount > balance) {

			System.out.println("insafisan fund please enter a another amount");
		} else {
			System.out.println("invalid amount please check again");
		}
	}

}
