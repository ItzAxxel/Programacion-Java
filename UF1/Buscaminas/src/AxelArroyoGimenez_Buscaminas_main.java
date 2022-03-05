//Axel Arroyo Giménez

import java.util.Random;
import java.util.Scanner;

public class AxelArroyoGimenez_Buscaminas_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos el Scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables necesarias
		Random rand = new Random(); // Variable para los números aleatorios de la tabla
		int table[][] = new int[10][10]; // Variable para la tabla con minas
		int tableUser[][] = new int[10][10]; // Variable para la tabla sin minas
		int row = -1; // Variable para las filas
		int column = -1; // Variable para las columnas
		int percentage = 0; // Variable para el tanto porciento que nos pide el ejercicio, es decir 10.
		boolean Bomberman = true; // Comprobar si hay mina o no
		boolean TryCatch = true; // TryCatch para comprobar valores extraños

		// Explicamos de que va el programa
		System.out.println("¡Bienvendix! Este programa está hecho para jugar al mítico juego de Buscaminas.\n");

		// Tabla con minas
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				percentage = rand.nextInt(9); // Numero del 0 al 10
				if (percentage == 1) {
					table[i][j] = 1;
				} else {
					table[i][j] = 0;
				}

			}
		}

		// Si el usuario no ha tocado bomba, se repetirá
		while (Bomberman) {
			// Tabla sin minas
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					System.out.print("  " + tableUser[i][j] + "");

				}
				System.out.println();
			}

			// Mientras la fila sea menor a 0 o mayor a 9 se repetira
			while (row < 0 || row > 9) {
				do {
					TryCatch = true;
					try {
						System.out.println("\nIntroduce la fila: ");
						row = Integer.parseInt(teclado.nextLine());

					} catch (Exception e) {
						System.out.println("Valor incorrecto.");
						TryCatch = false;

					}
				} while (!TryCatch);
			}

			// Mientras la colimna sea menro a 0 o mayor a 9 se repetira
			while (column < 0 || column > 9) {
				do {
					TryCatch = true;
					try {
						System.out.println("Introduce la columna: ");
						column = Integer.parseInt(teclado.nextLine());

					} catch (Exception e) {
						System.out.println("Valor incorrecto.");
						TryCatch = false;

					}
				} while (!TryCatch);
			}

			// Comprobamos las posiciones si hay mina o no
			if (table[row][column] == 1) {
				tableUser[row][column] = 3;
				System.out.println("Has perdido. ¡Más suerte la próxima!");
				Bomberman = false;
			} else {
				tableUser[row][column] = 2;
				System.out.println("No hay bomba.");
			}

			row = -1; // reinciar las variables a su valor inicial
			column = -1; // reinciar las variables a su valor inicial
		}

		// Cerramos telcado
		teclado.close();
	}

}
