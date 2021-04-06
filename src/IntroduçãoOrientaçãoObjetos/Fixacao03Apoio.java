package IntroduçãoOrientaçãoObjetos;

public class Fixacao03Apoio {
	
	public double Grade1;
	public double Grade2;
	public double Grade3;
	
	public double FinalGrade() {
		return ((Grade1 + Grade2 + Grade3));
	}
	public double Missing() {
		return (this.FinalGrade() - 60);
	}
	
	public String PASS() {
		return "FINAL GRADE: " + this.FinalGrade() + "\n" + "PASS";
	}
	public String FAILED() {
		return "FINAL GRADE: " + this.FinalGrade() + "\n" + "FAILED" + "\n" + "MISSING " + this.Missing() + " POINTS.";
	}
	

}
