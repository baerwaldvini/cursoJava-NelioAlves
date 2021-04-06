package ExercíciosEstruturaRepetitiva;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x, soma;

		x = scan.nextInt();
		
		soma = 0;
		while (x != 0) {
			soma += x;
			x = scan.nextInt();
		}
		System.out.println(soma);

	}

}
