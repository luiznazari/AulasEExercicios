package br.edu.unoesc.terceiroPeriodo.curso;

public class Curso {
	private String nome;
	private Integer vagas;

	public Curso(String nome, Integer vagas) {
		this.nome = nome;
		this.vagas = vagas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getVagas() {
		return vagas;
	}

	public void setVagas(Integer vagas) {
		this.vagas = vagas;
	}
}