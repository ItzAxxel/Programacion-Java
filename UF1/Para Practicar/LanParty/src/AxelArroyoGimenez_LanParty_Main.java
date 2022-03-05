//Axel Arroyo Giménez

import java.util.Scanner;

public class AxelArroyoGimenez_LanParty_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos el Scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables
		int numeroFilas = 0; // Esta variable la usaremos para el numero de filas
		int numeroColumnas = 0; // Esta variable la usaremos para el numero de columas
		boolean condicion = true; // Esta variable la usaremos para saber si las filas o columnas son 0

		// Explicamos de que va el programa
		System.out.println(
				"¡Bienvenidx! Este programa está creado con la intención de crear \nfilas y columnas que quiera el usuario.");

		// Mientras la condicion sea verdadera, se repetira
		while (condicion) {
			// Pedimos al usuario que introduzca el numero de filas
			System.out.println("\nIntroduce el número de filas que quieras introducir: ");
			numeroFilas = teclado.nextInt();

			// Pedimos al usuario que introduzca el número de columnas
			System.out.println("\nAhora introduce el número de columnas que quieras introducir: ");
			numeroColumnas = teclado.nextInt();
			System.out.println("\n");

			// Comprobamos si el número de filas y el número de columnas se pasa del limite
			while ((numeroFilas > 10 && numeroColumnas > 10) || (numeroFilas <= -1 && numeroColumnas <= -1)) {
				System.out.println("No se permiten valores de este tamaño.");
				System.out.println("Introduce el número de filas de nuevo por favor: ");
				numeroFilas = teclado.nextInt();
				System.out.println("Introduce el número de columnas de nuevo por favor: ");
				numeroColumnas = teclado.nextInt();

			}

			// Printamos por pantalla el resultado de las filas y las columnas
			for (int i = 0; i < numeroFilas; i++) {
				for (int j = 0; j < numeroColumnas; j++) {
					System.out.print(i + "" + j + " ");
				}
				System.out.println();
			}

			// Si el usuario pone un 0 en filas y columnas, la condicion será falsa y el
			// programa terminará
			if (numeroFilas == 0 && numeroColumnas == 0) {
				condicion = false;
			}
		}

		// Cerramos el teclado
		teclado.close();
	}

}
