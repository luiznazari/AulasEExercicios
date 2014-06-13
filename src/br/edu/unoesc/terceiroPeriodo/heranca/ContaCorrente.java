package br.edu.unoesc.terceiroPeriodo.heranca;

public class ContaCorrente extends Conta {
	
	private Double limite;
	
	@Override
	public boolean temSaldoParaSaque(Double valor) {
		if (valor <= getSaldo() + limite) {
			return true;
		}
		return false;
	}

	public Double getLimite() {
		return limite;
	}
	public void setLimite(Double limite) {
		this.limite = limite;
	}
}
