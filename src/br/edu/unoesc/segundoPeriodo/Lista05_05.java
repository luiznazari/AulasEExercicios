package br.edu.unoesc.segundoPeriodo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lista05_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		int maior = 0,menor = 0,soma=0,i=0;
		while (true){
			numeros.add(scan.nextInt());
			if (numeros.get(i) == -1){
				numeros.remove(i);
				break;
			}
			if (i == 0)
				maior = menor = numeros.get(i);
			else if (numeros.get(i) > maior)
				maior = numeros.get(i);
			else if (numeros.get(i) < menor)
				menor = numeros.get(i);
			if (numeros.get(i)%2 == 0)
				soma += numeros.get(i);
			i++;
		}
		Collections.sort(numeros);
		System.out.println("Maior Valor: "+ maior);
		System.out.println("Menor Valor: "+ menor);
		System.out.println("Soma dos pares: "+ soma);
		System.out.println("Lista organizada: ");
		for (int I=0; I<numeros.size(); I++)
			System.out.print(numeros.get(I) +" ");
		scan.close();
	}
}
