package euler.comunes;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * @author Radiofisica
 *
 */
public class Helpers {

	public static int longitud(int numero) {

		return (String.valueOf(numero).length());

	}

	public static int longitud(BigInteger numero) {

		return (String.valueOf(numero).length());

	}

	// Esto habria que reescribirlo usando un hasshet para que no se puedan
	// repetir

	public static ArrayList<Integer> divisores(int numero) {

		ArrayList<Integer> divisores = new ArrayList<Integer>();

		int limite = (int) Math.sqrt((double) numero);

		// En este problema un numero no se considera divisor de si mismo asi
		// que
		// hay que meter el 1 a pelo

		divisores.add(1);

		for (int i = 2; i <= limite; i++) {

			if (numero % i == 0) {
				divisores.add(i);
				if (numero != i * i) {
					divisores.add(numero / i);
				}
			}
		}

		return divisores;

	}

	
	public static boolean esPrimo(int n){
		return (divisores(n).size()==1);
	}
	
	
	
	
	/*
	 * Calcula el factorial de un entero uso biginteger para no tener problemas
	 * de digitos
	 */

	public static BigInteger factorial(int n) {

		if (n <= 1) {
			return BigInteger.ONE;
		} else {
			return BigInteger.valueOf(n).multiply(factorial(n - 1));
		}

	}

	// Returns n choose k.
	public static BigInteger binomial(int n, int k) {
		return factorial(n).divide(factorial(n - k).multiply(factorial(k)));
	}

	public static int valorLetra(char c) {

		if ((c >= 'A') && (c <= 'Z')) {

			return c - 'A' + 1;
		}

		if ((c >= 'a') && (c <= 'z')) {
			return c - 'a' + 1;
		}

		return 0;

	}

	public static int valorPalabra(String palabra) {
		int valor = 0;

		for (char l : palabra.toCharArray()) {
			valor += valorLetra(l);
		}

		return valor;
	}

	// Esto es un simple capsula para la de verdad, que es la de dos argumentos

	public static ArrayList<String> permus = new ArrayList<String>();

	public static ArrayList<String> permutaciones(String cadena) {

		permus.clear();
		doPermutaciones("", cadena);

		return permus;
	}

	public static void doPermutaciones(String prefijo, String cadena) {

		int n = cadena.length();

		if (n == 0) {
			permus.add(prefijo);
		}

		else {
			for (int i = 0; i < n; i++) {

				doPermutaciones(prefijo + cadena.charAt(i), cadena.substring(0, i) + cadena.substring(i + 1));
			}
		}

	}

}
