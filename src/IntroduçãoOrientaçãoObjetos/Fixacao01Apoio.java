package IntroduçãoOrientaçãoObjetos;

public class Fixacao01Apoio {

	double Width;
	double Height;

	public double Area() {
		return Width * Height;
	}

	public double Perimeter() {
		return ((Width * 2) + (Height * 2));
	}

	public double Diagonal() {
		return Math.sqrt(Math.pow(Width, 2) + Math.pow(Height, 2));
	}

	public String toString() {
		return "Area: " + this.Area() + "\n" + "Perimeter: " + this.Perimeter() + "\n" + "Diagonal: " + String.format("%.2f", this.Diagonal());
	}
}
