package actividad5;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Actividad5 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Escriba un número: ");
		int numero = in.nextInt();
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("datos.bin");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
        DataOutputStream dos = new DataOutputStream(fos);
        
        try {
			dos.writeInt(numero);
			System.out.println("Datos introducidos con éxito.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
