package ejemplo02;

public class Directivo extends Empleado{
	private String categoria;

	public Directivo(String nombre, int edad, int sueldo_bruto, String categoria) {
		super(nombre, edad, sueldo_bruto);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Además es un directivo y tiene la categoría " 
				+ this.getCategoria());
	}

}
