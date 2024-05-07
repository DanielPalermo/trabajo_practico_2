package ar.edu.unju.fi.ejercicio6.main;

import ar.edu.unju.fi.ejercicio6.interfaces.funcionales.Converter;
import ar.edu.unju.fi.ejercicio6.model.FelinoDomestico;
import ar.edu.unju.fi.ejercicio6.model.FelinoSalvaje;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FelinoDomestico gato = new FelinoDomestico("Garfield", (byte)45 , 12f);
		
		Converter<FelinoDomestico, FelinoSalvaje> converter = g1 -> new FelinoSalvaje(g1.getNombre(), g1.getEdad(),g1.getPeso());
		
		FelinoSalvaje felino1 = converter.convert(gato);
		
		converter.mostrarObjeto(felino1);
		
		
		
		FelinoSalvaje tigre = new FelinoSalvaje("Tanner", (byte)20, 180f);
		boolean Nonulo;
		
		Nonulo = Converter.isNotNull(tigre);

		if(!Nonulo) {
			System.out.println("Objeto nulo");
		}else {
			Converter<FelinoSalvaje, FelinoDomestico> converter2 = g2 -> new FelinoDomestico(g2.getNombre(),g2.getEdad(),g2.getPeso() );
			FelinoDomestico felino2 = converter2.convert(tigre);
			converter2.mostrarObjeto(felino2);
		}

		

	}

}
