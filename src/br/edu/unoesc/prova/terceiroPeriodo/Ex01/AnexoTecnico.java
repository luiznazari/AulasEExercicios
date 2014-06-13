package br.edu.unoesc.prova.terceiroPeriodo.Ex01;

import java.util.Date;

public class AnexoTecnico {

	private Date dataCriacao;
	private String titulo;
	private String tema;
	
	public AnexoTecnico() {
	}
	
	public AnexoTecnico(Date dataCriacao, String titulo, String tema) {
		this.dataCriacao = dataCriacao;
		this.titulo = titulo;
		this.tema = tema;
	}
	
	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

}
