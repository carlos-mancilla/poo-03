package ejemplo01;

public class Animal {
	private String especie;
	
	public Animal(String especie) {
		this.especie = especie;
	}

	
	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}


	public void imprimir() {
		System.out.println("Soy un animal de la especie: " + this.getEspecie());
	}
	
	public void comunicar() {
		System.out.println("Soy un animal de la especie: " + this.getEspecie() + " y me comunico de alguna forma");
	}
	
}
