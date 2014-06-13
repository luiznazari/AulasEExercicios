package br.edu.unoesc.terceiroPeriodo.heranca;

import java.util.Date;

import br.edu.unoesc.terceiroPeriodo.generic.GenericModel;

public abstract class Conta implements GenericModel, Comparable<Conta> {
	
	private static Integer numeroDeContas = 0;
	
	//Teste de GenericModel
	private Long id;
	
	private Integer numero;
	private Double saldo = 0.0;
	private Date dataAbertura;
	private Cliente cliente;
	private Agencia agencia;
	
	public Conta() {
		this.numero = numeroDeContas;
		numeroDeContas++;
	}
	
	public abstract boolean temSaldoParaSaque(Double valor);

	public boolean saca(Double valor) {
		if (temSaldoParaSaque(valor)) {
			saldo -= valor;
			return true;
		}
		return false;
	}
	
	public void deposita (Double valor) {
		this.saldo += valor;
	}
	
	public void transfereParaOutraConta(Conta contaDestino, Double valor) {
		if (this.saca(valor)) {
			System.out.println("Transferido quantia para conta de "+ contaDestino.getCliente().getNome());
			contaDestino.deposita(valor);
		} else {
			System.out.println("Não foi possível realizar a transferência.");
		}
	}
	
	@Override
	public int compareTo(Conta c) {
		if(this.getNumero() < c.getNumero()) {
			return -1;
		}
		if(this.getNumero() > c.getNumero()) {
			return 1;
		}
		return 0;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public Double getSaldo() {
		return saldo;
	}
}
