//Axel Arroyo Giménez

import java.util.Scanner;

public class AxelArroyoGimenez_LearningMachine_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos el scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables necesarias
		String WordA; // Variable para la primera palabra
		String WordB; // Variable para la segunda palabra
		boolean hastag = true; // Variable para ver si usa el # al final

		// Explicamos de que va el programa
		System.out.println(
				"¡Bienvenidx! Este programa sirve para ver cuantas veces se repite un caracter en dos palabras \ndiferentes.");
		System.out.println("Recuerda, ambas palabras deben terminar con el símbolo '#'.");
		System.out.println("Bien, dicho eso escribe la primera palabra: ");
		WordA = teclado.nextLine();

		// Comprobamos si la palabraA tiene un Hastag
		while (hastag) {
			char finalLetter = WordA.charAt(WordA.length() - 1);
			if (finalLetter == '#') {
				hastag = false;
			} else {
				System.out.println("No has terminado con el '#'. Introduce de nuevo la frase con el #.");
				WordA = teclado.nextLine();
			}
		}

		// Ponemos de nuevo la variable en true para comprobar
		hastag = true;

		// Pedimos la 2 palabra
		System.out.println("Ahora, escribe la segunda palabra: ");
		WordB = teclado.nextLine();

		// Comprobamos si la palabraB tiene un Hastag
		while (hastag) {
			char finalLetter = WordB.charAt(WordB.length() - 1);
			if (finalLetter == '#') {
				hastag = false;
			} else {
				System.out.println("No has terminado con el '#'. Introduce de nuevo la frase con el #.");
				WordB = teclado.nextLine();
			}
		}

		// Delimitamos los caracteres de ambas frases
		while (WordA.length() > 80) {
			System.out.println(
					"La palabra que has introducido es demasiado grande! \nIntroducela de nuevo. Debe de ser una palabra de menos de 80 carácteres con terminación de '#'.");
			WordA = teclado.nextLine();
		}

		// Creamos la cadenaA a una array de tipo char
		WordA.toCharArray();
		char A[] = new char[WordA.length()];

		while (WordB.length() > 25) {
			System.out.println(
					"La palabra que has introducido es demasiado grande! \nIntroducela de nuevo. Debe de ser una palabra de menos de 25 carácteres con terminación de '#'.");
			WordB = teclado.nextLine();
		}

		// Creamos la cadena B a una array de tipo char
		WordB.toCharArray();
		char B[] = new char[WordB.length()];

		// El contador para saber cuantos caracteres hay
		int[] cont = new int[WordB.length()];

		// Contamos los caracteres de la String A
		for (int i = 0; i < WordA.length(); i++) {
			A[i] = WordA.charAt(i);
		}
		// Contamos los caracteres de la String B
		for (int i = 0; i < WordB.length(); i++) {
			B[i] = WordB.charAt(i);
		}

		// Comprobaoms cuantos caracteres hay iguales en ambas strings
		for (int i = 0; i < WordA.length(); i++) {
			for (int a = 0; a < WordB.length(); a++) {

				if (B[a] == A[i]) {
					cont[a]++;
				}
			}
		}

		// Printamos por pantalla los caracteres similares
		for (int i = 0; i < WordB.length() - 1; i++) {

			System.out.println(i + " -- " + B[i] + "/" + cont[i]);
		}

		// Cerramos el teclado
		teclado.close();

	}

}
