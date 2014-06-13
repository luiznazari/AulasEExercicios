package br.edu.unoesc.terceiroPeriodo.curso;

public class MainUnidirecional {

	public static void main(String[] args) {
		Curso curso = new Curso("TEC", 30);
		Aluno aluno = new Aluno("Luiz", "9876", curso);
		System.out.println("Nome do curso do aluno: "+ aluno.getCurso().getNome());
		System.out.println("Número de vagas do curso: "+ aluno.getCurso().getVagas());
	}
}
