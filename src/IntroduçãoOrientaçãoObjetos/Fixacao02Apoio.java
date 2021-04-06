package IntroduçãoOrientaçãoObjetos;

public class Fixacao02Apoio {

	public String Name;
	public double GrossSalary;
	public double Tax;
	public double Percentage;

	public double NetSalary() {
		return GrossSalary - Tax;
	}

	public double IncreaseSalary() {
		return (this.NetSalary() + (this.NetSalary() * (this.Percentage / 100)));
	}

	public String toString1() {
		return "Employee: " + Name + ", $" + this.NetSalary();
	}

	public String toString2() {
		return "Updated data: " + Name + ", $" + this.IncreaseSalary();
	}

}
