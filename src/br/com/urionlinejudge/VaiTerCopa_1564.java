package br.com.urionlinejudge;

import java.util.Scanner;

public class VaiTerCopa_1564 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			int reclamacao = scan.nextInt();
			if (reclamacao == 0) {
				System.out.println("vai ter copa!");
			} else {
				System.out.println("vai ter duas!");
			}
		}
		
		scan.close();
	}
}
