package codigo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Escritura {

	
	//Método que genera archivo
	public void crearArchivo (String ruta) throws IOException {
		/*añadimos ruta y nombre del archivo por el string*/
		File archivoInscripcion = new File (ruta);
		
		//verificamos que exista y si no creamos el archivo
		if (archivoInscripcion.exists()) {
			System.out.println("El archivo ESTABA creado");
		} else {	
				archivoInscripcion.createNewFile();
				System.out.println("El archivo HA SIDO creado");
			}
		}
	
	//Método que genera las cabeceras de las columnas
	public void crearCabeceras (String ruta) throws IOException {
		
		FileOutputStream f1 = new FileOutputStream(ruta);
		OutputStreamWriter f1sw= new OutputStreamWriter(f1);
		
		f1sw.write("Dorsal; Nombre; Modelo\n");
		
		f1sw.close();
		f1.close();
	}
	
	//Método que escribe los datos
	public void introducirDatos (String ruta, int dorsal) throws IOException {
		/*iniciamos un objeto FileOutputStream, al que le pasamos la ruta donde debe crear el fichero
		con el boolean le decimos que debe ir escribiendo en el mismo archivo, es decir poner el puntero
		al final del archivo para seguir escribiendo*/
		FileOutputStream f2 = new FileOutputStream(ruta, true);
		OutputStreamWriter f2sw = new OutputStreamWriter(f2);
		Scanner sc = new Scanner (System.in);
		//pedimos al usuario los datos
		System.out.println("Introduce APELLIDO del corredor");
		String apellidos = sc.next();
		System.out.println("Introduce NOMBRE del corredor");
		String nombre = sc.next();
		System.out.println("Introduce MODELO del VEHÍCULO");
		String modelo = sc.next();
		
		//escribimos en una línea todos los datos, dando el formato adecuado
		f2sw.write(dorsal+ ";" +apellidos + ", " + nombre +  ";" + modelo + ";" + "\n");
		
	
		f2sw.close();
		f2.close();
			
	}
		
	}

