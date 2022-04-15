package Ejercicio2;

import javax.swing.JOptionPane;

public class Password extends MainApp {

	private int longitud;
	private String contrasenya;
	
	//Constructor por defecto
	public Password() {
		this.longitud = 8;
		this.contrasenya="";
	}

	//Constructor con la longitud que le pasemos
	public Password(int longitud, String contrasenya) {
		super();
		this.longitud = length;
		this.contrasenya = contrasenya;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contrasenya=" + contrasenya + ", askLength=" + askLength
				+ ", length=" + length + "]";
	}

	//Pedir la longitud de la contraseña al usuario
	String askLength = JOptionPane.showInputDialog("Introduce la longitud de la contraseña:");
	int length = Integer.parseInt(askLength);
		
	public String randomPassGenerator(int length) {
		
		String caracteres;
		StringBuilder builder;
		        
		caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; 

		builder = new StringBuilder(length); 

		for (int m = 0; m < length; m++) { 

		int myindex = (int)(caracteres.length() * Math.random()); 

		builder.append(caracteres.charAt(myindex)); 
		} 
		
	return builder.toString(); 
	} 
	
	public void showPass() {
		
	System.out.println("A random string: " + randomPassGenerator(length)); 	

	}
}


	
	
	

