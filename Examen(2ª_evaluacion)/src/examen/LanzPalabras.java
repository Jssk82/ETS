package examen;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LanzPalabras {
	
	private static Scanner tec = new Scanner (System.in);
	
	public static void main(String[] args) {
		/***************UT5***************/
		
		// vector de objetos Palabras inicializado con 4 datos
		Palabras[] dicc = {new Palabras("Oportunidad", "Opportunity","B1"),
				new Palabras("Excelente", "Outstanding","B2"),
				new Palabras("Mesa", "Table","A1"), new Palabras("Disponible", "Available","C1")};
		
		boolean seguir = true;
		
		System.out.print("¿Cuántas palabras quieres introducir en el diccionario? ");
		int num = solicitarEntero();
		
		Palabras[] diccionario = new Palabras[num];  // 
		Palabras palabra;
		
		// Peticion de los datos de las palabras al usuario
		
		for (int i = 0; i < num; i++) {

			System.out.println("Palabra "+ (i+1));
			System.out.print("Palabra en español: ");
			String esp = tec.next();
			System.out.print("Palabra en ingles: ");
			String eng = tec.next();
			System.out.print("Nivel de la palabra: ");						
			String nivel = tec.next();
			
			palabra = new Palabras(esp, eng, nivel);
			diccionario[i] = palabra;			
		}
		
		//Mostrar las palabras en ingles con el nivel en forma de String
		System.out.println("\n Las palabras de su diccionario y su nivel son las siguientes: \n");
		for (Palabras p : diccionario) {
			System.out.println(p.getEnglish()+", "+p.Nivel());
		}
		
		
		/*************UT4**************/
		
		/**
		 * Rellenar una matriz con los datos de las palabras anteriores.
		 * a) Carga una matriz de Mx3, donde M será la cantidad de palabras que se han definido, y 3 serán
		 * las coumnas dnde la primera columna es la palabra en español, la segunda la palabra en ingles y la
		 * tercera el nivel A1, A2...
		 * 
		 * b) Solicita al usuario un nivel y muestra las palabras en español que pertenecen al nivel solicitado
		 * 
		 * c) 
		 * 
		 * d)
		 * 
		 * e)
		 * 
		 */
		
		//Palabras[][] diccMatriz = new Palabras[diccionario.length][3];
		String[][] diccMatriz = new String[diccionario.length+1][3];
		
		String[] cabecera = {"SPANISH","ENGLISH","LEVEL"};
		
		//Rellenar la matriz
		for (int i = 0; i < cabecera.length; i++) {
			diccMatriz[0][i] = cabecera[i];
		}
		for (int i = 1; i < diccMatriz[0].length; i++) {
			diccMatriz[i][0] = diccionario[i-1].getSpanish();
			diccMatriz[i][1] = diccionario[i-1].getEnglish();
			diccMatriz[i][2] = diccionario[i-1].getNivel();
		}
		
		
		//Solicitar nivel y mostrar sus palabras en español
		
		
		System.out.print("\nIndica el nivel a consultar [A1,A2,B1,B2,C1,C2]: ");
		tec.nextLine();
		String level = tec.nextLine().toLowerCase();

		
		//muestra la palabra en español de ese nivel
		System.out.println("Palabras del nivel "+level);
		

		for (int i = 1; i < diccMatriz.length; i++) {
			if(diccMatriz[i][2].toLowerCase().equals(level)) {
				System.out.println(diccMatriz[i][0]);
			}
		}
		
		
		
		
		//d) crear uuna lista que con las palabras en ingles y mostrarlas ordenadas
		
		ArrayList<String> palabrasingles = new ArrayList<>();
		for (int i = 0; i < diccMatriz[0].length; i++) {
			palabrasingles.add(diccMatriz[i][1]);
		}
		palabrasingles.sort(null);
		for (String s : palabrasingles) {
			System.out.print(s+", ");
		}
		
		
		
		/*System.out.println();
		for (int i = 0; i < diccMatriz.length; i++) {
			for (int j = 0; j < diccMatriz[0].length; j++) {
				System.out.print(diccMatriz[i][j]+", ");
			}
			System.out.println();
		}*/
		
	}

	public static boolean comprobarNivel(String level) {
		String niveles = "A1A2B1B2C1C2";
		if (niveles.indexOf(level) != -1) return true;
		else return false;
		
	}
	/**
	 * Método que solicita un dato y comprueba si es un numero entero, se repite
	 * hasta que se introduce el dato correcto
	 * @return  devuelve un número entero
	 */
	public static int solicitarEntero() {
		int op = 0;
		boolean seguir = true;
		do {
			try {
				op = tec.nextInt();
				seguir = false;
			} catch (InputMismatchException e) {
				System.err.print("Esto no es un número entero. Vuelve a elegir: ");
				tec.nextLine();
			}			
		} while (seguir);
		return op;
	}
	
}
