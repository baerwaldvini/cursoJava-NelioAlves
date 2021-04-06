package T�picosImportantes;

public class Estudo {

	/* Essa classe abordar� informa��es importantes do java */

	public static void main(String[] args) {

		/* Declara��o de vari�veis: */

		/*
		 * int 5minutes; int sal�rio; int salario do funcion�rio Sintaxe errada, o
		 * correto segue abaixo:
		 */

		int _5minutes;
		int salario;
		int SalarioDoFuncionario; /* Corcunda do camelo VariavelParaDeclarar */

		/* Operadores Bitwise: (N�o confundir com operadores l�gicos) */

		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2); /* E bit a bit, F F = F; F v = F; V F = F; V V = V */
		System.out.println(n1 | n2); /* OU bit a bit, F F = F; F V = V; V F = V; V V = V */
		System.out.println(n1 ^ n2); /* XOR bit a bit, F F = F; F V = V; V F = V; V V = F */

		System.out.println("\n " + "***********************************************" + "\n");

		System.out.println("Fun��es Importantes String:" + "\n");

		String original = "abcdeFGHIJABC abc DEFG ";
		String s01 = original.toLowerCase(); /*Converte tudo em min�scula*/
		String s02 = original.toUpperCase(); /*Converte tudo em mai�scula*/
		String s03 = original.trim(); /*Elimina os espa�os em branco duplicados*/
		String s04 = original.substring(2); /*Continua o string a partir da posi��o selecionada*/
		String s05 = original.substring(2, 5); /*Continua o string entre os caracteres selecionados*/
		String s06 = original.replace('a', 'x'); /*Substitui a letra inserida no valor 1 pela inserida no valor 2*/
		String s07 = original.replace("abc", "xy"); /*Mesma fun��o por�m com mais caracteres*/
		
		int i = original.indexOf("bc"); /*Fala a primeira ocorr�ncia do argumento bc ser� 1*/
		int j = original.lastIndexOf("bc"); /*Fala a �ltima ocorr�ncia do argumento bc ser� 17*/
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		
		System.out.println("\n " + "***********************************************" + "\n");

		System.out.println("Opera��o Split:");
		
		String s = "BATATA MA�A LIM�O LARANJA MORANGO";
		           /*vect1 vect2 vect3*/
		String[] vect = s.split(" "); /*Trabalha com a divis�o das cadeias de caracteres*/
		String word1 = vect[0]; 
		String word2 = vect[1];
		String word3 = vect[2];
		String word4 = vect[3];
		String word5 = vect[4];
		
		System.out.println("\n" + word1 + "\n" + word2 + "\n" + word3 + "\n" + word4 + "\n" + word5);

	}

}
