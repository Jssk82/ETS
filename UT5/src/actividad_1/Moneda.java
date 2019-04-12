package actividad_1;

public class Moneda {
	
	/**
	 * Actividad 1. Clase Cambio Moneda
		Realiza una clase Moneda cuyo objetivo es utilizar sus métodos para convertir Euros a Dólares y	viceversa.
		La clase debe tener:
		Un constructor Moneda(), que por defecto establezca el cambio en 1,09 (1€ son 1.09$)
		Un constructor Moneda(double) que permita modificar el cambio de moneda
		Y los métodos para el cambio: EurosDolares() y DolaresEuros()
		Desde una clase externa con main utiliza la clase y métodos anteriores.
	 */
	
	//atributos
	private double cambio;
	
	//constructores
	public Moneda() {
		this.cambio = 1.13;
	}
	
	public Moneda(double cambio) {
		this.cambio = cambio;
	}

	//* Metodos Getters and Setters *//
	public double getCambio() {
		return cambio;
	}
	public void setCambio(double cambio) {
		this.cambio = cambio;
	}	
	
	//* Métodos propios de la clase *//
	public double EurosDolares(double euros) {
		return (double) Math.round(this.cambio*euros * 100) / 100;    // (double) Math.round(a * 100)/ 100 --para redondear a 2 decimales
	}	
	
	public double DolaresEuros(double dolares) {
		return (double) Math.round(dolares/this.cambio * 100) / 100;
	}
	
}
