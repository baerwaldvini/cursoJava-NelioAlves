package ExercícioFor;

import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x;

		System.out.println("Informe um número inteiro: ");
		x = scan.nextInt();

		System.out.println("Seus divisores são: ");
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				System.out.println(i);
			}

		}
	}

}
