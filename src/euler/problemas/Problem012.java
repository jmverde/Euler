package euler.problemas;

import euler.comunes.ISolucion;

public class Problem012 implements ISolucion {

	public static void main(String[] args) {

		Problem012 p12 = new Problem012();
		String resolver = p12.resolver();
		System.out.println(resolver);
	}

	@Override
	public String resolver() {
		final int limite = 500;
		int triangular = 0;
		int i = 0;
		while (true) {
			i++;
			triangular += i;
			if (contarDivisores(triangular) > limite) {
				return (String.valueOf(triangular));
			}


		}

	}

	private int contarDivisores(int nn) {

		int limite = (int) Math.sqrt((double) nn);
		int divisores = 0;

		for (int i = 1; i < limite; i++) {

			if (nn % i == 0) {
				divisores += 2;
			}
			
		}
		
		if (nn == limite*limite){
			divisores++;
		}
		return(divisores);
	}
}
