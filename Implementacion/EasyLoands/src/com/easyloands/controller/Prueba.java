package com.easyloands.controller;

import javax.swing.UIManager;

import com.easyloands.view.Login;
import com.easyloands.view.Principal;

public class Prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// si ponemos aqui el la configurarion del LookAndFeel no es necesario ponerlo en cada una de las ventanas XD!!
		 try {
	           
	            UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
	        }
		 
	        catch (Exception ex) {
	            ex.printStackTrace();
	        }
		// new Login().setVisible(true);
		new Principal().setVisible(true);
		

	}
	


}
