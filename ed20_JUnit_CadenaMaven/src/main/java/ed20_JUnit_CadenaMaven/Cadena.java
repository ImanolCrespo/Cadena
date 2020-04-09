package ed20_JUnit_CadenaMaven;

public class Cadena {

	public int longitud(String cadena) {

		return cadena.length();
	}

	public int vocales(String cadena) {
		cadena = cadena.toLowerCase();
		int cnt = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o'
					|| cadena.charAt(i) == 'u') {
				cnt++;
			}
		}
		return cnt;
	}
	
	public String invertir(String cadena) {
		String invertida ="";
		
		for (int i = cadena.length()-1; i >=0 ; i--) {
			invertida= invertida + cadena.charAt(i);
		}
		return invertida;
	}

	public int contarLetra(String cadena, char letra) {
		cadena = cadena.toLowerCase();
		int cnt = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == letra) {
				cnt++;
			}
		}
		return cnt;
	}
}
