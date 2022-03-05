//Axel Arroyo Gim�nez

import java.util.Scanner;

public class AxelArroyoGimenez_PalabrasPentavolicas_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos el scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables necesarias
		int NumberWords = 0; // Variable para el n�mero de las palabras
		int cont = 0; // Variable para saber en qu� palabra est� el usuario

		// Boleanas para las vocales
		boolean letterA = false;
		boolean letterE = false;
		boolean letterI = false;
		boolean letterO = false;
		boolean letterU = false;

		do {
			try {
				// Explicamos de que va el programa
				System.out.println("�Bienvenidx! Este programa sirve para saber si una palabra es pentav�lica o no.");
				System.out.println("Primero de todo, elige cuantas palabras quieres introducir: ");
				NumberWords = teclado.nextInt();

			} catch (Exception e) {
				System.out.println("El valor introducido es incorrecto. Introduce un n�mero, por favor: ");
				String str =  teclado.next();
				NumberWords = Integer.parseInt(str);
				
			}
		} while (NumberWords > 100 || NumberWords < 0);

		String Words[] = new String[NumberWords]; // Variable para el texto
		// Creamos el bucle para las palabras
		for (int i = 0; i < NumberWords; i++) {
			cont++;
			System.out.println("Escribe la # " + cont + " palabra");
			Words[i] = teclado.next();

			// Comprobamos si el usuario ha introducido algo mayor a 30 caracteres
			if (Words[i].length() > 30) {
				System.out.println(
						"El valor que has escrito es demasiado grande, recuerda introducir valores m�s peque�os que 30: ");
				Words[i] = teclado.next();
			}

			// Comprobamos si el usuario ha introducido una "�"
			if (Words[i].charAt(i) == '�') {
				System.out.println(
						"Has introducido una palabra incorrecta, recuerda introducir palabras que no contengan la '�': ");
				Words[i] = teclado.next();
			}

		}

		// Introducimos los caracteres en la variable
		for (int j = 0; j < Words.length; j++) {
			char Vocals[] = new char[Words[j].length()];

			for (int k = 0; k < Words[j].length(); k++) {
				Vocals[k] = Words[j].charAt(k);

			}

			// Comprobamos cada caracter de la palabra
			for (int l = 0; l < Vocals.length; l++) {

				if (Vocals[l] == 'a') {
					letterA = true;
				} else if (Vocals[l] == 'e') {
					letterE = true;
				} else if (Vocals[l] == 'i') {
					letterI = true;
				} else if (Vocals[l] == 'o') {
					letterO = true;
				} else if (Vocals[l] == 'u') {
					letterU = true;
				}
			}

			System.out.println();

			// Si tiene una A, E, I, O, U printar� "si", si no printar� "no"
			if (letterA == true && letterE == true && letterI == true && letterO == true && letterU == true) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}

			// Ponemos los valores en falso
			letterA = false;
			letterE = false;
			letterI = false;
			letterO = false;
			letterU = false;

			// Terminamos el contador
			cont = 0;
		}

		// Cerramos el teclado
		teclado.close();

	}

}
