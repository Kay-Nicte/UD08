package Ejercicio3;

public class Electrodomestico extends MainApp{

	private double precioBase;
	private String color;
	private String consumoEnergetico;
	private double peso;
	
	//Constructor por defecto
	public Electrodomestico() {
		super();
		this.precioBase = 100.0;
		this.color = "Blanco";
		this.consumoEnergetico = "F";
		this.peso = 5.0;
	}
	
	//Constructor con el precio y el peso (el resto por defecto)
	public Electrodomestico(double precioBase, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}
	
	//Constructor con todos los atributos
	public Electrodomestico(double precioBase, String color, String consumoEnergetico, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}
	

}
