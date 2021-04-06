package IntroduçãoOrientaçãoObjetos;

public class ApoioExercicio2 {

	public String NomeProduto;
	public double Price;
	public int Quantidade;

	public double TotalValueinStock() {
		return Price * Quantidade;
	}

	public void AddProducts(int Quantidade) {
		this.Quantidade += Quantidade;
	}

	public void RemoveProducts(int Quantidade) {
		this.Quantidade -= Quantidade;
	}

	public String toString() {
		return NomeProduto + ", $ " + String.format("%.2f", Price) + ", " + Quantidade + " unidades" + ", Total no estoque: $ "
				+ String.format("%.2f", TotalValueinStock());

	}

}
