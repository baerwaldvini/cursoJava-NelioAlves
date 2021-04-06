package ExercícioFor;

import java.util.Scanner;

public class Exercício04 {

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
				System.out.println("DIVISÃO IMPOSSÍVEL");
			} else {
				calculo = value1 / value2;
			}
			System.out.printf("Resultado desta divisão: " + "%.1f%n",calculo);
		}
		
	}

}
