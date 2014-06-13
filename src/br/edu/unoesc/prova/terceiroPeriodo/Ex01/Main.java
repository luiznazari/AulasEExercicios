package br.edu.unoesc.prova.terceiroPeriodo.Ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		List<Norma> normas = new ArrayList<Norma>();		
		Scanner scan = new Scanner(System.in);
		
		/*
		AnexoTecnico anexo01 = new AnexoTecnico(new Date(), "Anexo 01", "Este tema");
		AnexoTecnico anexo02 = new AnexoTecnico(new Date(), "Anexo 02", "é um");
		AnexoTecnico anexo03 = new AnexoTecnico(new Date(), "Anexo 03", "tema muito");
		AnexoTecnico anexo04 = new AnexoTecnico(new Date(), "Anexo 04", "importante");
		AnexoTecnico anexo05 = new AnexoTecnico(new Date(), "Anexo 05", "só que não,");
		AnexoTecnico anexo06 = new AnexoTecnico(new Date(), "Anexo 06", "Ha ha.");
		
		Norma norma01 = new Norma("Norma 01", new Date(), "Orgão 01", 1.0);
		norma01.adicionaAnexos(Arrays.asList(anexo01, anexo02, anexo03));
		
		Norma norma02 = new Norma("Norma 02", new Date(), "Orgão 02", 2.0);
		norma02.adicionaAnexos(Arrays.asList(anexo04, anexo05, anexo06));
		
		Norma norma03 = new Norma("Norma 03", new Date(), "Orgão 03", 3.0);
		norma03.adicionaAnexos(Arrays.asList(anexo01, anexo02, anexo04, anexo06));
		
		normas.addAll(Arrays.asList(norma01, norma02, norma03));
		*/
		
		for(int i=0; i<3; i++) {
			System.out.print("\nTítulo: ");
			String titulo = String.valueOf(scan.nextLine());
			System.out.print("Órgão: ");
			String orgao = String.valueOf(scan.nextLine());
			System.out.print("Versão: ");
			Double valor = Double.valueOf(scan.nextLine());
			System.out.print("Número de anexos: ");
			Integer num = Integer.valueOf(scan.nextLine());
					
			Norma norma = new Norma(titulo, new Date(), orgao, valor);
			for (int j=0; j<num; j++) {
				norma.adicionaAnexo(new AnexoTecnico());
			}
			
			normas.add(norma);
		}
		scan.close();
		
		System.out.println("Norma que possui maior número de anexos:\n");
		Collections.max(normas, NormaComparator.Por_numAnexos).imprimeDados();
		
		System.out.println("\nNorma que possui menor data:\n");
		Collections.min(normas, NormaComparator.Por_data).imprimeDados();
	}
	
}
