package Secao10;

import java.util.Locale;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insert how many peoples: ");
		int People = scan.nextInt();
		
		System.out.println("Insert the measures: ");
		double[] array = new double [People];
		
		for (int i = 0; i < People; i++) {
			array [i] = scan.nextDouble();
		}
		double sum = 0.0;
		for (int i = 0; i < People; i++) {
			sum += array[i];
		}
		
		double avg = sum / People;
		
		System.out.println(avg);
		

	}

}
