import java.util.Scanner;

public class AxelArroyoGimenezNnumerosMasPeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Algorisme que demani n n?meros (n donat per l?usuari) i calculi el menor
		 * d?ells.
		 * 
		 */

		// Creamos el Scanner
		Scanner teclado = new Scanner(System.in);

		// creacion de variables
		int cantidadDeNumeros = 0; // Esta variable la usaremos para contar las veces que imprentara por pantalla
		int num = 0; // variable donde guardaremos el mayor y menor
		int menor = 0; // variable para unicamente guardar el menor

		System.out.println("Introduce el numero de veces que quieras poner el numero: ");
		cantidadDeNumeros = teclado.nextInt();

		System.out.println("Introduce el numero: ");
		num = teclado.nextInt();

		menor = num; // igualamos el menor a la variable num

		for (int i = cantidadDeNumeros - 1; i <= cantidadDeNumeros; i++) { // El bucle se repetir? hasta que i sea menor
																			// o igual a la cantidad de numeros
			System.out.println("Introduce el numero: ");
			if (num < menor) {
				menor = num;
			}
		}

		System.out.println("El numero menor es: " + menor);
		teclado.close();
	}
}