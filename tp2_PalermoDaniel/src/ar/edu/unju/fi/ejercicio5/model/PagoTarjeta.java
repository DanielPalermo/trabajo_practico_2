package ar.edu.unju.fi.ejercicio5.model;

import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio5.interfaces.IPago;

public class PagoTarjeta implements IPago{

	String nroTarjeta;
	LocalDate fechapago;
	double montoPagado;
	
	@Override
	public void imprimirRecibo() {
		System.out.println("Numero de tarjeta: " + this.nroTarjeta);
		System.out.println("Fecha de pago: " + this.fechapago);
		System.out.println("Monto pagado: " + this.montoPagado);
		}
	
	@Override
	public void realizarPago(double monto) {
		this.montoPagado = (this.montoPagado + (this.montoPagado*15/100));
	}
	
	public PagoTarjeta() {
		// TODO Auto-generated constructor stub
	}

	public PagoTarjeta(String nroTarjeta, LocalDate fechapago, double montoPagado) {
		this.nroTarjeta = nroTarjeta;
		this.fechapago = fechapago;
		this.montoPagado = montoPagado;
	}

	public String getNroTarjeta() {
		return nroTarjeta;
	}

	public void setNroTarjeta(String nroTarjeta) {
		this.nroTarjeta = nroTarjeta;
	}

	public LocalDate getFechapago() {
		return fechapago;
	}

	public void setFechapago(LocalDate fechapago) {
		this.fechapago = fechapago;
	}

	public double getMontoPagado() {
		return montoPagado;
	}

	public void setMontoPagado(double montoPagado) {
		this.montoPagado = montoPagado;
	}
}
