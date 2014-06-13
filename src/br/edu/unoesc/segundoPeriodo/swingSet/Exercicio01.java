package br.edu.unoesc.segundoPeriodo.swingSet;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import classes.Fodas.Pra.Caralho.GridConstraints;

public class Exercicio01 extends JFrame {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private JPanel pnlPrincipal;
	private JLabel jlbNome;
	private JLabel jlbEstilo;
	private JLabel jlbFilmes;
	private JTextField jtfNome;
	private JButton jbtCadastrar;
	private ButtonGroup btgEstilos;
	private JRadioButton[] jrbEstilos;
	private JList<String> lstFilmes;
	private JScrollPane jspLista;
	private DefaultListModel<String> dlmList;
	private ArrayList<String> arlEstilos;
	private ArrayList<String> arlNomes;
	

	public Exercicio01() {
		super("CadastroFilme");
		setLocationRelativeTo(null);
		setContentPane(getPrincipal());
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	public JPanel getPrincipal() {
		pnlPrincipal = new JPanel(new GridBagLayout());
		pnlPrincipal.setBorder(new EmptyBorder(10,10,5,5));
		
		arlEstilos = new ArrayList<String>();
		arlNomes = new ArrayList<String>();
		
		jlbNome = new JLabel("Título do Filme:");
		pnlPrincipal.add(jlbNome, new GridConstraints().setGridLocation(0, 0).setInsets(5)
				.setAnchor(GridConstraints.NORTHWEST).setFill(GridConstraints.BOTH));
		
		jtfNome = new JTextField(15);
		pnlPrincipal.add(jtfNome, new GridConstraints().setGridLocation(0, 1).setInsets(5)
				.setAnchor(GridConstraints.NORTHWEST).setGridSize(GridConstraints.REMAINDER, 1)
				.setGridWeight(1, 0).setFill(GridConstraints.BOTH));
		
		jlbEstilo = new JLabel("Estilo: ");
		pnlPrincipal.add(jlbEstilo, new GridConstraints().setGridLocation(1, 0).setInsets(5)
				.setAnchor(GridConstraints.NORTHEAST).setGridSize(GridConstraints.REMAINDER,  1)
				.setFill(GridConstraints.BOTH));
		
		String[] sEstilos = {"Terror","Suspense","Romance","Comédia","Ficção","Infantil"};
		
		JPanel pnlEstilos = new JPanel(new GridLayout(2,3,5,5));
		btgEstilos = new ButtonGroup();
		jrbEstilos = new JRadioButton[6];
		for (int i=0; i<jrbEstilos.length; i++) {
			jrbEstilos[i] = new JRadioButton(sEstilos[i]);
			jrbEstilos[i].setActionCommand(sEstilos[i]);
			btgEstilos.add(jrbEstilos[i]);
			pnlEstilos.add(jrbEstilos[i]);
		}
		pnlPrincipal.add(pnlEstilos, new GridConstraints().setGridLocation(2, 0).setInsets(5)
				.setAnchor(GridConstraints.NORTHEAST).setGridSize(GridConstraints.REMAINDER,  1)
				.setFill(GridConstraints.BOTH));
		
		jlbFilmes = new JLabel("Filmes Cadastrados:");
		pnlPrincipal.add(jlbFilmes, new GridConstraints().setGridLocation(3, 0).setInsets(5)
				.setAnchor(GridConstraints.NORTHWEST).setGridSize(7,  1));
		
		dlmList = new DefaultListModel<String>();
		lstFilmes = new JList<String>(dlmList);
		jspLista = new JScrollPane(lstFilmes);
		pnlPrincipal.add(jspLista, new GridConstraints().setGridLocation(4, 0).setInsets(5)
				.setAnchor(GridConstraints.NORTHEAST).setGridSize(GridConstraints.REMAINDER, GridConstraints.RELATIVE)
				.setGridWeight(1, 1).setFill(GridConstraints.BOTH));
		
		jbtCadastrar = new JButton("Cadastrar Filme");
		pnlPrincipal.add(jbtCadastrar, new GridConstraints().setGridLocation(5, 0).setInsets(5)
				.setAnchor(GridConstraints.NORTHEAST).setGridSize(2, 0));
		
		acoesComponentes();
		
		return pnlPrincipal;
	}
	
	public void acoesComponentes() {
		jbtCadastrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					String nome = jtfNome.getText();
					if (!(arlNomes.contains(nome))) {
						String estilo = btgEstilos.getSelection().getActionCommand();
						dlmList.addElement(nome +" - "+ estilo);
						arlEstilos.add(estilo);
						arlNomes.add(nome);
					} else {
						JOptionPane.showMessageDialog(null, "Filme já cadastrado");
					}
				} catch (NumberFormatException | NullPointerException ex) {
					JOptionPane.showMessageDialog(null, "Campos incompletos ou inválidos");
				}
			}
		});
	
		lstFilmes.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int index = lstFilmes.getSelectedIndex();
				jtfNome.setText(arlNomes.get(index));				
				int i = 0;
				while (i<6) {
					if (jrbEstilos[i].getText().equals(arlEstilos.get(index))) {
						jrbEstilos[i].setSelected(true);
						break;
					}
					i++;
				}
			}
		});
	}
	
	public static void main(String[] args) {
		new Exercicio01();
	}
}
