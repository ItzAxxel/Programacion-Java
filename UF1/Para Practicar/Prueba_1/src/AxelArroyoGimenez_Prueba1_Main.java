//Axel Arroyo Giménez

import java.util.Scanner;
import java.util.Random;

public class AxelArroyoGimenez_Prueba1_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Mostrar un menú con las siguientes opciones ”1. Canal año”, “2. Canal
		 * Aleatorio” y “3. Salir”.
		 * 
		 * Si el usuario escoge la opción “1. Canal año”, se le irá pidiendo años al
		 * usuario hasta que introduzca un 0. Entonces se mostrará por pantalla el
		 * número de años pares, el número de años impares y cuantos años se han
		 * introducido.
		 * 
		 * Este menú se deberá mostrar continuamente hasta que el usuario seleccione
		 * salir.
		 * 
		 * Si el usuario escoge la opción “3.Salir”, no volverá a aparecer el menú y se
		 * mostrará cuantas veces se ha seleccionado la opción ”1. Canal año” y cuantas
		 * la opción “2. Canal Aleatorio”
		 * 
		 * Realiza todas las validaciones necesarias.
		 * 
		 */

		// Creamos el scanner
		Scanner teclado = new Scanner(System.in);

		// Variable random
		Random aleatorio = new Random();
		int random = 0;

		// Variables necesarias
		int elecionUsuario = 0;
		int canalAnos = 1;
		int canales = 0;
		int pares = 0;
		int impares = 0;
		int suma = 0;
		int media = 0;

		System.out.println("¡Bienvenidx! Selecione una opción por favor: \n");
		System.out.println("[1] Canal del año | [2] Canal Aleatorio | [3] Salir");
		elecionUsuario = teclado.nextInt();

		//Mientras la elecion del usuario sea diferente a 3 se repetira el bucle
		while (elecionUsuario != 3) {

			//Si el usuario elije algo mayor o menor a 3 se le pedira otro numero
			while (elecionUsuario > 3 || elecionUsuario <= -1) {
				System.out.println(
						"Solo tienes 3 eleciones. [1] Canal del año | [2] Canal Aleatorio | [3] Salir. Introduce de nuevo la que quieras: ");
				elecionUsuario = teclado.nextInt();
			}
			
			//Primera opcion
			if (elecionUsuario == 1 && canalAnos != 0) {

				System.out.println("Has elegido la primera opcion. Canal del año.");
				System.out.println("\nIntroduce años entre 1 y 2021 por favor: ");
				canalAnos = teclado.nextInt();
				canales++;

				while (canalAnos > 2021 || canalAnos <= -1) {
					System.out.println("El año que has introducido no es correcto, introduce uno de nuevo por favor: ");
					canalAnos = teclado.nextInt();
				}

				if (canalAnos % 2 == 0) {
					pares++;
				}
				if (canalAnos % 2 == 1) {
					impares++;
				}

				if (canalAnos == 0) {
					System.out.println("Has introducido: " + pares + " año(s) pares");
					System.out.println("Has introducido: " + impares + " año(s) impares");
					System.out.println("Has introducido: " + canales + " año(s)");
				}
			}

			/*
			 * Si el usuario escoge la opción “2.Canal Aleatorio”, genera 25 números
			 * aleatorios (del 0 al 100) y los muestra por pantalla, después muestra el
			 * valor promedio (media aritmética) de los 25 números.
			 * 
			 */

			
			//Segunda opcion
			if (elecionUsuario == 2) {
				System.out.println("Has elegido la 2 opción. Canal aleatorio");

				for (int i = 0; i <= 25; i++) {
					random = aleatorio.nextInt(100);
					System.out.println(random);
					suma = random + i;
					media = suma / 25;
				}
			}

			//La media de la 2 opcion
			System.out.println("La media es: " + media);

		}

		// Cerramos el teclado
		teclado.close();

	}

}
