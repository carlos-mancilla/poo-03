package ejemplo02;

import java.util.ArrayList;
import java.util.List;

public class ServicioValidacion {
	private List<Metodos> lista;
	
	public ServicioValidacion() {
		//this.lista = lista;
	}
	
	public void setLista(List<Metodos> lista) {
		this.lista = lista;
	}
	
	public void addPersona(Metodos persona) {
		lista.add(persona);
	}
	
	public void desplegar() {
		for (Metodos persona_aux : lista) {
			persona_aux.mostrar();
		}
	}
}
