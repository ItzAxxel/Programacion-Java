import java.util.Scanner;

public class AxelArroyoGimenez3NumerosMedia {
	public static void main(String[] args) {

		/*
		 * Algorisme que calculi la mitja de tres números.
		 * 
		 */

		// Creamos el scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables

		int numeroUno = 0; // El primer numero introducido por el usuario
		int numeroDos = 0; // El segundo numero introducido por el usuario
		int numeroTres = 0; // El tercer numero introducido por el usuario
		int media = 0; // El calculo de la operacion (numeroUno + numeroDos + numeroTres) / 3

		// Pedimos al usuario que introduzca los datos

		System.out.println("Introduce el primer numero: ");
		numeroUno = teclado.nextInt();
		System.out.println("Introduce el segundo numero: ");
		numeroDos = teclado.nextInt();
		System.out.println("Introduce el tercer numero: ");
		numeroTres = teclado.nextInt();

		// Empezamos con la operacion

		media = (numeroUno + numeroDos + numeroTres) / 3;

		// Introducimos los numeros del usuario

		System.out.println("El primer numero es: " + numeroUno);
		System.out.println("El segundo numero es: " + numeroDos);
		System.out.println("El tercer numero es: " + numeroTres);

		// Mostramos por pantalla el resultado
		System.out.println("-----------------------");
		System.out.println("La media es: " + media);

		// Cerramos el teclado
		teclado.close();
	}
}
