import java.util.Scanner;

public class AxelArroyoGimenezEjercicioMostrarSumaNumerosImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Algorisme que mostri la suma dels n?meros imparells compresos entre dos
		 * valors num?rics sencers i positius introdu?ts per l?usuari.
		 * 
		 */

		// Creamos el Scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables
		int numeroUno = 0;
		int numeroDos = 0;
		int suma = 0;

		System.out.println("Introduce dos n?meros impares positivos y enteros por favor: ");
		numeroUno = teclado.nextInt();

		while (numeroUno > 0) {
			System.out.println("Introduce cuantos numeros quieres mostrar: ");
			numeroDos = teclado.nextInt();

			if (numeroUno % 2 == 0) {
				numeroUno += 1;
			}
			for (int i = numeroUno; i <= numeroDos; i += 2) {
				System.out.println(i);
				suma += i;
			}
			System.out.println("La suma es: " + suma);
		}
		teclado.close();
	}
}
