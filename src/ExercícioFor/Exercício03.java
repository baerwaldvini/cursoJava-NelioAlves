package ExercícioFor;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N;
		double nota1, nota2, nota3, media;
		media = 0;

		System.out.println("Insira quantas médias serão calculadas: ");
		N = scan.nextInt();
		System.out.println("***************************************" + "\n Agora insira as notas: ");
		for (int i = 0; i < N; i++) {
			nota1 = scan.nextDouble();
			nota2 = scan.nextDouble();
			nota3 = scan.nextDouble();

			media = ((nota1 * 0.2) + (nota2 * 0.3) + (nota3 * 0.5));
			System.out.printf("Média destas notas: " + "%.1f%n", media);
		}

	}

}
