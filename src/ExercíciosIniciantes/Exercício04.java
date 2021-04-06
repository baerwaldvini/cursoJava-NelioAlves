package ExercíciosIniciantes;

import java.util.Locale;
import java.util.Scanner;

public class Exercício04 {

	/*
	 * Fazer um p ograma que leia o número de um funcionário, seu número de horas
	 * trabalhadas, o valor que recebe por hora e calcula o salário desse
	 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
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
