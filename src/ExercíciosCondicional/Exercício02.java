package ExercíciosCondicional;

import java.util.Scanner;

public class Exercício02 {

	/*
	 * Fazer um programa para ler um número inteiro e dizer se este número é par ou
	 * ímpar.
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
