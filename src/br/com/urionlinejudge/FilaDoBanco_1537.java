package br.com.urionlinejudge;

import java.util.Scanner;

public class FilaDoBanco_1537 {
	
	// Entre 6 combinações, apenas uma é verdadeira, pois precisa respeitar a ordem: André ... Bruno ... Carlos
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Long num;
		
		while (true) {
			num = Long.valueOf(scan.next());
			if (num == 0) {
				break;
			}
			
			System.out.println(fatorialDiv6(num));
		}
		
		scan.close();
	}
	
	public static Long fatorialDiv6(Long i) {
		if (i < 4) {
			return 1l;
		}
		return i * fatorialDiv6(i - 1);
	}
	
}
