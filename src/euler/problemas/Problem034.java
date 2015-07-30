package euler.problemas;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

import euler.comunes.Helpers;
import euler.comunes.ISolucion;

// Ponemos un limite grosero de 2540160 a partir del valor de 9!, contando con el numero de 
// digitos, y a cual no se puede llegar

public class Problem034 implements ISolucion {

	public static void main(String[] args) {

		Problem034 p34 = new Problem034();
		String resolver = p34.resolver();
		System.out.println(resolver);
	}

	@Override
	public String resolver() {

		final int LIMIT = 2540160;

		Set<Integer> numeros = new HashSet<Integer>();

		// explicitamente se quitan 1 y 2
		for (int i = 3; i < LIMIT; i++) {

		
		BigInteger test = BigInteger.ZERO;

			for (int j = 0; j < Helpers.longitud(i); j++) {

				test=test.add(Helpers.factorial((int) ((i / ((int)Math.pow(10, j))) % 10)));
				

			}

			if (test.equals(BigInteger.valueOf(i))) {

				numeros.add(i);
			}

		}

		int resultado =0;
		
		for(int ii:numeros){
			resultado+=ii;
		}
		return String.valueOf(resultado);
	}

}
