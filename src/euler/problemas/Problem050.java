package euler.problemas;

import java.util.ArrayList;
import java.util.List;

import euler.comunes.Helpers;
import euler.comunes.ISolucion;

public class Problem050 implements ISolucion {

	public static void main(String[] args) {

		Problem050 p50 = new Problem050();
		String resolver = p50.resolver();
		System.out.println(resolver);
	}

	@Override
	public String resolver() {

	
		List<Integer> primos = new ArrayList<Integer>();
		
		primos.add(2);
		
		for (int n=3;n<1000000;n=n+2){
			if(Helpers.esPrimo(n)){
				primos.add(n);
			}
		}
		
		
//		La idea seria ir contando de atras adelante, pero entonces no se si se puede hacer algo que no sea fuerza bruta
	
		
//    El primer paso es evidente
		
		
//		int solucion = 1;
//
//		int acumula = 0;
//		int nAcumula = 0;
//		int nSolucion = 0;
//
//		for (int n = 3; n <= 1000000; n = n + 2) {
//			if (Helpers.esPrimo(n)) {
//				acumula += n;
//				nAcumula++;
//				if (Helpers.esPrimo(acumula)) {
//					if (nAcumula > nSolucion) {
//						solucion = acumula;
//						nSolucion = nAcumula;
//					}
//
//				}
//			} else {
//				acumula = 0;
//				nAcumula = 0;
//
//			}
//
//		}

		return null;
	//	return String.valueOf(solucion);
	}

	
	private Integer maxLista(List<Integer> numeros){
		
	}
	
	
}


