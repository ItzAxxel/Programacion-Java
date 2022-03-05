import java.util.Scanner;

public class AxelArroyoGimenezEjercicioMayorOIgualQue10 {
	public static void main(String[] args) {

		/*
		 * Algorisme que demani un número i digui si es més gran que 10 o més petit o
		 * igual que 10.
		 * 
		 */

		// Crearemos el Scanner
		Scanner teclado = new Scanner(System.in);

		// Creacion de la variable
		int numero = 0;

		System.out.println("Introduce un numero: ");
		numero = teclado.nextInt();

		// Empezamos con los if
		if (numero > 10) {
			System.out.println(+numero + " Es mayor que 10");
		} else if (numero < 10) {
			System.out.println(+numero + " Es menor que 10");
		} else if (numero == 10) {
			System.out.println(+numero + " Es igual a 10");
		}
		// Cerramos el teclado
		teclado.close();
	}
}
