package Exerc�ciosIniciantes;

import java.util.Scanner;

public class Exerc�cio05 {

	/*
	 * Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o
	 * valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 e
	 * o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double CodPc1, NumPc1, ValorPc1, CodPc2, NumPc2, ValorPc2, ValorTotal;
		
		System.out.println("Informe o c�digo, a quantidade e o valor da pe�a 1: ");
		CodPc1 = scan.nextDouble(); NumPc1 = scan.nextDouble(); ValorPc1 = scan.nextDouble();
		
		System.out.println("Informe o c�digo, a quantidade e o valor da pe�a 2: ");
		CodPc2 = scan.nextDouble(); NumPc2 = scan.nextDouble(); ValorPc2 = scan.nextDouble();
		
		System.out.println("VALOR A PAGAR R$: " +((ValorPc1 * NumPc1) + (ValorPc2 * NumPc2)));
	}

}
