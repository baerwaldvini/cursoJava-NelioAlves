package ExercíciosCondicional;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int A, B;
		
		System.out.println("Informe as horas: ");
		A = scan.nextInt(); B = scan.nextInt();
		
		if (A > B) {
			System.out.println("O jogo durou " + (A - B) + " horas.");
		} else if (B > A){
			System.out.println("O jogo durou " + (B - A) + " horas.");
		} else {
			System.out.println("O jogo durou 24 horas.");
		}
	}

}
