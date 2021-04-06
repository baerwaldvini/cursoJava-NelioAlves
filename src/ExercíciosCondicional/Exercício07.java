package ExercíciosCondicional;

import java.util.Scanner;

public class Exercício07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double x, y;
		String posicao;

		x = scan.nextDouble();
		y = scan.nextDouble();

		if ((x > 0) && (y > 0)) {
			posicao = "Q1";
		} else if ((x > 0) && (y < 0)) {
			posicao = "Q4";
		} else if ((x < 0) && (y > 0)) {
			posicao = "Q2";
		} else if ((x < 0) && (y < 0)) {
			posicao = "Q3";
		} else {
			posicao = "Origem";
		}

		System.out.println(posicao);

	}

}
