package Exerc�cioFor;

import java.util.Scanner;

public class Exerc�cio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x;
		
		System.out.println("Informe um n�mero inteiro: ");
		x = scan.nextInt();
		
		for (int i = 1; i <= x; i++) {
			System.out.println(i + " " + (i * i) + " " + (i * i * i));
		}

	}

}
