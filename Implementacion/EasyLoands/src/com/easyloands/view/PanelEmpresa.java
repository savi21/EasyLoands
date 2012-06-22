package com.easyloands.view;

import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelEmpresa  extends JPanel {
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_2;
	private JTextField txtWeb;
	private JTextField textField_3;
	
	public PanelEmpresa() {
		setBorder(new TitledBorder(new LineBorder(new Color(140, 140, 140)), "Empresa", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setBackground(SystemColor.menu);
        setBounds(322, 126, 931, 600);
        setLayout(null);
        
        JLabel lblUsuario = new JLabel("Tel\u00E9fono");
        lblUsuario.setBounds(625, 49, 80, 14);
        add(lblUsuario);
        
        JLabel lblPrimerNombre = new JLabel(" Nombre");
        lblPrimerNombre.setBounds(105, 49, 86, 14);
        add(lblPrimerNombre);
        
        JLabel lblSegundoNombre = new JLabel("Subtitulo");
        lblSegundoNombre.setBounds(367, 49, 92, 14);
        add(lblSegundoNombre);
        
        JLabel lblUsuario_1 = new JLabel("Direcci\u00F3n");
        lblUsuario_1.setBounds(367, 121, 52, 14);
        add(lblUsuario_1);
        
        JLabel lblContrasea = new JLabel("Fax");
        lblContrasea.setBounds(105, 121, 52, 14);
        add(lblContrasea);
        
        textField = new JTextField();
        textField.setBounds(105, 70, 192, 20);
        add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setBounds(367, 70, 192, 20);
        textField_1.setColumns(10);
        add(textField_1);
        
        textField_4 = new JTextField();
        textField_4.setBounds(105, 147, 192, 20);
        textField_4.setColumns(10);
        add(textField_4);
        
        JButton btnAgregar = new JButton("Nuevo");
        btnAgregar.setBounds(105, 557, 126, 32);
        add(btnAgregar);
        
        JButton btnEditar = new JButton("Editar");
        btnEditar.setBounds(263, 557, 126, 32);
        add(btnEditar);
        
        textField_2 = new JTextField();
        textField_2.setBounds(625, 70, 192, 20);
        textField_2.setColumns(10);
        add(textField_2);
        
        JTextArea textArea = new JTextArea();
        textArea.setBounds(347, 149, 192, 43);
        textArea.setLineWrap(true);
        
        
        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(367, 148, 192, 47);
        scrollPane_1.setViewportView(textArea);
        add(scrollPane_1);
        
       
        JLabel lblWeb = new JLabel("Web");
        lblWeb.setBounds(105, 207, 52, 14);
        add(lblWeb);
        
        txtWeb = new JTextField();
        txtWeb.setBounds(105, 230, 192, 20);
        txtWeb.setColumns(10);
        add(txtWeb);
        
        JLabel lblEmail = new JLabel("Email");
        lblEmail.setBounds(625, 121, 52, 14);
        add(lblEmail);
        
        textField_3 = new JTextField();
        textField_3.setBounds(625, 147, 192, 20);
        textField_3.setColumns(10);
        add(textField_3);
        
        JLabel lblPas = new JLabel("Pa\u00EDs");
        lblPas.setBounds(367, 207, 52, 14);
        add(lblPas);
        
        JLabel lblProvincia = new JLabel("Provincia");
        lblProvincia.setBounds(625, 207, 52, 14);
        add(lblProvincia);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(367, 229, 192, 22);
        add(comboBox);
        
        JComboBox comboBox_1 = new JComboBox();
        comboBox_1.setBounds(625, 229, 192, 22);
        add(comboBox_1);
        
 
	
        
	}
}
