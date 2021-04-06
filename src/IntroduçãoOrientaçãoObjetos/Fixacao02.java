package IntroduçãoOrientaçãoObjetos;

import java.util.Locale;
import java.util.Scanner;
import IntroduçãoOrientaçãoObjetos.Fixacao02Apoio;

public class Fixacao02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);

		Fixacao02Apoio Values = new Fixacao02Apoio();

		System.out.print("Name: ");
		Values.Name = scan.nextLine();

		System.out.print("Salary: ");
		Values.GrossSalary = scan.nextDouble();

		System.out.print("Tax: ");
		Values.Tax = scan.nextDouble();

		System.out.print(Values.toString1());

		System.out.println("\n");

		System.out.print("Which percentage to increase salary?");
		Values.Percentage = scan.nextDouble();

		System.out.println("\n");

		System.out.print(Values.toString2());

	}

}
