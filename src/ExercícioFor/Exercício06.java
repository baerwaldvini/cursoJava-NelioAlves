package Exerc�cioFor;

import java.util.Scanner;

public class Exerc�cio06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x;

		System.out.println("Informe um n�mero inteiro: ");
		x = scan.nextInt();

		System.out.println("Seus divisores s�o: ");
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				System.out.println(i);
			}

		}
	}

}
