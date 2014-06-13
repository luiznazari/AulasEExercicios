package br.edu.unoesc.segundoPeriodo.swingSet;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import classes.Fodas.Pra.Caralho.GridConstraints;

public class Exercicio03 extends JFrame{
	
	private JPanel pnlPrincipal;
	private JPanel pnlLogin;
	private JLabel jlbNome;
	private JLabel jlbSexo;
	private JLabel jlbDataNasc;
	private JLabel jlbDadosLogin;
	private JLabel jlbEmail;
	private JLabel jlbSenha;
	private JLabel jlbConfirmacaoSenha;
	private JTextField jtfNome;
	private JTextField jtfDia;
	private JTextField jtfAno;
	private JTextField jtfEmail;
	private JTextField jtfSenha;
	private JTextField jtfConfirmaçãoSenha;
	private ButtonGroup btgSexo;
	private JRadioButton jrbFeminino;
	private JRadioButton jrbMasculino;
	private JComboBox<String> jcbMes;
	private JCheckBox jchReceberEmail;
	private JButton jbtEnviar;
	private JButton jbtCancelar;
	
	public Exercicio03() {
		super("Cadastro e Usuário");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setContentPane(getPrincipal());
		setVisible(true);
		pack();		
	}
	
	public JPanel getPrincipal() {
		pnlPrincipal = new JPanel(new GridBagLayout());
		pnlPrincipal.setBorder(new EmptyBorder(10, 10, 5, 5));
		
		jlbNome = new JLabel("Nome Completo:");
		pnlPrincipal.add(jlbNome, new GridConstraints().setGridLocation(0, 0).setInsets(5)
				.setAnchor(GridConstraints.NORTHWEST));
		
		jtfNome = new JTextField(25);
		pnlPrincipal.add(jtfNome, new GridConstraints().setGridLocation(0, 1).setInsets(5)
				.setAnchor(GridConstraints.NORTHWEST)
				.setGridSize(GridConstraints.REMAINDER, 1).setFill(GridConstraints.BOTH));
		
		jlbSexo = new JLabel("Sexo:");
		pnlPrincipal.add(jlbSexo, new GridConstraints().setGridLocation(1, 0).setInsets(5)
				.setAnchor(GridConstraints.NORTHWEST).setFill(GridConstraints.BOTH));
		
		btgSexo = new ButtonGroup();
		jrbFeminino = new JRadioButton("Feminino");
		pnlPrincipal.add(jrbFeminino, new GridConstraints().setGridLocation(1, 1).setInsets(5)
				.setAnchor(GridConstraints.NORTHWEST).setFill(GridConstraints.BOTH));
		
		jrbMasculino = new JRadioButton("Masculino");
		pnlPrincipal.add(jrbMasculino, new GridConstraints().setGridLocation(1, 2).setInsets(5)
				.setAnchor(GridConstraints.NORTHWEST).setFill(GridConstraints.BOTH));
		btgSexo.add(jrbFeminino);
		btgSexo.add(jrbMasculino);
		
		jlbDataNasc = new JLabel("Data de Nascimento:");
		pnlPrincipal.add(jlbDataNasc, new GridConstraints().setGridLocation(2, 0).setInsets(5)
				.setAnchor(GridConstraints.NORTHWEST).setFill(GridConstraints.BOTH));
		
		jtfDia = new JTextField(2);
		pnlPrincipal.add(jtfDia, new GridConstraints().setGridLocation(2, 1).setInsets(5)
				.setAnchor(GridConstraints.NORTHWEST).setFill(GridConstraints.BOTH));
		
		String[] sMeses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		
		jcbMes = new JComboBox<String>();
		for (String s : sMeses)
			jcbMes.addItem(s);
		pnlPrincipal.add(jcbMes, new GridConstraints().setGridLocation(2, 2).setInsets(5)
				.setAnchor(GridConstraints.NORTHWEST));
		
		jtfAno = new JTextField(4);
		pnlPrincipal.add(jtfAno, new GridConstraints().setGridLocation(2, 3).setInsets(5)
				.setAnchor(GridConstraints.NORTHWEST).setFill(GridConstraints.BOTH));
		
		pnlLogin = new JPanel(new GridBagLayout());
		pnlLogin.setBorder(BorderFactory.createLineBorder(Color.darkGray, 1));
		
		jlbEmail = new JLabel("E-mail:");
		pnlLogin.add(jlbEmail, new GridConstraints().setGridLocation(0, 0).setInsets(5)
				.setAnchor(GridConstraints.NORTHWEST));
		
		jtfEmail = new JTextField(25);
		pnlLogin.add(jtfEmail, new GridConstraints().setGridLocation(0, 1).setInsets(5)
				.setAnchor(GridConstraints.NORTHWEST)
				.setGridSize(GridConstraints.REMAINDER, 1).setFill(GridConstraints.BOTH));
		
		jlbSenha = new JLabel("Senha:");
		pnlLogin.add(jlbSenha, new GridConstraints().setGridLocation(1, 0).setInsets(5)
				.setAnchor(GridConstraints.NORTHWEST));
		
		jtfSenha = new JTextField(10);
		pnlLogin.add(jtfSenha, new GridConstraints().setGridLocation(1, 1).setInsets(5)
				.setAnchor(GridConstraints.NORTHWEST)
				.setGridSize(1, 1).setFill(GridConstraints.BOTH));
		
		jlbConfirmacaoSenha = new JLabel("Confirmar Senha:");
		pnlLogin.add(jlbConfirmacaoSenha, new GridConstraints().setGridLocation(1, 2).setInsets(5)
				.setAnchor(GridConstraints.NORTHWEST));
		
		jtfConfirmaçãoSenha = new JTextField(10);
		pnlLogin.add(jtfConfirmaçãoSenha, new GridConstraints().setGridLocation(1, 3).setInsets(5)
				.setAnchor(GridConstraints.NORTHWEST)
				.setGridSize(1, 1).setFill(GridConstraints.BOTH));
		
		pnlPrincipal.add(pnlLogin, new GridConstraints().setGridLocation(3, 0).setInsets(5)
				.setAnchor(GridConstraints.NORTHWEST).setFill(GridConstraints.BOTH).setGridSize(4, 2));
		
		jchReceberEmail = new JCheckBox("Desejo receber informações por e-mail");
		pnlPrincipal.add(jchReceberEmail, new GridConstraints().setGridLocation(5, 0).setInsets(5)
				.setAnchor(GridConstraints.NORTHWEST).setGridSize(2, 1));
		
		jbtEnviar = new JButton("Enviar");
		pnlPrincipal.add(jbtEnviar, new GridConstraints().setGridLocation(6, 2).setInsets(5)
				.setAnchor(GridConstraints.NORTHEAST));

		jbtCancelar = new JButton("Cancelar");
		pnlPrincipal.add(jbtCancelar, new GridConstraints().setGridLocation(6, 3).setInsets(5)
				.setAnchor(GridConstraints.NORTHEAST));
		
		acoesComponentes();
		
		return pnlPrincipal;
	}
	
	public void acoesComponentes() {
		
		jbtEnviar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					int dia = Integer.parseInt(jtfDia.getText());
					int ano = Integer.parseInt(jtfAno.getText());
					if (jtfNome.getText().equals("") || jtfDia.getText().equals("") || jtfAno.getText().equals("")
							|| jtfEmail.getText().equals("") || jtfSenha.getText().equals("")
							|| jtfConfirmaçãoSenha.getText().equals("")
							|| jrbFeminino.isSelected() == false && jrbMasculino.isSelected() == false){
						JOptionPane.showMessageDialog(null, "Campos Inválidos ou Incompletos");
					} else if (!(jtfSenha.getText().equals(jtfConfirmaçãoSenha.getText()))){
						JOptionPane.showMessageDialog(null, "Senha não confirmada");
					} else {
						JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
						dispose();
					}
				} catch (NumberFormatException | NullPointerException ex) {
					JOptionPane.showMessageDialog(null, "Campos Inválidos ou Incompletos");
				}
			}
		});
	
		jbtCancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Obrigado por usar nosso sistema");
				dispose();
			}
		});
		
	}
	
	public static void main(String[] args) {
		new Exercicio03();
	}

}
