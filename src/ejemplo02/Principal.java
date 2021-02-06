package ejemplo02;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Directivo direct1 = new Directivo("A A", 30, 300, "Categoría 1");
		Cliente cli1 = new Cliente("B B", 25, "Empresa 1", "+56 9 99999999");
		Empleado emp1 = new Empleado("C C", 35, 400);
		
		
		
		ServicioValidacion sc = new ServicioValidacion();
		sc.setLista(new ArrayList<Metodos>());
		sc.addPersona(cli1);
		sc.addPersona(direct1);
		sc.addPersona(emp1);
		
		sc.desplegar();
		
		
		
		direct1.calcular_salario_neto();

	}

}
