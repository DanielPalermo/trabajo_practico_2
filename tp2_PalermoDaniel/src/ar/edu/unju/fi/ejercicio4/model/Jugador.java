package ar.edu.unju.fi.ejercicio4.model;

import java.time.LocalDate;
import java.time.Period;

import ar.edu.unju.fi.ejercicio4.constantes.Posicion;

public class Jugador {
	String nombre;
	String apellido;
	LocalDate fechaNacimiento;
	String nacionalidad;
	double estatura;
	double peso;
	Posicion posicion;
	
	public Jugador() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento
				+ ", nacionalidad=" + nacionalidad + ", estatura=" + estatura + ", peso=" + peso + ", posicion="
				+ posicion + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	
	public int calcularEdad() {
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(fechaNacimiento, hoy);
		return periodo.getYears();
	}

}