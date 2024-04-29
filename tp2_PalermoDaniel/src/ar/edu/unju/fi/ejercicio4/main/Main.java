package ar.edu.unju.fi.ejercicio4.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio4.constantes.Posicion;
import ar.edu.unju.fi.ejercicio4.model.Jugador;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Jugador> jugadores = new ArrayList<>();

		
		int op;
		do {
			menu();
			op = sc.nextInt();
			switch(op) {
			case 1:
				Jugador jugador = new Jugador();
				
				System.out.print("Ingrese nombre: ");
				String nombre = sc.next();
				jugador.setNombre(nombre);
				
				System.out.print("Ingrese apellido: ");
				String apellido = sc.next();
				jugador.setApellido(apellido);
				
				/*int dia;
				try {
					do {
						System.out.print("Ingrese dia de nacimiento(dd): ");
						dia = sc.nextInt();
						
					}while(dia < 0 || dia > 31);
				}catch(InputMismatchException e) {
					System.err.println("Tipo de dato incorrecto");
					System.out.println("Saliendo del programa");
				}
				
				int mes;
				try {
					do {
						System.out.print("Ingrese mes de nacimiento (mm): ");
						mes = sc.nextInt();
					}while(mes < 0 || mes > 12);
				}catch(InputMismatchException e) {
					System.err.println("Tipo de dato incorrecto");
					System.out.println("Saliendo del programa");
				}
				
				int anio; 
				try {
					do {
						System.out.print("Ingrese anio de nacimiento (yyyy): ");
						anio = sc.nextInt();
					}while(anio <= 0);
				}catch(InputMismatchException e) {
					System.err.println("Tipo de dato incorrecto");
					System.out.println("Saliendo del programa");
				}*/
				//LocalDate fechaNac = LocalDate.of(anio, mes, dia);
				
				System.out.println("Ingrese fecha de nacimiento (dd/mm/yy): ");
				String fechaNacString = sc.next();
				LocalDate fechaNac = null;
				try {
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
					fechaNac = LocalDate.parse(fechaNacString,formatter);
				}catch(Exception e) {
					System.err.println("Cadena de fecha inválida");
					System.err.println("Volviendo al menu principal");
				}
				jugador.setFechaNacimiento(fechaNac);
				
				System.out.print("Ingrese estatura: ");
				double estatura = sc.nextDouble();
				jugador.setEstatura(estatura);
				
				System.out.print("Ingrese peso: ");
				double peso = sc.nextDouble();
				jugador.setPeso(peso);
				
								
				int op_pos;
				do {
					System.out.println("Ingrese posicion: ");
					menu_pos();
					op_pos = sc.nextInt();
					switch(op_pos) {
					case 1:
						jugador.setPosicion(Posicion.DELANTERO);
						break;
					case 2:
						jugador.setPosicion(Posicion.MEDIO);
						break;
					case 3:
						jugador.setPosicion(Posicion.DEFENSA);
						break;
					case 4:
						jugador.setPosicion(Posicion.ARQUERO);
						break;
					default:
						System.out.println("Opcion incorrecta");
					}
				}while(op_pos < 1 || op_pos > 4);
				jugadores.add(jugador);
				break;
			case 2:
				for(Jugador j:jugadores) {
					System.out.println(j);
				}
				break;
			case 3:
				boolean encontrado = true;
				
				System.out.print("Ingrese nombre del jugador que quiere modificar la posicion: ");
				String nom_mod = sc.next();
				
				System.out.print("Ingrese apellido del jugador que quiere modificar la posicion: ");
				String apel_mod = sc.next();
				
				for(Jugador j:jugadores) {
					if( !(j.getNombre().equalsIgnoreCase(nom_mod) ) && !( j.getApellido().equalsIgnoreCase(apel_mod)) ) {
						System.out.println("Jugador no encontrado");
					}else {
							if( j.getNombre().equalsIgnoreCase(nom_mod)  &&  j.getApellido().equalsIgnoreCase(apel_mod))  {
								int pos_mod;
								do {
									System.out.println("Ingrese posicion: ");
									menu_pos();
									pos_mod = sc.nextInt();
									switch(pos_mod) {
									case 1:
										j.setPosicion(Posicion.DELANTERO);
										break;
									case 2:
										j.setPosicion(Posicion.MEDIO);
										break;
									case 3:
										j.setPosicion(Posicion.DEFENSA);
										break;
									case 4:
										j.setPosicion(Posicion.ARQUERO);
										break;
										
									default:
										System.out.println("Opcion incorrecta");
									}
								}while(pos_mod < 1 || pos_mod > 4 );
							}
					}
				}
				
				
				break;
			case 4:
				boolean enc= true;
				
				System.out.print("Ingrese nombre del jugador que quiere modificar la posicion: ");
				String nom_mod_2 = sc.next();
				
				System.out.print("Ingrese apellido del jugador que quiere modificar la posicion: ");
				String apel_mod_2 = sc.next();
				
				for(Jugador j:jugadores) {
					if( !(j.getNombre().equalsIgnoreCase(nom_mod_2) ) && !( j.getApellido().equalsIgnoreCase(apel_mod_2)) ) {
						encontrado = false;
					}
				}
				
				if(enc == false) {
					System.out.println("Jugador no encontrado");
				}else {
					Iterator iterator = jugadores.iterator();
					while(iterator.hasNext()) {
						Jugador j = (Jugador)iterator.next();
						if(j.getNombre().equalsIgnoreCase(nom_mod_2)  &&  j.getApellido().equalsIgnoreCase(apel_mod_2)) {
							iterator.remove();
							
						}
					}
				}
				break;
			case 5:
				System.out.println("Fin del programa");
				break;
			default:
				System.out.println("Opcion incorrecta");
			}
		}while(op != 5);
	}
	public static void menu() {
		System.out.println("1) Alta de jugador");
		System.out.println("2) Mostrar los jugadores");
		System.out.println("3) Modificar posicion de jugador");
		System.out.println("4) Eliminar jugador");
		System.out.println("5) Salir");
		System.out.println("Seleccion opcion");
	}
	
	public static void menu_pos() {
		System.out.println("1) Delantero");
		System.out.println("2) Mediodealentero");
		System.out.println("3) Defensor");
		System.out.println("4) Arquero");
	}
}
