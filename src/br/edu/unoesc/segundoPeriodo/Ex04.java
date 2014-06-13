package br.edu.unoesc.segundoPeriodo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		String sexo;
		float altura;
		DecimalFormat df = new DecimalFormat("##0.00");
		Scanner scan = new Scanner(System.in);
		System.out.print("Sexo (F/M): ");
		sexo = scan.next();
		System.out.print("Altura: ");
		altura = scan.nextFloat();
		if(sexo.charAt(0) == 'M' || sexo.charAt(0) == 'm')
			System.out.println("Peso ideal: "+ df.format(72.7*altura-58));
		else if (sexo.charAt(0) == 'F' || sexo.charAt(0) == 'f')
			System.out.println("Peso ideal: "+ df.format(62.2*altura-44.7));
		scan.close();
	}
}
