package ExercíciosIniciantes;

import java.util.Scanner;

public class Exercício03 {

	/*
	 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
	 * calcule e mostre a diferença do produto de A e B pelo produto de C e D
	 * segundo a fórmula: DIFERENCA = (A * B - C * D)
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int A, B, C, D, DIFERENCA, Var1, Var2;

		System.out.println("Informe o valor A:");
			A = scan.nextInt();
		System.out.println("Informe o valor B:");
			B = scan.nextInt();
				Var1 = A * B;
		System.out.println("Informe o valor C:");
			C = scan.nextInt();
		System.out.println("Informe o valor D:");
			D= scan.nextInt();
				Var2 = C * D;
		DIFERENCA = Var1 - Var2;
		
		System.out.println("DIFERENCA = " + DIFERENCA);
	}

}
