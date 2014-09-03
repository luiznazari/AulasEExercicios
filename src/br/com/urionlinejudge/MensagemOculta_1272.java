package br.com.urionlinejudge;

import java.util.Scanner;

public class MensagemOculta_1272 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String criptografada;
		String[] descriptografada;
		
		int vezes = Integer.parseInt(scan.next());
		scan.nextLine();
		for (int i = 0; i < vezes; i++) {
			criptografada = scan.nextLine();
			descriptografada = criptografada.split(" ");
			for (String s : descriptografada) {
				if (!s.equals("")) {
					System.out.print(s.charAt(0));
				}
			}
			System.out.println();
		}
		
		scan.close();
	}
	
}
