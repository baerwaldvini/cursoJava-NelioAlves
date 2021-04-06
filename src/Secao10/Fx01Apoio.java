package Secao10;

public class Fx01Apoio {

	private String name;
	private String Email;

	public Fx01Apoio(String name, String email) {
		this.name = name;
		Email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String toString() {
		return name + ", " + Email;
	}

}
