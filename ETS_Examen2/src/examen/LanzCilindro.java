package examen;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class LanzCilindro {
	
	static Scanner teclado = new Scanner(System.in);

	/**
	 * Método principal de la clase
	 * @param args
	 */
	public static void main(String[] args) {
		
		inprimirMensaje("Introduce el radio");
		final float radio = leerFloat();
		inprimirMensaje("Introduce la altura");
		final float altura = leerFloat();
		
		final Cilindro cilindro = new Cilindro(radio, altura);
		
		inprimirMensaje("El volumen es: "+Float.toString(cilindro.calcularVolumen()));
		inprimirMensaje("El área es: "+Float.toString(cilindro.calcularArea()));
		
	}
	/**
	 * Método que lee un valor tipo float desde teclado
	 * @return float con el valor
	 */
	private static float leerFloat() {
		return teclado.nextFloat();
	}
		
	/**
	 * método que imprime un parametro por pantalla
	 */
	private static void inprimirMensaje(final String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
