package Secao10;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insert how many products you want registred: ");
		int n = scan.nextInt();
		
		Exemplo02Apoio[] array = new Exemplo02Apoio[n];
		
		for(int i = 0; i < array.length; i++) {
			scan.nextLine();
			System.out.print("\nInsert the product name: ");
			String name = scan.nextLine();
			System.out.print("Insert the product price: ");
			double price = scan.nextDouble();
			array[i] = new Exemplo02Apoio(name, price);
		}
		
		double sum = 0.0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i].getPrice();
		}
		double avg = sum / array.length;
		
		System.out.printf("AVERAGE PRICE = " + "%.2f%n", avg);
		
	}

}
