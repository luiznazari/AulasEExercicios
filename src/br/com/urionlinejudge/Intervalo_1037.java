package br.com.urionlinejudge;

import java.util.Scanner;

public class Intervalo_1037 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Float num = Float.valueOf(scan.next());
		
		if (0 <= num && num <= 25) {
			System.out.print("Intervalo [0,25]");
		} else if (25 < num && num <= 50) {
			System.out.print("Intervalo (25,50]");
		} else if (50 < num && num <= 75) {
			System.out.print("Intervalo (50,75]");
		} else if (75 < num && num <= 100) {
			System.out.print("Intervalo (75,100]");
		} else {
			System.out.print("Fora de intervalo");
		}
		
		scan.close();
	}
	
}
