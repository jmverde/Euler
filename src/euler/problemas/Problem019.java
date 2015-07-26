package euler.problemas;

import euler.comunes.ISolucion;


public class Problem019 implements ISolucion{

	
	public static void main(String[] args) {
		Problem019 p19 = new Problem019();
		String resolver = p19.resolver();
		System.out.println(resolver);

	}

	@Override
	public String resolver() {
		int contador = 0;
		for (int year=1901;year<=2000;year++){
			
			for (int mes=1;mes<=12;mes++){
				
				if(diaSemana(1, mes, year)==1){
					contador++;
				}
			}
			
		}
		return String.valueOf(contador);
	}
	
	
	/**
	 * @author jm
	 * Implementa el algortimo de Zeller para el calendario juliano
	 * devuelve el dia de la semana en un formato  (0 = Saturday, 1 = Sunday, 2 = Monday, ..., 6 = Friday)
	 * Se cambia la formula de la wiki para que todos los terminos sean positivos (se pasa -2j a 5j 
	 * y asi no haya problemas con los modulos de numeros negativos
	 */
	
	
	
	
	private  int diaSemana(int d, int m, int y){
		
		// TODO check que el dia es correcto
		
		
		if (m==1 ||m ==2){	
			m=m+12;
			y=y-1;
					
		}
		
		int k = y%100;
		int j = y/100;
		
		int h = (d+ (26*(m+1))/10+k+k/4+j/4+5*j)%7;
				
		return h;
		
		
	}
}
