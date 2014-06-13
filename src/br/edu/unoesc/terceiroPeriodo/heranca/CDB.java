package br.edu.unoesc.terceiroPeriodo.heranca;

public class CDB extends Conta implements Rendimento {

	private Double rendimento;
	
	@Override
	public boolean temSaldoParaSaque(Double valor) {
		return false;
	}
	
	@Override
	public Double getRendimento() {
		return this.rendimento;
	}	
	
	public void setRendimento(Double rendimento) {
		this.rendimento = rendimento;
	}
}
