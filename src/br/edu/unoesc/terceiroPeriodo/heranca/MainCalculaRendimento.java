package br.edu.unoesc.terceiroPeriodo.heranca;

import java.util.ArrayList;
import java.util.List;

public class MainCalculaRendimento {
	
	public Rendimento getMaiorRendimento(List<Rendimento> contas) {
		Rendimento maior = null;
		int i = 0;
		for (Rendimento r : contas) {
			if(i == 0) {
				maior = r;
			} else {
				if (r.getRendimento() > maior.getRendimento()) {
					maior = r;
				}
			}
			i++;
		}
		return maior;
	}
	
	public static void main(String[] args) {
		MainCalculaRendimento calculaRendimento = new MainCalculaRendimento();
		List<Rendimento> contas = new ArrayList<Rendimento>();
		
		CDB cdb = new CDB();
		cdb.setRendimento(1.0);
		contas.add(cdb);
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.setRendimento(0.3);
		contas.add(cp);
		
		TituloCapitalizacao titulo = new TituloCapitalizacao();
		titulo.setRendimento(0.1);
		contas.add(titulo);
		
		Rendimento maiorEncontrado = calculaRendimento.getMaiorRendimento(contas);
		
		System.out.println("O maior rendimento é: "+ maiorEncontrado.getRendimento() 
				+ " De: "+ maiorEncontrado.getClass().getSimpleName());
	}
}
