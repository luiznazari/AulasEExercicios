package br.com.urionlinejudge;

import java.util.Scanner;

public class DetetiveWatson_1533 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int casos;
		int temp;
		int[] maior = {
		    0, 0
		};
		int[] segundo = {
		    0, 0
		};
		
		while (true) {
			casos = Integer.parseInt(scan.next());
			if (casos == 0) {
				break;
			}
			
			for (int i = 1; i <= casos; i++) {
				temp = Integer.parseInt(scan.next());
				
				if (temp >= maior[1]) {
					segundo[0] = maior[0];
					segundo[1] = maior[1];
					maior[0] = i;
					maior[1] = temp;
				} else if (temp > segundo[1]) {
					segundo[0] = i;
					segundo[1] = temp;
				}
			}
			
			System.out.println(segundo[0]);
			maior[1] = segundo[1] = 0;
			
		}
		
		scan.close();
	}
}
