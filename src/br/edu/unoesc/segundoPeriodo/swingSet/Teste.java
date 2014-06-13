package br.edu.unoesc.segundoPeriodo.swingSet;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

import classes.Fodas.Pra.Caralho.GridConstraints;

public class Teste extends JFrame {
	
	private JList<String> jls;
	private JScrollPane jsp;
	private DefaultListModel<String> dlm;
	
	Teste() {
		setTitle("Título");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		
		jls = new JList<String>();
		jsp = new JScrollPane();
		dlm = new DefaultListModel<String>();
		
		
		jls.setModel(dlm);
		jsp.add(jls);
		dlm.addElement("oi");
		dlm.addElement("haha");
		jls.setModel(dlm);
		
		
		
		getContentPane().add(jsp, new GridConstraints().setAnchor(GridConstraints.WEST).setInsets(5)
						.setFill(GridConstraints.BOTH).setGridWeight(1, 1).setGridSize(GridConstraints.REMAINDER, GridConstraints.REMAINDER));
		
		setVisible(true);
		setSize(300, 100);
		setLocationRelativeTo(null);
		
		
	}
	
	public static void main(String[] args) {
		new Teste();
	}
}
