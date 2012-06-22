package com.easyloands.model;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Conexion {
	
	private static Connection con;
	private Conexion conexion;
	private XML datos;
	
	private Conexion(){
		this.datos = new XML();
		try{
		Class.forName(datos.getDriver());
		 con = DriverManager.getConnection(datos.getDireccion(),datos.getUsuario(),
				 						   datos.getPassword());
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e.getMessage(),"Conexion.Conexion",
										  JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public static Connection getConexion(){
		
		if(con == null){
			new Conexion();
		}
		return con;	
	}
}
