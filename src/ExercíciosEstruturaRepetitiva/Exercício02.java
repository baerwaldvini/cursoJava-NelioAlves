package ExercíciosEstruturaRepetitiva;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x, y;

		x = scan.nextInt();
		y = scan.nextInt();

		while ((x != 0) && (y != 0)) {
			if (( x > 0) && (y > 0)) {
				System.out.println("Primeiro");
			} else if ((x > 0) && (y < 0)) {
				System.out.println("Quarto");
			} else if ((x < 0) && ( y > 0)) {
				System.out.println("Segundo");
			} else {
				System.out.println("Terceiro");
			}
			break;
		}

	}

}
