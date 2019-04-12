
//refactorizar, optimizar, extraer metodos,pmd y javadoc

/*
import java.util.Scanner;

public class bisiestoRango {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int nB = 0;
        int a, b, in, fi;
       do {
           System.out.println("Introduce el primer año: ");
           a = c.nextInt();
           System.out.println("Introduce el segundo año: ");
           b = c.nextInt();
       } while (a > b);
        int anoa = a;

        while (anoa <= b) {
                if ((anoa%4==0 && anoa%100 != 0) || (anoa%100==0 && anoa%400==0)) {
                    System.out.println("El año -> " + anoa + " es bisiesto");
                    nB++;
                }
               anoa++;
            }

        if (nB > 0) {
            System.out.println("El numero de años bisiesto entre los años -> " +a +" y -> "+b);
            System.out.println("Es -> " + nB);
        } else {
            System.out.println("No hemos encontrado numero bisiestos en el rango solicitado.");
        }
    }

}
 */

package opcionB;

import java.util.Scanner;

public class bisiestoRango {

	static Scanner teclado = new Scanner(System.in);
	static int primerAño=0, segundoAño=0;

	public static void main(String[] args) {

		buscarAños();

		int numeroBisiestos = buscarBisiestos(primerAño, segundoAño);

		if (numeroBisiestos > 0) {
			inprimirMensaje("El numero de años bisiesto entre los años -> " + Integer.toString(primerAño) + " y -> " + Integer.toString(segundoAño));
			inprimirMensaje("Es -> " + Integer.toString(numeroBisiestos));
		} else {
			inprimirMensaje("No hemos encontrado numero bisiestos en el rango solicitado.");
		}
	}

	/**
	 * Método que lee y comprueba si los años son válidos
	 */
	private static void buscarAños() {
		do {
			inprimirMensaje("Introduce el primer año: ");
			primerAño = leerValor();
			inprimirMensaje("Introduce el segundo año: ");
			segundoAño = leerValor();
		} while (primerAño > segundoAño);
	}

	/**
	 * metodo que busca la cantidad de números bisiestos que hay en un rango de años
	 * @param primerAño
	 * @param segundoAño
	 * @return int con el número de años
	 */
	private static int buscarBisiestos(int primerAño, int segundoAño) {
		int numeroBisiestos = 0;
		int año = primerAño;

		while (año <= segundoAño) {
			if ((año % 4 == 0 && año % 100 != 0) || (año % 100 == 0 && año % 400 == 0)) {
				System.out.println("El año -> " + año + " es bisiesto");
				numeroBisiestos++;
			}
			año++;
		}
		return numeroBisiestos;
	}

	/**
	 * Método que lee un valor entero desde teclado
	 * @return
	 */
	private static int leerValor() {
		return teclado.nextInt();
	}

	/**
	 * método que imprime un parametro por pantalla
	 */
	private static void inprimirMensaje(String mensaje) {
		System.out.println(mensaje);
	}

}