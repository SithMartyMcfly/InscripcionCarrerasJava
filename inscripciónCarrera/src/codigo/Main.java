package codigo;

/**
 * Hemos generado una clase donde tenemos los métodos que vamos a usar en nuestro main
 * en él vamos haciendo llamadas y control de excepciones de los métodos usados*/

import java.io.IOException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		//iniciamos una clase Escritura, donde tenemos todos
		//los métodos necesarios para usar nuestro programa.
		Escritura es = new Escritura();
		Scanner sc = new Scanner(System.in);
		int dorsal = 1;
		boolean salida = true;
		
		//dentro de la estructura try/catch vamos a tener controlados todos los métodos 

		try {
			System.out.println("Introduce el nombre del Archivo que quieres escribir");
			String nombreArchivo = sc.next();

			String ruta = "../inscripciónCarrera/src/" + nombreArchivo + ".txt";
			// Crear Archivo
			es.crearArchivo(ruta);
			// Escribir cabeceras de columnas
			es.crearCabeceras(ruta);
			// Inicia switch para menu de opciones
			do {
				System.out.println("Introduce una opción (i) para INTRODUCIR datos, (e) para SALIR del programa");
				String opcion = sc.next();
				//Inicia switch que controla la salida del programa e introducir datos
				switch (opcion) {
				case "i":
					// Introducir datos
					es.introducirDatos(ruta, dorsal);
					dorsal++;
					break;
				case "e":
					// Salir del bucle
					salida = false;
					break;
				}
			} while (salida);
				//lanzamos las excepciones correspondientes
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("PROGRAMA FINALIZADO");
	}
}
