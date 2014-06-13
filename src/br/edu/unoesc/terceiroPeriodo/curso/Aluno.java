package br.edu.unoesc.terceiroPeriodo.curso;

public class Aluno {

	private String nome;
	private String cpf;
	private Curso curso; //Aluno tem um curso
	
	public Aluno() {
		
	}

	public Aluno(String nome, String cpf, Curso curso) {
		this.nome = nome;
		this.cpf = cpf;
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}