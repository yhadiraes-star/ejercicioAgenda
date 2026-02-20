package programacion;

public class Contactos {
	
	/**
	 * 
	 */
	private String nombre;
	private String telefono;
	private int edad;
	
	
	public Contactos(String nombre, String telefono, int edad) {
		this.nombre = nombre;
		this.telefono=telefono;
		this.edad = edad;
	}

	/**
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	/**
	 *
	 */
	@Override
	public String toString() {
		return nombre + " \nTelefono= " + telefono + " \nEdad=" + edad+"\n";
	}
	
	
	
	
}
