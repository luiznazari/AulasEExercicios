package br.edu.unoesc.terceiroPeriodo.conta;

import java.util.ArrayList;
import java.util.Collection;

public class Cliente {

	private String nome;
	private String cpf;
	private Collection<Conta> contas;
	
	public Cliente() {
	}
	
	public Cliente(String nome, String cpf, Conta conta) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.adicionaConta(conta);
	}
	
	public void adicionaConta(Conta conta) {
		if (contas == null) {
			contas = new ArrayList<Conta>();
		}
		conta.setCliente(this);
		contas.add(conta);
	}
	
	public void removeConta(Conta conta) {
		if (contas != null && !contas.isEmpty()) {
			contas.remove(conta);
		}
	}
	
	public Double getSaldoTotalDeContas() {
		Double saldoTotal = 0.0;
		for(Conta c : contas) {
			saldoTotal += c.getSaldo();
		}
		return saldoTotal;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
