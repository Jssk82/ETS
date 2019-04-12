package actividad_jugadores;

public class Jugadores {
	
	//atributos 
	private String nombre;
	private String equipo;
	private String posicion;
	private String nacionalidad;
	private int goles;
	private double ficha;
	
	//constructores
	public Jugadores() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles = goles;
	}
	public double getFicha() {
		return ficha;
	}
	public void setFicha(double ficha) {
		this.ficha = ficha;
	}
	

	//Métodos propios de la clase
	
	public double calcularTransfe(int a) {
		double resultado;
		//resultado = this.ficha *(a/100);
		resultado = this.ficha * (1 + ((double) a/ficha));  //-->  this.ficha * (this.ficha*(a/100));
		return resultado + this.ficha;
	}
	
}
