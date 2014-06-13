package br.edu.unoesc.segundoPeriodo;

public class Calculadora {

	public static void main(String args[]){
		int n0,n1;
		n0 = Integer.parseInt(args[0]);
		n1 = Integer.parseInt(args[2]);
		if (args[1].charAt(0) == '+'){
			System.out.println("Soma: "+ (n0+n1));
		}
		else if (args[1].charAt(0) == '-'){
			System.out.println("Subtracao: "+ (n0-n1));
		}
		else if (args[1].charAt(0) == '/'){
			System.out.println("Divisao: "+ (n0/n1));
		}
		else if (args[1].charAt(0) == 'x'){
			System.out.println("Multiplicacao: "+ (n0*n1));
		}
	}
}
