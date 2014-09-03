package br.com.urionlinejudge;

import java.util.Scanner;

public class BobConduite_1589 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer num1;
		Integer num2;
		
		Integer vezes = Integer.valueOf(scan.next());
		
		for (int i = 0; i < vezes; i++) {
			num1 = Integer.valueOf(scan.next());
			num2 = Integer.valueOf(scan.next());
			System.out.println(num1 + num2);
		}
		
		scan.close();
	}
	
}
