package Introdu��oOrienta��oObjetos;

import java.awt.geom.Area;
import java.util.Locale;
import java.util.Scanner;

public class Exerc�cioProposto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		Triangle x, y, max;

		x = new Triangle();
		y = new Triangle();
		max = new Triangle();
		
		System.out.println("Insira os lados do trin�ngulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Insira os lados do trin�ngulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double ax = x.area();
		double ay = y.area();
		
		double MaxValue = max.Max(ax, ay);
	}
}