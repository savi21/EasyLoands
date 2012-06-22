package com.easyloands.view;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelClientes extends JPanel {
	
	private JButton btnNuevo;
	private JScrollPane scroll;
	private JTextField textField;
	private JTable table;
	JButton btnModificar = new JButton("Modificar");
	JButton btnEliminar = new JButton("Eliminar");
	
	public PanelClientes() {
		
		init();
		
	}
	
	void init(){
		setLayout(null);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(308, 11, 103, 23);
		
		btnNuevo.setVerticalAlignment(SwingConstants.TOP);
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new PanelNuevoCliente().setVisible(true);
			}
		});
		
		add(btnNuevo);
		
		
		btnModificar.setBounds(50, 11, 103, 23);
		btnModificar.setEnabled(false);
		add(btnModificar);
		
		 
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int con = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar el Cliente?", "Eliminar Cliente",JOptionPane.YES_NO_OPTION);
				
			}
		});
		btnEliminar.setBounds(182, 11, 103, 23);
		btnEliminar.setEnabled(false);
		add(btnEliminar);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnEliminar.setEnabled(true);
				btnModificar.setEnabled(true);
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"001", "Juan Jos\u00E9", "Sepulveda", "809-234-2323", "809-233-2313"},
				{"002", "Pedro", "Ramirez", "809-341-1231", "809-812-1232"},
				{"004", "Sergio", "Hernadez", "809-123-1233", "829-898-6331"},
				{"005", "Mario", "Cepeda", "809-856-6123", "820-313-3123"},
			},
			new String[] {
				"codigo", "Nombre (s)", "Apellido (s)", "Telefono", "Celular"
			}
		));
		
		scroll = new JScrollPane(table);
		scroll.setBounds(50, 67, 799, 416);
		add(scroll);
			
		textField = new JTextField();
		textField.setBounds(471, 12, 226, 20);
		add(textField);
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton("");
		btnBuscar.setBorder(null);
		btnBuscar.setIcon(new ImageIcon(PanelClientes.class.getResource("/com/easyloands/imagenes/images.jpg")));
		btnBuscar.setBounds(743, 11, 40, 23);
		add(btnBuscar);
	}
}
