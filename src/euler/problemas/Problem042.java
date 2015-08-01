package euler.problemas;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

import euler.comunes.Helpers;
import euler.comunes.ISolucion;

public class Problem042 implements ISolucion{

	
	public static void main(String[] args) {
		Problem042 p42 = new Problem042();
		String resolver = p42.resolver();
		System.out.println(resolver);

	}
	
	@Override
	public String resolver() {
		
		HashSet<Integer> patron =numerosTriangulares(59);
		
		String linea ="";
		try {
			linea = readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return("algo ha ido mal");
		}
		// TODO Auto-generated method stub
		
		
		String[] palabras =linea.split(",");
		
		
		int resultado = 0;
		
		for(String palabra:palabras){
			if (patron.contains(Helpers.valorPalabra(palabra))){
				resultado +=1;
			}
		}
		
		
		
	return String.valueOf(resultado);
		
	}

	private String readFile() throws IOException {

		String path = "./data/p042_words.txt";

		FileReader archivo = new FileReader(path);

		BufferedReader leeArch = new BufferedReader(archivo);

		String salida = leeArch.readLine();

		archivo.close();

		return salida;
	}
	
	private HashSet<Integer> numerosTriangulares(int j){
		
		HashSet<Integer> triangulares = new HashSet<Integer>();
		
		for (int i =1;i<=j;i++){
			triangulares.add((i*(i+1))/2);
		}
		
		return triangulares;
		
	}
	
}
