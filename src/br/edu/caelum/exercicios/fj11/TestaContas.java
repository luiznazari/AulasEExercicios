package br.edu.caelum.exercicios.fj11;

public class TestaContas {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		cc.deposita(1000);
		cp.deposita(1000);
		
		cc.atualiza(10);
		cp.atualiza(10);
		
		System.out.println("CC: "+ cc.getSaldo());
		System.out.println("CP: "+ cp.getSaldo());
	}
}
