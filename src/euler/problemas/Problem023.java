package euler.problemas;

import java.util.HashSet;

import euler.comunes.Helpers;
import euler.comunes.ISolucion;

public class Problem023 implements ISolucion {

	public static void main(String[] args) {
		Problem023 p23 = new Problem023();
		String resolver = p23.resolver();
		System.out.println(resolver);

	}

	@Override
	public String resolver() {

		HashSet<Integer> sumables = new HashSet<Integer>();
		HashSet<Integer> abundantes = new HashSet<Integer>();

		for (int i = 1; i <= 28123; i++) {
			sumables.add(i);
		}

		for (int i = 1; i <= 28123; i++) {

			if (esAbundante(i)) {
				abundantes.add(i);
			}
		}

		for (int i : abundantes) {
			for (int j : abundantes) {
					sumables.remove(i + j);
			}
		}

		// Sumamos los que quedan

		int resultado = 0;
		for (int i : sumables) {

			// System.out.println(i);
			resultado += i;
		}

		return String.valueOf(resultado);
	}

	public static boolean esAbundante(int numero) {

		int prueba = 0;

		for (int n : Helpers.divisores(numero)) {
			prueba += n;
		}

		return prueba > numero;

	}

}
