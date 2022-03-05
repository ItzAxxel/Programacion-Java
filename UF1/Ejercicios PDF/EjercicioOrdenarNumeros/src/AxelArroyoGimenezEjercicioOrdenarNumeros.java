
import java.util.Scanner;

public class AxelArroyoGimenezEjercicioOrdenarNumeros {
	public static void main(String[] args) {
		/*
		 * Algorisme que demani tres números i els mostri ordenats.
		 */

		// Creamos el scanner
		Scanner teclado = new Scanner(System.in);

		// iniciamos las variables
		int numeroUno = 0;
		int numeroDos = 0;
		int numeroTres = 0;

		// Pedimos al usuario que introduzca los numeros

		System.out.println("Introduce el primer numero: ");
		numeroUno = teclado.nextInt();

		System.out.println("Introduce el segundo numero: ");
		numeroDos = teclado.nextInt();

		System.out.println("Introduce el tercer numero: ");
		numeroTres = teclado.nextInt();
		
		//Cerramos el teclado
		teclado.close();

		// Empezamos el programa

		if (numeroUno > numeroDos && numeroDos > numeroTres) {
			System.out.println("Mayor a menor: " + numeroUno + " , " + numeroDos + " , " + numeroTres);
		} else if (numeroUno > numeroTres && numeroTres > numeroDos) {
			System.out.println("Mayor a menor: " + numeroUno + " , " + numeroDos + ", " + numeroTres);
		} else if (numeroDos > numeroUno && numeroUno > numeroTres) {
			System.out.println("Mayor a menor: " + numeroDos + " , " + numeroUno + " , " + numeroTres);
		} else if (numeroDos > numeroTres && numeroTres > numeroUno) {
			System.out.println("Mayor a menor: " + numeroDos + " , " + numeroTres + " , " + numeroUno);
		} else if (numeroTres > numeroUno && numeroUno > numeroDos) {
			System.out.println("Mayor a menor: " + numeroTres + " , " + numeroUno + " , " + numeroDos);
		} else if (numeroTres > numeroDos && numeroDos > numeroUno) {
			System.out.println("Mayor a menor: " + numeroTres + " , " + numeroDos + " , " + numeroUno);
		}
	}
}
