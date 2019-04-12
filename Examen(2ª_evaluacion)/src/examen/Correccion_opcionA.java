package examen;

public class Correccion_opcionA {
	
	//atributos
	private String palabra;
	//constructores
	
	public Correccion_opcionA(String palabra) {
		this.palabra = palabra;
	}


	//Getters & Setters
	public String getPalabra() {
		return palabra;
	}
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}	
	
	//Metodos
	
	/**
	 * Método que calcula el valor en ascii de la palabra completa
	 * @return entero resultante de la suma de los valores ascii de las letras de las palabras
	 */
	public int Valor() {
		//calcula los ascii
		int cont = 0;
		for (int i = 0; i < this.palabra.length(); i++) {
			cont += this.palabra.charAt(i);  // al sumarlo como entero ya lo castea
		}
		return cont;
	}
	
	/**
	 * Método que retorna la palabra inversa
	 * @return
	 */
	public String Inverso() {
		String inversa="";
		for (int i = this.palabra.length()-1; i < 0; i--) {
			inversa += this.palabra.charAt(i);
		}
		return inversa;
	}
}
