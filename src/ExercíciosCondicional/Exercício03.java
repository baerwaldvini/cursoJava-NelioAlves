package Exerc�ciosCondicional;

import java.util.Scanner;

public class Exerc�cio03 {

	/*
	 * Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem
	 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o
	 * m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em ordem
	 * crescente ou decrescente.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int A, B;

		System.out.println("Insira os valores: ");
		A = scan.nextInt();
		B = scan.nextInt();

		if((A%B == 0) || (B%A == 0)) {
			System.out.println("S�o Multiplos");
		} else {
			System.out.println("N�o S�o Multiplos");
		}
		
	}

}
