package br.edu.unoesc.terceiroPeriodo.generic;

public class TipoValor<T> {
	
	private T valor;

	public void trocaValor(TipoValor<T> valorTroca) {
		T valorAux = valorTroca.getValor();
		valorTroca.setValor(this.valor);
		this.valor = valorAux;
	}
	
	public T getValor() {
		return this.valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}
	
}
