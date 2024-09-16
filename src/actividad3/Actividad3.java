package actividad3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Actividad3 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Escriba el nombre del archivo a leer: ");
		String nombreArchivo = in.nextLine();
		
		try {
			
			FileReader fr = new FileReader(nombreArchivo);
			char caracter;
			int numero = 0;
			
			do {
				numero = fr.read();
				caracter = (char) numero;
				System.out.print(caracter);
			} while (numero != -1);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
