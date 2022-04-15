package Ejercicio2;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		
		//Instanciar la clase Password
		Password pass = new Password();
		
		//Coger el atributo longitud de la clase Password
		int length = pass.length;

		//Invocar al método para generar una conraseña y mostrarla al usuario
		JOptionPane.showMessageDialog(null, "Contraseña generada automáticamente: "+pass.randomPassGenerator(length));

	}

}
