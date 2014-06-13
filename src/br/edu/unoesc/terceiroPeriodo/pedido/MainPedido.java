package br.edu.unoesc.terceiroPeriodo.pedido;

public class MainPedido {
	public static void main(String[] args) {
		Produto desktop = new Produto("Desktop", 2000.0);
		Produto notebook = new Produto("Notebook", 1799.98);
		Produto hdExterno = new Produto("HD Extreno", 500.56);
		
		Item item1 = new Item(desktop, 1);
		Item item2 = new Item(notebook, 2);
		Item item3 = new Item(hdExterno, 1);
		
		Cliente luiz = new Cliente("Luiz", 19);
		
		Pedido pedido1 = new Pedido(luiz);
		pedido1.adicionaItem(item1);
		pedido1.adicionaItem(item2);		
		pedido1.geraRelatorio();
		
		Pedido pedido2 = new Pedido(luiz);
		pedido2.adicionaItem(item1);
		pedido2.adicionaItem(item2);
		pedido2.adicionaItem(item3);		
		pedido2.geraRelatorio();
	}
}
