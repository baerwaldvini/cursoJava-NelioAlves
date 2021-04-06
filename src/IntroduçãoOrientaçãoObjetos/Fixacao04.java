package IntroduçãoOrientaçãoObjetos;

import java.util.Locale;
import java.util.Scanner;

import  IntroduçãoOrientaçãoObjetos.Fixacao04Apoio;

public class Fixacao04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double Price = scan.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double Mont = scan.nextDouble();
		
		Fixacao04Apoio.DollartoReal(Price, Mont);
		System.out.printf("\n" + "Amount to be paid in reais = " + "%.2f%n",Fixacao04Apoio.DollartoReal(Price, Mont));
		
	}

}
