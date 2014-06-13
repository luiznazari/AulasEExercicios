package br.edu.unoesc.segundoPeriodo.swingSet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Table extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel jpnFields;
	private JPanel jpnTable;
	private JPanel jpnResult;
	
	private JTextField jtfField1;
	private JTextField jtfField2;
	private JTextField jtfResult;
	
	private JLabel jlbRow;
	private JLabel jlbColumn;
	private JLabel jlbResult;
	
	private JButton jbtCreate;
	private JButton jbtSum;
	
	private JTable jtbTable;
	
	private DefaultTableModel dtmModel;
	
	public Table() {
		super("CreateTable");
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(300,300);
		getContentPane().add(getFields(), BorderLayout.NORTH);
		getContentPane().add(getTable(), BorderLayout.CENTER);
		getContentPane().add(getResult(), BorderLayout.SOUTH);
	}
	
	public JPanel getFields() {
		jpnFields = new JPanel();
		jpnFields.setPreferredSize(new Dimension(50, 65));
		jpnFields.setLayout(new FlowLayout());
		
		jlbRow = new JLabel("Rows:");
		
		jlbColumn = new JLabel("Columns:");
		
		jtfField1 = new JTextField();
		jtfField1.setPreferredSize(new Dimension(80,22));
		
		jtfField2 = new JTextField();
		jtfField2.setPreferredSize(new Dimension(80,22));
		
		jbtCreate = new JButton("Create the Table");
		jbtCreate.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					dtmModel.setRowCount(Integer.parseInt(jtfField1.getText()));
					dtmModel.setColumnCount(Integer.parseInt(jtfField2.getText()));
					
					jtbTable.setModel(dtmModel);
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Only Integer at Fields Row and Column!");
				}
			}			
		});
		
		jpnFields.add(jlbRow);
		jpnFields.add(jtfField1);
		jpnFields.add(jlbColumn);
		jpnFields.add(jtfField2);
		jpnFields.add(jbtCreate);
		
		return jpnFields;
	}
	
	public JPanel getTable() {
		jpnTable = new JPanel();
		jpnTable.setLayout(new BorderLayout());
		jpnTable.setBackground(Color.white);
		
		jtbTable = new JTable();
		dtmModel = new DefaultTableModel();
		
		jpnTable.add(jtbTable, BorderLayout.CENTER);
		
		return jpnTable;
	}
	
	public JPanel getResult() {
		jpnResult = new JPanel();
		jpnResult.setLayout(new FlowLayout());
		
		jbtSum = new JButton("Sum");
		jbtSum.addActionListener(new ActionListener() {			
			@Override
			
			public void actionPerformed(ActionEvent arg0) {
				try {
					double sum = 0;
					for (int i = 0; i<dtmModel.getRowCount(); i++){
						for (int j = 0; j<dtmModel.getColumnCount(); j++){
							sum += Double.parseDouble((String) dtmModel.getValueAt(i, j));
						}
					}
					jtfResult.setText(Double.toString(sum));
				} catch (NullPointerException | NumberFormatException ex1) {
					JOptionPane.showMessageDialog(null, "Fields don't confirmed");
				}
			}
		});
		
		jlbResult = new JLabel("Result:");
		
		jtfResult = new JTextField();
		jtfResult.setPreferredSize(new Dimension(80,22));
		
		jpnResult.add(jbtSum);
		jpnResult.add(jlbResult);
		jpnResult.add(jtfResult);
		
		return jpnResult;
	}
	
	public static void main(String[] args) {
		new Table();
	}
}
