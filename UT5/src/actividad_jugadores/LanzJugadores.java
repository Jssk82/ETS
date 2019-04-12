package actividad_jugadores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class LanzJugadores {

	private static Scanner tec;

	public static void main(String[] args) {
		tec = new Scanner(System.in);
		Jugadores jugador;
		
		//Lista
		ArrayList<Jugadores> milista = new ArrayList<>();
		
		//Matriz
		System.out.print ("¿Cuantos jugadores quieres introducir?: ");
		int numero = tec.nextInt();
		String[][] jugadores = new String[numero+1][6];
		
		//Cabecera matriz Nombre equipo....
		String[] cabecera = {"NOMBRE","EQUIPO","POSICION","NACIONALIDAD","GOLES","FICHA"};
		for (int i = 0; i < cabecera.length; i++) {
			jugadores[0][i] = cabecera[i];
		}
		
		//pedir los datos de los jugadores
		
		//Rellenar matriz
		
		for (int i = 1; i < jugadores.length; i++) {
			System.out.println("Introduzca los datos del jugador "+ i);
			tec.nextLine();
			for (int j = 0; j < jugadores[0].length; j++) {
				System.out.print(jugadores[0][j]+": ");
				jugadores[i][j] = tec.nextLine();
			}
		}
				
		mostrarMatriz(jugadores);
		
		//4º) Crea objetos Jugadores y los almacenas en una lista.
		for (int i = 1; i < jugadores.length; i++) {
			jugador = new Jugadores();
			jugador.setNombre(jugadores[i][0]);
			jugador.setEquipo(jugadores[i][1]);
			jugador.setPosicion(jugadores[i][2]);
			jugador.setNacionalidad(jugadores[i][3]);
			jugador.setGoles(Integer.parseInt(jugadores[i][4]));
			jugador.setFicha(Double.parseDouble(jugadores[i][5]));
			milista.add(jugador);
		}
		
		//5º) Recorre la lista y muestra los datos de cada jugador.
		System.out.println("Mostrams toda la lista");
		for (Jugadores x : milista) {
			System.out.println(x.getNombre()+x.getEquipo()+x.getGoles());
		}
		
		/* lo mismo de antes pero con un foreach
		 * 
		Iterator<Jugadores> it = milista.iterator();
		while (it.hasNext()) {
			jugador = it.next();
			System.out.println(jugador.getNombre()+jugador.getEquipo()+jugador.getGoles());
		}
		*/
		
		
		/* 6º) Muestra los datos de los jugadores de FC Barcelona y cuánto costaría su traspaso, si se les
			   aplica un 20% (Este dato no se graba, sólo se muestra)
		 */
		//mostrar solo al barcelona
		System.out.println("Mostrams solo jugadores del barcelona");
		for (Jugadores x : milista) {
			if (x.getEquipo().equalsIgnoreCase("barcelona")); //ignora las mayusculas
				System.out.println(x.getNombre() + " cuesta"+ x.calcularTransfe(20));
			}
		
		/* 7º) Utilizando métodos de String, sustituye en la posición todo lo que sea “derecho” por
		   izquierdo… es decir => “Extremo derecho” por “Extremo izquierdo”, “Lateral derecho” por “Lateral
		   izquierdo”, etc.
		 */		
		//reemplazar derecho por izquierdo:
		
		Iterator<Jugadores> it = milista.iterator();
		while (it.hasNext()) {
			jugador = it.next();
			jugador.getPosicion().replaceAll("derecho", "izquierdo");		
		}
		//mostrarLita
		System.out.println("Mostrams la lista para ver la posicion");
		for (Jugadores x : milista) {
			System.out.println(x.getNombre()+x.getPosicion());
		}
		
		//8º) Elimina de las lista los objetos que sean de Nacionalidad “Italia”.
		// int pos = milista.indexOf()
		/*
		for (Jugadores x : milista) {
			if (x.getNacionalidad().equalsIgnoreCase("italiana")) {
				milista.remove(x);
			}
			
		}*/
		
		it = milista.iterator();	//reinicio el iterador
		while (it.hasNext()) {
			jugador = it.next();
			if (jugador.getNacionalidad().equalsIgnoreCase("italia")) {
				//milista.remove(milista.indexOf(jugador));
				it.remove();
			}
			
		}
		
		System.out.println("Mostrams borrando a los italianos");
		
		for (Jugadores x : milista) {
			System.out.println(x.getNombre()+x.getNacionalidad());
		}
		
		
		
	}
		
	private static void mostrarMatriz(String[][] jugadores) {
		for (int i = 0; i < jugadores.length; i++) {
			for (int j = 0; j < jugadores.length; j++) {
				System.out.println(jugadores[i][j] + "  ");
			}
			System.out.println();
		}
	}
	

	
	

}
