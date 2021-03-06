package euler.comunes;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

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

	public static boolean esPrimo(int n) {
		return (divisores(n).size() == 1);
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

	private static ArrayList<String> permus = new ArrayList<String>();

	public static ArrayList<String> permutaciones(String cadena) {

		permus.clear();
		doPermutaciones("", cadena);

		return permus;
	}

	private static void doPermutaciones(String prefijo, String cadena) {

		int n = cadena.length();

		if (n == 0) {
			permus.add(prefijo);
		}

		else {
			for (int i = 0; i < n; i++) {

				doPermutaciones(prefijo + cadena.charAt(i),
						cadena.substring(0, i) + cadena.substring(i + 1));
			}
		}

	}

	public static boolean esPandigital(String candidato) {

		return esPandigital(candidato, 1, 9);
	}

	public static boolean esPandigital(String candidato, int j) {

		return esPandigital(candidato, 1, j);
	}

	public static boolean esPandigital(String candidato, int i, int j) {

		if (candidato.length() != (j - i + 1)) {
			return false;
		}

		// Creamos un patron

		String patron = "";
		for (int ii = i; ii <= j; ii++) {
			patron += ii;
		}

		// Comparamos con el patron

		char[] test = candidato.toCharArray();
		Arrays.sort(test);

		return new String(test).equals(patron);
	}

	/*
	 * Generamos los numeros triagular, pentagonal y exagonal en int y
	 * BigInteger
	 */

	public static int numeroTriangular(int n) {
		return (n * (n + 1)) / 2;
	}

	public static BigInteger numeroTriangular(BigInteger n) {

		return n.multiply(n.add(BigInteger.ONE)).divide(BigInteger.valueOf(2));

	}

	public static int numeroPentagonal(int n) {
		return (n * (3 * n - 1)) / 2;
	}

	public static BigInteger numeroPentagonal(BigInteger n) {

		return n.multiply(
				BigInteger.valueOf(3).multiply(n).add(BigInteger.valueOf(-1)))
				.divide(BigInteger.valueOf(2));

	}

	public static int numeroHexagonal(int n) {
		return n * (2 * n - 1);
	}

	public static BigInteger numeroHexagonal(BigInteger n){
		return n.multiply(BigInteger.valueOf(2).multiply(n).add(BigInteger.valueOf(-1)));
	}
}

