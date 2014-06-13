package br.edu.unoesc.terceiroPeriodo.conta;

public class Boolean {
	
	//Com método static, o objeto não precisa ser instanciado para ser usado
	public static String traduz(boolean bool) {
		if(bool) {
			return "Sim";
		}
		return "Não";
	}
	
}
