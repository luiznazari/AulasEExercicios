package br.edu.unoesc.prova.segundoPeriodo;

import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import classes.Fodas.Pra.Caralho.GridConstraints;

public class Exercicio04 extends JFrame {
	
	private JPanel pnlPrincipal;
	private JLabel jlbValor;
	private JTextField jtfValor;
	private JButton jbtAdd;
	private ButtonGroup bgOpcao;
	private JRadioButton jrbLista;
	private JRadioButton jrbCombo;
	private DefaultListModel<String> model;
	private JList<String> jlsValores;
	private JScrollPane jspScroll;
	private JComboBox<String> jcbValores;
	
	public Exercicio04() {
		super("Exercício 04");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(getPrincipal());
		setVisible(true);
		pack();
	}
	
	public JPanel getPrincipal() {
		pnlPrincipal = new JPanel();
		pnlPrincipal.setLayout(new GridBagLayout());
		
		jlbValor = new JLabel("Valor:");
		pnlPrincipal.add(jlbValor, new GridConstraints().setAnchor(GridConstraints.WEST).setInsets(5).setFill(GridConstraints.BOTH));
		
		jtfValor = new JTextField(10);
		pnlPrincipal.add(jtfValor, new GridConstraints().setAnchor(GridConstraints.WEST).setInsets(5).setFill(GridConstraints.BOTH));
		
		jbtAdd = new JButton("Adicionar");
		pnlPrincipal.add(jbtAdd, new GridConstraints().setAnchor(GridConstraints.WEST).setInsets(5).setFill(GridConstraints.BOTH));
		
		bgOpcao = new ButtonGroup();
		jrbLista = new JRadioButton("Lista");
		jrbLista.setActionCommand("0");
		bgOpcao.add(jrbLista);
		pnlPrincipal.add(jrbLista, new GridConstraints().setGridLocation(1, 0).setAnchor(GridConstraints.WEST).setInsets(5)
						.setFill(GridConstraints.BOTH));
		
		jrbCombo = new JRadioButton("ComboBox");
		jrbCombo.setActionCommand("1");
		bgOpcao.add(jrbCombo);
		pnlPrincipal.add(jrbCombo, new GridConstraints().setGridLocation(1, 1).setAnchor(GridConstraints.EAST).setInsets(5)
				.setFill(GridConstraints.BOTH));
		
		model = new DefaultListModel<String>();
		
		jlsValores = new JList<String>();
		jlsValores.setModel(model);
		jlsValores.setFont(new Font("Meera", Font.PLAIN, 16));
		jspScroll = new JScrollPane(jlsValores);
		pnlPrincipal.add(jspScroll, new GridConstraints().setGridLocation(2, 0).setFill(GridConstraints.BOTH)
						.setAnchor(GridConstraints.WEST).setInsets(5).setOccupiedSize(2, 3));		
		
		jcbValores = new JComboBox<String>();
		pnlPrincipal.add(jcbValores, new GridConstraints().setGridLocation(2, 2).setFill(GridConstraints.HORIZONTAL)
				.setAnchor(GridConstraints.NORTHWEST).setInsets(5).setOccupiedSize(2, 3));
		
		acoesComponentes();
		
		return pnlPrincipal;
	}
	
	public void acoesComponentes() {
		
		jbtAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					int rbselecionado = Integer.parseInt(bgOpcao.getSelection().getActionCommand());
					switch (rbselecionado) {
					case 0: model.addElement(jtfValor.getText()); break;
					case 1: jcbValores.addItem(jtfValor.getText()); break;
					}
				} catch (NullPointerException ex) {
					JOptionPane.showMessageDialog(null, "Campo incompleto!");
				}
			}
		});		
	}
	
	public static void main(String[] args) {
		new Exercicio04();
	}
}
