import java.util.Scanner;

public class AxelArroyoGimenezEjercicioSumaPromedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Algorisme que multipliqui dos n?meros introdu?ts per l?usuari utilitzant
		 * sumes successives
		 * 
		 */

		// Creamos el Scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables
		int numero = 0;
		int cantidad = 0;
		int suma = 0;
		int promedio = 0;

		// Empezamos el ejercicio
		System.out.println("Cuantos n?meros quieres introducir:  ");
		cantidad = teclado.nextInt();

		for (int i = 0; i < cantidad; i++) {
			System.out.println("Introduce el suiguiente n?mero: ");
			numero = teclado.nextInt();
			promedio++;
		}

		suma = numero + cantidad;

		// Cerramos el teclado
		teclado.close();

		System.out.println("El resultado de la suma es: " + suma);
		System.out.println("El promedio es: " + promedio);
	}

}
