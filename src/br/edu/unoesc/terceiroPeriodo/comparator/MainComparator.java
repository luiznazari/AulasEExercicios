package br.edu.unoesc.terceiroPeriodo.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.beanutils.BeanComparator;
import org.apache.commons.collections4.comparators.ComparatorChain;

import br.edu.unoesc.terceiroPeriodo.heranca.Conta;
import br.edu.unoesc.terceiroPeriodo.heranca.ContaCorrente;

public class MainComparator {
	
	private static List<Conta> contas = new ArrayList<Conta>();
	
	private static void imprimeContas(String descricao) {
		System.out.println(descricao);
		for (Conta c : contas) {
			System.out.println(c.getNumero());
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Conta cc01 = new ContaCorrente();
		cc01.setNumero(451);
		cc01.deposita(100.0);
		
		Conta cc02 = new ContaCorrente();
		cc02.setNumero(410);
		cc02.deposita(50.0);
		
		contas.add(cc01);
		contas.add(cc02);
		
		Collections.sort(contas);
		imprimeContas("Primeira ordenação");
		
		Collections.sort(contas, new SaldoComparator());
		imprimeContas("Ordenação por Saldo");
		
		Collections.sort(contas, ContaComparator.Por_numero);
		imprimeContas("Ordenação por Número");
		
		Collections.sort(contas, ContaComparator.Por_numero.asc());
		imprimeContas("Ordenação por Número Ordem Ascendente");
		
		Collections.sort(contas, ContaComparator.Por_numero.dec());
		imprimeContas("Ordenação por Número Ordem Decrescente");
		
		// Commons Apache
		
		List<BeanComparator<Conta>> campos = new ArrayList<>();
		campos.add(new BeanComparator<Conta>("numero"));
		campos.add(new BeanComparator<Conta>("saldo"));
		
		//ComparatorChain<Conta> multiChain = new ComparatorChain<Conta>(campos.get(0));
		//ComparatorChain<Conta> multiChain2 = new ComparatorChain<>(campos);
		
	}
}
