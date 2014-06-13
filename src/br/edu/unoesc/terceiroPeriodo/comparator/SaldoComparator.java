package br.edu.unoesc.terceiroPeriodo.comparator;

import java.util.Comparator;

import br.edu.unoesc.terceiroPeriodo.heranca.Conta;

public class SaldoComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta o1, Conta o2) {
		return o1.getSaldo().compareTo(o2.getSaldo());
	}
	
}
