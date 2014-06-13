package br.edu.unoesc.segundoPeriodo;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaMusicPlayer {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> musicas = new ArrayList<>();
		int opcao,atual=0;
		String musica_atual = "Nenhuma";
		do{
			System.out.println(" *** Java Music Player ***\n");
			System.out.println("Música Tocando: "+ musica_atual +"\n");
			System.out.println("1 - Exibir Play List.");
			System.out.println("2 - Cadastrar Música.");
			System.out.println("3 - Remover Música.");
			System.out.println("4 - Tocar Música.");
			System.out.println("5 - Próxima Música.");
			System.out.println("6 - Música Anterior.");
			System.out.println("7 - Sair.");
			opcao = scan.nextInt();
			switch (opcao){
				case 1:{
					System.out.println("\n\nPlay List\n");
					for (String s : musicas)
						System.out.println(s);
					new Scanner(System.in).nextLine();
					break;
				}
				case 2:{
					musicas.add(scan.next());
					break;
				}
				case 3:{
					musicas.remove(scan.next());
					break;
				}
				case 4:{
					if (musicas.isEmpty() == false)
						musica_atual = musicas.get(atual);
					break;
				}
				case 5:{
					atual++;
					if (atual > musicas.size()-1){
						System.out.println("Fim da Lista!");
						atual--;
					}
					else
						musica_atual = musicas.get(atual);
					break;
				}
				case 6:{
					atual--;
					if (atual >= 0)
						musica_atual = musicas.get(atual);
					else
						atual++;
					break;
				}
				case 7:break;
				default:System.out.println("\nComando Inválido!");break;
			}
		}while(opcao != 7);
		scan.close();
	}
}
