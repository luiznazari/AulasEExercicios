package br.com.urionlinejudge;

import java.util.Scanner;

public class PoligonosRegularesContrutiveis_1577 {

	// Soma ângulos internos: (n-2)*180
	// Ângulo interno: soma_angulos_internos / n 
	// Números de Fermat = Fn = 2^2^n = X
	
	public static boolean isPrimo(Integer num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isNumeroDeFermat(Integer num) {
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Integer vezes = Integer.valueOf(scan.next());
		Integer num = Integer.valueOf(scan.next());
		for (int i = 0; i < vezes; i++) {
			if (isPrimo(num)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		
		scan.close();
	}
	
}
