package br.com.urionlinejudge;

import java.util.Arrays;
import java.util.Scanner;

public class Altura_1566 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vezes = Integer.parseInt(scan.next());
		int qtd;
		int[] valores2;
		
		for (int i = 0; i < vezes; i++) {
			qtd = Integer.parseInt(scan.next());
			valores2 = new int[qtd];
			for (int j = 0; j < qtd; j++) {
				valores2[j] = Integer.parseInt(scan.next());
			}
			Arrays.sort(valores2);
			for (int in : valores2) {
				System.out.print(in + " ");
			}
		}
		
		/*
		 * for (int i = 0; i < vezes; i++) {
		 * valores.clear();
		 * qtd = Integer.parseInt(scan.next());
		 * for (int j = 0; j < qtd; j++) {
		 * valores.add(Integer.parseInt(scan.next()));
		 * }
		 * Collections.sort(valores);
		 * for (Integer in : valores) {
		 * System.out.print(in + " ");
		 * }
		 * }
		 */
		
		scan.close();
	}
	
}
