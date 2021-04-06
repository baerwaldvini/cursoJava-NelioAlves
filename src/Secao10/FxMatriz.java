package Secao10;

import java.util.Scanner;

public class FxMatriz {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Quantas linhas?");
		int m = scan.nextInt();
		System.out.println("Quantas colunas?");
		int n = scan.nextInt();

		int[][] mat = new int[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("\nInsira o valor da linha " + (i + 1) + " coluna " + (j + 1) + ": ");
				mat[i][j] = scan.nextInt();
			}
		}

		System.out.print("\nInsira o numero: ");
		int pm = scan.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == pm) {
					System.out.println("\nPosição " + (i + 1) + ", " + (j + 1) + ": ");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Riht: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}

			}
		}
	}

}
