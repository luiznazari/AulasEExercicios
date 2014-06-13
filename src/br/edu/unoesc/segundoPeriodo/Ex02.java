package br.edu.unoesc.segundoPeriodo;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		float raio,alt;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o valor do raio: ");
		raio = entrada.nextFloat();
		System.out.print("Insira o valor da altura: ");
		alt = entrada.nextFloat();
		System.out.println("O volume é: "+ (3.14159*raio*raio*alt));
		entrada.close();
	}
}
