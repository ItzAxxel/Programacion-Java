import java.util.Scanner;

public class AxelArroyoGimenezEjercicioNumerosHastaNegativoo {
	public static void main(String[] args) {

		/*
		 * 
		 * Algorisme que demani números fins a que s’introdueixi un negatiu, aleshores
		 * s’ha d’indicar quants números s’han introduït.
		 * 
		 */

		// Creamos el Scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos la variable
		int numero = 0; // Esta es la variable donde se almacenarán los datos del usuario
		int comprobante = 0; // Esta es la variable que hará de comprobante para saber cuantos numeros se han
								// puesto

		// Pedimos al usuario que introduzca el numero
		System.out.println("Introduce un numero: ");
		numero = teclado.nextInt();

		for (comprobante = 0; numero > 0; comprobante++) { // Empezamos poniendo el comprobante a 0, luego ponemos la
															// condición de que si numero es mayor a 0
			System.out.println("Introduce otro número: "); // Deberá seguir pidiendo al usuario que introduzca un numero
															// negativo,
															// si no se cumple seguirá aumentando el contador
			numero = teclado.nextInt(); // Hasta que la condicion se cumpla
		}
		// Cerramos el teclado
		teclado.close();
		// Una vez el programa cumpla con la funcion de pedir hasta un negativo el
		// programa printará cuantos números han sido puestos
		// por el usuario
		System.out.println("------------------------------------------");
		System.out.println("Se han puesto: " + comprobante + " numeros");
	}
}
