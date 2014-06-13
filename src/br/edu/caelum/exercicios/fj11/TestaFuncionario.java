package br.edu.caelum.exercicios.fj11;

public class TestaFuncionario {
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();

		Data dataDeEntrada = new Data();
		dataDeEntrada.dia = 3;
		dataDeEntrada.mes = 2;
		dataDeEntrada.ano = 2014;
		
		f1.setNome("Luiz");
		f1.setRG("000.000.000-0");
		f1.setDepartamento("Desenvolvimento");
		f1.setSalario(800);
		f1.setData(dataDeEntrada);
		
		f1.mostra();
	}
}
