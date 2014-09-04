package br.edu.unoesc.prova.segundoPeriodo;

import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import classes.Fodas.Pra.Caralho.GridConstraints;

public class Exercicio03 extends JFrame{
	
	private JPanel pnlPrincipal;
	private JLabel jlbValor;
	private JLabel jlbMedia;
	private JTextField jtfValor;
	private JButton jbtAdd;
	private JButton jbtCalcular;
	private DefaultListModel<Float> model;
	private JList<Float> jlsValores;
	private JScrollPane jspScroll;
	
	public Exercicio03() {
		super("Exercício 03");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(getPrincipal());
		setVisible(true);
		setSize(300, 300);
	}
	
	public JPanel getPrincipal() {
		pnlPrincipal = new JPanel();
		pnlPrincipal.setLayout(new GridBagLayout());
		
		jlbValor = new JLabel("Valor:");
		pnlPrincipal.add(jlbValor, new GridConstraints().setAnchor(GridConstraints.WEST).setInsets(5).setFill(GridConstraints.BOTH));
		
		jtfValor = new JTextField();
		pnlPrincipal.add(jtfValor, new GridConstraints().setAnchor(GridConstraints.WEST).setInsets(5)
						.setFill(GridConstraints.BOTH).setOccupiedSize(GridConstraints.RELATIVE, 1).setGridWeight(1, 0));
		
		jbtAdd = new JButton("Adicionar");
		pnlPrincipal.add(jbtAdd, new GridConstraints().setAnchor(GridConstraints.EAST).setInsets(5).setOccupiedSize(GridConstraints.REMAINDER, 1));
		
		model = new DefaultListModel<Float>();
		
		jlsValores = new JList<Float>();
		jlsValores.setModel(model);
		jlsValores.setFont(new Font("Meera", Font.PLAIN, 16));
		jspScroll = new JScrollPane(jlsValores);
		pnlPrincipal.add(jspScroll, new GridConstraints().setFill(GridConstraints.BOTH)
						.setAnchor(GridConstraints.WEST).setInsets(5).setOccupiedSize(GridConstraints.REMAINDER, GridConstraints.RELATIVE)
						.setGridWeight(1, 1));		
		
		jbtCalcular = new JButton("Calcular Média");
		pnlPrincipal.add(jbtCalcular, new GridConstraints().setAnchor(GridConstraints.WEST)
						.setInsets(5).setOccupiedSize(2, 1));
		
		jlbMedia = new JLabel("Média: ");
		pnlPrincipal.add(jlbMedia, new GridConstraints().setAnchor(GridConstraints.WEST)
						.setInsets(5).setOccupiedSize(2, 1));
		
		acoesComponentes();
		
		return pnlPrincipal;
	}
	
	public void acoesComponentes() {
		
		jbtAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					model.addElement(Float.parseFloat(jtfValor.getText()));
				} catch (NullPointerException | NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Campo 'Valor' incompleto ou inválido!");
				}
			}
		});
		
		jbtCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int elementos = model.getSize();
				float soma = 0;
				for (int i=0; i<elementos ; i++) {
					soma += model.getElementAt(i);
				}
				jlbMedia.setText("Média: "+ (soma/elementos));
			}
		});
		
	}
	
	public static void main(String[] args) {
		new Exercicio03();
	}
}
