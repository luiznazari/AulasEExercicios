package br.edu.unoesc.segundoPeriodo;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		float a,b,c,delta;
		Scanner scan = new Scanner(System.in);
		System.out.print("A: ");
		a = scan.nextFloat(); 
		System.out.print("B: ");
		b = scan.nextFloat();
		System.out.print("C: ");
		c = scan.nextFloat();
		delta = b*b - 4*a*c;
		if (delta>=0)
			System.out.println("X' : "+((Math.sqrt(delta)+(-b))/2*a)+"\nX'': "+((Math.sqrt(delta)-(-b))/2*a));
		else
			System.out.println("Delta negativo.");
		scan.close();
		}
}
