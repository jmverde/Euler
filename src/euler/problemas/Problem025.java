package euler.problemas;

import java.math.BigInteger;

import euler.comunes.Helpers;
import euler.comunes.ISolucion;

public class Problem025 implements ISolucion {

	public static void main(String[] args) {
		Problem025 p25 = new Problem025();
		String resolver = p25.resolver();
		System.out.println(resolver);

	}

	@Override
	public String resolver() {
		
		BigInteger fibbo = BigInteger.ONE;
		BigInteger fibbo_ant= BigInteger.ONE;
		BigInteger nuevo = BigInteger.ZERO ;
		
		int indice = 2; 
		
		while(true){
			
		indice++;
		
		nuevo = fibbo.add(fibbo_ant); 
		
	//	System.out.println(nuevo + "es " + Helpers.longitud(nuevo));
		
/*		if (indice == 100){
			return("patata");
		}
*/
		
		if (Helpers.longitud(nuevo)==1000){
			return (String.valueOf(indice));
		}
		
		fibbo_ant = fibbo;
		fibbo =  nuevo ;
		
		
			
		}
		
	}

}
