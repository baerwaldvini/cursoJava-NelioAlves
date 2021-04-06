package ExercíciosEstruturaRepetitiva;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x;

		System.out.println("Insira a senha: ");
		x = scan.nextInt();

		while (x != 2002) {
			System.out.println("Senha Inválida!");
			break;
		}
		if (x == 2002) {
			System.out.println("Acesso Permitido");
		}
	}

}
