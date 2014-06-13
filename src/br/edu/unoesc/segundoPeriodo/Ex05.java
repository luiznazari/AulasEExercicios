package br.edu.unoesc.segundoPeriodo;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		int idade;
		Scanner scan = new Scanner(System.in);
		System.out.print("Idade: ");
		idade = scan.nextInt();
		if (idade>=5 && idade<=7)
			System.out.println("Intantil A");
		else if (idade>=8 && idade<=10)
			System.out.println("Intantil B");
		else if (idade>=11 && idade<=13)
			System.out.println("Juvenil A");
		else if (idade>=14 && idade<=17)
			System.out.println("Juvenil B");
		else if (idade>=18)
			System.out.println("Adulto");
		else
			System.out.println("Não se encaixa em nenhuma categoria.");
		scan.close();
	}
}
