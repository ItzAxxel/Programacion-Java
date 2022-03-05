import java.util.Scanner;

public class AxelArroyoGimenezEjercicioVocalConsonante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Algorisme que demani caràcters i imprimeixi 'VOCAL' si són vocales i
		 * 'CONSONANT' si no.
		 * 
		 */

		// Creamos el scanner
		Scanner teclado = new Scanner(System.in);

		// Variable general
		char texto;

		// Vocales
		char a = 'a';
		char e = 'e';
		char i = 'i';
		char o = 'o';
		char u = 'u';

		// Pedimos al usuario que introduzca los daots

		System.out.println("Introduce una letra: ");
		texto = teclado.next().charAt(0);
		
		//Cerramos el teclado
		teclado.close();
		
		
		//Empezamos el ejercicio
		if (texto == a || texto == e || texto == i || texto == o || texto == u) {
			System.out.println("VOCAL");
		} else {
			System.out.println("CONSONANT");
		}
		
	}

}
