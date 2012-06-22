package com.easyloands.model;

import java.io.FileInputStream;
import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

public class XML {

	private Document doc;
	private List<Element> etiqueta; 
	private String direccion;
	private String usuario;
	private String password; 
	private String driver;
	
	public XML(){	
		init();	
	}
	
	private void init(){
		SAXBuilder builder  = new SAXBuilder();
		
		try {
			doc = builder.build(new FileInputStream("files/config.xml"));
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
		etiqueta = doc.getRootElement().getChildren();
		
		direccion = etiqueta.get(0).getChildText("url");
		usuario = etiqueta.get(0).getChildText("user");
		password = etiqueta.get(0).getChildText("password");
		driver = etiqueta.get(0).getChildText("driver");
	}
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}
}