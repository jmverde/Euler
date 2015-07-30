

package euler.problemas;

import java.util.ArrayList;

import euler.comunes.ISolucion;

/**
 * @author Radiofisica
 * En realidad el unico problema que tiene este problema es comprobar como se van
 * generando los numeros de las esquinas
 * partimos de 1 y se añade cuatro veces 2 para tener las esquinas del de lado 3
 * despues se añade cuatro veces 4 para tener las de lado 5
 * etc
 * y en realidad se podria hacer con papel y boli en 5 minutos
 */
public class Problem028 implements ISolucion {
	
	public static void main(String[] args) {
		Problem028 p28 = new Problem028();
		String resolver = p28.resolver();
		System.out.println(resolver);
	}

	@Override
	public String resolver() {
		ArrayList<Integer> esquinas = new ArrayList<Integer>();
	
		int numero=1;
		esquinas.add(numero);
		
		for (int incremento=2;incremento<=1000;incremento=incremento+2){
			
			for (int i = 0; i<=3;i++){
				
				numero+=incremento;
				esquinas.add(numero);
			}
			
			
		}
		
		int suma = 0;
		
		for (int i:esquinas){
			suma+=i;
		}
		
		return String.valueOf(suma);
	}
	
	
}
