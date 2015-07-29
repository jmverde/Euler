package euler.problemas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;

import euler.comunes.Helpers;
import euler.comunes.ISolucion;

public class Problem022 implements ISolucion {

	public static void main(String[] args) {
		Problem022 p22 = new Problem022();
		String resolver = p22.resolver();
		System.out.println(resolver);

	}

	@Override
	public String resolver() {

		
		// esto es para testeo para saber donde estas, lo dejo por que puede hacer falta para tunear
		// el asunto para un mac
/*		try {
			System.out.println(new File(".").getCanonicalPath());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
*/

		String linea ="";
		try {
			linea = readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return("algo ha ido mal");
		}



		// una vez que tenemos la monstruolinea toca separarla en los nombres, lo que es facilito
		
		String[] nombres = linea.split(",");
		
			Arrays.sort(nombres);
		
		

	
		long suma =0;
			

		for (int i = 0 ; i<nombres.length;i++){
			
			suma += (i+1)*Helpers.valorPalabra(nombres[i]);
		}
		
	
			
			
			return String.valueOf(suma);
		
	}

	public String readFile() throws IOException {

		String path = "./data/p022_names.txt";

		FileReader archivo = new FileReader(path);

		BufferedReader leeArch = new BufferedReader(archivo);

		String salida = leeArch.readLine();

		archivo.close();

		return salida;
	}

}
