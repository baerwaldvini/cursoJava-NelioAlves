package ExercíciosIniciantes;

import java.util.Locale;
import java.util.Scanner;

public class Exercício02 {

	/*
	 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
	 * valor da área deste círculo com quatro casas decimais conforme exemplos.
	 * Fórmula da área: area = π . raio2 Considere o valor de π = 3.14159
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);

		double raio, area, R;
		double pi = Math.PI;

		System.out.println("Informe o Raio da circunferência:");
		raio = scan.nextDouble();
		R = Math.pow(raio, 2);

		area = pi * R;

		System.out.printf("Área =" + " %.4f%n", area);

	}

}
