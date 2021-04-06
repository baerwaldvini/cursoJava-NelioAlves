package Secao09;

public class Apoio {

	private int Number;
	private String Holder;
	private double Balance;

	

	public Apoio(int number, String holder) {
		Number = number;
		Holder = holder;
	}

	public Apoio(int number, String holder, double initialDeposit) {
		this.Number = number;
		this.Holder = holder;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return Number;
	}

	public String getHolder() {
		return Holder;
	}

	public void setHolder(String holder) {
		Holder = holder;
	}

	public double getBalance() {
		return Balance;
	}

	public void deposit(double amount) {
		Balance += amount;
	}

	public void withdraw(double amount) {
		Balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ Number
				+ ", Holder: " 
				+ Holder
				+ ", Balance: " 
				+ String.format("%.2f", Balance);
	}

}
