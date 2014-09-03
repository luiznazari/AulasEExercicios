package br.com.urionlinejudge;

import java.util.Scanner;

public class ArremessoDeBolas_1532 {
	
	// A bola pode ser arremessada a uma velocidade igual ou menor que vel, ou seja,
	// Se vel == 3, posso chamar quica(0, 3) ou quica(2, 3) ou quica(1, 3)
	
	static Integer dist;
	
	static Integer velInicial;
	
	public static String quica(Integer posicao, Integer vel) {
		if (posicao > dist || vel == 0) {
			if (velInicial.equals(0)) {
				return "impossivel";
			}
			return quica(0, --velInicial);
		}
		for (int i = 0; i < vel; i++) {
			posicao += vel;
			if (posicao.equals(dist)) {
				return "possivel";
			}
		}
		return quica(posicao, vel - 1);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			dist = Integer.valueOf(scan.next());
			velInicial = Integer.valueOf(scan.next());
			if (dist == 0 && velInicial == 0) {
				break;
			}
			System.out.println(quica(0, velInicial));
		}
		scan.close();
	}
}
