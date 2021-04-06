package ExercícioFor;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N;
		int in = 0;
		int out = 0;

		N = scan.nextInt();

		for (int i = 0; i < N; i++) {

			int x = scan.nextInt();

			if ((x >= 10) && (x <= 20)) {
				in = in +1;
			} else {
				out = out + 1;
			}
		}
		System.out.println(" In: " + in + "\n Out: " + out);
	}

}
