import java.util.Scanner;

public class AxelArroyoGimenezEjercicioSumaPositivaNegativaZero {
	public static void main(String[] args) {

		/*
		 * Algorisme que demani dos números a i b e indiqui si la seva suma es positiva,
		 * negativa o zero.
		 * 
		 */

		// Creamos el Scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables
		int numeroA = 0;
		int numeroB = 0;

		// Pedimos al usuario que introduzca los datos

		System.out.println("Por favor, introduce un número: ");
		numeroA = teclado.nextInt();

		System.out.println("Por favor, introduce otro número: ");
		numeroB = teclado.nextInt();

		// Empezamos el programa

		if (numeroA + numeroB == 0) {
			System.out.println("La suma es 0");

		} else if (numeroA + numeroB < 0) {
			System.out.println("La suma es negativa");
		} else {
			System.out.println("La suma es positiva");
		}
		
		//Cerramos el teclado
		teclado.close();
		
	}
}
