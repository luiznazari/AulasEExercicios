package br.edu.unoesc.segundoPeriodo;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercícioVetor1 {
	public static void main(String[] args) {
		int valor,maior,menor;
		ArrayList<Integer> vetor = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Digite vários números, valor 0 termina a entrada.");
		valor = input.nextInt();
		maior = menor = valor;
		while (true){
			valor = input.nextInt();
			if (valor == 0)
				break;
			vetor.add(valor);
		}
		for (int i=0; i<vetor.size(); i++){
			if (vetor.get(i)>maior)
				maior = vetor.get(i);
			else if (vetor.get(i)<menor)
				menor = vetor.get(i);
		}
		System.out.println("O maior valor: "+ maior +"\nO menor valor: "+ menor);
		input.close();
	}
}