package br.edu.unoesc.terceiroPeriodo.heranca;

import java.util.Collection;
import java.util.HashSet;

public class Banco {
	
	private Double saldoBanco = 0.0;
	private Collection<Conta> contas;
	
	public void addConta(Conta conta) {
		if (this.contas == null) {
			contas = new HashSet<Conta>();
		}
		contas.add(conta);
	}
	
	public void addContas(Collection<Conta> novasContas) {
		if (this.contas == null) {
			contas = new HashSet<Conta>();
		}
		this.contas.addAll(novasContas);
	}
	
	public Double getSaldoBanco() {
		for (Conta c : contas) {
			saldoBanco += c.getSaldo();
		}
		return saldoBanco;
	}
	
	public void removerConta(Conta conta) {
		this.contas.remove(conta);
	}
	
}
