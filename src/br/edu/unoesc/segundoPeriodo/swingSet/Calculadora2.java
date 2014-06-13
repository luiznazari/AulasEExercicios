package br.edu.unoesc.segundoPeriodo.swingSet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculadora2 extends JFrame implements ActionListener{
	
	private JButton jbt1,jbt2,jbt3, jbt4, jbt5, jbt6, jbt7, jbt8, jbt9, jbt0;
	private JButton jbtmais, jbtmenos, jbtvezes, jbtdividido;
	private JButton jbtC, jbtCE, jbtigual, jbtponto;
	private JTextField jtfvisor;
	private JLabel jlbcalculo;
	private float Nbackup=0;
	private byte operacao=0,contr=1;
	
	Calculadora2(){
		setLayout(null);
		jbt1 = new JButton("1");
		jbt2 = new JButton("2");
		jbt3 = new JButton("3");
		jbt4 = new JButton("4");
		jbt5 = new JButton("5");
		jbt6 = new JButton("6");
		jbt7 = new JButton("7");
		jbt8 = new JButton("8");
		jbt9 = new JButton("9");
		jbt0 = new JButton("0");
		jbtmais = new JButton("+");
		jbtmenos = new JButton("-");
		jbtvezes = new JButton("*");
		jbtdividido = new JButton("/");
		jbtC = new JButton("C");
		jbtCE = new JButton("CE");
		jbtigual = new JButton("=");
		jbtponto = new JButton(".");
		jtfvisor = new JTextField("0");		
		jtfvisor.setHorizontalAlignment(JTextField.RIGHT);
		jlbcalculo = new JLabel("");
		
		jbt1.setBounds(10, 125, 41, 20);
		jbt2.setBounds(60, 125, 41, 20);
		jbt3.setBounds(110, 125, 41, 20);
		jbt4.setBounds(10, 100, 41, 20);
		jbt5.setBounds(60, 100, 41, 20);
		jbt6.setBounds(110, 100, 41, 20);
		jbt7.setBounds(10, 75, 41, 20);
		jbt8.setBounds(60, 75, 41, 20);
		jbt9.setBounds(110, 75, 41, 20);		
		jbt0.setBounds(60, 150, 41, 20);
		jbtmais.setBounds(160, 75, 49, 20);
		jbtmenos.setBounds(160, 100, 49, 20);
		jbtvezes.setBounds(160, 125, 49, 20);
		jbtdividido.setBounds(160, 150, 49, 20);
		jbtC.setBounds(110, 50, 42, 20);
		jbtCE.setBounds(160, 50, 49, 20);
		jbtigual.setBounds(110, 150, 41, 20);
		jbtponto.setBounds(10, 150, 41, 20);
		jtfvisor.setBounds(10, 20, 200, 25);
		jlbcalculo.setBounds(10, 5, 200, 10);
		
		jbt1.addActionListener(this);
		jbt2.addActionListener(this);
		jbt3.addActionListener(this);
		jbt4.addActionListener(this);
		jbt5.addActionListener(this);
		jbt6.addActionListener(this);
		jbt7.addActionListener(this);
		jbt8.addActionListener(this);
		jbt9.addActionListener(this);
		jbt0.addActionListener(this);
		jbtmais.addActionListener(this);
		jbtmenos.addActionListener(this);
		jbtvezes.addActionListener(this);
		jbtdividido.addActionListener(this);
		jbtC.addActionListener(this);
		jbtCE.addActionListener(this);
		jbtigual.addActionListener(this);
		jbtponto.addActionListener(this);
				
		getContentPane().add(jbt1);
		getContentPane().add(jbt2);
		getContentPane().add(jbt3);
		getContentPane().add(jbt4);
		getContentPane().add(jbt5);
		getContentPane().add(jbt6);
		getContentPane().add(jbt7);
		getContentPane().add(jbt8);
		getContentPane().add(jbt9);
		getContentPane().add(jbt0);
		getContentPane().add(jbtmais);
		getContentPane().add(jbtmenos);
		getContentPane().add(jbtvezes);
		getContentPane().add(jbtdividido);
		getContentPane().add(jbtigual);
		getContentPane().add(jbtC);
		getContentPane().add(jbtCE);
		getContentPane().add(jbtponto);
		getContentPane().add(jtfvisor);
		getContentPane().add(jlbcalculo);
		
		setTitle("Calculadora");
		setSize(225,210);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Calculadora2 calc = new Calculadora2();
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		//Adicionar o Texto do Botão ao campo do TextField:
		JButton jb = (JButton) evt.getSource();
		String Svisor = jtfvisor.getText();
		float Fvisor = Float.parseFloat(Svisor);
		if (Svisor.equals("0"))
			Svisor = "";
		switch (jb.getText()){
			case "1": if (contr == 1) {Svisor = Svisor+"1"; jtfvisor.setText(Svisor);} break;
			case "2": if (contr == 1) {Svisor = Svisor+"2"; jtfvisor.setText(Svisor);} break;
			case "3": if (contr == 1) {Svisor = Svisor+"3"; jtfvisor.setText(Svisor);} break;
			case "4": if (contr == 1) {Svisor = Svisor+"4"; jtfvisor.setText(Svisor);} break;
			case "5": if (contr == 1) {Svisor = Svisor+"5"; jtfvisor.setText(Svisor);} break;
			case "6": if (contr == 1) {Svisor = Svisor+"6"; jtfvisor.setText(Svisor);} break;
			case "7": if (contr == 1) {Svisor = Svisor+"7"; jtfvisor.setText(Svisor);} break;
			case "8": if (contr == 1) {Svisor = Svisor+"8"; jtfvisor.setText(Svisor);} break;
			case "9": if (contr == 1) {Svisor = Svisor+"9"; jtfvisor.setText(Svisor);} break;
			case "0": if (contr == 1) {Svisor = Svisor+"0"; jtfvisor.setText(Svisor);} break;
			case "+": if (operacao == 0) Nbackup = Fvisor; jtfvisor.setText("0"); jlbcalculo.setText(Float.toString(Nbackup)+" +"); operacao = 1; contr = 1; break;
			case "-": if (operacao == 0) Nbackup = Fvisor; jtfvisor.setText("0"); jlbcalculo.setText(Float.toString(Nbackup)+" -"); operacao = 2; contr = 1; break;
			case "*": if (operacao == 0) Nbackup = Fvisor; jtfvisor.setText("0"); jlbcalculo.setText(Float.toString(Nbackup)+" *"); operacao = 3; contr = 1; break;
			case "/": if (operacao == 0) Nbackup = Fvisor; jtfvisor.setText("0"); jlbcalculo.setText(Float.toString(Nbackup)+" /"); operacao = 4; contr = 1; break;
			case ".": if (contr == 1) {if (Svisor.equals("")){Svisor = "0";}Svisor = Svisor+"."; jtfvisor.setText(Svisor);} break;
			case "=":{
				switch(operacao){
					case 1: jtfvisor.setText(Float.toString(Nbackup+Fvisor)); jlbcalculo.setText(Float.toString(Nbackup) +" + "+ Svisor); break;
					case 2: jtfvisor.setText(Float.toString(Nbackup-Fvisor)); jlbcalculo.setText(Float.toString(Nbackup) +" - "+ Svisor); break;
					case 3: jtfvisor.setText(Float.toString(Nbackup*Fvisor)); jlbcalculo.setText(Float.toString(Nbackup) +" * "+ Svisor); break;
					case 4: jtfvisor.setText(Float.toString(Nbackup/Fvisor)); jlbcalculo.setText(Float.toString(Nbackup) +" / "+ Svisor); break;
				}
				operacao = 0;
				contr = 0;
				break;
			}
			case "C": contr = 1;jlbcalculo.setText(""); Nbackup = 0; jtfvisor.setText("0"); break;
			case "CE": contr = 0; operacao = -1; jlbcalculo.setText(Float.toString(Nbackup)); jtfvisor.setText("0"); break;
		}
		/*
		Criar um objeto para pegar o nome do botão:
		Object obj = evt.getSource();
		if (obj == jbt1)
			jtfvisor.setText("1");
		*/
	}
}
