import java.util.Scanner;

public class AxelArroyoGimenezEjercicioDosNumerosABMasPeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Algorisme que demani dos n�meros, a i b, i conti des del m�s petit al m�s
		 * gran
		 * 
		 */

		// Creamos el Scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables
		int numeroA = 0;
		int numeroB = 0;
		int numero = 0;

		// Comenzamos el ejercicio
		System.out.println("Introduce un n�mero: ");
		numeroA = teclado.nextInt();

		numero = numeroA + 1;

		System.out.println("Introduce otro n�mero: ");
		numeroB = teclado.nextInt();

		System.out.println("Los n�meros entre A y B son: ");
		while (numeroA < numero && numeroB > numero) {
			System.out.println(numero);
			numero++;
		}

		// Cerramos el teclado
		teclado.close();

	}

}
