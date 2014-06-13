package br.edu.caelum.exercicios.fj11;

public class TestaEmpresa {
	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
		
		empresa.nome = "Camtwo";
		empresa.CNPJ = "00.000.000/0000-00";
		
		Funcionario f1 = new Funcionario("Fulano");
		f1.setSalario(1000);
		f1.setData(new Data());
		empresa.adiciona(f1);
		
		Funcionario f2 = new Funcionario("Ciclano");
		f2.setSalario(1700);
		f2.setData(new Data());
		empresa.adiciona(f2);
		
		empresa.mostraFuncionarios();
		
		Funcionario f3 = new Funcionario("Beltrano");
		f3.setSalario(2000);
		f3.setData(new Data());
		empresa.adiciona(f3);
		
		empresa.mostraFuncionarios();
		
		System.out.println("Número total de funcionários: "+ f1.getNumFuncionarios());
	}
}
