package br.edu.unoesc.segundoPeriodo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lista05_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<Integer, String> dias_semana = new HashMap<>();
		int escolha;
		dias_semana.put(1, "Domingo");
		dias_semana.put(2, "Segunda-Feira");
		dias_semana.put(3, "Terça-Feira");
		dias_semana.put(4, "Quarta-Feira");
		dias_semana.put(5, "Quinta-Feira");
		dias_semana.put(6, "Sexta-Feira");
		dias_semana.put(7, "Sábado");
		escolha = scan.nextInt();
		System.out.println("Dia da Semana: "+ dias_semana.get(escolha));
		scan.close();
	}
}
