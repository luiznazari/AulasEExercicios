package br.edu.unoesc.prova.terceiroPeriodo.Ex02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Comercial extends Telefone {

	private Integer ramais;

	public Comercial(String usuario, String numero, Date dataCriacao, Integer ramais) {
		this.setUsuario(usuario);
		this.setNumero(numero);
		this.setDataInstalacao(dataCriacao);
		this.ramais = ramais;
	}
	
	public Integer getRamais() {
		return ramais;
	}

	public void setRamais(Integer ramais) {
		this.ramais = ramais;
	}

	@Override
	public Double valorBasico() {
		Date dataInstalacao = this.getDataInstalacao();
		Double valor = 0.0;
		try {
			String dataContrato = "01/01/1998";
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date dt = df.parse(dataContrato);
			if (dataInstalacao.after(dt)) {
				valor =  25.00;
			} else {
				valor = 37.50;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return valor;
	}

}
