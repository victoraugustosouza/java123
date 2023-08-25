package entitties;

public class Estudante {
	public double primeiroSemestre,segundoSemestre,terceiroSemestre;
	public String name;
	
	public double grade() {
		return primeiroSemestre+segundoSemestre+terceiroSemestre;
	}
	public String status() {
		return grade()>=60 ? "PASS" : "FAILED";
	}
	public String missingPoints() {
		return String.format("MISSING %.2f POINTS",Math.abs(grade()-60));
		
	}
}
