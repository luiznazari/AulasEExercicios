package br.edu.unoesc.terceiroPeriodo.heranca;

import java.util.ArrayList;
import java.util.Collection;

import br.edu.unoesc.terceiroPeriodo.generic.GenericModel;

public class Cliente implements GenericModel{
	
	//Testes com GenericModel
	private Long id;
	
	private String nome;
	private Integer idade;
	private TipoCliente tipoCliente;
	private Collection<Conta> contas;
	
	public Cliente() {
	}
	
	public Cliente(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public boolean temCreditoFinanciamento() {
		return tipoCliente.getPodeTerEmprestimo();
	}
	
	public void adicionaConta(Conta conta) {
		if (contas == null) {
			contas = new ArrayList<Conta>();
		} else {
			conta.setCliente(this);
			contas.add(conta);
		}
	}
	
	public void removeConta(Conta conta) {
		if(contas.contains(conta)) {
			contas.remove(conta);
		} else {
			System.out.println("Conta não existente!");
		}
	}
	
	public Long getId() {
		return id;
	}	
	public void setId(Long id) {
		this.id = id;
	}
	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
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
}
