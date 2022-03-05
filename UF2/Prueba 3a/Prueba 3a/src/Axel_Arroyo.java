import java.util.Random;

public class Arroyo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables

		Random rand = new Random();
		int[] pares = new int[25];
		int[] valores = null;
		int valor = 0;

		// Bucle para rellenar el array de "pares"
		for (int x = 0; x < pares.length; x++) {
			pares[x] = rand.nextInt(10) + 1;
			while (pares[x] % 2 == 1) { // Mientras no sean pares, se volverá a randomizar un número
				pares[x] = rand.nextInt(10) + 1;
			}

			// Mostramos al usuario los números pares
			System.out.println(pares[x]);
		}

		// Funciones
		CalculGran(pares);
		CalculUltim(valores, valor, pares, rand, valor);
	}

	public static int CalculGran(int[] pares) {

		/*
		 * Esta función sirve para calcular el numero más grande del array
		 * 
		 */

		int mayor = 0;

		// Miramos numero por número y lo guardamos en la variable de "Mayor"
		for (int i = 1; i < pares.length; i++) {
			if (pares[i] > mayor) {
				mayor = pares[i];
			}
		}

		// Mostramos al usuario el resultado

		System.out.println("------------------------");
		System.out.println("El mayor es: " + mayor);

		return mayor;

	}

	public static void CalculUltim(int[] valores, int valor, int[] pares, Random rand, int mayor) {

		/*
		 * Esta función sirve para calcular el número más grande de la posición impar
		 * 
		 */

		int resultado = 0;
		int impar = 0;

		// Miramos numero por número y lo guardamos en la variable de "Mayor"
		for (int i = 0; i < pares.length; i++) {
			if (pares[i] > mayor) {
				mayor = pares[i];
			}
			if (pares[i] % 2 == 1) {
				// Hacemos el calculo y mostramos el resultado
				resultado = mayor + impar;
				System.out.println("----------------------------------------------");
				System.out.println("El resultado del apartado h es: " + resultado);
			}

		}

	}
}
