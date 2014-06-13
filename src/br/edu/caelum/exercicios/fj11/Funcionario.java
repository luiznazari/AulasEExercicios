package br.edu.caelum.exercicios.fj11;

import java.text.DecimalFormat;

public class Funcionario {
	
	private String nome;
	private String RG;
	private String departamento;	
	private double salario;
	private Data dataEntrada;
	private static int numFuncionarios = 0;
	
	public Funcionario () {
		this.numFuncionarios++;
	}
	
	public Funcionario (String nomeFuncionario) {
		this.numFuncionarios++;
		this.nome = nomeFuncionario;
	}
	
	public void recebeAumento(double aumento) {
		this.salario += aumento;
	}
	
	public double calculaGanhoAnual() {
		return salario*12;
	}
	
	public void mostra() {
		DecimalFormat df = new DecimalFormat("##00");
		
		System.out.println("Nome: "+ nome +"\nRG: "+ RG +"\nDepartamento: "+ departamento +"\nSalário: "+ salario);
		System.out.println("Data Entrada: "+ df.format(dataEntrada.dia) +"/"+ df.format(dataEntrada.mes) +"/"+ dataEntrada.ano);
	}
	
	public int getNumFuncionarios() {
		return this.numFuncionarios;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRG() {
		return this.RG;
	}
	
	public void setRG(String RG) {
		this.RG = RG;
	}

	public String getDepartamento() {
		return this.departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Data getData() {
		return this.dataEntrada;
	}
	
	public void setData(Data data) {
		this.dataEntrada = data;
	}
}
