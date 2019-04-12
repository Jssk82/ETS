package actividad_1;

import java.io.IOException;
import java.util.Scanner;

public class LanzMoneda {
	
	private static Moneda coin; 	// Objeto tipo moneda
	private static Scanner tec = new Scanner (System.in);
	
	/**
	 * M�todo que solicita al usuario si quiere o no modificar el valor del cambio
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
	 * M�todo que solicita un dato y comprueba si es un numero
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
	 * M�todo que comprueba si una string esta en formato num�rico ya sea un n�mero
	 * decimal o entero.
	 * @param String, cadena a comprobar
	 * @return boolean que indica si es o no num�rico
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
	 * M�todo que recoge el tipo de moneda que el usuario quiere cambiar
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
			case "d�lar":
			case "dolares":
			case "d�lares":
				return "d�lares";
				
			default:
				System.err.print("Opci�n no v�lida. Nuevo intento [euro/dolar] ");
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
		
		System.out.println("***** Conversor de Euro a D�lar y viseversa ******\n");
		do {
			//petici�n de tipo de moneda
			System.out.print("�Qu� quieres cambiar, euros o d�lares?: ");
			String opcion = tipoMoneda();
			
			//petici�n de tipo de cambio		
			System.out.print("El cambio esta establecido a 1� = $1.13, �quieres cambiarlo? [s/n]: ");
			while (!tipoCambio()) {
				System.err.print("Respuesta no v�lida. Introduce el cambio: ");
			}
			
			//petici�n de la cantidad a cambiar
			System.out.print("Introduce la cantidad a cambiar: ");
			double cantidad = solicitarDouble();
			

			//cambio de moneda seg�n el tipo
			if (opcion.equals("euros")) {
				System.out.println("\n"+cantidad+ " euros son "+coin.EurosDolares(cantidad)+" d�lares estadounidenses");
			}else {
				System.out.println("\n"+cantidad+ " d�lares son "+coin.DolaresEuros(cantidad)+" euros");
			}
			
			//peticion de un nuevo cambio o salida del programa
			System.out.print("�Quieres hacer otro cambio? [s/n]: ");
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
					System.err.print("Respuesta no v�lida. Nuevo intento: ");
					continuar = true;
					break;
				}
			} while (continuar);
			
			
		} while (seguir);	
	}


}
