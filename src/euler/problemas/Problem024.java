package euler.problemas;

import java.util.ArrayList;

import euler.comunes.Helpers;
import euler.comunes.ISolucion;

public class Problem024 implements ISolucion {

	
	public static void main(String[] args) {
		Problem024 p24 = new Problem024();
		String resolver = p24.resolver();
		System.out.println(resolver);

	}
	
	@Override
	public String resolver() {
		 
		ArrayList<String> numeros = Helpers.permutaciones("0123456789");
		
		// Se coloca solo por construccion, si no fuere asi habria que poner un sort

		return numeros.get(999999);
		
	}

}
