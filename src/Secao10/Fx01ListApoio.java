package Secao10;

public class Fx01ListApoio {

	private int Id;
	private String Name;
	private double Salary;
	
	public Fx01ListApoio() {
		
	}

	public Fx01ListApoio(int id, String name, double salary) {
		Id = id;
		Name = name;
		Salary = salary;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}
	
	public void IncreaseSalary(double Porcentage) {
		Salary += Salary * (Porcentage/100);
	}
	public String toString() {
		return this.Id + ", " + this.Name + ", " + String.format("%.2f", this.Salary);
	}

}
