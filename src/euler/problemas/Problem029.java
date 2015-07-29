package euler.problemas;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

import euler.comunes.ISolucion;

public class Problem029 implements ISolucion {

	public static void main(String[] args) {
		Problem029 p29 = new Problem029();
		String resolver = p29.resolver();
		System.out.println(resolver);
	}
	
	
	
	
	@Override
	public String resolver() {
		Set<BigInteger> resultados = new HashSet<BigInteger>();
		
		int limit_a = 100;
		int limit_b =100;
				
		for (int a=2;a<=limit_a;a++){
			for (int b=2;b<=limit_b;b++){
				resultados.add(BigInteger.valueOf(a).pow(b));
			}
		}
		
		
		// TODO Auto-generated method stub
		return String.valueOf(resultados.size());
	}

}
