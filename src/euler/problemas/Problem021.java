package euler.problemas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import euler.comunes.ISolucion;

/**
 * @author jmverde
 * 
 */

public class Problem021 implements ISolucion {

	public static void main(String[] args) {
		Problem021 p21 = new Problem021();
		String resolver = p21.resolver();
		System.out.println(resolver);
	}

	// si se quiere adaptar a java 8 aqui tocaria un
	// @Override
	public String resolver() {

		// como no quiero elementos repetidos en los numeros uso un set

		HashSet<Integer> numerosAmigables = new HashSet<Integer>();

		for (int i = 1; i <= 10000; i++) {

			int candidato = 0;
			for (int jj : divisores(i)) {

				candidato += jj;
			}

			if (i != candidato) {

				int test = 0;

				for (int jj : divisores(candidato)) {

					test += jj;
				}

				if (test == i) {
					numerosAmigables.add(i);
					numerosAmigables.add(candidato);

				}

			}

		}

		
		// Una vez que tenemos la lista de numeros amigables los sumamos 
		
		int resultado=0;
		for (int i:numerosAmigables){
			resultado+=i;
		}

		return String.valueOf(resultado);
		
		
	}

	/**
	 * @author jmverde Devuelve todos los divisores de un numero menos si mismo,
	 *         esto tiene que ver con el planteamiento del problema, hago clase
	 *         aparte por que en otros casos lo considera al contrario
	 */

	private static ArrayList<Integer> divisores(int numero) {

		ArrayList<Integer> divisores = new ArrayList<Integer>();

		int limite = (int) Math.sqrt((double) numero);

		// En este problema un numero no se considera divisor de si mismo asi
		// que
		// hay que meter el 1 a pelo

		divisores.add(1);

		for (int i = 2; i <= limite; i++) {

			if (numero % i == 0) {
				divisores.add(i);
				divisores.add(numero / i);
			}
		}

		return divisores;

	}
}
