package actividad_1;

import java.io.IOException;
import java.util.Scanner;

public class LanzMoneda {
	
	private static Moneda coin; 	// Objeto tipo moneda
	private static Scanner tec = new Scanner (System.in);
	
	/**
	 * Método que solicita al usuario si quiere o no modificar el valor del cambio
	 * y en caso afirmativo lo establece 
	 * @throws IOException
	 */
	private static boolean tipoCambio() throws IOException {		
		char respuesta = (char) System.in.read();
		
		if (respuesta == 's' || respuesta == 'S') {
			System.out.print("Introduce cambio: ");
			double cambio = solicitarDouble();
			coin = new Moneda(cambio);		
			return true;
		}
		if (respuesta == 'n' || respuesta == 'N') {
			coin = new Moneda();
			return true;
		}
		return false;		
	}

	/**
	 * Método que solicita un dato y comprueba si es un numero
	 * @return numero decimal
	 */
	private static double solicitarDouble() {
		String numero = "";
		boolean seguir=true;
		do {
			numero = tec.next();
			seguir= false;
			if (!esDouble(numero)) {
				System.err.print("ERROR. Introduce un numero: ");
				seguir=true; //seguimmos dentro del bucle
			}
		} while (seguir);	
		return Double.parseDouble(numero);
	}
	
	/**
	 * Método que comprueba si una string esta en formato numérico ya sea un número
	 * decimal o entero.
	 * @param String, cadena a comprobar
	 * @return boolean que indica si es o no numérico
	 */
	public static boolean esDouble(String num){
		try{
			Double.parseDouble(num);
			return true;
		} catch(NumberFormatException e){
			return false;
		}
	 }

	/**
	 * Método que recoge el tipo de moneda que el usuario quiere cambiar
	 * @return una cadena que especifica el tipo
	 */
	public static String tipoMoneda() {
		String tipo = "";
		
		tipo = tec.next().toLowerCase();
		switch (tipo) {
			case "euro":
			case "euros":					
				return "euros";
	
			case "dolar":
			case "dólar":
			case "dolares":
			case "dólares":
				return "dólares";
				
			default:
				System.err.print("Opción no válida. Nuevo intento [euro/dolar] ");
				tipoMoneda();
				break;
		}			
		return "";
	}
	
		
	/**
	 * Programa que realiza el cambio de moneda
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		
		boolean seguir = true;
		
		System.out.println("***** Conversor de Euro a Dólar y viseversa ******\n");
		do {
			//petición de tipo de moneda
			System.out.print("¿Qué quieres cambiar, euros o dólares?: ");
			String opcion = tipoMoneda();
			
			//petición de tipo de cambio		
			System.out.print("El cambio esta establecido a 1€ = $1.13, ¿quieres cambiarlo? [s/n]: ");
			while (!tipoCambio()) {
				System.err.print("Respuesta no válida. Introduce el cambio: ");
			}
			
			//petición de la cantidad a cambiar
			System.out.print("Introduce la cantidad a cambiar: ");
			double cantidad = solicitarDouble();
			

			//cambio de moneda según el tipo
			if (opcion.equals("euros")) {
				System.out.println("\n"+cantidad+ " euros son "+coin.EurosDolares(cantidad)+" dólares estadounidenses");
			}else {
				System.out.println("\n"+cantidad+ " dólares son "+coin.DolaresEuros(cantidad)+" euros");
			}
			
			//peticion de un nuevo cambio o salida del programa
			System.out.print("¿Quieres hacer otro cambio? [s/n]: ");
			boolean continuar=true;
			do {
				String respuesta = tec.next().toLowerCase();
				switch (respuesta) {
				case "s":
					continuar = false;
					seguir = true;
					break;
				case "n":
					System.out.println("\n************* Hasta pronto **************");
					continuar = false;
					seguir = false;
					break;
				default:
					System.err.print("Respuesta no válida. Nuevo intento: ");
					continuar = true;
					break;
				}
			} while (continuar);
			
			
		} while (seguir);	
	}


}
