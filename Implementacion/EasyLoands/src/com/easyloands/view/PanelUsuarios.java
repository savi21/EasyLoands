package com.easyloands.view;


import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;

public class PanelUsuarios extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	
	public PanelUsuarios() {
		
		setBorder(new TitledBorder(null, "Usuarios", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setBackground(SystemColor.menu);
        setBounds(322, 126, 931, 600);
        setLayout(null);
        
        JLabel lblUsuario = new JLabel("Perfil");
        lblUsuario.setBounds(605, 49, 46, 14);
        add(lblUsuario);
        
        JLabel lblPrimerNombre = new JLabel(" Nombre");
        lblPrimerNombre.setBounds(85, 49, 86, 14);
        add(lblPrimerNombre);
        
        JLabel lblSegundoNombre = new JLabel("Apellido");
        lblSegundoNombre.setBounds(347, 49, 92, 14);
        add(lblSegundoNombre);
        
        JLabel lblUsuario_1 = new JLabel("Usuario");
        lblUsuario_1.setBounds(212, 120, 46, 14);
        add(lblUsuario_1);
        
        JLabel lblContrasea = new JLabel("Contrase\u00F1a");
        lblContrasea.setBounds(490, 120, 68, 14);
        add(lblContrasea);
        
        textField = new JTextField();
        textField.setBounds(140, 46, 192, 20);
        add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(398, 46, 192, 20);
        add(textField_1);
        
        textField_3 = new JTextField();
        textField_3.setBounds(265, 117, 192, 20);
        add(textField_3);
        textField_3.setColumns(10);
        
        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(565, 117, 192, 20);
        add(textField_4);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Administrador", "Gerente"}));
        comboBox.setBounds(646, 46, 206, 20);
        add(comboBox);
        
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
        		"Nombre", "Apellido", "Perfil", "Usuario", "Contraseña"
        	}
        ));
        scrollPane.setViewportView(table);
        
 
	
        
	}
}
