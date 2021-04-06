package IntroduçãoOrientaçãoObjetos;

public class Triangle {

	public double a;
	public double b;
	public double c;
	
	public double area() {
		double p = ( a + b + c) / 2;
		double area = Math.sqrt((p - a)*(p - b) * (p - c));
		return area;
	}
	
	public double Max(double a, double b) {
		double MaxValue = Math.max(a, b);
		if (a > b){
			System.out.printf("Maior área: X - " + "%.4f%n", MaxValue);
		} else {
			System.out.printf("Maior área: Y - " + "%.4f%n", MaxValue);
		}
		return MaxValue;
	}
	
}


