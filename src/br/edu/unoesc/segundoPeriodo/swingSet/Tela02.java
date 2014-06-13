package br.edu.unoesc.segundoPeriodo.swingSet;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela02 extends JFrame {
	
	private JPanel pnlPrincipal;
	private JLabel jlbValor;
	private JTextField jtfValor;
	
	public Tela02 () {
		super ("Tela 02");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setContentPane(getPrincipal());
		setResizable(false);
		setSize(200, 60);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public JPanel getPrincipal() {
		pnlPrincipal = new JPanel();
		pnlPrincipal.setLayout(new FlowLayout());
		
		jlbValor = new JLabel("Valor: ");
		pnlPrincipal.add(jlbValor);
		
		jtfValor = new JTextField(13);
		pnlPrincipal.add(jtfValor);
		
		return pnlPrincipal;
	}
	
	public void setText(String sTexto) {
		jtfValor.setText(sTexto);
	}
	
	public String getText() {
		return jtfValor.getText();		
	}
	
	
	public static void main(String[] args) {
		new Tela02();
	}
}
