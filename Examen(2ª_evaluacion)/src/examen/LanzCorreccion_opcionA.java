package examen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LanzCorreccion_opcionA {
		
	static String alfabeto = "abcdefghijklmnñopqrstuvwxyz";
	static ArrayList<String> lista = new ArrayList<>();
	static Scanner tec = new Scanner(System.in);
	
	/**
	 * 
	 * @return
	 */
	public static int AleatorioInt() {
		//no hace falta definir el alfabeto aqui porque lo tengo static
		int a = (int) (Math.random()*alfabeto.length());
		return a; 
	}

	/**
	 * 
	 * @return
	 */
	public static char AleatorioChar() {
		//necesito aqui el alfabeto ??
		String alfabeto = "abcdefghijklmnñopqrstuvwxyz";
		int a = (int) (Math.random()*alfabeto.length());
		return alfabeto.charAt(a); 
	}

	/**
	 * @param matriz
	 */
	private static void mostrarMatriz(char[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]+ " ");
			}
			System.out.println();
		}
	}	

	/**
	 * 
	 */
	private static void mostrarLista() {
		System.out.println();
		for (String s : lista) {
			System.out.println(s);
		}
	}
	
	//******** PROGRAMA PRINCIPAL *********//
	
	public static void main(String[] args) {
		
		//Solicitamos datos  //acuerdate de controlar errores
		System.out.print("Introduce el número de filas: ");
		int M = tec.nextInt();
		System.out.print("Introduce el número de columnas: ");
		int N = tec.nextInt();
		tec.nextLine();
		char[][] matriz = new char[M][N];
		
		// Rellenar matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = AleatorioChar();
			}
		}
		
		// Mostrar matriz
		mostrarMatriz(matriz);
		
		//Calculamos la String, recorremos al revés
		for (int col = 0; col < matriz[0].length; col++) {   // columnas
			String nuevaPalabra = "";
			for (int fil = 0; fil < matriz.length; fil++) {  // filas
				nuevaPalabra += matriz[fil][col];
			}
			lista.add(nuevaPalabra);
		}
		lista.add("gact");
		
		//Mostrar lista
		mostrarLista();
		
		//Mostrar lista al reves
		Collections.reverse(lista);
		mostrarLista();
		
		
		//Apartado 5 
		
		Correccion_opcionA[] vecPalabras = new Correccion_opcionA[lista.size()];
		Correccion_opcionA pal; //instancia
		
		for (int i = 0; i < vecPalabras.length; i++) {
			pal = new Correccion_opcionA(lista.get(i));
			vecPalabras[i] = pal;
		}
		
		System.out.println();
		for (int i = 0; i < vecPalabras.length; i++) {
			System.out.println(vecPalabras[i].getPalabra()+"- "+vecPalabras[i].Valor()+"- "+vecPalabras[i].Inverso());
		}

	}
	





	


}
