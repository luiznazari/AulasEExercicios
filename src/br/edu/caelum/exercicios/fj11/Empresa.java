package br.edu.caelum.exercicios.fj11;

public class Empresa {
	
	String nome;
	String CNPJ;
	Funcionario[] empregados = new Funcionario[2];
	private int i=0;
	private int limite = 2;
	
	public void adiciona(Funcionario f) {
		
		if (i >= limite) {
			//Se o tamanho do Array - inicia em 2 - exceder, copia-se a array e cria-se outra, com o dobro do tamanho e, então, adiciona novo funcionário 
			empregados = criarArray();
			System.out.println(" == Novo Array ==\n");
			this.empregados[i] = f;
			i++;
		} else {
			this.empregados[i] = f;
			i++;
		}
	}
	
	public void mostraFuncionarios() {
		Funcionario f;
		for (int j=0; j<i; j++) {
			f = this.empregados[j];
			System.out.println("Funcionário " + (j+1) +":");
			f.mostra();
			System.out.println();			
		}
	}
	
	public Funcionario[] criarArray() {
		Funcionario[] novosF = new Funcionario[this.limite+2];
		this.limite += 2;
		int j=0;
		for (Funcionario f : empregados) {
			novosF[j] = f;
			j++;
		}
		return novosF;
	}
}
