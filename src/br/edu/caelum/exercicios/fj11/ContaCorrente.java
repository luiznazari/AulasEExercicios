package br.edu.caelum.exercicios.fj11;

public class ContaCorrente extends Conta{
	
	public void atualiza(double taxa) {
		this.saldo = this.saldo * taxa * 2;
	}
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor - 0.1;
	}
	
	public static void main(String[] args) {
	}
}
