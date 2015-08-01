package euler.problemas;

import euler.comunes.ISolucion;

public class Problem039 implements ISolucion{

	public static void main(String[] args) {

		Problem039 p39 = new Problem039();
		String resolver = p39.resolver();
		System.out.println(resolver);
	}

	@Override
	public String resolver() {
	

		// uso como notacion a el cateto pequeño, b el mayor c la hipotenusa y p el perimetro	
		int pcandidato=0;
		int ncandidato=0;
		
		
		for (int p=4; p<=1000; p++){
			
			int n=0;
			
			for (int a=1;a<=p/2;a++){
				for (int b = a; b<=p-a;b++){
					int c= p-a-b;
					
					if (c*c==(a*a+b*b)){
						n++;
					}
				}
				
			}
			
			if(n>ncandidato){
				pcandidato=p;
				ncandidato=n;
				
			}
			
		}


		return String.valueOf(pcandidato);
	}
	
}
