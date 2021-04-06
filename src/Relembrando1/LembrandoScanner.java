package Relembrando1;

import java.util.Scanner;

public class LembrandoScanner {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Insert a integer variable:");
		a = x.nextInt();
		System.out.println("Insert another a integer variable:");
		b = x.nextInt();
		c = a * b;
		System.out.println("Var 1 * Var 2 = " + c);
	}

}
