package br.edu.unoesc.terceiroPeriodo.portal;

public class Portal {
	
	private String senhaPadrao;
	
	public Portal(String senhaPadrao) {
		this.senhaPadrao = senhaPadrao;
	}
	
	public void acessa(AcessaPortal acessaPortal) {
		if (acessaPortal.getSenha().equals(this.senhaPadrao)) {
			System.out.println("Bem vindo, "+ acessaPortal.getNickName());
			System.out.println("- Tipo de Usuário: "+ acessaPortal.getTipoUsuario());
		} else {
			System.out.println("Acesso Negado!");
		}
	}
	
	public static void main(String[] args) {
		Portal portal = new Portal("123");
		Professor professor1 = new Professor("Professor1", "123", TipoUsuario.Profissional);
		portal.acessa(professor1);
		Aluno aluno1 = new Aluno("aluno1", "123", TipoUsuario.Aluno);
		portal.acessa(aluno1);
		Aluno aluno2 = new Aluno("aluno2", "1234", TipoUsuario.Aluno);
		portal.acessa(aluno2);
		
	}
	
}
