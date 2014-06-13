package br.edu.unoesc.segundoPeriodo;

import java.util.Scanner;

public class Lista05_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String frase = scan.nextLine();
		//Tamanho da string precisa ser decrementada em 1 posição para ser usada com o for (i=0)
		for (int i=frase.length()-1; i>=0; i--)
			System.out.print(frase.charAt(i));
		scan.close();
	}
}
