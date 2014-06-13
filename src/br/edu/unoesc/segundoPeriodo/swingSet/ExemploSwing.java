package br.edu.unoesc.segundoPeriodo.swingSet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ExemploSwing extends JFrame implements ActionListener{ //A classe herda tudo do JFrame - O implements ActionListener, implementa o respectivo pacote (para ações do botão) 
	
	//Componentes da tela -> Se declarado em cima, ficará global, mas este é privado da classe
	private JLabel jlbNome; //Nome padronizado de labels, iniciando com jlb
	private JTextField jtfNome;
	private JButton jbtOk;
	
	// Construtor da Classe
	// Construtor -> primeira ação a ser executada
	// Construtor define o "layout", telas, botões, etc.
	// 1º Sempre possui o mesmo nome do que a Classe
	ExemploSwing(){
		
		setLayout(null);
		
		// Criando o Label
		jlbNome = new JLabel();
		jlbNome.setText("Nome: "); //Atribui String ao Label
		jlbNome.setBounds(10, 5, 100, 50); // X, Y, Largura, Altura
		getContentPane().add(jlbNome); // Adiciona o Label ao painel
		
		// Criando o Text Field
		jtfNome = new JTextField();
		jtfNome.setBounds(50, 22, 200, 20);
		getContentPane().add(jtfNome);
		
		// Criando o botão
		jbtOk = new JButton();
		jbtOk.setText("OK");
		jbtOk.setBounds(270, 22, 60, 19);
		jbtOk.addActionListener(this);
		getContentPane().add(jbtOk);
		
		// Criando o Construtor
		setTitle("Tela 01");
		setSize(360,100); // Largura, Altura
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Se não for feito, o programa continuará rodando e consumindo memória, mesmo quando a janela for fechada
	}
	public static void main(String[] args) {
		ExemploSwing tela01 = new ExemploSwing();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(this, "Instalando Vírus...");
		JOptionPane.showMessageDialog(this, "Vírus Instalado com Sucesso!");
	}
}
