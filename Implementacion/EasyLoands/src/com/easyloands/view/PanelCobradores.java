package com.easyloands.view;

import java.awt.SystemColor;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class PanelCobradores extends JPanel {
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTable table;
	private JTextField textField_2;
	
	public PanelCobradores() {
		setBorder(new TitledBorder(new LineBorder(new Color(140, 140, 140)), "Cobradores", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setBackground(SystemColor.menu);
        setBounds(322, 126, 931, 600);
        setLayout(null);
        
        JLabel lblUsuario = new JLabel("C\u00E9dula");
        lblUsuario.setBounds(605, 49, 46, 14);
        add(lblUsuario);
        
        JLabel lblPrimerNombre = new JLabel(" Nombre");
        lblPrimerNombre.setBounds(85, 49, 86, 14);
        add(lblPrimerNombre);
        
        JLabel lblSegundoNombre = new JLabel("Apellido");
        lblSegundoNombre.setBounds(347, 49, 92, 14);
        add(lblSegundoNombre);
        
        JLabel lblUsuario_1 = new JLabel("Direcci\u00F3n");
        lblUsuario_1.setBounds(493, 101, 52, 14);
        add(lblUsuario_1);
        
        JLabel lblContrasea = new JLabel("Tel\u00E9fono");
        lblContrasea.setBounds(168, 121, 52, 14);
        add(lblContrasea);
        
        textField = new JTextField();
        textField.setBounds(140, 46, 192, 20);
        add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(398, 46, 192, 20);
        add(textField_1);
        
        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(227, 118, 192, 20);
        add(textField_4);
        
        JButton btnAgregar = new JButton("Nuevo");
        btnAgregar.setBounds(85, 172, 126, 32);
        add(btnAgregar);
        
        JButton btnEditar = new JButton("Editar");
        btnEditar.setBounds(243, 172, 126, 32);
        add(btnEditar);
        
        JButton btnBorrar = new JButton("Borrar");
        btnBorrar.setBounds(398, 172, 132, 32);
        add(btnBorrar);
        
        JButton btnGrabar = new JButton("Grabar");
        btnGrabar.setBounds(558, 172, 132, 32);
        add(btnGrabar);
        
        JButton button = new JButton("Agregar");
        button.setBounds(719, 172, 133, 32);
        add(button);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(60, 233, 821, 335);
        add(scrollPane);
        
        table = new JTable();
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"Nombre", "Apellido", "Cédula", "Teléfono", "Dirección"
        	}
        ));
        scrollPane.setViewportView(table);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(651, 46, 192, 20);
        add(textField_2);
        
        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(557, 101, 230, 47);
        add(scrollPane_1);
        
        JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);
        scrollPane_1.setViewportView(textArea);
        
 
	
        
	}
}
