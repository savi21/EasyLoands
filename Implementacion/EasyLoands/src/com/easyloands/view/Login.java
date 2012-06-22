package com.easyloands.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Login extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JTextField txtUsuario;
	private JPasswordField txtClave;
	private JButton btnAceptar;
	private JButton btnCerrar;
	
	public Login() {
		setResizable(false);
		init();
	}

	private void init(){
			 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("EasyLoands - Login");
		setSize(560,283);
		setLocationRelativeTo(null);		
		getContentPane().setBackground(Color.WHITE);
		
		getContentPane().setLayout(null);
		
		JLabel lblImagen = new JLabel();
		lblImagen.setIcon(new ImageIcon(Login.class.getResource("/com/easyloands/imagenes/Logo.png")));
		
		lblImagen.setBounds(174, 12, 243, 136);
		getContentPane().add(lblImagen);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(25, 163, 49, 16);
		getContentPane().add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(84, 161, 181, 20);
		getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtClave = new JPasswordField();
		txtClave.setColumns(10);
		txtClave.setBounds(350, 159, 181, 20);
		getContentPane().add(txtClave);
		
		JLabel lblClave = new JLabel("Clave");
		lblClave.setBounds(302, 163, 41, 16);
		getContentPane().add(lblClave);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(121, 208, 150, 25);
		getContentPane().add(btnAceptar);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnCerrar.setBounds(291, 208, 150, 25);
		getContentPane().add(btnCerrar);
		setVisible(true);
	}
	
}
