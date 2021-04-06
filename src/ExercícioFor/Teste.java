package ExercícioFor;

import java.util.Scanner;

public class Teste {

	/*
	 * for (inicio; condição; incremento){ comando 1 comando 2 }
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int cont;

		System.out.println("Insira vezes deseja delcarar valores: ");
		cont = scan.nextInt();

		int soma = 0;

		System.out.println("Declare: ");
		for (int i = 0; i < cont; i++) {
			int x = scan.nextInt();
			
			soma = soma + x;
		}
		System.out.println("A soma dos valores apresentados é: " + soma);		
	}

}
