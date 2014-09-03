package br.com.urionlinejudge;

import java.util.Scanner;

public class Distancia_1016 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
		 * float entrada = Float.parseFloat(scan.next());
		 * float tempo = entrada / 30;
		 * System.out.printf("%.0f minutos", tempo * 60);
		 */
		
		Integer entrada = Integer.valueOf(scan.next());
		System.out.println(entrada * 2 + " minutos");
		
		scan.close();
	}
	
}
