package br.edu.unoesc.segundoPeriodo.swingSet;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Banco extends JFrame {

	private JPanel pnlPrincipal;
	private JLabel jlbCliente;	
	private JLabel jlbOperacao;
	private JLabel jlbValor;	
	private JLabel jlbMovimentacao;	
	private JTextField jtfCliente;
	private JTextField jtfValor;
	private JTextField jtfMostraSaldo;
	private JComboBox<String> jcbOperacao;
	private JButton jbtCalcular;
	private JButton jbtLimpar;
	private JTable jtbMovimentacao;
	private DefaultTableModel dtmMovimentacao;
	private JScrollPane jspMovimentacao;
	
	private JPanel pnlCadastro;
	private JLabel jlbNome;
	private JLabel jlbSexo;
	private JLabel jlbSaldo;
	private JTextField jtfNome;
	private JTextField jtfSaldo;
	private ButtonGroup btgSexo;
	private JRadioButton jrbMasculino;
	private JRadioButton jrbFeminino;
	private JButton jbtConfirmar;
	private JButton jbtCancelar;
	
	private JFrame jfmCadastro;
	private JMenuBar jmbMenu;
	private JMenu jmCadastro;
	private JMenuItem jmiCadastrar;
	private JMenuItem jmiRemover;
	private JMenuItem jmExit;
	
	private ArrayList<String> lstNomes = new ArrayList<String>();
	private ArrayList<String> lstSexo = new ArrayList<String>();
	private ArrayList<Double> lstSaldos = new ArrayList<Double>();

	public Banco() {
		super("Banco");
		setJMenuBar(getMenu());
		setContentPane(iniciar());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 305, 350);
		setSize(300, 400);
		setVisible(true);
	}
	
	public void frameCadastro() {
		jfmCadastro = new JFrame("Cadastro");
		jfmCadastro.setContentPane(Cadastro());
		jfmCadastro.setSize(300, 180);
		jfmCadastro.setVisible(true);
		jfmCadastro.setResizable(false);
		jfmCadastro.setLocationRelativeTo(null);
	}

	public JPanel iniciar() {
		pnlPrincipal = new JPanel();
		pnlPrincipal.setBorder(new EmptyBorder(10, 5, 5, 5));
		pnlPrincipal.setLayout(new GridBagLayout());

		jlbCliente = new JLabel("Cliente:");
		pnlPrincipal.add(
				jlbCliente,
				new GBC(0, 0).setInsets(5).setAnchor(GBC.NORTHEAST)
						.setFill(GBC.BOTH));

		jtfCliente = new JTextField();
		pnlPrincipal.add(
				jtfCliente,
				new GBC(0, 1, GBC.REMAINDER, 1).setInsets(5)
						.setAnchor(GBC.NORTHEAST).setFill(GBC.BOTH)
						.setWeight(1, 0));

		jlbOperacao = new JLabel("Operação:");
		pnlPrincipal.add(
				jlbOperacao,
				new GBC(1, 0).setInsets(5).setAnchor(GBC.CENTER)
						.setFill(GBC.BOTH));

		jcbOperacao = new JComboBox<>(new String[] { "Débito", "Crédito" });
		pnlPrincipal.add(
				jcbOperacao,
				new GBC(1, 1, GBC.REMAINDER, 1).setInsets(5)
						.setAnchor(GBC.NORTHEAST).setWeight(1, 0)
						.setFill(GBC.BOTH));

		jlbValor = new JLabel("Valor:");
		pnlPrincipal.add(
				jlbValor,
				new GBC(2, 0).setInsets(5).setAnchor(GBC.NORTHEAST)
						.setFill(GBC.BOTH));

		jtfValor = new JTextField();
		pnlPrincipal.add(
				jtfValor, new GBC(2, 1, GBC.REMAINDER, 1).setInsets(5)
				.setAnchor(GBC.NORTHEAST).setWeight(1, 0).setFill(GBC.BOTH));
		
		jlbSaldo = new JLabel("Saldo: R$");
		pnlPrincipal.add(
				jlbSaldo,
				new GBC(3, 0).setInsets(5).setAnchor(GBC.NORTHEAST)
						.setFill(GBC.BOTH));
		
		jtfMostraSaldo = new JTextField("0.00");
		jtfMostraSaldo.setEditable(false);
		pnlPrincipal.add(jtfMostraSaldo, new GBC(3, 1, GBC.REMAINDER, 1).setInsets(5)
				.setAnchor(GBC.NORTHEAST).setWeight(1, 0).setFill(GBC.BOTH));
		
		jlbMovimentacao = new JLabel("Movimentação:");
		pnlPrincipal.add(jlbMovimentacao, new GBC(4, 0, 2, 1).setInsets(5)
				.setAnchor(GBC.NORTHEAST).setFill(GBC.BOTH));

		dtmMovimentacao = new DefaultTableModel();
		jtbMovimentacao = new JTable(dtmMovimentacao);
		jspMovimentacao = new JScrollPane(jtbMovimentacao);
		jtbMovimentacao.setEnabled(false);
		String[] colunas = { "Cliente", "Sexo", "Operação", "Valor" };
		for (int i = 0; i < colunas.length; i++) {
			dtmMovimentacao.addColumn(colunas[i]);
		}
		pnlPrincipal.add(
				jspMovimentacao,
				new GBC(5, 0, GBC.REMAINDER, GBC.RELATIVE)
						.setAnchor(GBC.NORTHWEST).setInsets(5)
						.setFill(GBC.BOTH).setWeight(0, 1));

		jbtCalcular = new JButton("Calcular Saldo");
		pnlPrincipal.add(jbtCalcular, new GBC(6, 0, 2, 1).setInsets(5)
				.setAnchor(GBC.NORTHWEST));
		
		jbtLimpar = new JButton("Limpar Registros");
		pnlPrincipal.add(jbtLimpar, new GBC(6, 2, 2, 1).setInsets(5)
				.setAnchor(GBC.NORTHWEST));

		acoesComponentes();
		return pnlPrincipal;
	}

	public void acoesComponentes() {

		jbtCalcular.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				String cliente = jtfCliente.getText();
				if (cliente.equals("")){
					JOptionPane.showMessageDialog(null, "Nome incompleto!");
				}
				else if (!(lstNomes.contains(cliente))){
					JOptionPane.showMessageDialog(null, "Cliente não cadastrado!");
				} else {
					try {
						double valor = Double.parseDouble(jtfValor.getText());
						int index = lstNomes.indexOf(cliente);
						String sexo = lstSexo.get(index);
						if (jcbOperacao.getSelectedIndex() == 0) {
							if ((lstSaldos.get(index)-valor) >= 0) {
								lstSaldos.set(index, lstSaldos.get(index) - valor);
							} else {
								JOptionPane.showMessageDialog(null, "Fundos insuficientes!");
								valor = 0;
							}
						} else {
							lstSaldos.set(index, lstSaldos.get(index) + valor);
						}
						jtfMostraSaldo.setText(Double.toString(lstSaldos.get(index)));
						dtmMovimentacao.addRow(new String[]
								{ cliente, sexo, (String) jcbOperacao.getSelectedItem(), Double.toString(valor)});
					} catch (NumberFormatException ex) {
						JOptionPane.showMessageDialog(null, "Valor inválido ou incompleto!");
					}
				}
			}
		});
		
		jbtLimpar.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				jtfCliente.setText("");
				jcbOperacao.setSelectedIndex(0);
				jtfValor.setText("");
				jtfMostraSaldo.setText("0.00");
				for (int i = dtmMovimentacao.getRowCount()-1; i>=0; i--) {
					dtmMovimentacao.removeRow(i);
				}
			}
		});
	}

	public JPanel Cadastro() {
		
		pnlCadastro = new JPanel();
		pnlCadastro.setBorder(new EmptyBorder(10, 5, 5, 5));
		pnlCadastro.setLayout(new GridBagLayout());

		jlbNome = new JLabel("Nome:");
		pnlCadastro.add(
				jlbNome,
				new GBC(0, 0).setInsets(5).setAnchor(GBC.NORTHEAST)
						.setFill(GBC.BOTH));

		jtfNome = new JTextField();
		pnlCadastro.add(
				jtfNome,
				new GBC(0, 1, GBC.REMAINDER, 1).setInsets(5)
						.setAnchor(GBC.NORTHEAST).setFill(GBC.BOTH)
						.setWeight(1, 0));
		
		jlbSexo = new JLabel("Sexo");
		pnlCadastro.add(
				jlbSexo,
				new GBC(1, 0).setInsets(5).setAnchor(GBC.CENTER)
						.setFill(GBC.BOTH));

		jrbFeminino = new JRadioButton("Feminino");
		jrbFeminino.setSelected(true);
		pnlCadastro.add(jrbFeminino,
				new GBC(1, 1).setInsets(5).setAnchor(GBC.NORTHWEST));

		jrbMasculino = new JRadioButton("Masculino");
		pnlCadastro.add(jrbMasculino,
				new GBC(1, 2).setInsets(5).setAnchor(GBC.NORTHWEST));

		btgSexo = new ButtonGroup();
		btgSexo.add(jrbFeminino);
		btgSexo.add(jrbMasculino);
		
		jlbSaldo = new JLabel("Saldo:");
		pnlCadastro.add(
				jlbSaldo,
				new GBC(2, 0).setInsets(5).setAnchor(GBC.NORTHEAST)
						.setFill(GBC.BOTH));

		jtfSaldo = new JTextField();
		pnlCadastro.add(
				jtfSaldo,
				new GBC(2, 1, GBC.REMAINDER, 1).setInsets(5)
						.setAnchor(GBC.NORTHEAST).setFill(GBC.BOTH)
						.setWeight(1, 0));
		
		jbtConfirmar = new JButton("Confirmar");
		pnlCadastro.add(
				jbtConfirmar, new GBC(3,1).setInsets(5)
				.setAnchor(GBC.NORTHEAST).setFill(GBC.BOTH));
		jbtConfirmar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					String nome_cliente = jtfNome.getText();
					if (!(lstNomes.contains(nome_cliente))) {
						lstSaldos.add(Double.parseDouble(jtfSaldo.getText()));
						lstNomes.add(nome_cliente);
						if (jrbFeminino.isSelected() == true){
							lstSexo.add(jrbFeminino.getText());
						} else {
							lstSexo.add(jrbMasculino.getText());
						}
						jfmCadastro.dispose();
					} else {
						JOptionPane.showMessageDialog(null, "Cliente já registrado!");
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Campos incompletos ou inválidos!");
				}
			}
		});
		
		jbtCancelar = new JButton("Cancelar");
		pnlCadastro.add(
				jbtCancelar, new GBC(3,2).setInsets(5)
				.setAnchor(GBC.NORTHEAST).setFill(GBC.BOTH));
		jbtCancelar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				jfmCadastro.dispose();
			}
		});
		
		return pnlCadastro;
	}
	
	public JMenuBar getMenu() {
		
		jmbMenu = new JMenuBar();
		
		jmCadastro = new JMenu("Cadastro");
		jmCadastro.setMnemonic(KeyEvent.VK_C);
		jmbMenu.add(jmCadastro);
		
		jmiCadastrar = new JMenuItem("Cadastrar");
		jmCadastro.add(jmiCadastrar);
		jmiCadastrar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frameCadastro();
			}
		});
		
		jmiRemover = new JMenuItem("Remover");
		jmCadastro.add(jmiRemover);
		jmiRemover.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String nome_cliente = JOptionPane.showInputDialog("Remover cliente, Digite o nome:");
				try {
					int index = lstNomes.indexOf(nome_cliente);
					lstNomes.remove(index);
					lstSaldos.remove(index);
					lstSexo.remove(index);
					JOptionPane.showMessageDialog(null, "Dados removidos com sucesso!");
				} catch (java.lang.IndexOutOfBoundsException ex){
					JOptionPane.showMessageDialog(null, "Nome de Cliente não encontrado.");
				}
			}
		});
		
		jmExit = new JMenu("Sair");
		jmExit.setMnemonic(KeyEvent.VK_S);
		jmbMenu.add(jmExit);
		jmExit.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(1);				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				System.exit(1);
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		return jmbMenu;
	}
	
	public static void main(String[] args) {
		new Banco();
	}
}

class GBC extends GridBagConstraints {

	public GBC(int gridy, int gridx) {
		this.gridy = gridy;
		this.gridx = gridx;
	}

	public GBC(int gridy, int gridx, int gridwidth, int gridheight) {
		this.gridy = gridy;
		this.gridx = gridx;
		this.gridwidth = gridwidth;
		this.gridheight = gridheight;
	}

	public GBC setAnchor(int anchor) {
		this.anchor = anchor;
		return this;
	}

	public GBC setFill(int fill) {
		this.fill = fill;
		return this;
	}

	public GBC setWeight(double weightx, double weighty) {
		this.weightx = weightx;
		this.weighty = weighty;
		return this;
	}

	public GBC setInsets(int distance) {
		this.insets = new Insets(distance, distance, distance, distance);
		return this;
	}

	public GBC setInsets(int top, int left, int bottom, int right) {
		this.insets = new Insets(top, left, bottom, right);
		return this;
	}

	public GBC setIpad(int ipadx, int ipady) {
		this.ipadx = ipadx;
		this.ipady = ipady;
		return this;
	}
}