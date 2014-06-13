package anotações;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSet_HashMap {
	public static void main(String[] args) {
		System.out.println("Set: ");
		//Set - trabalha baseado na teoria dos conjuntos, não será adicionado dois valores iguais, diferente de Arrays
		Set<String> conjunto = new HashSet<>();
		conjunto.add("João da Silva Sauro");
		conjunto.add("Ana Maria");
		conjunto.add("João da Silva Sauro");
		for (String nome : conjunto)
			System.out.println(nome);
		
		//Map - trabalha com uma chave e um valor
		System.out.println("\nMap: ");
		Map</*Chave*/String, /*Valor*/String> estados = new HashMap<>();
		estados.put("SC", "Santa Catarina");
		estados.put("RS", "Rio Grande do Sul");
		System.out.println(estados.get("SC"));
		System.out.println(estados.get("RS"));
	}
}
