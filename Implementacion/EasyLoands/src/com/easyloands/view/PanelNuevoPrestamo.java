package com.easyloands.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class PanelNuevoPrestamo extends JDialog {
	private JTextField txtNoPrestamo;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table;
	
	public PanelNuevoPrestamo() {
		setSize(900,600);
		setForeground(Color.WHITE);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(37, 59, 821, 554);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNoPrestamo = new JLabel("No Prestamo");
		lblNoPrestamo.setBounds(10, 11, 70, 19);
		panel.add(lblNoPrestamo);
		
		txtNoPrestamo = new JTextField();
		txtNoPrestamo.setText("002");
		txtNoPrestamo.setBounds(102, 10, 58, 20);
		panel.add(txtNoPrestamo);
		txtNoPrestamo.setColumns(10);
		
		JLabel lblDeudor = new JLabel("Deudor");
		lblDeudor.setBounds(10, 41, 46, 14);
		panel.add(lblDeudor);
		
		textField = new JTextField();
		textField.setText("001");
		textField.setBounds(102, 38, 58, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(439, 13, 46, 14);
		panel.add(lblFecha);
		
		textField_1 = new JTextField();
		textField_1.setText("01/06/2012");
		textField_1.setBounds(495, 10, 142, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnBuscar = new JButton("");
		btnBuscar.setBorder(null);
		btnBuscar.setIcon(new ImageIcon(PanelNuevoPrestamo.class.getResource("/com/easyloands/imagenes/images.jpg")));
		btnBuscar.setBounds(190, 33, 32, 32);
		panel.add(btnBuscar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 87, 627, 131);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTasaDeInteres = new JLabel("Tasa de interes");
		lblTasaDeInteres.setBounds(10, 11, 86, 22);
		panel_1.add(lblTasaDeInteres);
		
		textField_3 = new JTextField();
		textField_3.setText("15.00");
		textField_3.setBounds(130, 12, 99, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblMonto = new JLabel("Monto ");
		lblMonto.setBounds(10, 48, 86, 22);
		panel_1.add(lblMonto);
		
		textField_4 = new JTextField();
		textField_4.setBounds(130, 49, 99, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCuotas = new JLabel("Cuotas");
		lblCuotas.setBounds(399, 48, 46, 14);
		panel_1.add(lblCuotas);
		
		textField_5 = new JTextField();
		textField_5.setBounds(476, 43, 86, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblTipoCredito = new JLabel("Tipo Credito");
		lblTipoCredito.setBounds(10, 87, 86, 22);
		panel_1.add(lblTipoCredito);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Diario", "Semanal", "Quincenal", "Mensual", "Anual"}));
		comboBox.setBounds(130, 87, 99, 22);
		panel_1.add(comboBox);
		
		JLabel lblMora = new JLabel("Mora");
		lblMora.setBounds(399, 15, 46, 14);
		panel_1.add(lblMora);
		
		textField_6 = new JFormattedTextField(new Integer(5));
		textField_6.setText("5.00");
		textField_6.setBounds(476, 12, 86, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnGenerarCalculo = new JButton("Generar Calculo");
		btnGenerarCalculo.setBounds(451, 87, 111, 23);
		panel_1.add(btnGenerarCalculo);
		
		
		table = new JTable();
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 229, 736, 289);
		panel.add(scrollPane);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Juan Jos\u00E9 Sepulveda", "Pedro Ramirez", "Sergio Hernandez", "Mario Cepeda"}));
		comboBox_1.setBounds(232, 37, 241, 22);
		panel.add(comboBox_1);
		
		JLabel lblNuevoPrestamo = new JLabel("Nuevo Prestamo");
		lblNuevoPrestamo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNuevoPrestamo.setBounds(367, 11, 187, 26);
		add(lblNuevoPrestamo);
		
	}
}
