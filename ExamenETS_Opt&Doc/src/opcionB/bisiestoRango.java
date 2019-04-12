
//refactorizar, optimizar, extraer metodos,pmd y javadoc

/*
import java.util.Scanner;

public class bisiestoRango {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int nB = 0;
        int a, b, in, fi;
       do {
           System.out.println("Introduce el primer a�o: ");
           a = c.nextInt();
           System.out.println("Introduce el segundo a�o: ");
           b = c.nextInt();
       } while (a > b);
        int anoa = a;

        while (anoa <= b) {
                if ((anoa%4==0 && anoa%100 != 0) || (anoa%100==0 && anoa%400==0)) {
                    System.out.println("El a�o -> " + anoa + " es bisiesto");
                    nB++;
                }
               anoa++;
            }

        if (nB > 0) {
            System.out.println("El numero de a�os bisiesto entre los a�os -> " +a +" y -> "+b);
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
	static int primerA�o=0, segundoA�o=0;

	public static void main(String[] args) {

		buscarA�os();

		int numeroBisiestos = buscarBisiestos(primerA�o, segundoA�o);

		if (numeroBisiestos > 0) {
			inprimirMensaje("El numero de a�os bisiesto entre los a�os -> " + Integer.toString(primerA�o) + " y -> " + Integer.toString(segundoA�o));
			inprimirMensaje("Es -> " + Integer.toString(numeroBisiestos));
		} else {
			inprimirMensaje("No hemos encontrado numero bisiestos en el rango solicitado.");
		}
	}

	/**
	 * M�todo que lee y comprueba si los a�os son v�lidos
	 */
	private static void buscarA�os() {
		do {
			inprimirMensaje("Introduce el primer a�o: ");
			primerA�o = leerValor();
			inprimirMensaje("Introduce el segundo a�o: ");
			segundoA�o = leerValor();
		} while (primerA�o > segundoA�o);
	}

	/**
	 * metodo que busca la cantidad de n�meros bisiestos que hay en un rango de a�os
	 * @param primerA�o
	 * @param segundoA�o
	 * @return int con el n�mero de a�os
	 */
	private static int buscarBisiestos(int primerA�o, int segundoA�o) {
		int numeroBisiestos = 0;
		int a�o = primerA�o;

		while (a�o <= segundoA�o) {
			if ((a�o % 4 == 0 && a�o % 100 != 0) || (a�o % 100 == 0 && a�o % 400 == 0)) {
				System.out.println("El a�o -> " + a�o + " es bisiesto");
				numeroBisiestos++;
			}
			a�o++;
		}
		return numeroBisiestos;
	}

	/**
	 * M�todo que lee un valor entero desde teclado
	 * @return
	 */
	private static int leerValor() {
		return teclado.nextInt();
	}

	/**
	 * m�todo que imprime un parametro por pantalla
	 */
	private static void inprimirMensaje(String mensaje) {
		System.out.println(mensaje);
	}

}