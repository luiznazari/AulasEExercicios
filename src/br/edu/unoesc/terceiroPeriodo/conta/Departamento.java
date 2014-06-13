package br.edu.unoesc.terceiroPeriodo.conta;

public class Departamento {
	
	private String nome;
	private Double percentualGratificacao;
	
	public Departamento(String nome, Double percentualGratificacao) {
		this.nome = nome;
		this.percentualGratificacao = percentualGratificacao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getPercentualGratificacao() {
		return percentualGratificacao;
	}
	
	public void setPercentualGratificacao(Double percentualGratificacao) {
		this.percentualGratificacao = percentualGratificacao;
	}
}
