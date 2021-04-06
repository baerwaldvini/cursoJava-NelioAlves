package Exerc�ciosIniciantes;

import java.util.Locale;
import java.util.Scanner;

public class Exerc�cio06 {

	/*
	 * Fazer um programa que leia tr�s valores com ponto flutuante de dupla
	 * precis�o: A, B e C. Em seguida, calcule e mostre: a) a �rea do tri�ngulo
	 * ret�ngulo que tem A por base e C por altura. b) a �rea do c�rculo de raio C.
	 * (pi = 3.14159) c) a �rea do trap�zio que tem A e B por bases e C por altura.
	 * d) a �rea do quadrado que tem lado B. e) a �rea do ret�ngulo que tem lados A
	 * e B.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		float A, B, C;
		
		System.out.println("Insira os valor A, B, C respectivamente: ");
		A = scan.nextFloat(); B = scan.nextFloat(); C = scan.nextFloat();
		
		System.out.printf("TRIANGULO: " + "%.3f%n",(A * C));
		System.out.printf("CIRCULO: " + "%.3f%n",(Math.PI * Math.pow(C, 2)));
		System.out.printf("TRAPEZIO: " + "%.3f%n",((A + B) * C) / 2);
		System.out.printf("QUADRADO: " +"%.3f%n", Math.pow(B, 2));
		System.out.printf("RETANGULO: " + "%.3f%n",(A * B));
		
	}

}
