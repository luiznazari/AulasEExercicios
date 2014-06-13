/*
Prova A1 - Programação Desktop
Acadêmico: Luiz Felipe Nazari

Exercício 03
 */

package exercícios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prova01_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> produtos = new HashMap<>();
		String entrada;
		produtos.put("Chinelo", 1);
		produtos.put("Bota", 1);
		produtos.put("Tênis", 2);
		produtos.put("Calça", 3);
		produtos.put("Camisa", 5);
		produtos.put("Boné", 8);
		produtos.put("Jaqueta", 13);
		System.out.println("Digite um nome de produto para procurar no estoque:");
		entrada = scan.next();
		if (produtos.containsKey(entrada))
			System.out.println("Itens no estoque: "+ produtos.get(entrada));
		else
			System.out.println("Produto não existe no estoque!");
		scan.close();
	}
}
