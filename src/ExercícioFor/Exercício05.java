package ExercícioFor;

import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N, fat;

		N = scan.nextInt();
		
		fat = 1;
		for (int i = 1; i <= N; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
	}

}
