package br.edu.unoesc.terceiroPeriodo.pedido;

import java.util.Date;

public class Conta implements Cloneable {
	
	private Double limite;
	private Double saldo = 0.0;
	private Date dataAbertura;
	private Cliente cliente;
	private Agencia agencia;
	
	public Conta() {
	}
	
	public Conta(Cliente cliente, Agencia agencia, Double saldo, Double limite, Date dataAbertura) {
		this.cliente = cliente;
		this.agencia = agencia;
		this.limite = limite;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
	}

	public boolean saca(Double valor) {
		if (this.saldo-valor >= 0) {
			if (this.cliente != null)
				System.out.println("Sacado R$"+ valor +" da conta de "+ cliente.getNome());
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Saldo insuficiente!");
		}
		return false;
	}
	
	public void deposita (Double valor) {
		if (this.cliente != null)
			System.out.println("Depositado R$"+ valor +" da conta de "+ cliente.getNome());
		this.saldo += valor;
	}
	
	public void alteraLimite(Double valor) {
		this.limite = valor;
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
	public Object clone() {
		try {
			return (Conta) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public Double getLimite() {
		return limite;
	}
	public void setLimite(Double limite) {
		this.limite = limite;
	}
	public Double getSaldo() {
		return this.saldo;
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
}
