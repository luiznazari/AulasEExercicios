package br.edu.unoesc.prova.terceiroPeriodo.Ex02;

import java.util.Date;

public abstract class Telefone {

	private String usuario;
	private String numero;
	private Date dataInstalacao;

	public abstract Double valorBasico();

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getDataInstalacao() {
		return dataInstalacao;
	}

	public void setDataInstalacao(Date dataInstalacao) {
		this.dataInstalacao = dataInstalacao;
	}

}
