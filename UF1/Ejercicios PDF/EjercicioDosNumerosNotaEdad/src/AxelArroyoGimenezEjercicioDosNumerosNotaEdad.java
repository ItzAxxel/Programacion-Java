import java.util.Scanner;

public class AxelArroyoGimenezEjercicioDosNumerosNotaEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * Algorisme que demani dos números 'nota' i 'edat' i un caràcter 'carnet' i
		 * mostri el missatge 'ACCEPTADA' si la nota és més gran o igual a cinc, la edat
		 * és més gran o igual a divuit i el carnet és 'S'. En cas de que es compleixi
		 * lo mateix, però el carnet sigui 'N' ha de imprimir 'POSSIBLE
		 * 
		 * 
		 */

		// Creamos el scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables
		int nota = 0;
		int edad = 0;
		char carnet;
		
		// Pedimos al usuario que introduzca los datos

		System.out.println("Por favor, introduce tu nota: ");
		nota = teclado.nextInt();

		System.out.println("Por favor, introduce tu edad: ");
		edad = teclado.nextInt();

		System.out.println("Introduce una letra: ");
		carnet = teclado.next().charAt(0);

		//Empezamos el programa
		if (nota >= 5 && edad >= 18 && carnet == 'S') {
			System.out.println("ACCEPTADA");
		} else if (carnet == 'N') {
			System.out.println("POSSIBLE");
		}

		//Cerramos el scanner
		teclado.close();
		
	}
}
