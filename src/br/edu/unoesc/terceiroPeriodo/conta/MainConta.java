package br.edu.unoesc.terceiroPeriodo.conta;

public class MainConta {
	
	public static void main(String[] args) {
		
		Cliente luiz = new Cliente();
		luiz.setNome("Luiz");
		luiz.setCpf("9876-0");
		
		Conta contaDoLuiz = new Conta();
		contaDoLuiz.setAgencia(new Agencia("SC", "1234-5"));
		contaDoLuiz.setLimite(10000.0);
		contaDoLuiz.deposita(609.13);
		luiz.adicionaConta(contaDoLuiz);
		
		Conta contaDoLuiz2 = new Conta();
		contaDoLuiz2.setAgencia(new Agencia("PR", "2345-6"));
		contaDoLuiz2.setLimite(20000.0);
		contaDoLuiz2.deposita(1043.26);
		luiz.adicionaConta(contaDoLuiz2);
		
		
		System.out.println(luiz.getSaldoTotalDeContas());
	}
}
