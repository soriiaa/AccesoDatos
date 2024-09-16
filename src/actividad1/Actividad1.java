package actividad1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Actividad1 {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Introduzca el nombre del archivo: ");
		String nombreArchivo = in.nextLine();
		
		
		
		File archivo = new File(nombreArchivo);
		
		try {
			if (archivo.createNewFile()) {
				System.out.println("El archivo " + nombreArchivo + " ha sido creado correctamente.");
			} else {
				System.out.println("El archivo ya existia.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	

}
