//Axel Arroyo Gim�nez

import java.util.Random;
import java.util.Scanner;

public class EjerciciosParaPracticarFunciones_AxelArroyoGimenez_Main {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int opcionUsuario = 0; // Opcion del usuario
		Random aleatorio = new Random(); // para el aleatorio
		System.out.println("Elige una opci�n: ");
		System.out.println("Buscar Array [1] | Cadena de caracteres [2] | Crear funcion [3]");
		opcionUsuario = teclado.nextInt();
		opcionUsuario = EjercicioUno(opcionUsuario, aleatorio);
		opcionUsuario = EjercicioDos(opcionUsuario);
		opcionUsuario = EjercicioTres(opcionUsuario);

	}

	// Act 1
	public static int EjercicioUno(int opcionUsuario, Random aleatorio) {

		int numeroUsuario = 0;
		int[] arrayAleatorio = new int[10];
		if (opcionUsuario == 1) {
			
			System.out.println("Has selecionado la primera ocpi�n, buscar en el Array.");
			System.out.println("Introduce el n�mero que creas que est� en la array: ");
			numeroUsuario = teclado.nextInt();

			for (int i = 0; i < arrayAleatorio.length; i++) {
				arrayAleatorio[i] = aleatorio.nextInt(15);
			}

			int indice = validar(numeroUsuario, arrayAleatorio);
			if (indice == -1) {
				
				System.out.println("El n�mero no est� en el array (-1)");
				
			} else {
				
				System.out.println("El numero s� esta en el array en la posici�n: " + indice);
			}

		}

		return opcionUsuario;
	}

	// Para saber si est� en el array (act 1)
	public static int validar(int numeroUsuario, int[] arrayAleatorio) {
		
		for (int i = 0; i < arrayAleatorio.length; i++) {
			
			if (numeroUsuario == arrayAleatorio[i]) {
				
				return i;
			}
		}
		return -1;

	}

	// Act 2
	public static int EjercicioDos(int opcionUsuario) {

		String cadenaA = " ";
		String cadenaB = " ";
		if (opcionUsuario == 2) {
			
			System.out.println("Has seleccionado la segunda opci�n, cadena de caracteres.");
			
			System.out.println("Escribe una frase: ");
			cadenaA = teclado.nextLine();
			System.out.println("Escribe otra frase: ");
			cadenaB = teclado.nextLine();
			
			if (cadenaA.compareTo(cadenaB) == 0) {
				
				System.out.println("Las cadenas son iguales (0)");
			} else {
				
				if (cadenaA.compareTo(cadenaB) < 0) {
					
					System.out.println("La primera cadena es menor (-1)");
					
				} else {
					
					System.out.println("La primera cadena es mayor (1)");
				}
			}

		}

		return opcionUsuario;
	}

	// Act 3
	public static int EjercicioTres(int opcionUsuario) {
		
		int contVocal = 0;
		int contConst = 0;
		int contDigit = 0;
		int contPunt = 0;
		int contEsp = 0;

		String cadenaTexto = " ";
		
		if (opcionUsuario == 3) {
			
			System.out.println("Has selecionado la tercera opci�n, crear funci�n.");
			System.out.println("Escribe una frase: ");
			teclado.nextLine();
			cadenaTexto = teclado.nextLine();
			System.out.println(cadenaTexto.replace(" ", ""));
		}

		for (int i = 0; i < cadenaTexto.length(); i++) {
			
			if (cadenaTexto.charAt(i) == 'A' || cadenaTexto.charAt(i) == 'E' || cadenaTexto.charAt(i) == 'O'
					|| cadenaTexto.charAt(i) == 'U' || cadenaTexto.charAt(i) == 'a' || cadenaTexto.charAt(i) == 'e'
					|| cadenaTexto.charAt(i) == 'i' || cadenaTexto.charAt(i) == 'o' || cadenaTexto.charAt(i) == 'u')
			{
				contVocal++;
				
			} else if (cadenaTexto.charAt(i) == 1 || cadenaTexto.charAt(i) == 2 || cadenaTexto.charAt(i) == 3
					|| cadenaTexto.charAt(i) == 4 || cadenaTexto.charAt(i) == 5 || cadenaTexto.charAt(i) == 6
					|| cadenaTexto.charAt(i) == 7 || cadenaTexto.charAt(i) == 8 || cadenaTexto.charAt(i) == 9
					|| cadenaTexto.charAt(i) == 0) {
				
				contDigit++;
				
			} else if (cadenaTexto.charAt(i) == ',' || cadenaTexto.charAt(i) == '.' || cadenaTexto.charAt(i) == ':'
					|| cadenaTexto.charAt(i) == ';' || cadenaTexto.charAt(i) == '`' || cadenaTexto.charAt(i) == '�'
					|| cadenaTexto.charAt(i) == '?' || cadenaTexto.charAt(i) == '�' || cadenaTexto.charAt(i) == '!'
					|| cadenaTexto.charAt(i) == '�') {
				
				contPunt++;
				
			} else if (cadenaTexto.charAt(i) == ' ') {
				
				contEsp++;
				
			} else {
				
				contConst++;
				
			}
		}
		
		System.out.println("La palabra que has introducido tiene: ");
		System.out.println(contVocal + " vocales");
		System.out.println(contDigit + " digitos");
		System.out.println(contPunt + " signos de puntuacion");
		System.out.println(contEsp + " espacios en blanco");
		System.out.println(contConst + " consonantes");

		return opcionUsuario;
	}

}
