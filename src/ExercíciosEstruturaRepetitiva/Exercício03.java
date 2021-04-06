package ExercíciosEstruturaRepetitiva;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x;

		x = scan.nextInt();
		int contGas = 0;
		int contAlc = 0;
		int contDie = 0;

		while (x != 4) {
			if (x == 1) {
				contAlc += 1;
			} else if (x == 2) {
				contGas += 1;
			} else if (x == 3) {
				contDie += 1;				
			}
			x = scan.nextInt();
		}

		System.out.println(
				"MUITO OBRIGADO !" + "\n ALCOOL: " + contAlc + "\n GASOLINA: " + contGas + "\n Diesel: " + contDie);
	}

}
