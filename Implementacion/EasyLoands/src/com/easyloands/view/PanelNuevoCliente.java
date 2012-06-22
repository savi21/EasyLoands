package com.easyloands.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;

import org.eclipse.wb.swing.FocusTraversalOnArray;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelNuevoCliente extends JDialog {
	
	private JTextField txtPrimerNombre;
	private JTextField txtPrimerApellido;
	private JTextField txtSegundoNombre;
	private JTextField txtSegundoApellido;
	private JTextField txtFechaNacimiento;
	private JTextField txtDomicilio;
	private JTextField txtTelefonoCasa;
	private JTextField txtCelular;
	private JTextField txtLimiteCredito;
	private JTextField txtNoCliente;
	private JTextField txtNombreGarante;
	private JTextField txtTelefonoGarante;
	private JTextField txtApellidoGarante;
	private JTextField txtDomicilioGarante;
	private JTextField txtProfesionGarante;
	private JTextField txtSueldoGarante;
	private JTextField txtProfesion;
	private JTextField txtEmpleador;
	private JTextField txtTelefonoEmpleador;
	private JTextField txtDomicilioEmpleador;
	private JTextField txtSueldo;
	private JTextField txtTiempoLaborado;
	private JTextField tipo;
	
	
	public PanelNuevoCliente() {
		setTitle("Nuevo Cliente");
		init();
	}
	private void init(){
		getContentPane().setLayout(null);
		 setVisible(true);
		 setSize(900,620);
		 
		 JPanel panelDatosPersonales = new JPanel();
		 panelDatosPersonales.setBorder(new TitledBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(64, 64, 64)), "Datos Personales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		 panelDatosPersonales.setBounds(21, 62, 759, 254);
		 getContentPane().add(panelDatosPersonales);
		 panelDatosPersonales.setLayout(null);
		 
		 JLabel lblNoCliente = new JLabel("No Cliente");
		 lblNoCliente.setBounds(34, 26, 64, 14);
		 panelDatosPersonales.add(lblNoCliente);
		 
		 JLabel lblPrimerNombre = new JLabel("Primer Nombre");
		 lblPrimerNombre.setBounds(34, 58, 100, 20);
		 panelDatosPersonales.add(lblPrimerNombre);
		 
		 JLabel lblFechaNacimiento = new JLabel("Fecha de Nacimiento");
		 lblFechaNacimiento.setBounds(34, 120, 145, 20);
		 panelDatosPersonales.add(lblFechaNacimiento);
		 
		 JLabel lblCelular = new JLabel("Domicilio");
		 lblCelular.setBounds(34, 151, 100, 20);
		 panelDatosPersonales.add(lblCelular);
		 
		 JLabel lblTelefonoCasa = new JLabel("Telefono Casa");
		 lblTelefonoCasa.setBounds(34, 186, 100, 20);
		 panelDatosPersonales.add(lblTelefonoCasa);
		 
		 JLabel lblLimiteDeCredito = new JLabel("Limite de Credito");
		 lblLimiteDeCredito.setBounds(34, 222, 100, 20);
		 panelDatosPersonales.add(lblLimiteDeCredito);
		 
		 txtPrimerApellido = new JTextField();
		 txtPrimerApellido.setBounds(189, 89, 175, 20);
		 panelDatosPersonales.add(txtPrimerApellido);
		 txtPrimerApellido.setColumns(10);
		 
		 txtFechaNacimiento = new JTextField();
		 // 155, 117, 114, 20
		 txtFechaNacimiento.setBounds(189, 117, 114, 20);
		 panelDatosPersonales.add(txtFechaNacimiento);
		 txtFechaNacimiento.setColumns(10);
		 
		 txtDomicilio = new JTextField();
		 txtDomicilio.setBounds(189, 148, 175, 20);
		 panelDatosPersonales.add(txtDomicilio);
		 txtDomicilio.setColumns(10);
		 
		 txtTelefonoCasa = new JTextField();
		 txtTelefonoCasa.setBounds(189, 186, 175, 20);
		 panelDatosPersonales.add(txtTelefonoCasa);
		 txtTelefonoCasa.setColumns(10);
		 
		 txtLimiteCredito = new JTextField();
		 txtLimiteCredito.setBounds(189, 217, 175, 20);
		 panelDatosPersonales.add(txtLimiteCredito);
		 txtLimiteCredito.setColumns(10);
		 
		 txtPrimerNombre = new JTextField();
		 txtPrimerNombre.setBounds(189, 58, 175, 20);
		 panelDatosPersonales.add(txtPrimerNombre);
		 txtPrimerNombre.setColumns(10);
		 
		 txtNoCliente = new JTextField();
		 txtNoCliente.setText("006");
		 txtNoCliente.setBounds(189, 20, 86, 20);
		 panelDatosPersonales.add(txtNoCliente);
		 txtNoCliente.setColumns(10);
		 
		 JLabel lblEstadoCivil = new JLabel("Estado Civil");
		 lblEstadoCivil.setBounds(390, 219, 100, 20);
		 panelDatosPersonales.add(lblEstadoCivil);
		 
		 JComboBox cbxEstadoCivil = new JComboBox();
		 cbxEstadoCivil.setBounds(535, 219, 141, 20);
		 panelDatosPersonales.add(cbxEstadoCivil);
		 cbxEstadoCivil.setEditable(true);
		 cbxEstadoCivil.setModel(new DefaultComboBoxModel(new String[] {"Casado (a)", "Divorciado (a)", "Soltero (a)"}));
		 
		 txtCelular = new JTextField();
		 txtCelular.setBounds(535, 184, 175, 20);
		 panelDatosPersonales.add(txtCelular);
		 txtCelular.setColumns(10);
		 
		 JLabel lblCelular_1 = new JLabel("Celular");
		 lblCelular_1.setBounds(390, 184, 100, 20);
		 panelDatosPersonales.add(lblCelular_1);
		 
		 JLabel lblCiudad = new JLabel("Ciudad");
		 lblCiudad.setBounds(390, 149, 100, 20);
		 panelDatosPersonales.add(lblCiudad);
		 
		 JComboBox cbxCiudad = new JComboBox();
		 cbxCiudad.setModel(new DefaultComboBoxModel(new String[] {"Santo Domingo"}));
		 cbxCiudad.setBounds(535, 148, 175, 20);
		 panelDatosPersonales.add(cbxCiudad);
		 
		 JComboBox cbxPais = new JComboBox();
		 cbxPais.setModel(new DefaultComboBoxModel(new String[] {"Republica Dominicana"}));
		 cbxPais.setBounds(535, 117, 175, 20);
		 panelDatosPersonales.add(cbxPais);
		 
		 JLabel lblPais = new JLabel("Pais");
		 lblPais.setBounds(390, 114, 100, 20);
		 panelDatosPersonales.add(lblPais);
		 
		 JLabel lblSegundoApellido = new JLabel("Segundo Apellido");
		 lblSegundoApellido.setBounds(390, 89, 100, 20);
		 panelDatosPersonales.add(lblSegundoApellido);
		 
		 txtSegundoApellido = new JTextField();
		 txtSegundoApellido.setBounds(535, 89, 175, 20);
		 panelDatosPersonales.add(txtSegundoApellido);
		 txtSegundoApellido.setColumns(10);
		 
		 txtSegundoNombre = new JTextField();
		 txtSegundoNombre.setBounds(535, 58, 175, 20);
		 panelDatosPersonales.add(txtSegundoNombre);
		 txtSegundoNombre.setColumns(10);
		 
		 JLabel lblPrimerApellido = new JLabel("Primer Apellido");
		 lblPrimerApellido.setBounds(34, 89, 100, 20);
		 panelDatosPersonales.add(lblPrimerApellido);
		 
		 JLabel lblFecha = new JLabel("Fecha");
		 lblFecha.setBounds(390, 26, 46, 14);
		 panelDatosPersonales.add(lblFecha);
		 
		 JComboBox cbxFecha = new JComboBox();
		 cbxFecha.setModel(new DefaultComboBoxModel(new String[] {"01/05/2012"}));
		 cbxFecha.setBounds(535, 18, 141, 22);
		 panelDatosPersonales.add(cbxFecha);
		 
		 JLabel lblSegundoNombre = new JLabel("Segundo Nombre");
		 lblSegundoNombre.setBounds(390, 58, 100, 20);
		 panelDatosPersonales.add(lblSegundoNombre);
		 
		 JLabel lblDatosDelCliente = new JLabel("Datos del Cliente");
		 lblDatosDelCliente.setFont(new Font("Times New Roman", Font.BOLD, 16));
		 lblDatosDelCliente.setBounds(343, 25, 116, 19);
		 getContentPane().add(lblDatosDelCliente);
		 JPanel panelOtrosDatos = new JPanel();
		 panelOtrosDatos.setBorder(new TitledBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(64, 64, 64)), "Otros Datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		 panelOtrosDatos.setBounds(21, 327, 759, 221);
		 getContentPane().add(panelOtrosDatos);
		 panelOtrosDatos.setLayout(null);
		 
		 JPanel panelFoto = new JPanel();
		 panelFoto.setBorder(new TitledBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(64, 64, 64)), "Fotografia", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		 panelFoto.setBounds(25, 28, 182, 163);
		 panelOtrosDatos.add(panelFoto);
		 panelFoto.setLayout(null);
		 
		 JLabel lblFoto = new JLabel("");
		 lblFoto.setIcon(new ImageIcon(PanelNuevoCliente.class.getResource("/com/easyloands/imagenes/cliente.png")));
		 lblFoto.setBounds(16, 16, 150, 130);
		 panelFoto.add(lblFoto);
		 
		 JTabbedPane tbpOtrosDatos = new JTabbedPane(JTabbedPane.TOP);
		 tbpOtrosDatos.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		 tbpOtrosDatos.setBounds(217, 36, 532, 174);
		 panelOtrosDatos.add(tbpOtrosDatos);
		 
		 JPanel panelGarante = new JPanel();
		 tbpOtrosDatos.addTab("Garante", null, panelGarante, null);
		 panelGarante.setLayout(null);
		 
		 JLabel lblNombreGarante = new JLabel("Nombre");
		 lblNombreGarante.setBounds(10, 17, 46, 20);
		 panelGarante.add(lblNombreGarante);
		 
		 txtNombreGarante = new JTextField();
		 txtNombreGarante.setBounds(108, 17, 122, 20);
		 panelGarante.add(txtNombreGarante);
		 txtNombreGarante.setColumns(10);
		 
		 JLabel lblTelefonoGarante = new JLabel("Telefono");
		 lblTelefonoGarante.setBounds(10, 54, 72, 20);
		 panelGarante.add(lblTelefonoGarante);
		 
		 JLabel lblApellidoGarante = new JLabel("Apellido");
		 lblApellidoGarante.setBounds(281, 17, 46, 20);
		 panelGarante.add(lblApellidoGarante);
		 
		 txtTelefonoGarante = new JTextField();
		 txtTelefonoGarante.setBounds(108, 54, 123, 20);
		 panelGarante.add(txtTelefonoGarante);
		 txtTelefonoGarante.setColumns(10);
		 
		 txtApellidoGarante = new JTextField();
		 txtApellidoGarante.setText("");
		 txtApellidoGarante.setBounds(363, 17, 122, 20);
		 panelGarante.add(txtApellidoGarante);
		 txtApellidoGarante.setColumns(10);
		 
		 txtDomicilioGarante = new JTextField();
		 txtDomicilioGarante.setBounds(363, 54, 122, 20);
		 panelGarante.add(txtDomicilioGarante);
		 txtDomicilioGarante.setColumns(10);
		 
		 JLabel lblDomicilioGarante = new JLabel("Domicilio");
		 lblDomicilioGarante.setBounds(281, 54, 72, 20);
		 panelGarante.add(lblDomicilioGarante);
		 
		 JLabel lblProfesion = new JLabel("Profesion");
		 lblProfesion.setBounds(10, 91, 72, 20);
		 panelGarante.add(lblProfesion);
		 
		 txtProfesionGarante = new JTextField();
		 txtProfesionGarante.setBounds(108, 91, 124, 20);
		 panelGarante.add(txtProfesionGarante);
		 txtProfesionGarante.setColumns(10);
		 
		 JLabel lblSueldo = new JLabel("Sueldo");
		 lblSueldo.setBounds(281, 91, 46, 20);
		 panelGarante.add(lblSueldo);
		 
		 txtSueldoGarante = new JTextField();
		 txtSueldoGarante.setBounds(363, 85, 122, 20);
		 panelGarante.add(txtSueldoGarante);
		 txtSueldoGarante.setColumns(10);
		 panelGarante.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNombreGarante, txtNombreGarante, lblTelefonoGarante, lblApellidoGarante, txtTelefonoGarante, txtApellidoGarante, txtDomicilioGarante, lblDomicilioGarante, lblProfesion, txtProfesionGarante, lblSueldo, txtSueldoGarante}));
		 
		 JPanel panelLaboral = new JPanel();
		 tbpOtrosDatos.addTab("Laboral", null, panelLaboral, null);
		 panelLaboral.setLayout(null);
		 
		 JLabel lblProfesion_1 = new JLabel("Profesion");
		 lblProfesion_1.setBounds(10, 13, 86, 20);
		 panelLaboral.add(lblProfesion_1);
		 
		 JLabel lblNewLabel = new JLabel("Empleador");
		 lblNewLabel.setBounds(10, 46, 62, 20);
		 panelLaboral.add(lblNewLabel);
		 
		 JLabel lblTelefono = new JLabel("Telefono");
		 lblTelefono.setBounds(10, 79, 86, 20);
		 panelLaboral.add(lblTelefono);
		 
		 JLabel lblDomicilio = new JLabel("Domicilio");
		 lblDomicilio.setBounds(10, 112, 86, 20);
		 panelLaboral.add(lblDomicilio);
		 
		 txtProfesion = new JTextField();
		 txtProfesion.setBounds(106, 13, 130, 20);
		 panelLaboral.add(txtProfesion);
		 txtProfesion.setColumns(10);
		 
		 txtEmpleador = new JTextField();
		 txtEmpleador.setBounds(106, 46, 130, 20);
		 panelLaboral.add(txtEmpleador);
		 txtEmpleador.setColumns(10);
		 
		 txtTelefonoEmpleador = new JTextField();
		 txtTelefonoEmpleador.setBounds(106, 79, 130, 20);
		 panelLaboral.add(txtTelefonoEmpleador);
		 txtTelefonoEmpleador.setColumns(10);
		 
		 txtDomicilioEmpleador = new JTextField();
		 txtDomicilioEmpleador.setBounds(106, 112, 130, 20);
		 panelLaboral.add(txtDomicilioEmpleador);
		 txtDomicilioEmpleador.setColumns(10);
		 
		 JLabel lblSueldo_1 = new JLabel("Sueldo");
		 lblSueldo_1.setBounds(259, 16, 46, 14);
		 panelLaboral.add(lblSueldo_1);
		 
		 JLabel lblAsd = new JLabel("Tiempo Laborado");
		 lblAsd.setBounds(259, 49, 115, 14);
		 panelLaboral.add(lblAsd);
		 
		 txtSueldo = new JTextField();
		 txtSueldo.setBounds(391, 13, 127, 20);
		 panelLaboral.add(txtSueldo);
		 txtSueldo.setColumns(10);
		 
		 txtTiempoLaborado = new JTextField();
		 txtTiempoLaborado.setBounds(391, 46, 127, 20);
		 panelLaboral.add(txtTiempoLaborado);
		 txtTiempoLaborado.setColumns(10);
		 
		 JPanel panelPropiedad = new JPanel();
		 tbpOtrosDatos.addTab("Propiedad", null, panelPropiedad, null);
		 panelPropiedad.setLayout(null);
		 
		 JLabel lblTipo = new JLabel("Tipo");
		 lblTipo.setBounds(10, 11, 49, 14);
		 panelPropiedad.add(lblTipo);
		 
		 tipo = new JTextField();
		 tipo.setBounds(87, 8, 115, 20);
		 panelPropiedad.add(tipo);
		 tipo.setColumns(10);
		 
		 JLabel lblDescripcion = new JLabel("Descripcion");
		 lblDescripcion.setBounds(10, 46, 67, 14);
		 panelPropiedad.add(lblDescripcion);
		 
		 JScrollPane scrollPane_1 = new JScrollPane();
		 scrollPane_1.setBounds(87, 52, 301, 84);
		 panelPropiedad.add(scrollPane_1);
		 
		 JTextArea txaDescripcion = new JTextArea();
		 txaDescripcion.setLineWrap(true);
		 scrollPane_1.setViewportView(txaDescripcion);
		 
		 JPanel panelObservaciones = new JPanel();
		 tbpOtrosDatos.addTab("Observaciones", null, panelObservaciones, null);
		 panelObservaciones.setLayout(null);
		 
		 JLabel lblObservaciones = new JLabel("Observaciones");
		 lblObservaciones.setBounds(20, 11, 85, 22);
		 panelObservaciones.add(lblObservaciones);
		 
		 JScrollPane scrollPane = new JScrollPane();
		 scrollPane.setBounds(30, 33, 452, 103);
		 panelObservaciones.add(scrollPane);
		 
		 JTextArea txaObservaciones = new JTextArea();
		 txaObservaciones.setLineWrap(true);
		 scrollPane.setViewportView(txaObservaciones);
		 
		 JButton btnAgregar = new JButton("Agregar");
		 btnAgregar.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 	}
		 });
		 btnAgregar.setBounds(343, 559, 143, 23);
		 getContentPane().add(btnAgregar);
		
	}
}
//2,3,4,9,10