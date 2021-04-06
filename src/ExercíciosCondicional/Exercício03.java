package ExercíciosCondicional;

import java.util.Scanner;

public class Exercício03 {

	/*
	 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
	 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
	 * múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
	 * crescente ou decrescente.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int A, B;

		System.out.println("Insira os valores: ");
		A = scan.nextInt();
		B = scan.nextInt();

		if((A%B == 0) || (B%A == 0)) {
			System.out.println("São Multiplos");
		} else {
			System.out.println("Não São Multiplos");
		}
		
	}

}
