package br.edu.unoesc.prova.terceiroPeriodo.Ex01;

import java.util.Comparator;

public enum NormaComparator implements Comparator<Norma> {
	
	Por_numAnexos() {
		@Override
		public int compare(Norma n1, Norma n2) {
			return n1.getNumeroAnexos().compareTo(n2.getNumeroAnexos());
		}
	},
	Por_data() {
		@Override
		public int compare(Norma n1, Norma n2) {
			return n1.getDataCriacao().compareTo(n2.getDataCriacao());
		}
	};
	
	public abstract int compare(Norma n1, Norma n2);
	
}