package euler.problemas;

import euler.comunes.Helpers;
import euler.comunes.ISolucion;

public class Problem015 implements ISolucion {

	static final int LADO=20;
	
	
	public static void main(String[] args) {
		Problem015 p15 = new Problem015();
		String resolver = p15.resolver();
		System.out.println(resolver);

	}

	@Override
	public String resolver() {
		
		return Helpers.binomial(2*LADO, LADO).toString();
	}
	
	
}
