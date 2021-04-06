package Secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;;

public class Fx01List {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);

		List<Fx01ListApoio> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("\nEmployee #" + (i + 1) + " :");

			System.out.print("ID: ");
			Integer id = scan.nextInt();

			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();

			System.out.print("Salary: ");
			Double salary = scan.nextDouble();

			Fx01ListApoio emp = new Fx01ListApoio(id, name, salary);

			list.add(emp);
		}

		System.out.println("\nEnter the employee id that will have salary increase : ");
		int idselect = scan.nextInt();

		Integer pos = hasId(list, idselect);
		if (pos == null) {
			System.out.println("This ID doesn't exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = scan.nextDouble();
			list.get(pos).IncreaseSalary(percent);
		}
		
		System.out.println("\nList of employees: ");
		for (Fx01ListApoio emp : list) {
			System.out.println(emp);
		}

	}

	public static Integer hasId(List<Fx01ListApoio> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;

	}

}
