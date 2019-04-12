package examen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExamenTest {
	
	Palabras palabra1, palabra2, palabra3, palabra4;

	@Before
	public void inicializar() {
		palabra1 =  new Palabras("Oportunidad", "Opportunity","B1");
		palabra2 =  new Palabras("Excelente", "Outstanding","B2");
		palabra3 =  new Palabras("Mesa", "Table","A1");
		palabra4 =  new Palabras("Disponible", "Available","C1");
	}
	@Test
	public void NivelTest() {		
		assertEquals("Intermediate",palabra1.Nivel());
		assertEquals("Upper-Intermediate",palabra2.Nivel());
		assertEquals("Basic",palabra3.Nivel());
		assertEquals("Advanced",palabra4.Nivel());
	}

}



/*
 * 
 * public String Nivel() {
		
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

		}
		return "";
	}*/
