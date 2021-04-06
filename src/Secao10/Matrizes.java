package Secao10;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[][] mat = new int[n][n];
		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = scan.nextInt();
			}
		}
		System.out.println("Main diagonal: ");
		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers: " + count);

	}

}
