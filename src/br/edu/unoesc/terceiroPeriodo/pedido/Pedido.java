package br.edu.unoesc.terceiroPeriodo.pedido;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Pedido {
	
	private static Integer n = 1; 
	
	private Collection<Item> itens;
	private Double precoTotal;
	private Date data;
	private Integer numero;
	private Cliente cliente;
	
	public Pedido(Cliente cliente) {
		this.numero = n;
		n++;
		
		this.cliente = cliente;
		this.data = new Date();
	}
	
	public void adicionaItem(Item item) {
		if (this.itens == null)
			this.itens = new ArrayList<Item>();
		Item novoItem = (Item) item.clone();
		novoItem.setPedido(this);
		itens.add(novoItem);
	}
	
	public Double getPrecoTotal() {
		precoTotal = 0.0;
		for (Item item : itens) {
			precoTotal += item.getValor();
		}
		return precoTotal;
	}
	
	public void geraRelatorio() {
		System.out.println(
			  "\n ---------- Relatório Pedido ---------- "
			+ "\n - Número do Pedido: "+ this.getNumero()
			+ "\n - Data: "+ this.getDate()
			+ "\n - Cliente: "+ this.cliente.getNome()
			+ "\n -"
			+ "\n -       ------- Itens ------- "
		);
		for (Item item : itens) {
			System.out.println(
				  " -"
				+ "\n - Nome:        "+ item.getProduto().getNome()
				+ "\n - Valor:       "+ item.getProduto().getValor()
				+ "\n - Quantidade:  "+ item.getQuantidade()
				+ "\n - Valor total: "+ item.getValor()
			);
		}
		System.out.println(
			  " -\n -       --------------------- \n -"
			+ "\n - Valor total do Pedido: "+ this.getPrecoTotal()
			+ "\n -------------------------------------- "
		);
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Integer getNumero() {
		return this.numero;
	}
	public Collection<Item> getItens() {
		return itens;
	}
	public Date getDate() {
		return data;
	}
	public void setDate(Date data) {
		this.data = data;
	}
}
