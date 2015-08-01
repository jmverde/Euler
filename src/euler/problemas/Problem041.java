package euler.problemas;

import java.util.List;

import euler.comunes.Helpers;
import euler.comunes.ISolucion;

public class Problem041 implements ISolucion {
	
	public static void main(String[] args) {

		Problem041 p41 = new Problem041();
		String resolver = p41.resolver();
		System.out.println(resolver);
	}

	@Override
	public String resolver() {
		int solucion = 0;
		//Para pandigital 9 no hay primos puesto que todos los pandigital 9 y pandigital 8  son multiplos de 3
		List<String> candidatos = Helpers.permutaciones("1234567");
		
		for(String candidato:candidatos){
			int candidatoNum=Integer.valueOf(candidato);
			
			if(Helpers.esPrimo(candidatoNum)){
				if(candidatoNum>solucion){
					solucion=candidatoNum;
				}
			}
			
		}
		
		return String.valueOf(solucion);
	}
}
