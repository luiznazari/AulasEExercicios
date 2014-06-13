package br.edu.unoesc.segundoPeriodo.swingSet;

import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class ExemploList extends JFrame implements ActionListener {

	private ScrollPane scpRolagem;
	private JList<String> jltFontes;
	private JButton jbtOk;
	private Vector<String> minhasFontes;
	private int i=0;
	
	ExemploList(){
		super("Lista de Fontes");
		setLayout(null);
		
		minhasFontes = new Vector<String>();
		minhasFontes.add("Times New Romam");
		minhasFontes.add("Arial");
		minhasFontes.add("Courier New");
		minhasFontes.add("Fonte_00");
		minhasFontes.add("Fonte_01");
		minhasFontes.add("Fonte_02");
		minhasFontes.add("Fonte_03");
		minhasFontes.add("Fonte_04");
		minhasFontes.add("Fonte_05");
		
		scpRolagem = new ScrollPane();
		scpRolagem.setBounds(10, 10, 200, 130);
		jltFontes = new JList<String>();
		jltFontes.setListData(minhasFontes);
		jltFontes.setSelectedIndex(i);
		scpRolagem.add(jltFontes);
		getContentPane().add(scpRolagem);
		
		jbtOk = new JButton("OK");
		jbtOk.setBounds(10, 150, 60, 25);
		jbtOk.addActionListener(this);
		getContentPane().add(jbtOk);
		
		setSize(240, 230);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new ExemploList();
	}
	@Override
	public void actionPerformed(ActionEvent evt) {
		
		//Selecionar Elemento
		i++;
		jltFontes.setSelectedIndex(i);
		
		//Exemplo de Troca entre Valores
		//String aux = minhasFontes.get(0);
		//minhasFontes.set(0, minhasFontes.get(1));
		//minhasFontes.set(1, aux);
		//jltFontes.setListData(minhasFontes);
		
		//Exemplo Troca de Valor
		//minhasFontes.set(jltFontes.getSelectedIndex(), "Arial Black");
		//jltFontes.setListData(minhasFontes);
		
		//Exemplo alteração
		//minhasFontes.set(3, "ArialBlack");
		//jltFontes.setListData(minhasFontes);
		
		//Mostrar fonte selecionada
		//JOptionPane.showMessageDialog(this, "Fonte Escolhida: " + jltFontes.getSelectedValue());
		
		//Exemplo remover
		//minhasFontes.remove("Arial");
		//jltFontes.setListData(minhasFontes); // Atualiza a lista
	}
}
