import java.util.Scanner;

public class AxelArroyoGimenezEjercicioNumerosHastaNegativoo {
	public static void main(String[] args) {

		/*
		 * 
		 * Algorisme que demani n�meros fins a que s�introdueixi un negatiu, aleshores
		 * s�ha d�indicar quants n�meros s�han introdu�t.
		 * 
		 */

		// Creamos el Scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos la variable
		int numero = 0; // Esta es la variable donde se almacenar�n los datos del usuario
		int comprobante = 0; // Esta es la variable que har� de comprobante para saber cuantos numeros se han
								// puesto

		// Pedimos al usuario que introduzca el numero
		System.out.println("Introduce un numero: ");
		numero = teclado.nextInt();

		for (comprobante = 0; numero > 0; comprobante++) { // Empezamos poniendo el comprobante a 0, luego ponemos la
															// condici�n de que si numero es mayor a 0
			System.out.println("Introduce otro n�mero: "); // Deber� seguir pidiendo al usuario que introduzca un numero
															// negativo,
															// si no se cumple seguir� aumentando el contador
			numero = teclado.nextInt(); // Hasta que la condicion se cumpla
		}
		// Cerramos el teclado
		teclado.close();
		// Una vez el programa cumpla con la funcion de pedir hasta un negativo el
		// programa printar� cuantos n�meros han sido puestos
		// por el usuario
		System.out.println("------------------------------------------");
		System.out.println("Se han puesto: " + comprobante + " numeros");
	}
}
