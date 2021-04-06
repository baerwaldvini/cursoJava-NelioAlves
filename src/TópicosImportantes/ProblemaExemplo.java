package TópicosImportantes;

import java.util.Scanner;

public class ProblemaExemplo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y, z, a;

		System.out.println("Enter three numbers: ");

		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();

		a = max(x, y, z);

		showResult(a);

	}

	public static int max(int d, int b, int c) {
		int aux;

		if (d > b && d > c) {
			aux = d;
		} else if (b > c) {
			aux = b;
		} else {
			aux = c;
		}
		return aux;
	}

	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}
