import java.util.Scanner;

public class AxelArroyoGimenezSumaRestaCociente {
	public static void main(String[] args) {

		/*
		 * Algorisme que demani dos números i calculi la seva suma, el seu producte, la
		 * seva resta i el seu quocient.
		 * 
		 */

		// Creamos el scanner
		Scanner teclado = new Scanner(System.in);

		// Creacion de las variables generales
		int numeroUno = 0;
		int numeroDos = 0;

		// Variables de las operaciones
		int suma = 0;
		int producto = 0;
		int resta = 0;
		int cociente = 0;

		// Pedimos al usuario que introduzca los dos numeros

		System.out.println("Introduce un numero: ");
		numeroUno = teclado.nextInt();

		System.out.println("Introduce otro numero: ");
		numeroDos = teclado.nextInt();

		// Empezamos con las operaciones

		suma = numeroUno + numeroDos;
		producto = numeroUno * numeroDos;
		resta = numeroUno - numeroDos;
		cociente = numeroUno / numeroDos;

		// Los numeros que eligio el usuario

		System.out.println("El primer numero es: " + numeroUno);
		System.out.println("El segundo numero es: " + numeroDos);

		// Damos el resultado a los usuarios
		System.out.println("------------------------------------");
		System.out.println("La suma de la operacion es: " + suma);
		System.out.println("El producto de la operacion es: " + producto);
		System.out.println("La resta de la operacion es: " + resta);
		System.out.println("El cociente de la operacion es: " + cociente);

		// Cerramos el teclado
		teclado.close();
	}
}
