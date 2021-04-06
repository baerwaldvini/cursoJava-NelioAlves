package Secao11;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Date {

	public static void main(String[] args) throws ParseException {

		Scanner scan = new Scanner(System.in);

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		
		System.out.println(y1);
		System.out.println(y2);

	}

}
