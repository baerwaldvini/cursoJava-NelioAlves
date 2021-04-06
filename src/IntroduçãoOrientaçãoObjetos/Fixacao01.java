package IntroduçãoOrientaçãoObjetos;

import java.util.Locale;
import java.util.Scanner;
import IntroduçãoOrientaçãoObjetos.Fixacao01Apoio;

public class Fixacao01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner Scan = new Scanner(System.in);
		
		Fixacao01Apoio Measures = new Fixacao01Apoio();
		
		System.out.println("Enter rectangle width and height: ");
		System.out.print("HEIGHT: ");
		Measures.Height = Scan.nextDouble();
		
		System.out.print("WIDTH: ");
		Measures.Width = Scan.nextDouble();
		
		System.out.println("\n");
		System.out.println(Measures);
		
	}

}
