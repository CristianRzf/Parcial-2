package Ejercicios;

public class Persona {
	    private String nombre;
	    private int edad;
	    private String DNI;
	    private char sexo;
	    private double peso;
	    private double altura;
	    
	    
	    public Persona() {
	    }
	    
	    public Persona(String nombre, int edad, char sexo) {
	        this(nombre, edad, sexo, 0, 0);
	    }
	    
	    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.sexo = sexo;
	        this.peso = peso;
	        this.altura = altura;
	    }
	    
	    

}
