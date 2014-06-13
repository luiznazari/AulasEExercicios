package br.edu.unoesc.terceiroPeriodo.pedido;

import java.util.ArrayList;
import java.util.Collection;

public class Cliente {
	
	private String nome;
	private Integer idade;
	private Collection<Pedido> pedidos;
	private Collection<Conta> contas;
	
	public Cliente(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void adicionaItem(Pedido pedido) {
		if (this.pedidos == null)
			this.pedidos = new ArrayList<Pedido>();
		pedido.setCliente(this);
		pedidos.add(pedido);
	}
	
	public void adicionaItem(Conta conta) {
		if (this.contas == null)
			this.contas = new ArrayList<Conta>();
		Conta novaConta = (Conta) conta.clone();
		novaConta.setCliente(this);
		contas.add(novaConta);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Collection<Pedido> getPedidos() {
		return pedidos;
	}	
}
