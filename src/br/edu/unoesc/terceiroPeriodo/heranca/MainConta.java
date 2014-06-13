package br.edu.unoesc.terceiroPeriodo.heranca;

import java.util.Arrays;
import classes.Fodas.Pra.Caralho.Boolean;

public class MainConta {
	public static void main(String[] args) {
		ContaPoupanca cp1 = new ContaPoupanca();
		cp1.deposita(1000.0);
		
		ContaCorrente cc1 = new ContaCorrente();
		cc1.setLimite(1000.0);
		cc1.deposita(300.0);
		
		CaixaEletronico cx = new CaixaEletronico();
		cx.setTotalDinheiro(30000.0);
		
		cx.tirarDinheiro(cc1, 200.0);
		System.out.println("Corrente: "+ cc1.getSaldo());
		cx.tirarDinheiro(cp1, 100.0);
		System.out.println("Pupança: "+ cp1.getSaldo());
		cx.tirarDinheiro(cc1, 300.0);
		System.out.println("Corrente: "+ cc1.getSaldo());
		
		Banco banco = new Banco();
		banco.addContas( Arrays.asList(cc1, cp1) );
		System.out.println("Saldo Total do Banco: "+ banco.getSaldoBanco());
		
		System.out.println("\n=====-----=====-----=====\n");
		
		Cliente cliente1 = new Cliente("Luiz", 19);
		cliente1.setTipoCliente(TipoCliente.Especial);
		
		Cliente cliente2 = new Cliente("Angela", 42);
		cliente2.setTipoCliente(TipoCliente.Comum);
		
		System.out.println("Cliente: "+ cliente2.getNome() +"\nPode fazer financiamento: "+ Boolean.traduz(cliente2.temCreditoFinanciamento()));
		
		
		
		
		
	}
}
