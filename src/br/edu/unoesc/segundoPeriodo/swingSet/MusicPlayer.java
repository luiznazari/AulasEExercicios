package br.edu.unoesc.segundoPeriodo.swingSet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MusicPlayer extends JFrame {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private JImagePanel pnlPrincipal;
	private JImagePanel jipBg, jipCima;
	private JPanel pnlControles;
	private JPanel pnlLista;
	private JPanel pnlBotoesEdicaoLista;

	private JToggleButton jtbPlaynPause;
	private JToggleButton jtbExtend;
	private JButton jbtNext;
	private JButton jbtPrevious;
	private JButton jbtRemover;
	private JButton jbtAdd;

	private JList<String> jlsMusicas;
	private JLabel jlbTocando;
	private int musica_atual;
	private DefaultListModel<String> model;

	public MusicPlayer() throws IOException {
		super("Music Player");
		getClass().getResourceAsStream("/icones");
		setContentPane(getPainelPrincipal());
		setLocation(400, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setSize(400, 420); // 65
		setVisible(true);
	}

	public JPanel getPainelPrincipal() throws IOException {
		if (pnlPrincipal != null)
			return pnlPrincipal;

		jipBg = new JImagePanel("icones/Bg2.png");
		jipCima = new JImagePanel("icones/Cima.png");
		pnlPrincipal = jipBg;
		pnlPrincipal.setLayout(new BorderLayout());
		pnlPrincipal.add(getPainelMusicas(), BorderLayout.CENTER);
		pnlPrincipal.add(getPainelControles(), BorderLayout.NORTH);

		return pnlPrincipal;
	}

	public JPanel getPainelBotoesEdicaoLista() {
		if (pnlBotoesEdicaoLista != null)
			return pnlBotoesEdicaoLista;

		pnlBotoesEdicaoLista = new JPanel();
		pnlBotoesEdicaoLista.setLayout(new GridLayout(11, 1));
		pnlBotoesEdicaoLista.setOpaque(false);
		pnlBotoesEdicaoLista.setPreferredSize(new Dimension(70, 30));

		jbtAdd = new JButton();
		jbtAdd.setIcon(new ImageIcon("icones/Add.png"));
		jbtAdd.setBackground(null);
		jbtAdd.setBorder(null);
		jbtAdd.setContentAreaFilled(false);
		jbtAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser file = new JFileChooser();
				file.setMultiSelectionEnabled(true);
				file.setFileFilter(new FileNameExtensionFilter("*.mp3", "mp3"));
				file.setAcceptAllFileFilterUsed(false);
				int teste = file.showOpenDialog(null);
				if (teste == JFileChooser.APPROVE_OPTION) {
					File[] files = file.getSelectedFiles();
					for (int i = 0; i < files.length; i++)
						model.addElement(files[i].getName());
				}

				jlsMusicas.setModel(model);
				jlsMusicas.ensureIndexIsVisible(model.size() - 1);
				jlsMusicas.setSelectedIndex(0);
				jlsMusicas.requestFocus();
			}
		});

		jbtRemover = new JButton();
		jbtRemover.setIcon(new ImageIcon("icones/Remove.png"));
		jbtRemover.setBackground(null);
		jbtRemover.setBorder(null);
		jbtRemover.setContentAreaFilled(false);
		jbtRemover.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				byte selecionado = (byte) jlsMusicas.getSelectedIndex();
				if (selecionado != musica_atual){
					int[] listaItensSelecionados = jlsMusicas.getSelectedIndices();
					for (Integer v : listaItensSelecionados)
						model.remove(v);
					jlsMusicas.setModel(model);
					jlsMusicas.requestFocus();
					jlsMusicas.setSelectedIndex(0);
				} else {
					JOptionPane.showMessageDialog(null, "Música sendo executada!");
				}
			}
		});

		pnlBotoesEdicaoLista.add(jbtAdd);
		pnlBotoesEdicaoLista.add(jbtRemover);

		return pnlBotoesEdicaoLista;
	}

	public JPanel getPainelMusicas() {
		if (pnlLista != null)
			return pnlLista;

		pnlLista = new JPanel();
		pnlLista.setLayout(new BorderLayout());

		model = new DefaultListModel<>();

		jlsMusicas = new JList<String>();
		jlsMusicas.setModel(model);
		jlsMusicas.setFont(new Font("Meera", Font.PLAIN, 16));
		JScrollPane scroll = new JScrollPane(jlsMusicas);

		pnlLista.setBorder(BorderFactory.createMatteBorder(20, 5, 5, 5,
				new Color(0x308FBF)));
		pnlLista.add(scroll, BorderLayout.CENTER);
		pnlLista.add(getPainelBotoesEdicaoLista(), BorderLayout.WEST);
		pnlLista.setOpaque(false);
		return pnlLista;
	}

	public JPanel getPainelControles() {
		if (pnlControles != null)
			return pnlControles;

		jbtNext = new JButton();
		jbtNext.setIcon(new ImageIcon("icones/Next track.png"));
		jbtNext.setBorder(null);
		jbtNext.setBackground(null);
		jbtNext.setContentAreaFilled(false);
		jbtNext.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (jtbPlaynPause.isSelected()) {
					if (musica_atual + 1 < model.size()) {
						musica_atual++;
					} else {
						musica_atual = 0;
					}
					jlsMusicas.setSelectedIndex(musica_atual);
					String tocando = jlsMusicas.getSelectedValue();
					if (tocando.length() > 42)
						jlbTocando.setText(tocando.substring(0, 39) + "...");
					else
						jlbTocando.setText(tocando);
				} else {
					JOptionPane.showMessageDialog(null,
							"Nenhuma música tocando!");
				}
			}
		});

		jtbPlaynPause = new JToggleButton();
		jtbPlaynPause.setIcon(new ImageIcon("icones/Play.png"));
		jtbPlaynPause.setBorder(null);
		jtbPlaynPause.setBackground(null);
		jtbPlaynPause.setContentAreaFilled(false);
		jtbPlaynPause.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (jtbPlaynPause.isSelected() && !model.isEmpty()) {
					musica_atual = jlsMusicas.getSelectedIndex();
					jtbPlaynPause.setIcon(new ImageIcon("icones/Pause.png"));
					String tocando = jlsMusicas.getSelectedValue();
					if (tocando.length() > 42)
						jlbTocando.setText(tocando.substring(0, 39) + "...");
					else
						jlbTocando.setText(tocando);

					jlsMusicas.requestFocus();
				} else {
					jtbPlaynPause.setIcon(new ImageIcon("icones/Play.png"));
					jlbTocando.setText("Tocando: Nenhuma");
					musica_atual=-1;
					jlsMusicas.requestFocus();
				}
			}
		});

		jbtPrevious = new JButton();
		jbtPrevious.setIcon(new ImageIcon("icones/Previous record.png"));
		jbtPrevious.setBorder(null);
		jbtPrevious.setBackground(null);
		jbtPrevious.setContentAreaFilled(false);
		jbtPrevious.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (jtbPlaynPause.isSelected()) {
					if (musica_atual - 1 >= 0) {
						musica_atual--;
					} else {
						musica_atual = model.size() - 1;
					}
					jlsMusicas.setSelectedIndex(musica_atual);
					String tocando = jlsMusicas.getSelectedValue();
					if (tocando.length() > 42)
						jlbTocando.setText(tocando.substring(0, 39) + "...");
					else
						jlbTocando.setText(tocando);
				} else {
					JOptionPane.showMessageDialog(null,
							"Nenhuma música tocando!");
				}
			}
		});
		
		jtbExtend = new JToggleButton();
		jtbExtend.setIcon(new ImageIcon("icones/Top.png"));
		jtbExtend.setBorder(null);
		jtbExtend.setBackground(null);
		jtbExtend.setContentAreaFilled(false);
		jtbExtend.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed (ActionEvent arg0) {
				if (jtbExtend.isSelected()){
					jtbExtend.setIcon(new ImageIcon("icones/Bottom.png"));
					setSize(400, 62);
					pnlPrincipal = jipCima;
					setContentPane(pnlPrincipal);
					pnlPrincipal.setLayout(new BorderLayout());
					pnlPrincipal.add(getPainelMusicas(), BorderLayout.CENTER);
					pnlPrincipal.add(getPainelControles(), BorderLayout.NORTH);
				} else {
					jtbExtend.setIcon(new ImageIcon("icones/Top.png"));
					setSize(400, 420);
					pnlPrincipal = jipBg;
					pnlPrincipal.repaint();
					setContentPane(pnlPrincipal);
					pnlPrincipal.setLayout(new BorderLayout());
					pnlPrincipal.add(getPainelMusicas(), BorderLayout.CENTER);
					pnlPrincipal.add(getPainelControles(), BorderLayout.NORTH);
				}
				
			}			 
		});

		jlbTocando = new JLabel("Tocando: Nenhuma"); // 39
		jlbTocando.setFont(new Font("Arial", Font.ITALIC, 12));
		jlbTocando.setForeground(Color.WHITE);
		jlbTocando.setPreferredSize(new Dimension(265, 22));

		pnlControles = new JPanel();
		pnlControles.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlControles.setOpaque(false);
		pnlControles.add(jbtPrevious);
		pnlControles.add(jtbPlaynPause);
		pnlControles.add(jbtNext);
		pnlControles.add(jlbTocando);
		pnlControles.add(jtbExtend);

		return pnlControles;
	}

	public static void main(String[] args) throws IOException {
		new MusicPlayer();
	}

}