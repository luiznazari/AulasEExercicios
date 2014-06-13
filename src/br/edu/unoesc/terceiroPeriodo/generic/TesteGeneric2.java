package br.edu.unoesc.terceiroPeriodo.generic;

import br.edu.unoesc.terceiroPeriodo.heranca.Cliente;
import br.edu.unoesc.terceiroPeriodo.heranca.Conta;
import br.edu.unoesc.terceiroPeriodo.heranca.ContaCorrente;
import br.edu.unoesc.terceiroPeriodo.heranca.ContaPoupanca;

public class TesteGeneric2 {
	
	public static void main(String[] args) {
		GenericService<Conta> contaBancoDados = new GenericServiceImpl<>();
		
		ContaPoupanca poupanca = new ContaPoupanca();
		poupanca.setId(12l); // 12 L
		contaBancoDados.salvar(poupanca);
	
		ContaCorrente corrente = new ContaCorrente();
		corrente.setId(13l);
		contaBancoDados.salvar(corrente);
		
		GenericService<Cliente> clienteBancoDados = new GenericServiceImpl<>();
		
		Cliente cliente = new Cliente("Luiz", 19);
		cliente.setId(14l);
		clienteBancoDados.salvar(cliente);
	}

}
