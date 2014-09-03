package br.com.urionlinejudge;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PlanejandoAEnergia_1540 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer ano1;
		Double val1;
		Integer ano2;
		Double val2;
		
		Integer vezes = Integer.valueOf(scan.next());
		
		for (int i = 0; i < vezes; i++) {
			ano1 = Integer.valueOf(scan.next());
			val1 = Double.valueOf(scan.next());
			ano2 = Integer.valueOf(scan.next());
			val2 = Double.valueOf(scan.next());
			
			DecimalFormat df = new DecimalFormat("0.00");
			df.setMaximumFractionDigits(2);
			df.setRoundingMode(RoundingMode.DOWN);
			df.setNegativePrefix("");
			
			System.out.print(df.format((val1 - val2) / (ano1 - ano2)));
			
		}
		
		scan.close();
	}
}
