package Exerc�ciosCondicional;

import java.util.Scanner;

public class Exerc�cio01 {

	/*
	 * Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero �
	 * negativo ou n�o.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int A;
		
		System.out.println("Digite algum n�mero inteiro: ");
		A = scan.nextInt();
		
		if (A >= 0){
			System.out.println("N�O NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}

	}

}
