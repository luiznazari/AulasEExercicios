package anotações;

public class CompararChar{
	public static void main(String[] args) {
		String a = "Java", b = "Java";
		if (a == b) //Compara endereço de memória
		{System.out.println("Memória igual");}
		if (a.equals(b)) //Compara o conteúdo das variáveis
		{System.out.println("String igual");}
	}
}
