package IntroduçãoOrientaçãoObjetos;

public class TesteGeraçãoAutomaticaConstrutores {

	public double a;
	public double b;
	
	public TesteGeraçãoAutomaticaConstrutores(double a, double b) {
		super(); //Vai chamar o construtor da superclass
		this.a = a;
		this.b = b;
	}
	 /*Procedimento:
	  * Botão direito
	  *  Source
	  *  Generate Constructor using field*/

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	
	
	
	
}
