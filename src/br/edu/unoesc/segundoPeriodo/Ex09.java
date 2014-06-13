package br.edu.unoesc.segundoPeriodo;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		int n_homens=0,n_mulheres=0;
		float alt,alt_mulheres=0,maior,menor;
		String sexo;
		Scanner input = new Scanner(System.in);
		System.out.print("Sexo: ");
		sexo = input.next();
		System.out.print("Altura: ");
		alt = input.nextFloat();
		maior = menor = alt;
		for (int i=0; i<49; i++){
			System.out.print("Sexo: ");
			sexo = input.next();
			System.out.print("Altura: ");
			alt = input.nextFloat();
			if (sexo.charAt(0) == 'F' || sexo.charAt(0) == 'f'){
				n_mulheres++;
				alt_mulheres += alt;
			}
			else if (sexo.charAt(0) == 'M' || sexo.charAt(0) == 'm')
				n_homens++;
			else
				System.out.println("Comando Inválido!");
		}
		System.out.println("Maior altura: "+ maior +"\nMenor altura: "+ menor);
		System.out.println("Média: "+ (float)(alt_mulheres/n_mulheres));
		System.out.println("Número de homens: "+ n_homens +"\nDiferença Percentual: "+ (n_homens-n_mulheres/100) + "%");
		input.close();
	}
}
