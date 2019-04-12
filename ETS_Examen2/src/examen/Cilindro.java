package examen;

public class Cilindro {
	
	//atributos
	private float radio;
	private float altura;
	
	/**
	 * Metodo constructor que inicializa un objeto de tipo cilindro
	 * @param radio
	 * @param altura
	 */
	public Cilindro(float radio, float altura){
		this.radio= radio;
		this.altura=altura;
	}
	
	//Getters & Setters
	public float getRadio() {
		return radio;
	}
	public void setRadio(float radio) {
		this.radio = radio;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	//Métodos propios de la clase//
	
	/**
	 * Metodo que calcula el área lateral de un cilindro
	 * @return float con el valos del área
	 */
	public float areaLateral() {		
		return  2 * (float)Math.PI *this.radio * this.altura;
	}
	
	/**
	 * Metodo que calcula el aárea de la base de un cilindro
	 * @return float con el valor de la base
	 */
	public float areaBase() {
		return (float)Math.PI *this.radio*this.radio;
	}
	
	/**
	 * Metodo que calcula el area total de un cilindro
	 * @return float con el valor del área
	 */
	public float calcularArea() {
		return 2*areaBase() + areaLateral();
	}
	
	/**
	 * Metodo que calcula el volumen de un cilindro
	 * @return float con el valor del cilindro
	 */
	public float calcularVolumen() {
		return areaBase()*this.altura;
	}
}
