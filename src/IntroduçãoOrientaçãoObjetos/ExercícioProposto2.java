package Introdu��oOrienta��oObjetos;

import java.util.Locale;
import java.util.Scanner;

public class Exerc�cioProposto2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);

		ApoioExercicio2 Produto = new ApoioExercicio2();

		System.out.print("Informe os dados do produto: " + "\n Nome: ");
		Produto.NomeProduto = scan.nextLine();

		System.out.print(" Pre�o: ");
		Produto.Price = scan.nextDouble();

		System.out.print(" Quantidade: ");
		Produto.Quantidade = scan.nextInt();
		
		System.out.println("\n" + "Status do produto: " + Produto);
		
		System.out.println("\n" + "Informe quantos ser�o adicionados ao estoque: ");
		int quantidade = scan.nextInt();
		Produto.AddProducts(quantidade);
		
		System.out.println("\n" + "Status do produto: " + Produto);
		
		System.out.println("\n" + "Informe quantos ser�o removidos ao estoque: ");
		int quantidademenos = scan.nextInt();
		Produto.RemoveProducts(quantidademenos);
		
		System.out.println("\n" + "Status do produto: " + Produto);

	}

}
