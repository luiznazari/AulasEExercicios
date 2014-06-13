package br.edu.unoesc.segundoPeriodo;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		byte a,b,c;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o valor de A: ");
		a = entrada.nextByte();
		System.out.print("Insira o valor de B: ");
		b = entrada.nextByte();
		c=a;
		a=b;
		b=c;
		System.out.println("A: "+ a +"\nB: "+ b);
		entrada.close();
	}
}
