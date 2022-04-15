package Ejercicio1;

public class Persona extends MainApp{

	private String nombre;
	private int edad;
	private String dni;
	private String SEXO="H";
	private double peso;
	private double altura;
	
	//Constructor por defecto
	public Persona() {
		super();
		this.nombre = "";
		this.edad = 0;
		this.dni = "";
		this.peso = 0.0;
		this.altura = 0.0;
	}
	
	//Constructor con Nombre, Edad y Sexo, el resto por defecto
	
	public Persona(String nombre, int edad, String SEXO) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = "";
		this.SEXO = SEXO;
		this.peso = 0.0;
		this.altura = 0.0;
	}

	
	//Constructor con todos los atributos
	
	public Persona(String nombre, int edad, String dni, String SEXO, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		SEXO = SEXO;
		this.peso = peso;
		this.altura = altura;
	}
	
}
