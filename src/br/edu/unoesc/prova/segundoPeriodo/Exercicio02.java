package br.edu.unoesc.prova.segundoPeriodo;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import classes.Fodas.Pra.Caralho.GridConstraints;

public class Exercicio02 extends JFrame{
	
	private JPanel pnlPrincipal;
	private JLabel jlbEnunciado;
	private JLabel jlbEscolhidos;
	private JButton jbtResposta;
	private JCheckBox[] jchCandidatos;
	
	public Exercicio02() {
		super("Exercício 02");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(getPrincipal());
		setVisible(true);
		pack();
	}
	
	public JPanel getPrincipal() {
		pnlPrincipal = new JPanel();
		pnlPrincipal.setLayout(new GridBagLayout());
		
		jlbEnunciado = new JLabel("Quais são os candidatos à Presidência da República de 2010?");
		pnlPrincipal.add(jlbEnunciado, new GridConstraints().setAnchor(GridConstraints.WEST).setInsets(5));
		
		String[] sCandidatos = {"Dilma", "José Serra", "João da Silva", "Marina da Silva", "Plínio da Silveira"};
		
		jchCandidatos = new JCheckBox[5];
		for (int i = 0; i<5; i++) {
			jchCandidatos[i] = new JCheckBox(sCandidatos[i]);
			pnlPrincipal.add(jchCandidatos[i], new GridConstraints().setGridLocation(i+1, 0).setAnchor(GridConstraints.WEST).setInsets(5));
		}
		
		jbtResposta = new JButton("Resposta");
		jbtResposta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					for (int i=0; i<5; i++) {
						if (jchCandidatos[i].isSelected()) {
							String backup = jlbEscolhidos.getText();
							jlbEscolhidos.setText(backup + jchCandidatos[i].getText() +", ");
						}							
					}
				} catch (NullPointerException ex) {
					JOptionPane.showMessageDialog(null, "Nenhuma opção selecionada!");
				}
			}
		});
		pnlPrincipal.add(jbtResposta, new GridConstraints().setGridLocation(7, 0).setAnchor(GridConstraints.WEST).setInsets(5));
		
		jlbEscolhidos = new JLabel("Os escolhidos foram: ");
		pnlPrincipal.add(jlbEscolhidos, new GridConstraints().setGridLocation(8, 0).setAnchor(GridConstraints.WEST).setInsets(5));
		
		return pnlPrincipal;
	}
	
	public static void main(String[] args) {
		new Exercicio02();
	}

}
