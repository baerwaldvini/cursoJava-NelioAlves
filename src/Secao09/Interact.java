package Secao09;

import java.util.Locale;
import java.util.Scanner;

public class Interact {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		Apoio apoio;
		
		System.out.print("Enter account number: ");
		int number = scan.nextInt();
		
		System.out.print("Enter account holder: ");
		scan.nextLine();
		String holder = scan.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = scan.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = scan.nextDouble();
			apoio = new Apoio(number, holder, initialDeposit);
		} else {
			apoio = new Apoio(number, holder);
		}
		
		System.out.println("\n" + "Account data: ");
		System.out.print(apoio);

		System.out.print("\n" + "Enter a deposit value: ");
		double Deposit = scan.nextDouble();
		
		apoio.deposit(Deposit);
		
		System.out.println("\n" + "Updated account data:");
		System.out.print(apoio);
		
		System.out.print("\n" + "Enter a withdraw value: ");
		double Withdraw = scan.nextDouble();

		apoio.withdraw(Withdraw);
		
		System.out.println("\n" + "Updated account data:");
		System.out.print(apoio);
		
		
	}

}
