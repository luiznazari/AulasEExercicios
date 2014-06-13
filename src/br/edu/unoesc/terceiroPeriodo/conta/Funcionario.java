package br.edu.unoesc.terceiroPeriodo.conta;

public class Funcionario {
	
	private String nome;
	private Double salarioBase = 0.0;
	private Departamento dpto;
	private Cargo cargo;
	
	public Funcionario(){
	}
	
	public Funcionario(String nome, Double salarioBase, Departamento dpto, Cargo cargo) {
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.dpto = dpto;
		this.cargo = cargo;
	}
	
	public Double getSalarioBruto() {
		return salarioBase + (salarioBase*dpto.getPercentualGratificacao()/100);
	}
	
	public boolean isSalarioInferiorAoMinimo(){
		if (getSalarioBruto()<cargo.getSalarioMinimo()) {
			return true;
		}
		return false;
	}
	
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public Departamento getDpto() {
		return dpto;
	}
	public void setDpto(Departamento dpto) {
		this.dpto = dpto;
	}
}
