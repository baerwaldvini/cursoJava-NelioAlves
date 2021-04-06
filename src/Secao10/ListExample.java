package Secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		
		String value;
		
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			value = scan.next();
			list.add(value);
		} System.out.println(list);
		
	}

}
