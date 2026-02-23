package programacion;

import java.util.ArrayList;

/**
 * Clase donde se aplicaran los metodos para la agenda
 */
public class Agenda {
	
	
	private ArrayList<Contactos>contacto=new ArrayList<>();
	
	public Agenda() {
		cargarContacto();
	}
	/**
	 * 
	 * @param nombre
	 * @param telefono
	 * @param edad
	 */
	public void añadirContacto(String nombre, String telefono, int edad) {
		if(telefono.equals("0") || nombre.equals("0")) {
			throw new IllegalArgumentException("telefono invalido");		
			
		}
		if(!telefono.matches("\\d{9}")) {
			throw new IllegalArgumentException("ingresa 9 digitos.");
		}
			contacto.add(new Contactos(nombre,telefono,edad));
			System.out.println("El contacto se guardo exitosamente.");
		
	}
	
	/**
	 * @param nombre
	 */
	public void buscarContacto(String nombre) {
		
		boolean encontrado=false;
		for(Contactos contacto: contacto) {
			if(contacto.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("Contacto encontrado: " + contacto);
				encontrado=true;
				break; 
			}else{
				System.out.println("Contacto no encontrado. ");
			}
			
			if(!encontrado) {
				System.out.println("Contacto no encontrado. ");
			}
		}
		
	}
	
	/**
	 * Se carga 10 contactos iniciales
	 */
	public void cargarContacto() {
		contacto.add(new Contactos("Juan", "123456789", 25));
        contacto.add(new Contactos("Ana", "987654321", 30));
        contacto.add(new Contactos("Luis", "111222333", 28));
        contacto.add(new Contactos("Maria", "444555666", 22));
        contacto.add(new Contactos("Pedro", "777888999", 35));
        contacto.add(new Contactos("Carla", "222333444", 27));
        contacto.add(new Contactos("Diego", "555666777", 32));
        contacto.add(new Contactos("Sofia", "888999000", 24));
        contacto.add(new Contactos("Andres", "333444555", 29));
        contacto.add(new Contactos("Lucia", "666777888", 26));
		
	}

	public void mostrarContacto() {
		for(Contactos c: contacto) {
			System.out.println(c);
		}
	}
	
	
	public void borrarContacto() {
		
	}
	
	
}
