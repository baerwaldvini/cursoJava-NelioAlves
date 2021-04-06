package ExercíciosIniciantes;

import java.util.Scanner;

public class Exercício05 {

	/*
	 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
	 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
	 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double CodPc1, NumPc1, ValorPc1, CodPc2, NumPc2, ValorPc2, ValorTotal;
		
		System.out.println("Informe o código, a quantidade e o valor da peça 1: ");
		CodPc1 = scan.nextDouble(); NumPc1 = scan.nextDouble(); ValorPc1 = scan.nextDouble();
		
		System.out.println("Informe o código, a quantidade e o valor da peça 2: ");
		CodPc2 = scan.nextDouble(); NumPc2 = scan.nextDouble(); ValorPc2 = scan.nextDouble();
		
		System.out.println("VALOR A PAGAR R$: " +((ValorPc1 * NumPc1) + (ValorPc2 * NumPc2)));
	}

}
