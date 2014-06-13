package br.edu.unoesc.prova.segundoPeriodo;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import classes.Fodas.Pra.Caralho.GridConstraints;

public class Exercicio01 extends JFrame {
	
	private JPanel pnlPrincipal;
	private JLabel jlbEstados;
	private JLabel jlbCidades;
	private JComboBox<String> jcbEstados;
	private JComboBox<String> jcbCidades;
	
	public Exercicio01 () {
		super("Exercício 01");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(getPrincipal());
		setVisible(true);
		setSize(200, 100);
	}
	
	public JPanel getPrincipal() {
		pnlPrincipal = new JPanel();
		pnlPrincipal.setLayout(new GridBagLayout());
		
		jlbEstados = new JLabel("Estados: ");
		pnlPrincipal.add(jlbEstados, new GridConstraints().setAnchor(GridConstraints.WEST).setInsets(5));
		
		jcbEstados = new JComboBox();
		pnlPrincipal.add(jcbEstados, new GridConstraints().setAnchor(GridConstraints.WEST).setInsets(5));
		jcbEstados.addItem("PR");
		jcbEstados.addItem("SC");
		jcbEstados.addItem("RS");
		jcbEstados.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				switch (jcbEstados.getSelectedIndex()) {
				case 0: jcbCidades.removeAllItems(); jcbCidades.addItem("Curitiba"); jcbCidades.addItem("Pato Branco"); break;
				case 1: jcbCidades.removeAllItems(); jcbCidades.addItem("Florianópolis"); jcbCidades.addItem("Chapecó"); break;
				case 2: jcbCidades.removeAllItems(); jcbCidades.addItem("Porto Alegre"); jcbCidades.addItem("Passo Fundo"); break;
				}
			}
		});
		
		jlbCidades = new JLabel("Cidades: ");
		pnlPrincipal.add(jlbCidades, new GridConstraints().setGridLocation(1, 0).setAnchor(GridConstraints.WEST).setInsets(5));
		
		jcbCidades = new JComboBox();
		pnlPrincipal.add(jcbCidades, new GridConstraints().setGridLocation(1, 1).setAnchor(GridConstraints.WEST).setInsets(5));
		jcbCidades.addItem("Curitiba"); jcbCidades.addItem("Pato Branco");
		
		return pnlPrincipal;
	}
	
	public static void main(String[] args) {
		new Exercicio01();
	}
}
