package br.edu.unoesc.segundoPeriodo.swingSet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener{
	private JLabel jlbn1,jlbn2,jlbresposta;
	private JTextField jtfn1, jtfn2,jtfresposta;
	private JButton jbtigual;
	private JComboBox<String> jcboperacao;
	
	Calculadora(){
		setLayout(null);
		
		jlbn1 = new JLabel();
		jlbn1.setText("Número 1:");
		jlbn1.setBounds(15, 5, 100, 50);
		getContentPane().add(jlbn1);

		jlbn2 = new JLabel();
		jlbn2.setText("Número 2:");
		jlbn2.setBounds(145, 5, 100, 50);
		getContentPane().add(jlbn2);
		
		jlbresposta = new JLabel();
		jlbresposta.setText("Resposta:");
		jlbresposta.setBounds(275, 5, 100, 50);
		getContentPane().add(jlbresposta);
		
		jtfn1 = new JTextField();
		jtfn1.setBounds(10, 42, 70, 20);
		getContentPane().add(jtfn1);
		
		jtfn2 = new JTextField();
		jtfn2.setBounds(140, 42, 70, 20);
		getContentPane().add(jtfn2);
		
		jtfresposta = new JTextField();
		jtfresposta.setBounds(270, 42, 70, 20);
		getContentPane().add(jtfresposta);
		
		jbtigual = new JButton();
		jbtigual.setText("=");
		jbtigual.setBounds(215, 42, 50, 19);
		jbtigual.addActionListener(this);
		getContentPane().add(jbtigual);
		
		jcboperacao = new JComboBox<String>();
		ArrayList<String> operacoes = new ArrayList<>(Arrays.asList(new String[] {"+", "-", "*", "/"}));
		for (String c : operacoes)
			jcboperacao.addItem(c);
		jcboperacao.setBounds(85, 42, 50, 20);
		getContentPane().add(jcboperacao);
		
		setTitle("Calculadora");
		setSize(400,120);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		}	
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			float n1,n2;
			n1 = Integer.parseInt(jtfn1.getText());
			n2 = Integer.parseInt(jtfn2.getText());
			switch ((String) jcboperacao.getSelectedItem())	{
				case "+": jtfresposta.setText(Float.toString(n1+n2)); break;
				case "-": jtfresposta.setText(Float.toString(n1-n2)); break;
				case "*": jtfresposta.setText(Float.toString(n1*n2)); break;
				case "/": jtfresposta.setText(Float.toString(n1/n2)); break;
			}
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this, "Valor Inválido!");
		}
	}
}
