import java.util.Scanner;

public class AxelArroyoGimenezEjercicio5NumerosMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Algorisme que demani cinc números i mostri els que siguin més gran que la
		 * mitja
		 * 
		 */

		// Incializamos el Scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int media = 0;

		// Pedimos al usuario que introduzca los datos

		System.out.println("Introduce el primer numero: ");
		num1 = teclado.nextInt();

		System.out.println("Introduce el segundo numero: ");
		num2 = teclado.nextInt();

		System.out.println("Introduce el tercer numero: ");
		num3 = teclado.nextInt();

		System.out.println("Introduce el cuarto numero: ");
		num4 = teclado.nextInt();

		System.out.println("Introduce el quinto numero: ");
		num5 = teclado.nextInt();

		// Cerramos el teclado
		teclado.close();

		// Iniciamos el programa

		media = (num1 + num2 + num3 + num4 + num5) / 5;

		System.out.println("----------------------");
		System.out.println("La media es: " + media);

		if (num1 > media) {
			System.out.println("El numero más grande de la media es: " + num1);
		}
		if (num2 > media) {
			System.out.println("El numero más grande de la media es: " + num2);
		}
		if (num3 > media) {
			System.out.println("El numero más grande de la media es: " + num3);
		}
		if (num4 > media) {
			System.out.println("El numero más grande de la media es: " + num4);
		}
		if (num5 > media) {
			System.out.println(" El numero más grande de la media es: " + num5);
		}
	}
}
