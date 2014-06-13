package br.edu.unoesc.terceiroPeriodo.heranca;

public class Calculadora {

	public static void mostraCalculo(Operacao operacao, float x, float y) {
		System.out.println("Resultado = "+ operacao.calcula(x, y));
	}
	
	public static void main(String[] args) {
		Calculadora.mostraCalculo(new Soma(), 10, 10);
		Calculadora.mostraCalculo(new Subtracao(), 10, 10);
	}
}
