package br.edu.unoesc.segundoPeriodo.swingSet;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Calculadora_RadioButton extends JFrame implements ActionListener {
	
	private ButtonGroup bgoperacoes;
	private JRadioButton[] jrboperacoes;
	private Container cOperacoes;
	private Container cNumeros;
	private JLabel jlbNum1, jlbNum2, jlbResposta;
	private JTextField jtfNum1, jtfNum2, jtfResposta;
	
	public Calculadora_RadioButton(){
		super ("Carculadera");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		bgoperacoes = new ButtonGroup();
		jrboperacoes = new JRadioButton[4];
		jlbNum1 = new JLabel("Numero 1:");
		jtfNum1 = new JTextField();
		jlbNum2 = new JLabel("Numero 2:");
		jtfNum2 = new JTextField();
		jlbResposta = new JLabel("Resposta:");
		jtfResposta = new JTextField();
		jtfResposta.setPreferredSize(new Dimension(200,20));
		cOperacoes = new Container();
		cOperacoes.setLayout(new GridLayout( 2, 2, 5, 5));
		cNumeros = new Container();
		cNumeros.setLayout(new GridLayout(2, 2, 5, 5));
		
		String[] Soperacoes = {"Adição", "Subtração", "Divisão", "Multiplicação"};
		
		for (int i=0; i<jrboperacoes.length; i++){
			jrboperacoes[i] = new JRadioButton(""+Soperacoes[i]);
			bgoperacoes.add(jrboperacoes[i]);
			jrboperacoes[i].addActionListener(this);
			cOperacoes.add(jrboperacoes[i]);
		}
		
		cNumeros.add(jlbNum1);
		cNumeros.add(jtfNum1);
		cNumeros.add(jlbNum2);
		cNumeros.add(jtfNum2);
		
		getContentPane().add(cNumeros);
		getContentPane().add(cOperacoes);
		getContentPane().add(jlbResposta);
		getContentPane().add(jtfResposta);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(220, 190);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args){
		Calculadora_RadioButton carc = new Calculadora_RadioButton();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		float num1=0, num2=0;
		try{
			num1 = Float.parseFloat(jtfNum1.getText());
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this, "Campo 'Numero 1' incompleto ou inválido!");
		}
		try{
			num2 = Float.parseFloat(jtfNum2.getText());
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this, "Campo 'Numero 2' incompleto ou inválido!");
		}
		int selecionado=0;
		for (int i=0; i<jrboperacoes.length; i++){
			if (jrboperacoes[i].isSelected()){
				selecionado = i;
				break;
			}
		}
		switch (selecionado){
			case 0: jtfResposta.setText(Float.toString(num1+num2)); break;
			case 1: jtfResposta.setText(Float.toString(num1-num2)); break;
			case 2: jtfResposta.setText(Float.toString(num1/num2)); break;
			case 3: jtfResposta.setText(Float.toString(num1*num2)); break;
		}
	}
}
