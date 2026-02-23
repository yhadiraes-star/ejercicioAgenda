package programacion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */
public class Aplicacion {
		
	Agenda agenda1= new Agenda();
		public Aplicacion(){
			
		
			Scanner teclado= new Scanner(System.in);
			System.out.println("Agenda 2025");
			int opcion;
			
			do {
				
				System.out.println("1) Añadir contacto");
				System.out.println("2) Buscar contacto ");
				System.out.println("3) Borrar contacto");
				System.out.println("4) Mostrar todos los contactos");
				System.out.println("5) Modificar contacto");
				System.out.println("Escoge una opcion... ");
				opcion=teclado.nextInt();
				
				switch(opcion) {
					case 1:
						System.out.println("Ingresa el nombre:");
						String nombre=teclado.next();
						
						System.out.println("Ingresa el telefono:");
						String telefono=teclado.next();
						
						System.out.println("Ingresa la edad:");
						int edad=teclado.nextInt();
						try {
							agenda1.añadirContacto(nombre, telefono,edad);
						}catch(IllegalArgumentException e) {
							System.out.println("Error " + e.getMessage());
						}
						
						break;
					case 2:
						System.out.println("Ingrese el nombre:");
						String nombreBuscar=teclado.next();
						agenda1.buscarContacto(nombreBuscar);
						break;
					case 3:
						break;
					case 4:
						agenda1.mostrarContacto();
						
						break;
					case 5:
						
						break;
						
						
				}
				
			}while(opcion!=6);
			teclado.close();
		}
	
		
	public static void main(String[] args) {
		new Aplicacion();
		
	}

}
