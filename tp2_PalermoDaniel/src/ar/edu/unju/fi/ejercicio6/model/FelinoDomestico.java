package ar.edu.unju.fi.ejercicio6.model;

public class FelinoDomestico {
	String nombre;
	byte Edad;
	float Peso;
	
	public FelinoDomestico() {
		// TODO Auto-generated constructor stub
	}

	public FelinoDomestico(String nombre, byte edad, float peso) {
		this.nombre = nombre;
		Edad = edad;
		Peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte getEdad() {
		return Edad;
	}

	public void setEdad(byte edad) {
		Edad = edad;
	}

	public float getPeso() {
		return Peso;
	}

	public void setPeso(float peso) {
		Peso = peso;
	}

	@Override
	public String toString() {
		return "FelinoDomestico [nombre=" + nombre + ", Edad=" + Edad + ", Peso=" + Peso + "]";
	}
	
	
	
}
