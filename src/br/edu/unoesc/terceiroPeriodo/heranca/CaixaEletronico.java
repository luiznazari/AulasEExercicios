package br.edu.unoesc.terceiroPeriodo.heranca;

public class CaixaEletronico {
	
	private Double totalDinheiro = 0.0;
	
	public boolean tirarDinheiro(Conta conta, Double valor) {
		if (this.totalDinheiro >= valor) {
			if(conta.saca(valor)) {
				this.totalDinheiro -= valor;
				return true;
			}
		}
		return false;
	}
	
	public void colocarDinheiro(Double valor) {
		this.totalDinheiro += valor;
	}
	
	public Double getTotalDinheiro() {
		return totalDinheiro;
	}
	public void setTotalDinheiro(Double totalDinheiro) {
		this.totalDinheiro = totalDinheiro;
	}	
}
