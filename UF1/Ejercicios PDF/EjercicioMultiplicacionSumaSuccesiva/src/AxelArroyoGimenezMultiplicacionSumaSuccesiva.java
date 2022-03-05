import java.util.Scanner;

public class AxelArroyoGimenezMultiplicacionSumaSuccesiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Algorisme que multipliqui dos números introduïts per l’usuari utilitzant
		 * sumes successives
		 * 
		 */

		// Creamos el Scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables
		int numeroUno = 0;
		int numeroDos = 0;
		int multi = 0;

		// Empezamos el ejercicio
		System.out.println("Introduce un número: ");
		numeroUno = teclado.nextInt();

		System.out.println("Introduce otro número: ");
		numeroDos = teclado.nextInt();

		for (int i = 0; i < numeroUno; i++) {
			multi = numeroDos + multi;
		}

		// Cerramos el teclado
		teclado.close();

		System.out.println("El resultado es: ");
		System.out.println(numeroUno + " * " + numeroDos + " = " + multi);
	}

}
