package br.edu.unoesc.terceiroPeriodo.heranca;

public enum TipoCliente {
	
	/*Especial, Comum;
	Especial(), Comum(); Mesma coisa que o anterior, porém, este, serve para o uso parâmetros */
	
	Especial(true), Comum(false);
	
	private boolean podeTerEmprestimo;
	
	TipoCliente(boolean podeTerEmprestimo) {
		this.podeTerEmprestimo = podeTerEmprestimo;
	}
		
	public boolean getPodeTerEmprestimo() {
		return podeTerEmprestimo;
	}
	
}
