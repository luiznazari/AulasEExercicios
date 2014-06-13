package br.edu.unoesc.terceiroPeriodo.pedido;

public class Item implements Cloneable {
	
	private Pedido pedido;
	private Produto produto;	
	private Integer quantidade;
	private Double valor;
	
	public Item(Produto produto, Integer quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
		
		this.valor = produto.getValor() * quantidade;
	}
	
	@Override
	protected Object clone() {
		try {
			return (Item) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	public Double getValor() {
		return this.valor;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
}
