import java.util.Random;
import java.util.Scanner;

public class AxelArroyoGimenez_primitiva_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ahora vamos a jugar a la �Loter�a primitiva�. Para ello, se pedir� al usuario
		 * que introduzca 6 n�meros enteros comprendidos entre el 1 y el 49 ambos
		 * incluidos. No estar� permitido repetir n�mero. Una vez elegidos los seis
		 * n�meros el programa nos mostrar� nuestros 6 n�meros as� como la combinaci�n
		 * ganadora (ordenada de menor a mayor). Esta combinaci�n constar� de 6 n�meros
		 * entre 1 y 49 elegidos al azar por el programa. Finalmente nos dir� cu�ntos
		 * aciertos hemos tenido y nos preguntar� si queremos volver a jugar.
		 * 
		 */

		// Creamos el Scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables necesarias
		int vector[] = new int[6];
		int numeroUsuario = 0;
		Random aleatorio = new Random();

		System.out.println(
				"�Bienvenidx! Este programa sirve para jugar a la loteria.\nPor favor, introduce seis n�meros entre 1 y 49");

		for (int i = 0; i < vector.length; i++) {

			System.out.println("Escribe el numero " + (i + 1));
			numeroUsuario = teclado.nextInt();
			while (numeroUsuario < 1 || numeroUsuario > 49) {
				System.out
						.println("El n�mero que has introducido tiene un valor incorrecto, introduce otro por favor: ");
				numeroUsuario = teclado.nextInt();
			}

			for (int j = 0; j < i; j++) {
				
					if (vector[j] == vector[i]) {
						System.out.println("El numero que has introducido es incorrecto! Introduce uno diferente: ");
						numeroUsuario = teclado.nextInt();
					}
				}

			}

		}

	}

}
