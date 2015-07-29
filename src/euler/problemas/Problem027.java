package euler.problemas;

import euler.comunes.Helpers;
import euler.comunes.ISolucion;

public class Problem027 implements ISolucion {

	public static void main(String[] args) {
		Problem027 p27 = new Problem027();
		String resolver = p27.resolver();
		System.out.println(resolver);
	}

	@Override
	public String resolver() {

		int asol=0;
		int bsol=0;
		int nsol=0;
		
		
		for (int a =-999;a<1000;a++){
			
			for (int b=-999;b<=1000;b++){
				
				int n = 0;
				
				while (true){
					
					int candidato = n*n+n*a+b;
					if (candidato<0){
						break;
					}
					if (!Helpers.esPrimo(candidato)){
						break;
					}
					
					n++;
					
				}
				
				if (n>nsol){
					nsol=n;
					asol=a;
					bsol=b;
				System.out.println(n+" "+a+" "+b);
				}
				
			}
			
		}
		
		
		return String.valueOf(asol*bsol);
	}
	
	
	
	
}
