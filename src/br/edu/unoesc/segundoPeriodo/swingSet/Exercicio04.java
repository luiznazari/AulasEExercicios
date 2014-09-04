package br.edu.unoesc.segundoPeriodo.swingSet;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import classes.Fodas.Pra.Caralho.GridConstraints;

public class Exercicio04 extends JFrame{
	
	private JPanel pnlMain;
	private JPanel pnlDescontos;
	private JLabel jlbValor;
	private JLabel jlbValorLiquido;
	private JTextField jtfValor;
	private JTextField jtfValorLiquido;
	private JButton jbtCalcularValor;
	private ButtonGroup btgDescontos;
	private JRadioButton jrb10;
	private JRadioButton jrb20;
	private JRadioButton jrb30;
	
	Exercicio04() {
		super ("Exercício 03");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(getMain());
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		pack();
	}
	
	public JPanel getMain() {
		pnlMain = new JPanel();
		pnlMain.setLayout(new GridBagLayout());
		
		jlbValor = new JLabel("Insira o Valor:");
		pnlMain.add(jlbValor, new GridConstraints()
					.setAnchor(GridConstraints.WEST).setInsets(5));
		
		jtfValor = new JTextField(15);
		pnlMain.add(jtfValor, new GridConstraints()
					.setAnchor(GridConstraints.CENTER).setInsets(5));
		
		pnlMain.add(getDescontos(), new GridConstraints()
					.setGridLocation(1, 0).setAnchor(GridConstraints.WEST).setInsets(5)
					.setFill(GridConstraints.BOTH).setOccupiedSize(1, 3));
		
		jbtCalcularValor = new JButton("Calcular Valor Líquido");
		pnlMain.add(jbtCalcularValor, new GridConstraints()
					.setGridLocation(1, 1).setAnchor(GridConstraints.CENTER).setInsets(5));
		
		jlbValorLiquido = new JLabel("Valor Líquido:");
		pnlMain.add(jlbValorLiquido, new GridConstraints()
					.setGridLocation(2, 1).setAnchor(GridConstraints.CENTER).setInsets(5));

		jtfValorLiquido = new JTextField(15);
		pnlMain.add(jtfValorLiquido, new GridConstraints()
					.setGridLocation(3, 1).setAnchor(GridConstraints.CENTER).setInsets(5));

		acoesComponentes();
		
		return pnlMain;
	}
	
	public JPanel getDescontos() {
		pnlDescontos = new JPanel();
		pnlDescontos.setLayout(new GridLayout(3,1));
		pnlDescontos.setBorder(BorderFactory.createLineBorder(Color.darkGray, 1));
		
		btgDescontos = new ButtonGroup();
		jrb10 = new JRadioButton("10%");
		jrb10.setActionCommand("10");
		btgDescontos.add(jrb10);
		pnlDescontos.add(jrb10);
		jrb20 = new JRadioButton("20%");
		jrb20.setActionCommand("20");
		btgDescontos.add(jrb20);
		pnlDescontos.add(jrb20);
		jrb30 = new JRadioButton("30%");
		jrb30.setActionCommand("30");
		btgDescontos.add(jrb30);
		pnlDescontos.add(jrb30);
		
		return pnlDescontos;
	}
	
	public void acoesComponentes() {
		
		jbtCalcularValor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					float valor = Float.parseFloat(jtfValor.getText());
					switch (btgDescontos.getSelection().getActionCommand()) {
						case "10": jtfValorLiquido.setText(Float.toString(valor-(valor*1/10))); break;
						case "20": jtfValorLiquido.setText(Float.toString(valor-(valor*1/5))); break;
						case "30": jtfValorLiquido.setText(Float.toString(valor-(valor*3/10))); break;
					}
				} catch (NumberFormatException | NullPointerException ex) {
					JOptionPane.showMessageDialog(null, "Campos incompletos ou inválidos!");
				}
			}
		});
	}
	
	public static void main(String[] args) {
		new Exercicio04();
	}
}
