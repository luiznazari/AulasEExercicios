package br.edu.unoesc.segundoPeriodo;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		float capital,taxa;
		int qtd_meses,tipo_taxa;
		Scanner input = new Scanner(System.in);
		DecimalFormat formata = new DecimalFormat("#,##0.00");
		System.out.print("Capital: ");
		capital = input.nextFloat();
		System.out.print("Taxa: ");
		taxa = input.nextFloat();
		taxa /= 100;
		System.out.print("Quantidade de Meses: ");
		qtd_meses = input.nextInt();
		System.out.print("Tipo de taxa: [1] Simples ou [2] Composto: ");
		tipo_taxa = input.nextInt();
		if (tipo_taxa == 2){
			for (int i=1; i<=qtd_meses; i++)
				System.out.println("Juros mês "+ i +": "+ formata.format(capital*Math.pow(1+taxa,i)-capital));
			System.out.println("Montante: "+ formata.format(capital*Math.pow(1+taxa,qtd_meses)));
		}
		else if (tipo_taxa == 1)
			System.out.println("Montante: "+ formata.format((capital*taxa*qtd_meses)+capital));
		else
			System.out.println("Comando Inválido!");
		input.close();
	}
}
