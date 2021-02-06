package ejemplo01;
public class Perro extends Animal {
	private String nombre;
	
	public Perro(String especie, String nombre) {
		super(especie);
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Soy un perro llamado " + this.getNombre() + " y ladro");
	}
	
	public void comunicar() {
		System.out.println("Guau guau ");
	}
}
