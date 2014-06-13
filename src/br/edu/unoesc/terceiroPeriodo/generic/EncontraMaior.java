package br.edu.unoesc.terceiroPeriodo.generic;

public class EncontraMaior {
	
	//CompareTo retorna:
	// -1 quando menor
	// 0 quando igual
	// 1 quando maior
	
	public <T extends Comparable<T>> T maior(T valores[]) {
		T maior = valores[0];
		for (T valor : valores) {			
			if(valor.compareTo(maior) > 0) {
				maior = valor;
			}
		}
		return maior;
	}
	
}
