package br.edu.unoesc.segundoPeriodo;

import java.util.Scanner;


public class Lista05_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String frase = scan.next();
		if (frase.contains("Java"))
			System.out.println("Contém.");
		else
			System.out.println("Não Contém.");
		scan.close();
	}
}

