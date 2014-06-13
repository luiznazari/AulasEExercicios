package br.edu.unoesc.terceiroPeriodo.generic;

public class TesteGeneric {
	
	public static void main(String[] args) {
		EncontraMaior encontra = new EncontraMaior();
		
		Integer valoresInt[] = new Integer[] { 5, 1, 9, 12, 27, 3 };
		Integer maiorInteger = encontra.maior(valoresInt);
		System.out.println("Maior valor encontrado: "+ maiorInteger);
		
		String valoresString[] = new String[] { "Luiz", "Casa", "Joaquim", "Banana", "Pedro", "Pedra" };
		String maiorString = encontra.maior(valoresString);
		System.out.println("Maior valor encontrado: "+ maiorString);
		//A maior String encontrada respeita a ordem alfabética
		
		TipoValor<String> nome = new TipoValor<>();
		nome.setValor("Luiz");
		TipoValor<String> nome2 = new TipoValor<>();
		nome2.setValor("Pedro");
		
		nome.trocaValor(nome2);
		System.out.println("Nome: "+ nome.getValor());
		
	}

}
