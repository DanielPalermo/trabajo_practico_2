package ar.edu.unju.fi.ejercicio1.main;

import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio1.model.Categoria;
import ar.edu.unju.fi.ejercicio1.model.OrigenFabricacion;
import ar.edu.unju.fi.ejercicio1.model.Producto;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Producto> productos = new ArrayList<>();
		
		Producto producto = new Producto();
		//OrigenFabricacion origen;
		//Categoria categoria;
		
		int op;
		do {
			menu();
			op = sc.nextInt();
			switch(op) {
			case 1:
				System.out.print("Ingrese codigo del producto: ");
				String cod = sc.next();
				producto.setCodigo(cod);
				
				System.out.print("Ingrese la descripcion: ");
				String desc = sc.next();
				producto.setDescripcion(desc);
				
				System.out.println("Ingrese el precio: ");
				float prec = sc.nextFloat();
				producto.setPrecioUnitario(prec);
				
				System.out.println("Seleccione el origen de fabricacion: ");
				menu_origen();
				int op_origen = sc.nextInt();
				do {
					switch(op_origen) {
					case 1:
						producto.setOrigenFabricacion(OrigenFabricacion.ARGENTINA);
						break;
					case 2:
						producto.setOrigenFabricacion(OrigenFabricacion.CHINA);
						break;
					case 3:
						producto.setOrigenFabricacion(OrigenFabricacion.BRASIL);
						break;
					case 4:
						producto.setOrigenFabricacion(OrigenFabricacion.URUGUAY);
						break;
					default:
						System.out.println("Opcion incorrecta");
					}
				}while(op_origen < 1 | op_origen > 4);
				
				System.out.println("Seleccione la categoria del producto");
				menu_categoria();
				int op_cat = sc.nextInt();
				
				do {
					switch(op_cat) {
					case 1:
						producto.setCategoria(Categoria.TELEFONIA);
						break;
					case 2:
						producto.setCategoria(Categoria.INFORMATICA);
						break;
					case 3:
						producto.setCategoria(Categoria.ELECTROHOGAR);
						break;
					case 4:
						producto.setCategoria(Categoria.HERRAMIENTAS);
						break;
					default:
							System.out.println("Opcion incorrecta");
					}
				}while(op_cat < 1 | op_cat > 4);
				
				productos.add(producto);
				
				break;
			case 2:
				for(Producto p: productos) {
					System.out.println(p);
				}
				break;
			case 3:
				System.out.println("Seleccione que elemento del producto desea modificar");
				menu_modificacion();
				int op_mod = sc.nextInt();
				
				System.out.print("Ingrese el codigo: ");
				String cod_mod = sc.next();
				for(Producto p: productos) {
					if(p.getCodigo().equals(cod_mod)) {
						switch(op_mod) {
						case 1:
							System.out.println("Ingrese la nueva descripcion");
							String desc_mod = sc.next();
							p.setDescripcion(desc_mod);
							break;
						case 2:
							System.out.println("Ingrese el nuevo precio");
							float precio_mod = sc.nextFloat();
							p.setPrecioUnitario(precio_mod);
							break;
						case 3:
							System.out.println("Indique el nuevo origen del producto: ");
							menu_origen();
							int origen_mod = sc.nextInt();
							do {
								switch(origen_mod) {
								case 1:
									p.setOrigenFabricacion(OrigenFabricacion.ARGENTINA);
									break;
								case 2:
									p.setOrigenFabricacion(OrigenFabricacion.CHINA);
									break;
								case 3:
									p.setOrigenFabricacion(OrigenFabricacion.BRASIL);
									break;
								case 4:
									p.setOrigenFabricacion(OrigenFabricacion.URUGUAY);
									break;
								default:
									System.out.println("Opcion incorrecta");
								}
							}while(origen_mod < 1 | origen_mod > 4);
							break;
						case 4:
							System.out.println("Indique la nueva categoria del producto: ");
							menu_categoria();
							int cat_mod = sc.nextInt();
							
							do {
								switch(cat_mod) {
								case 1:
									p.setCategoria(Categoria.TELEFONIA);
									break;
								case 2:
									p.setCategoria(Categoria.INFORMATICA);
									break;
								case 3:
									p.setCategoria(Categoria.ELECTROHOGAR);
									break;
								case 4:
									p.setCategoria(Categoria.HERRAMIENTAS);
									break;
								default:
										System.out.println("Opcion incorrecta");
								}
							}while(cat_mod < 1 | cat_mod > 4);
							
							
							break;
							
						}
					}
				}
				break;
			case 4:
				System.out.println("Fin del programa");
				break;
			default:
				System.out.println("Opcion incorrecta");
			}
		}while( op != 4 );
		
	}
	
	public static void menu() {
		System.out.println("1) Crear un producto");
		System.out.println("2) Mostrar productos");
		System.out.println("3) Modificar un producto (descripción, precio unitario, origen fabricación o categoría)");
		System.out.println("4) Salir");
	}
	
	public static void menu_origen() {
		System.out.println("1) Argentina");
		System.out.println("2) China");
		System.out.println("3) Brasil");
		System.out.println("4) Uruguay");
	}
	
	public static void menu_categoria() {
		System.out.println("1) Telefonia");
		System.out.println("2) Informatica");
		System.out.println("3) Electrohogar");
		System.out.println("4) Herramientas");
	}
	
	public static void menu_modificacion() {
		System.out.println("1) Descripcion");
		System.out.println("2) Precio");
		System.out.println("3) Origen");
		System.out.println("4) Categoria");
	}
}
