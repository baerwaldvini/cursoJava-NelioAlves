package Exerc�ciosIniciantes;

import java.util.Scanner;

public class Exerc�cio01 {

	public static void main(String[] args) {

		/*
		 Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a
		 soma desses n�meros com uma mensagem explicativa, conforme exemplos.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int a, b , c;
		
		System.out.println("Insira o primeiro valor:");
		a = scan.nextInt();
		System.out.println("Insira o segundo valor:");
        b = scan.nextInt();
        
        c = a + b;
        
        System.out.println("SOMA = " + c);
	}

}
