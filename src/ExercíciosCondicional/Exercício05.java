package ExercíciosCondicional;

import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int Cod, quan;

		double total = 0;

		System.out.println("Insira o código e quantidade: ");
		Cod = scan.nextInt();
		quan = scan.nextInt();

		if (Cod == 1) {
			total = quan * 4.00;
		} else if (Cod == 2) {
			total = quan * 4.50;
		} else if (Cod == 3) {
			total = quan * 5.00;
		} else if (Cod == 4) {
			total = quan * 2;
		} else if (Cod == 5) {
			total = quan * 1.50;
		} else {
			System.out.println("Insira um código válido");
		}

		System.out.printf("Total : R$ " + "%.2f%n", total);

	}

}
