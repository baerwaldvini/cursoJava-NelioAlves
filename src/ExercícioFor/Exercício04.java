package Exerc�cioFor;

import java.util.Scanner;

public class Exerc�cio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N;
		double value1, value2;
		
		double calculo = 0;
		
		N = scan.nextInt();
				
		for ( int i = 0; i < N; i++) {
			value1 = scan.nextDouble();
			value2 = scan.nextDouble();
			
			if (value2 == 0) {
				System.out.println("DIVIS�O IMPOSS�VEL");
			} else {
				calculo = value1 / value2;
			}
			System.out.printf("Resultado desta divis�o: " + "%.1f%n",calculo);
		}
		
	}

}
