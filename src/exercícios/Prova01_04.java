/*
Prova A1 - Programação Desktop
Acadêmico: Luiz Felipe Nazari

Exercício 04
 */

package exercícios;

import java.util.ArrayList;
import java.util.Scanner;

public class Prova01_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> agenda = new ArrayList<>();
		int opcao;
		do{
			System.out.println("\n1 - Adicionar nome\n2 - Remover nome\n3 - Procurar nome\n4 - Exibir agenda\n5 - Sair");
			opcao = scan.nextInt();
			switch (opcao){
				case 1:{
					System.out.println("Digite o nome:");
					agenda.add(scan.next());
					break;
				}
				case 2:{
					System.out.println("Digite o nome:");
					agenda.remove(scan.next());
					break;
				}
				case 3:{
					System.out.println("Digite o nome:");
					String nome = scan.next();
					if (agenda.contains(nome))
						System.out.println("O nome está na lista na posição: "+ (agenda.indexOf(nome)+1));
					else
						System.out.println("O nome não está na lista.");
					break;
				}
				case 4:{
					for (String nome : agenda)
						System.out.println(nome);
					break;
				}
				case 5:break;
				default: System.out.println("Comando Inválido!");break;
			}
		}while(opcao != 5);
		scan.close();
	}
}
