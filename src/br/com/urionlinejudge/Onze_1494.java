package br.com.urionlinejudge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Onze_1494 {

	static Map<Integer, Integer> map = new HashMap<>();
	
	public static void adicionaNoMap(Integer key){
		Integer value = map.get(key);
		map.put(key, value == null ? 1 : value + 1);
	}
	
	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		String entrada;
		String[] numeros;
		String[] saida;
		StringBuilder builder = new StringBuilder();
		
		while (scan.hasNext()) {
			entrada = scan.next();
			numeros = entrada.split("");
			saida = new String[numeros.length];
			
			for (int i = 0, j = numeros.length; i < numeros.length; i++, j--) {
				
			}
			
			for (String s : numeros) {
				adicionaNoMap(Integer.valueOf(s));
			}
			
			
		}
		
		scan.close();*/
		
		String s = "abcd";
		System.out.println(s.substring(0, 0));
	}
	
}
