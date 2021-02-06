package ejemplo01;
public class PolimorfismoMain {

	public static void main(String[] args) {
		Animal fido, snarf;
		
		fido = new Perro("Canino", "Fido");
		snarf = new Gato("Felino", "Snarf");
		
		fido.imprimir();
		snarf.imprimir();
		
		fido.comunicar();
		snarf.comunicar();

	}

}
