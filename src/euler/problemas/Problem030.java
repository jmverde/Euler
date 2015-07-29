package euler.problemas;

import java.util.HashSet;
import java.util.Set;

import euler.comunes.ISolucion;

public class Problem030 implements ISolucion {

	public static void main(String[] args) {
		Problem030 p30 = new Problem030();
		String resolver = p30.resolver();
		System.out.println(resolver);

	}

	@Override
	public String resolver() {

		int LIMITE = 354294;

		Set<Integer> numeros = new HashSet<Integer>();

		for (int i = 2; i <= LIMITE; i++) {

			int test = 0;
			test += Math.pow((i % 10), 5);
			test += Math.pow((i / 10) % 10, 5);
			test += Math.pow((i / 100) % 10, 5);
			test += Math.pow((i / 1000) % 10, 5);
			test += Math.pow((i / 10000) % 10, 5);
			test += Math.pow((i / 100000) % 10, 5);

			if (i == test) {
				numeros.add(i);
			}
		}

		int resultado=0;
		for(int i:numeros){
			resultado+=i;
		}
		
		
		return String.valueOf(resultado);
	}
}
