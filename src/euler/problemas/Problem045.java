package euler.problemas;

import java.math.BigInteger;

import euler.comunes.Helpers;
import euler.comunes.ISolucion;

public class Problem045 implements ISolucion {

	public static void main(String[] args) {
		Problem045 p45 = new Problem045();
		String resolver = p45.resolver();
		System.out.println(resolver);

	}

	@Override
	public String resolver() {

		// inicializo directamente en los numeros siguientes a los del
		// planteamiento
		
		//Hay que usar BigInteger

		BigInteger iT = BigInteger.valueOf(286);
		BigInteger iP = BigInteger.valueOf(166);
		BigInteger iH = BigInteger.valueOf(144);

		BigInteger nT = Helpers.numeroTriangular(iT);
		BigInteger nP = Helpers.numeroPentagonal(iP);
		BigInteger nH = Helpers.numeroHexagonal(iH);

		while (true) {

			
			if (nT.compareTo(nH)==-1){	
				iT = iT.add(BigInteger.ONE);
				nT = Helpers.numeroTriangular(iT);
			}
			if (nT.compareTo(nH)==+1) {
				iH= iH.add(BigInteger.ONE);
				nH = Helpers.numeroHexagonal(iH);
			}
			if (nT.compareTo(nH)==0) {
				if (iP.compareTo(iH) ==-1) {
					iP = iH;
				}
				while (nP.compareTo(nH)==-1) {
					iP = iP.add(BigInteger.ONE);
					nP = Helpers.numeroPentagonal(iP);
					if (nP.equals(nH)) {
						return String.valueOf(nH);
					}
				}

			    iT= iT.add(BigInteger.ONE);
			    nT = Helpers.numeroTriangular(iT);
			}

			System.out.println(nT+" "+nH);
		}

	}
}
