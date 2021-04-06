package IntroduçãoOrientaçãoObjetos;

import java.util.Scanner;

public class ExercícioAula1FeitoPorMim {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double x1, x2, x3, aX;
		double y1, y2, y3, aY;

		double MaxValue;

		System.out.println("Informe os lados do triângulo X: ");
		x1 = scan.nextDouble();
		x2 = scan.nextDouble();
		x3 = scan.nextDouble();

		System.out.println("Informe os lados do triângulo Y: ");
		y1 = scan.nextDouble();
		y2 = scan.nextDouble();
		y3 = scan.nextDouble();

		aX = PX(x1, x2, x3);
		aY = PY(y1, y2, y3);

		MaxValue = MAX(aX, aY);

		if (aX > aY) {
			System.out.printf("Maior área: X - " + "%.4f%n", MaxValue);
		} else {
			System.out.printf("Maior área: Y - " + "%.4f%n", MaxValue);
		}
	}

	public static double PX(double a, double b, double c) {
		double p = a + b + c / 2;

		double areaX = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return areaX;
	}

	public static double PY(double a, double b, double c) {
		double p = a + b + c / 2;

		double areaY = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return areaY;
	}

	public static double MAX(double a, double b) {
		double MaxValue = Math.max(a, b);
		return MaxValue;
	}

}
