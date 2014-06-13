package br.edu.unoesc.prova.terceiroPeriodo.Ex01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Norma {
	
	private String titulo;
	private	Date dataCriacao;
	private	String orgaoNormativo;
	private	Double versao;
	private List<AnexoTecnico> anexos;
	
	public Norma() {
	}
	
	public Norma(String titulo, Date dataCriacao, String orgaoNormativo, Double versao) {
		this.titulo = titulo;
		this.dataCriacao = dataCriacao;
		this.orgaoNormativo = orgaoNormativo;
		this.versao = versao;
	}
	
	public void adicionaAnexo(AnexoTecnico anexoTecnico) {
		if (this.anexos == null) {
			anexos = new ArrayList<AnexoTecnico>();
		}
		
		this.anexos.add(anexoTecnico);
	}
	
	public void adicionaAnexos(List<AnexoTecnico> anexosTecnicos) {
		if (this.anexos == null) {
			anexos = new ArrayList<AnexoTecnico>();
		}
		
		this.anexos.addAll(anexosTecnicos);
	}
	
	public boolean removeAnexo(AnexoTecnico anexoTecnico) {
		try {
			this.anexos.remove(anexoTecnico);
			return true;
		} catch (Exception e){
			return false;
		}
	}
	
	public void imprimeDados() {
		System.out.print("Título: " + getTitulo() + "\n"
						 + "Data: " + getDataCriacao() + "\n"
						 + "Órgão: " + getOrgaoNormativo() + "\n"
						 + "Versão: " + getVersao() + "\n"
						 + "Num. Anexos: " + getAnexos().size() + "\n"
						 + "Títulos anexos: ");
		for (AnexoTecnico a : getAnexos()) {
			System.out.print(a.getTitulo() + ", ");
		}
		System.out.println();
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getOrgaoNormativo() {
		return orgaoNormativo;
	}

	public void setOrgaoNormativo(String orgaoNormativo) {
		this.orgaoNormativo = orgaoNormativo;
	}

	public Double getVersao() {
		return versao;
	}

	public void setVersao(Double versao) {
		this.versao = versao;
	}

	public List<AnexoTecnico> getAnexos() {
		return anexos;
	}

	public void setAnexos(List<AnexoTecnico> anexos) {
		this.anexos = anexos;
	}
	
	public Integer getNumeroAnexos() {
		return getAnexos().size();
	}

}
