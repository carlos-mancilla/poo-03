package ejemplo02;

public class Empleado extends Persona {
	
	private int sueldo_bruto;

	public Empleado(String nombre, int edad, int sueldo_bruto) {
		super(nombre, edad);
		this.sueldo_bruto = sueldo_bruto;
	}

	public int getSueldo_bruto() {
		return sueldo_bruto;
	}

	public void setSueldo_bruto(int sueldo_bruto) {
		this.sueldo_bruto = sueldo_bruto;
	}
	
	public void calcular_salario_neto() {
		System.out.println("El salario neto del empleado es " 
				+ (int) this.getSueldo_bruto()/1.1);
	}
	
	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("El sueldo bruto del empleado es " 
				+ this.getSueldo_bruto());
	}
	

}
