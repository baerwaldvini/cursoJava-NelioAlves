package IntroduçãoOrientaçãoObjetos;

import java.util.Locale;
import java.util.Scanner;

public class Fixacao03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		Fixacao03Apoio Grades = new Fixacao03Apoio();
		
		System.out.println("What's yout name? ");
		String Name = scan.nextLine();
		
		System.out.print("Grade 1: ");
		Grades.Grade1 = scan.nextDouble();
		
		System.out.print("Grade 2: ");
		Grades.Grade2 = scan.nextDouble();
		
		System.out.print("Grade 3: ");
		Grades.Grade3 = scan.nextDouble();
		
		System.out.println("\n" + "********************************" + "\n");
		
		if (Grades.FinalGrade() >= 60) {
			System.out.println(Grades.PASS());
		} else {
			System.out.println(Grades.FAILED());
		}
		
	}

}
