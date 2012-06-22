package com.easyloands.view;

import javax.swing.JFrame;
import javax.swing.UIManager;
import com.l2fprod.common.swing.JTaskPane;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import com.l2fprod.common.swing.JTaskPaneGroup;
import java.awt.SystemColor;
import java.awt.Cursor;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Frame;
import javax.swing.JToolBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	JPanel panelControl;
	JLabel lblMensaje = new JLabel("");
	public Principal() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		getContentPane().setBackground(Color.WHITE);
		
		init();
		
	}

	
	public void init(){
		
		 try {
	           
	            UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
	        }
	        catch (Exception ex) {
	            ex.printStackTrace();
	        }
		 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("EasyLoands - Login");
		getContentPane().setLayout(null);
		setSize(1275, 759);
		
		getContentPane().add(new PanelClientes());
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/com/easyloands/imagenes/Logo peq.png")));
		lblNewLabel.setBounds(20, 11, 154, 85);
		getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 108, 1233, 9);
		getContentPane().add(separator);
		
		JScrollPane sc = new JScrollPane();
		getContentPane().add(sc);
		
		
		
		PanelUsuarios panel_Usuarios = new PanelUsuarios();
		panel_Usuarios.setBounds(290, 120, 930, 600);
		//getContentPane().add(panel_Usuarios);
		
		JLabel lblAyuda = new JLabel("Ayuda");
		lblAyuda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblAyuda.setForeground(SystemColor.activeCaptionText);
		lblAyuda.setFont(new Font("Arial", Font.BOLD, 18));
		lblAyuda.setIcon(new ImageIcon(Principal.class.getResource("/com/easyloands/imagenes/Apps-help-browser-icon.png")));
		lblAyuda.setBounds(930, 35, 108, 48);
		getContentPane().add(lblAyuda);
		
		JLabel lblCerrasSesim =new JLabel("Cerrar sesi\u00F3n");
		lblCerrasSesim.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblCerrasSesim.setIcon(new ImageIcon(Principal.class.getResource("/com/easyloands/imagenes/Log-Out-icon.png")));
		lblCerrasSesim.setForeground(SystemColor.activeCaptionText);
		lblCerrasSesim.setFont(new Font("Arial", Font.BOLD, 18));
		lblCerrasSesim.setBounds(1083, 35, 170, 48);
		getContentPane().add(lblCerrasSesim);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(1061, 35, 4, 48);
		getContentPane().add(separator_1);
		
				JTaskPane taskPane = new JTaskPane();
				taskPane.setBounds(20, 118, 253, 603);
				getContentPane().add(taskPane);
				taskPane.setAutoscrolls(true);
				taskPane.setBackground(SystemColor.menu);
				
				JTaskPaneGroup Config = new JTaskPaneGroup();
				Config.setTitle("Configuraci\u00F3n y par\u00E1metros");
				Config.setBounds(30, 138, 267, 85);
				taskPane.add(Config);
				
				JTaskPaneGroup Clients = new JTaskPaneGroup();
				Clients.setTitle("Clientes");
				Config.setBounds(30, 138, 267, 85);
				taskPane.add(Clients);
				
				JLabel lblListadoDeClientes = new JLabel("Listado de clientes");
				lblListadoDeClientes.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						panelControl = new PanelClientes();
						panelControl.setVisible(false);
						lblMensaje.setText("Lista Clientes");
						panelControl.setBounds(321, 150, 932, 593);
						panelControl.setVisible(true);
						getContentPane().add(panelControl);
					}
				});
				lblListadoDeClientes.setIcon(new ImageIcon(Principal.class.getResource("/com/easyloands/imagenes/Apps-preferences-contact-list-icon.png")));
				lblListadoDeClientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				Clients.getContentPane().add(lblListadoDeClientes);
				
				JLabel lblAgregarClientes = new JLabel("Agregar clientes");
				lblAgregarClientes.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						new PanelNuevoCliente();
					}
				});
				lblAgregarClientes.setIcon(new ImageIcon(Principal.class.getResource("/com/easyloands/imagenes/Actions-list-add-user-icon.png")));
				lblAgregarClientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				Clients.getContentPane().add(lblAgregarClientes);
				
				JLabel Usr = new JLabel("Usuarios");
				Usr.setIcon(new ImageIcon(Principal.class.getResource("/com/easyloands/imagenes/users.png")));
				Config.getContentPane().add(Usr);
				
				JLabel Cbr = new JLabel("Cobradores");
				Cbr.setIcon(new ImageIcon(Principal.class.getResource("/com/easyloands/imagenes/personal-loan-icon.png")));
				Config.getContentPane().add(Cbr);
				
				JTaskPaneGroup Loands = new JTaskPaneGroup();
				Loands.setTitle("Pr\u00E9stamos");
				Config.setBounds(30, 138, 267, 85);
				
				JLabel lblUsuarios = new JLabel("Datos de la empresa");
				lblUsuarios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				lblUsuarios.setIcon(new ImageIcon(Principal.class.getResource("/com/easyloands/imagenes/App-home-2-icon.png")));
				Config.getContentPane().add(lblUsuarios);
				
				JLabel lblNewLabel_1 = new JLabel("Inter\u00E9s por mora");
				lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				lblNewLabel_1.setIcon(new ImageIcon(Principal.class.getResource("/com/easyloands/imagenes/money-icon.png")));
				Config.getContentPane().add(lblNewLabel_1);
				
				taskPane.add(Loands);
				
				JTaskPaneGroup Charges = new JTaskPaneGroup();
				Charges.setTitle("Cobros");
				Config.setTitle("Configuraci\u00F3n y par\u00E1metros");
				Config.setBounds(30, 138, 267, 85);
				taskPane.add(Charges);
				
				JLabel lblAplicarPago = new JLabel("Aplicar Pago");
				lblAplicarPago.setIcon(new ImageIcon(Principal.class.getResource("/com/easyloands/imagenes/checklist-icon.png")));
				lblAplicarPago.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				Charges.getContentPane().add(lblAplicarPago);
				
				JTaskPaneGroup Reports = new JTaskPaneGroup();
				Reports.setTitle("Reportes");
				Config.setTitle("Configuraci\u00F3n y par\u00E1metros");
				Config.setBounds(30, 138, 267, 85);
				taskPane.add(Reports);
				
				JLabel lblIngresos= new JLabel("Balance de Ingresos");
				lblIngresos.setIcon(new ImageIcon(Principal.class.getResource("/com/easyloands/imagenes/sales-report-icon.png")));
				lblIngresos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				Reports.getContentPane().add(lblIngresos);
				
				JLabel lblAgregarPrestamo = new JLabel("Agregar pr\u00E9stamos");
				lblAgregarPrestamo.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
						new PanelNuevoPrestamo().setVisible(true);
					}
				});
				lblAgregarPrestamo.setIcon(new ImageIcon(Principal.class.getResource("/com/easyloands/imagenes/coins-add-icon.png")));
				lblAgregarPrestamo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				Loands.getContentPane().add(lblAgregarPrestamo);
				lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 20));
				
				
				lblMensaje.setBounds(321, 116, 193, 25);
				getContentPane().add(lblMensaje);
				

	}
}
