package br.edu.unoesc.terceiroPeriodo.portal;

public class Aluno implements AcessaPortal {

	private String nickName;
	private String senha;
	private TipoUsuario tipoUsuario;

	public Aluno(String nickName, String senha, TipoUsuario tipoUsuario) {
		this.nickName = nickName;
		this.senha = senha;
		this.tipoUsuario = tipoUsuario;
	}

	@Override
	public String getNickName() {
		return this.nickName;
	}
	
	@Override
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	@Override
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
