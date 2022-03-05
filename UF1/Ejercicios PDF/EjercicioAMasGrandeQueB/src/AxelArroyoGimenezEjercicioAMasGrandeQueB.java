import java.util.Scanner;

public class AxelArroyoGimenezEjercicioAMasGrandeQueB {
	public static void main(String[] args) {

		/*
		 * Algorisme que demani dos números a i b e indiqui si a es més gran que b o no
		 * 
		 */

		// Creamos las variables
		int numeroA = 0;
		int numeroB = 0;

		// Creamos el scanner
		Scanner teclado = new Scanner(System.in);

		// Pedimos al usuario que introduzca un numero
		System.out.println("Por favor, introduce un numero: ");
		numeroA = teclado.nextInt();

		System.out.println("Por favor, introduce otro numero: ");
		numeroB = teclado.nextInt();

		// Empezamos con el ejercicio

		if (numeroA > numeroB) {
			System.out.println(numeroA + " Es mayor que: " + numeroB);
		} else if (numeroB > numeroA) {
			System.out.println(numeroB + " No es mayor que: " + numeroA);
		}

		// Cerramos el teclado
		teclado.close();

	}
}
