package Exerc�ciosIniciantes;

import java.util.Locale;
import java.util.Scanner;

public class Exerc�cio04 {

	/*
	 * Fazer um p ograma que leia o n�mero de um funcion�rio, seu n�mero de horas
	 * trabalhadas, o valor que recebe por hora e calcula o sal�rio desse
	 * funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas
	 * casas decimais.
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);

		double days, hours, salary, calculum;
		
		System.out.println("Please, insert how many days you worked in this month:");
		days = scan.nextDouble();
		
		System.out.println("Please, insert how many hours you worked in a normal day:");
		hours = scan.nextDouble();
		
		System.out.println("Please, insert how much you earn per hour:");
		salary = scan.nextDouble();
		
		calculum = ((hours * salary) * days);
		
		System.out.println("NUMBER = " + days);
		System.out.printf("SALARY = " + "%.2f%n", calculum);
		
	}

}
