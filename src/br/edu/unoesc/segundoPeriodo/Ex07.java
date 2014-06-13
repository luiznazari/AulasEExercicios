package br.edu.unoesc.segundoPeriodo;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		int entrada,maior,menor;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite 20 valores: ");
		entrada = input.nextInt();
		maior = menor = entrada;
		for (int i=0; i<19; i++){
			entrada = input.nextInt();
			if (entrada > maior)
				maior = entrada;
			else if (entrada < menor)
				menor = entrada;
		}
		System.out.println("Maior valor: "+ maior +"\nMenor valor: "+ menor);
		input.close();		
	}

}
