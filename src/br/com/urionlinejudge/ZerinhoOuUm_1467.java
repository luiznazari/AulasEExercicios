package br.com.urionlinejudge;

import java.util.Scanner;

public class ZerinhoOuUm_1467 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a;
		String b;
		String c;
		while(scan.hasNext()) {
			a = scan.next();
			b = scan.next();
			c = scan.next();
			
			if (!a.equals(b) && !a.equals(c)) {
				System.out.println("A");
			} else if (!b.equals(a) && !b.equals(c)) {
				System.out.println("B");
			} else if (!c.equals(a) && !c.equals(b)) {
				System.out.println("C");
			} else {
				System.out.println("*");
			}
		}
		scan.close();
	}
	
}
