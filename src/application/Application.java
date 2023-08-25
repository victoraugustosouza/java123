package application;

import java.util.Locale;
import java.util.Scanner;

import entitties.Estudante;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Estudante est = new Estudante();
		Scanner sc = new Scanner(System.in);
				
		est.name=sc.nextLine();
		est.primeiroSemestre= sc.nextDouble();
		est.segundoSemestre=sc.nextDouble();
		est.terceiroSemestre=sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", est.grade());
		String status = est.status();
		System.out.println(status);
		if(status=="FAILED") {
			System.out.println(est.missingPoints());
		}

	
		sc.close();
		
	}

}
