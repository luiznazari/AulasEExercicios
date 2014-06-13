package br.edu.unoesc.segundoPeriodo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex01 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.00");
		int opcao;
		float celsius,fahrenheit;
		System.out.println("1 - Calsius para Fahrenheit\n2 - Fahrenheit para Celsius");
		opcao = teclado.nextByte();
		if (opcao == 1) {
			System.out.print("Informe graus celsius: ");
			celsius = teclado.nextFloat();
			fahrenheit = celsius * 1.8f + 32;
			System.out.println("Em Fahrenheit: "+ df.format(fahrenheit));
		} else {
			System.out.print("Informe graus Fahrenheit: ");
			fahrenheit = teclado.nextFloat();
			celsius = (fahrenheit -32) / 1.8f;
			System.out.println("Em Celsius: "+ df.format(celsius));			
		}
		teclado.close();
	}
}
