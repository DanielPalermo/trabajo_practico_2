package ar.edu.unju.fi.ejercicio3.constantes;

public enum Provincia {
	JUJUY(718971, 53.219), SALTA(1441351, 155.488), TUCUMAN(1703186, 22.525), CATAMARCA(429562, 102.602), LA_RIOJA(362605, 89.680), SANTIAGO_DEL_ESTERO(1060906, 136.351);
	private int poblacion;
	private double superficie;
	
	private Provincia(int poblacion, double superficie) {
		this.poblacion = poblacion;
		this.superficie = superficie;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public double getSuperficie() {
		return superficie;
	}
	
	public double calcularDensidadPoblacional() {
		double densidad;
		densidad = (double)this.poblacion/superficie;
		return densidad;
	}
	

	
	
}
