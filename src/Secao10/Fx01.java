package Secao10;

import java.util.Locale;
import java.util.Scanner;

public class Fx01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);

		Fx01Apoio[] array = new Fx01Apoio[10];

		System.out.println("How many rooms will be rented?");
		int n = scan.nextInt();

		for(int i = 0; i < n; i++) {
			int op = i +1;
			
			System.out.println("\nRent #" + op +":");
			System.out.print("Name: ");
			String name = scan.next();
			System.out.print("E-mail: ");
			String Email = scan.next();
			System.out.print("Room: ");
			int Room = scan.nextInt();
			
		
			System.out.println("\nBusy rooms: ");
			array[Room] = new Fx01Apoio(name,Email);
		}
		for (int i = 0; i < array.length; i++) {
			if(array[i] != null) {
				System.out.println(i + ": " + array[i]);
			}
		}

	}

}
