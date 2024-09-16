package actividad2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Escriba el nombre del archivo a crear: ");
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
		
		System.out.print("Escriba un texto para insertar en el archivo: ");
		String contenidoArchivo = in.nextLine();
		
		try {
			FileWriter fw = new FileWriter(archivo);
			fw.write(contenidoArchivo);
			System.out.println("El texto ha sido insertado con éxito.");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
