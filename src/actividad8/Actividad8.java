package actividad8;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Escriba el nombre del archivo binario: ");
		String nombreArchivo = in.nextLine();
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(nombreArchivo);
			System.out.println("Datos leidos con éxito.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
        DataInputStream dis = new DataInputStream(fis);
        try {
			System.out.println(dis.readInt());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
