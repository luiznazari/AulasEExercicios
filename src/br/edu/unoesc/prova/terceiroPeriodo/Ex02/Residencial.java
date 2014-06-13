package br.edu.unoesc.prova.terceiroPeriodo.Ex02;

import java.util.Date;

public class Residencial extends Telefone {

	private Boolean internet;

	public Residencial(String usuario, String numero, Date dataCriacao, Boolean internet) {
		this.setUsuario(usuario);
		this.setNumero(numero);
		this.setDataInstalacao(dataCriacao);
		this.internet = internet;
	}
	
	public Boolean getInternet() {
		return internet;
	}

	public void setInternet(Boolean internet) {
		this.internet = internet;
	}

	@Override
	public Double valorBasico() {
		return 15.00;
	}

}
