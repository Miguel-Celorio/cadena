package cadena;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CadenaTest {

	@Test
	void testLongitud() {
		Cadena cadena = new Cadena();
		assertEquals(6, cadena.longitud("pajaro"));
	}
	
	@Test
	void testVocales() {
		Cadena cadena = new Cadena();
		assertEquals(3, cadena.vocales("pajaro"));
	}
	
	@Test
	void testInvertir() {
		Cadena cadena = new Cadena();
		assertEquals("orajap", cadena.invertir("pajaro"));
	}
	
	@Test
	void testContarLetra() {
		Cadena cadena = new Cadena();
		assertEquals(2, cadena.contarLetra("pajaro", 'a'));
	}
	

}
