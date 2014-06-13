package br.edu.unoesc.segundoPeriodo.swingSet;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela01 extends JFrame {
	
	private JPanel pnlPrincipal;
	private JLabel jlbValor;
	private JTextField jtfValor;
	private JButton jbtEnviar;
	private JButton jbtSetar;
	private JButton jbtGet;
	private Tela02 tela;
	
	public Tela01 () {
		super ("Tela 01");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(getPrincipal());
		setResizable(false);
		setSize(200, 90);
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
		
		jbtEnviar = new JButton("Enviar");
		pnlPrincipal.add(jbtEnviar);
		
		jbtSetar = new JButton("Set");
		pnlPrincipal.add(jbtSetar);
		
		jbtGet = new JButton("Get");
		pnlPrincipal.add(jbtGet);
		
		tela = new Tela02();
		tela.setVisible(false);

		acoesComponentes();
		
		return pnlPrincipal;
	}
	
	public void acoesComponentes() {
		tela.setVisible(true);
		jbtEnviar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tela.setText(jtfValor.getText());
			}
		});
		
		jbtSetar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tela.setText("Texto setado");
			}
		});
		
		jbtGet.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				jtfValor.setText(tela.getText());
			}
		});
	}
	
	public static void main(String[] args) {
		new Tela01();
	}
}
