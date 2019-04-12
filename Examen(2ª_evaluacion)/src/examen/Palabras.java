package examen;

public class Palabras {
	
	/*
	 * UT5 Objetos:
	 * a) Generar una clase que almacene objetos Palabras, cuyos atributos serán spanish e english,
	 * que contendran la palabra en español y su traduccion en ingles. Asi como el atributo nivel
	 * que contendra el nivel de ingles de la palabra... ejemplo: B1, B2, C1 ...
	 * 
	 * b) Los metodos que contendran serán Nivel() que devuelve una String, de forma que si el nivel
	 * es A1 devuelve Basic, A2 será Pre-intermediate, B1 es Intermediate ,B2 Upper-Intermediate ,
	 * C1 Advanced y C2 Proficiency.
	 * 
	 * c) Desarrolla un programa Main que lee de teclado una serie de palabras y su correspondiente
	 * en ingles (te pongo dos ejemplos, inventa al menos dos mas). Crea los objetos Palabras y 
	 * almacenalos en un vector (pregunta previamente al usuario cuantas palabras va a contener su 
	 * diccionario)
	 * 						Oportunidad, Opportunity, B1
	 * 						Excelente, Outstanding, B2
	 * 
	 * d) Posteriormente muestra al usuario todas las palabras en ingles mostrando el Nivel como
	 * String (Outstanding, Upper-intermediate por ejemplo)
	 * 	
	 * */
	
	//atributos
	private String spanish;
	private String english;
	private String nivel;
	
	//constructor
	public Palabras(String spanish, String english, String nivel) {
		this.spanish = spanish;
		this.english = english;
		this.nivel = nivel;
	}
	
	// Getters and Setters
	public String getSpanish() {
		return spanish;
	}
	public void setSpanish(String spanish) {
		this.spanish = spanish;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
	// Métodos propios de la clase
	
	public String Nivel() {
		
		switch (this.nivel.toUpperCase()) {
		case "A1":
			return "Basic";
		case "A2":
			return "Pre-intermediate";
		case "B1":
			return "Intermediate";
		case "B2":
			return "Upper-Intermediate";
		case "C1":
			return "Advanced";
		case "C2":
			return "Proficiency";
		/*default:
			break;*/
		}
		return "";
	}

}
