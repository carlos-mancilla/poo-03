package ejemplo01;
public class Gato extends Animal {
	private String nombre;
	
	public Gato(String especie, String nombre) {
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
		System.out.println("Soy un gato de nombre " + this.getNombre() + " y digo miau");
	}
	
	public void comunicar() {
		System.out.println("Miau miau ");
	}
}
