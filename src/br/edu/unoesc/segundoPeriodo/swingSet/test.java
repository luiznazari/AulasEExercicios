package br.edu.unoesc.segundoPeriodo.swingSet;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class test extends JFrame{
	
	private JLabel jlbalgumacoisa;
	private JTextField jtfalgumacoisa;
	
	test() {
		super ("Teste");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 200);
		setVisible(true);
		
		setLayout(new GridBagLayout());
		GridBagConstraints cons = new GridBagConstraints();
		
		jlbalgumacoisa = new JLabel("Alguma Coisa:");
		cons.anchor = GridBagConstraints.WEST;
		cons.gridx = 0;
		cons.gridy = 0;
		getContentPane().add(jlbalgumacoisa, cons);
		
		jtfalgumacoisa = new JTextField(10);
		cons.anchor = GridBagConstraints.EAST;
		cons.gridx = 1;
		cons.gridy = 0;
		getContentPane().add(jtfalgumacoisa, cons);
	}
	
	public static void main(String[] args) {
		new test();
	}
}
