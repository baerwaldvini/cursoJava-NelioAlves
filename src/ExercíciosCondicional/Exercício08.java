package ExercíciosCondicional;

import java.util.Scanner;

public class Exercício08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double x, calculo;

		calculo = 0;

		System.out.println("Insira seu salário: ");
		x = scan.nextDouble();

		if (x <= 2000) {
			calculo = 0;
		} else if ((x >= 2000.01) && (x <= 3000)) {
			calculo = x * 0.08;
		} else if ((x >= 3000.01) && (x <= 4500)) {
			calculo = x * 0.18;
		} else if (x >= 4500.01) {
			calculo = x * 0.28;
		}

		System.out.printf("Imposto R$ " + "%.2f%n",calculo);
	}

}
