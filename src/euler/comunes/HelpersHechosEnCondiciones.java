package euler.comunes;

import java.util.ArrayList;
import java.util.List;

public class HelpersHechosEnCondiciones {


	public static List<String> permutaciones(String cadena) {

		List<String> permus = new ArrayList<String>();
		doPermutaciones("", cadena, permus);

		return permus;
	}

	private static void doPermutaciones(String prefijo, String cadena, List<String> cachePermutaciones) {

		int n = cadena.length();

		if (n == 0) {
			cachePermutaciones.add(prefijo);
		}

		else {
			for (int i = 0; i < n; i++) {

				doPermutaciones(prefijo + cadena.charAt(i), cadena.substring(0, i) + cadena.substring(i + 1), cachePermutaciones);
			}
		}
	}
}
