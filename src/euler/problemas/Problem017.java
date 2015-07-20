package euler.problemas;

import euler.comunes.ISolucion;

public class Problem017 implements ISolucion {

	public static void main(String[] args) {
		Problem017 p17 = new Problem017();
		String resolver = p17.resolver();
		System.out.println(resolver);
	}

	@Override
	public String resolver() {

		int solucion = 0;
		
		for (int i = 1; i <=1000; i++) {

			solucion += leerEnIngles(i).length(); 
		}
		// TODO Auto-generated method stub
		return String.valueOf(solucion);
	}

	final static String[] UNIDADES = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
	final static String[] DIECES = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
			"seventeen", "eighteen", "nineteen" };
	final static String[] DECENAS = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
			"ninety" };

	private String leerEnIngles(int numero) {

		if (numero < 0 || numero > 9999)
			throw new IllegalArgumentException();

		else if (numero < 100) {
			return leerPeques(numero);
		}

		else {

			String sol = "";

			if (numero >= 1000) {
				sol = sol + UNIDADES[numero / 1000] + "thousand";
			}

			// System.out.println(String.valueOf(numero) + "centena" +
			// String.valueOf((numero - 1000 * (numero / 1000))/100 ));

			if (((numero - 1000 * (numero / 1000)) / 100) != 0) {

				sol = sol + UNIDADES[(numero - 1000 * (numero / 1000)) / 100] + "hundred";
			}

			if (numero % 100 != 0) {

				sol = sol + "and" + leerPeques(numero % 100);
			}

			return sol;

		}

	}

	private String leerPeques(int numero) {

		if (numero == 0) {
			return "";
		}
		if (numero < 10) {
			return UNIDADES[numero];
		} else if (numero < 20) {
			return (DIECES[numero % 10]);
		}

		else if (numero < 100) {
			String sol = "";

			sol = DECENAS[numero / 10] + UNIDADES[numero % 10];
			return (sol);

		} else {
			return "patata";
		}
	}
}