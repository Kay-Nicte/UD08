package Ejercicio2;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		
		//Instanciar la clase Password
		Password pass = new Password();
		
		//Coger el atributo longitud de la clase Password
		int length = pass.length;

		//Invocar al m�todo para generar una conrase�a y mostrarla al usuario
		JOptionPane.showMessageDialog(null, "Contrase�a generada autom�ticamente: "+pass.randomPassGenerator(length));

	}

}
