package euler.problemas;

import euler.comunes.Helpers;
import euler.comunes.ISolucion;

public class Problem038 implements ISolucion {

	public static void main(String[] args) {
		Problem038 p38 = new Problem038();
		String resolver = p38.resolver();
		System.out.println(resolver);
	}

	@Override
	public String resolver() {

		int solucion = 0;

		for (int i = 2; i <= 987654321 / 2; i++) {

			String candidato = "";

			int n = 1;

			while (true) {

				candidato += (i * n);
				n++;

				if (Helpers.esPandigital(candidato)) {

					int intcandi = Integer.valueOf(candidato);

					if (intcandi > solucion) {
						solucion = intcandi;
					}
				}

				if (candidato.length() > 9) {
					break;
				}

			}

		}

		return String.valueOf(solucion);
	}

}
