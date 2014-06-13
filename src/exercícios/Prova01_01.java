/*
Prova A1 - Programação Desktop
Acadêmico: Luiz Felipe Nazari

Exercício 01
 */

package exercícios;

import java.util.Scanner;

public class Prova01_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int voltas=1,total=0,melhor=0,melhor_volta=0,v;
		System.out.println("Tempo = 0 termina a entrada!");
		while (true){
			System.out.println("Volta "+ voltas);
			System.out.print("Tempo da volta: ");
			v = scan.nextInt();
			if (voltas == 1){
				melhor = v;
				melhor_volta = voltas;
			} else {
				if (v == 0){
					voltas--;
					break;
				}
				if (v < melhor){
					melhor = v;
					melhor_volta = voltas;
				}
			}
			total += v;
			voltas++;
		}
		System.out.println("Melhor Tempo: "+ melhor);
		System.out.println("Volta do melhor tempo: "+ melhor_volta);
		System.out.println("Tempo médio das voltas: "+ ((float)total/voltas));
		scan.close();
	}
}
