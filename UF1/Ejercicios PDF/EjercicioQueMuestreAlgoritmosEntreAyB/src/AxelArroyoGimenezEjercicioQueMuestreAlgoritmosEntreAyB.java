import java.util.Scanner;

public class AxelArroyoGimenezEjercicioQueMuestreAlgoritmosEntreAyB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Algorisme que mostri els números entre a i b (valors donats per l’usuari).
		 * 
		 */

		// Creamos el Scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables
		int numeroA = 0;
		int numeroB = 0;
		int numero = 0;

		// Comenzamos el ejercicio
		System.out.println("Introduce un número: ");
		numeroA = teclado.nextInt();

		numero = numeroA + 1;

		System.out.println("Introduce otro número: ");
		numeroB = teclado.nextInt();

		System.out.println("Los números entre A y B son: ");
		while (numeroA < numero && numeroB > numero) {
			System.out.println(numero);
			numero++;
		}

		// Cerramos el teclado
		teclado.close();
	}

}
