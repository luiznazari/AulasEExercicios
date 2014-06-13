package br.edu.unoesc.terceiroPeriodo.conta;

public class Cargo {
	
	private String nome;
	private Double salarioMinimo;
	
	public Cargo() {
	}
	
	public Cargo(String nome, Double salarioMinimo) {
		this.nome = nome;
		this.salarioMinimo = salarioMinimo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalarioMinimo() {
		return salarioMinimo;
	}
	public void setSalarioMinimo(Double salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
	}	
}
