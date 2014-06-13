package br.edu.unoesc.terceiroPeriodo.heranca;

public class ContaPoupanca extends Conta implements Rendimento {

	private Double rendimento;
	
	@Override
	public boolean temSaldoParaSaque(Double valor) {
		if (valor <= getSaldo()) {
			return true;
		}
		return false;
	}

	public Double getRendimento() {
		return this.rendimento;
	}
	public void setRendimento(Double rendimento) {
		this.rendimento = rendimento;
	}
	
}
