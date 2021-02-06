package ejemplo02;

public class Persona implements Metodos {
	
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	

	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public int getEdad() {
		return edad;
	}




	public void setEdad(int edad) {
		this.edad = edad;
	}




	@Override
	public void mostrar() {
		System.out.println("La persona se llama " + this.getNombre() 
		+ " y tiene " + this.edad + " de edad");
	}
	
}
