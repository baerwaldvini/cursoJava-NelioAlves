package Exerc�ciosCondicional;

import java.util.Scanner;

public class Exerc�cio02 {

	/*
	 * Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou
	 * �mpar.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um valor:");
		int A = scan.nextInt();
		
		if (A % 2 == 0){
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		
	}

}
