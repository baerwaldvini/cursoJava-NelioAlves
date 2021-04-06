package ExercíciosCondicional;

import java.util.Scanner;

public class Exercício01 {

	/*
	 * Fazer um programa para ler um número inteiro, e depois dizer se este número é
	 * negativo ou não.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int A;
		
		System.out.println("Digite algum número inteiro: ");
		A = scan.nextInt();
		
		if (A >= 0){
			System.out.println("NÃO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}

	}

}
