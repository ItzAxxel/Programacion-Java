//Axel Arroyo Giménez

import java.util.Scanner;

public class AxelArroyoGimenez_Nacionalidades_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos el Scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables necesarias
		int NumberValidate = 0; // Para saber cuantos nombres quiere validar
		int cont = 0; // Para saber en que nombre está el usuario

		// Explicamos de que va el programa
		System.out.println(
				"¡Bienvenidx! Este programa sirve para poder validar nombres: Galos, Romanos, Normandos, Bretones, Hispanos, Indios, Pictos y Ilernenses.");
		System.out.println(
				"Recuerda que debes introducir nombres más pequeños que 50 caracteres y no puedes introducir más de 25 peticiones. \nAdemás está prohibido usar cualquier tipo de accento o caracter especial.");
		System.out.println("Primero, elije cuantos nombres quieres validar: ");
		NumberValidate = teclado.nextInt();

		// Si el usuario introduce más de 25 posibilidades se le volverá a pedir
		while (NumberValidate > 25) {
			System.out.println(
					"Solo se pueden procesar 25 peticiones. Introduce cuantos números quieres poner de nuevo: ");
			NumberValidate = teclado.nextInt();
		}

		// Para vaciar el buffer
		teclado.nextLine();

		// Creamos la variable de String para guardar la cadena de texto
		String Name[] = new String[NumberValidate];

		// Bucle para saber cuantas palabras quiere validar el usuario
		System.out.println("\nBien, ahora escribe los nombres que queiras validar: ");
		for (int i = 0; i < NumberValidate; i++) {
			cont++;
			System.out.print("Escribe el nombre #: " + cont + " ");
			Name[i] = teclado.nextLine();
			System.out.println("Has escrito el nombre: " + Name[i].toUpperCase());

			// Si el usuario introduce una frase mayor a 50 caracteres le volverá a pedir
			// que escriba de nuevo
			if (Name[i].length() > 50) {
				System.out.println(
						"El nombre que has introducido es demasiado largo, intenta introducir uno menor de 50 caracteres: ");
				Name[i] = teclado.nextLine();
			}

			// Aqui verificamos a que nacionalidades pertenecen
			if (Name[i].contains("ix")) {
				System.out.println("\nLa nacionalidad del nombre que has intrdocudido es: Galos.");
			} else if (Name[i].contains("us") || Name[i].contains("um")) {
				System.out.println("\nLa nacionalidad del nombre que has introducido es: Romana.");
			} else if (Name[i].contains("af")) {
				System.out.println("\nLa nacionalidad del nombre que has introducido es: Normandos.");
			} else if (Name[i].contains("is") || Name[i].contains("os") || Name[i].contains("ax")) {
				System.out.println("\nLa nacionalidad del nombre que has introducido es: Bretones.");
			} else if (Name[i].contains("ez")) {
				System.out.println("\nLa nacionalidad del nombre que has introducido es: Hispano.");
			} else if (Name[i].contains("a")) {
				System.out.println("\nLa nacionalidad del nombre que has introducido es: India.");
			} else if (Name[i].contains("Mac")) {
				System.out.println("\nLa nacionalidad del nombre que has introducido es: Pictos.");
			} else if (Name[i].contains("Pro")) {
				System.out.println("\nLa nacionalidad del nombre que has introducido es: Ilernensa.");
			} else {
				System.out.println("\nLa nacionalidad del nombre que has introducido es: Estraterraquis");
			}

		}

		// Nos despedimos del usuario
		System.out.println("\nHas introducido: " + cont + " nombre(s).");
		System.out.println("\nEspero que haya disfrutado del programa. ¡Gracias por usarlo! ^^.");

		// Cerramos el teclado
		teclado.close();

	}
}
