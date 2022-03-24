package cadena;

public class Cadena {
	public int longitud(String cadena) {
		return cadena.length();
	}
	
	public int vocales(String cadena) {
		int contador = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u') {
				contador++;
			}
		}
		return contador;
	}
	
	// hay que probarlo
	public String invertir(String cadena) {
		StringBuilder sb = new StringBuilder();
		for(int i = cadena.length() - 1; i >= 0; i--) {
			sb.append(cadena.charAt(i));
		}
		
		return sb.toString();
	}
	
	public int contarLetra(String cadena, char caracter) {
		int contador = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i) == caracter) {
				contador++;
			}
		}
		return contador;
	}
}
