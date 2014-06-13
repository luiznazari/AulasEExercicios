package br.edu.unoesc.prova.terceiroPeriodo.Ex02;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void imprimeDados(Telefone telefone) {
		System.out.println("=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Usuário: " + telefone.getUsuario());
		System.out.println("Número: " + telefone.getNumero());
		System.out.println("Data da Instalação: " + telefone.getDataInstalacao());
		System.out.println("Custo Fixo: " + telefone.valorBasico());
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<Telefone> telefones = new ArrayList<Telefone>();
		
		for (int i=0; i<2; i++) {
			try {
				System.out.print("\nNome usuario: ");
				String usuario = String.valueOf(scan.nextLine());
				System.out.print("Numero: ");
				String numero = scan.nextLine();
				System.out.print("Digite 0 para residencial ou outro valor para comercial: ");				
				Integer tipo = Integer.valueOf(scan.nextLine());
				Telefone t;
				if (tipo == 0) {
					System.out.print("\nTem internet? 0 - Sim, outro valor - Não");
					Integer internet = Integer.valueOf(scan.nextLine());
					boolean b;
					if (internet == 0) {
						b = true;
					} else {
						b = false;
					}
					t = new Residencial(usuario, numero, new Date(), b);
				} else {
					System.out.println("\nDigite quantidade de ramais: ");
					Integer ramais = Integer.valueOf(scan.nextLine());
					t = new Comercial(usuario, numero, new Date(), ramais);
				}
				
				telefones.add(t);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		scan.close();
		
		System.out.println("\nLista de telefones:");
		for(Telefone t : telefones) {
			imprimeDados(t);
		}
		
	}

}
