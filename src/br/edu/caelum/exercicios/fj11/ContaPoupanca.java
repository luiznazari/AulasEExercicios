package br.edu.caelum.exercicios.fj11;

public class ContaPoupanca extends Conta {

	public void atualiza(double taxa) {
		this.saldo = this.saldo * taxa * 3;
	}
	
	public static void main(String[] args) {
	}
}
