package Exerc�cioFor;

import java.util.Scanner;

public class Exerc�cio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int x;
		
		x = scan.nextInt();
		
		for (int i = 0; i <= x; i++) {
			if ( i%2 != 0) {
				System.out.println(i);
			}
		}
		
	}

}
