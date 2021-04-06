package ExercíciosCondicional;

import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double valor;
		String intervalo = null;

		valor = scan.nextDouble();

		if ((valor >= 0) && (valor <= 25)) {
			intervalo = "[0,25]";
		} else if ((valor >= 25.01) && (valor <= 50)) {
			intervalo = "[25,50]";
		} else if ((valor >= 50.01) && (valor <= 75)) {
			intervalo = "[50,75]";
		} else if ((valor >= 75.01) && (valor <= 100)) {
			intervalo = "[75,100]";
		} else {
			System.out.println("Fora de intervalo!");
		}

		System.out.println("INTERVALO = " + intervalo);
	}

}
