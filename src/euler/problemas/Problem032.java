package euler.problemas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import euler.comunes.Helpers;
import euler.comunes.ISolucion;

public class Problem032 implements ISolucion {

	public static void main(String[] args) {

		Problem032 p32 = new Problem032();
		String resolver = p32.resolver();
		System.out.println(resolver);
	}

	@Override
	public String resolver() {

		Set<Integer> candidatos = new HashSet<Integer>();
		ArrayList<String> cadenas = Helpers.permutaciones("123456789");

		// Harcodeo los limites por que tampoco es tanto problema

		for (String modelo : cadenas) {
			for (int i = 1; i <= 7; i++) {

				for (int j = i + 1; j < 9; j++) {

					int multiplicand = Integer.valueOf(modelo.substring(0, i));
					int multiplicador = Integer.valueOf(modelo.substring(i, j));
					int test = Integer.valueOf(modelo.substring(j));

					if (test == multiplicador * multiplicand) {
						candidatos.add(test);
					}
				}
			}

		}

		// genero la suma

		int resultado = 0;

		for (int num : candidatos) {
			resultado += num;
		}

		// TODO Auto-generated method stub
		return String.valueOf(resultado);
	}

}
