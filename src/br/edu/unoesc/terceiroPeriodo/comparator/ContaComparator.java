package br.edu.unoesc.terceiroPeriodo.comparator;

import java.util.Collections;
import java.util.Comparator;

import br.edu.unoesc.terceiroPeriodo.heranca.Conta;

public enum ContaComparator implements Comparator<Conta> {

	Por_numero() {
		@Override
		public int compare(Conta o1, Conta o2) {
			return o1.getNumero().compareTo(o2.getNumero());
		}
	},
	Por_saldo(){
		@Override
		public int compare(Conta o1, Conta o2) {
			return o1.getSaldo().compareTo(o2.getSaldo());
		}		
	};
	
	public abstract int compare(Conta o1, Conta o2);
	
	public Comparator<Conta> asc() {
		return this;
	}
	
	public Comparator<Conta> dec() {
		return Collections.reverseOrder(this);
	}
}
