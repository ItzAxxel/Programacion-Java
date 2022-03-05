import java.util.Scanner;

public class AxelArroyoGimenez_Gueropa_main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*
		 * Una serie de números es GUEROPA cuando cumple las siguientes condiciones:
		 * 
		 * a) Los números que ocupan un lugar par se comportan como una serie
		 * creciente.
		 * 
		 * b) Los números que ocupan un lugar impar son divisibles por 7.
		 * 
		 * c) La suma de dos números consecutivos siempre es inferior a 100.
		 * 
		 * El programa terminara de pedir números cuando le entremos un -1. El rango de
		 * valores que puede aceptar una serie GUEROPA será 0<N<10000.
		 * 
		 * Realiza un programa que dada una serie de números escritos desde teclado nos
		 * diga si es una serie GUEROPA o si no lo es. En caso, de que no lo sea, que
		 * nos informe de la condición o condiciones que no se ha cumplido.
		 * 
		 */

		// Decimos al usuario para que sirve el programa
		System.out.println(
				"�Bienvenidx! Este programa sirve para saber si una serie de n�meros es GUEROPA, \nen caso de que no sea una serie GUEROPA te indica que condiciones deben ser.");
		System.out.println("------------------------------------------------------------------------------");

		// Creamos el Scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables enteras 
		int num = 0; // Esta variable es para el n�mero que introduzca el usuario
		int numeroLugarPar = 0; // Esta variable es para saber si est� en un lugar par o no
		int numeroLugarImpar = 0; // Esta variable es para saber si est� en un lugar impar o no
		int contador = 0; // Iniciamos un contador para saber si el lugar del n�mero introducido por el usuario es par o no

		//Variables booleanas
		boolean condicionA = true; // Esta variable es para saber si se cumple la condici�n A
		boolean condicionB = true; // Esta variable es para saber si se cumple la condici�n B
		boolean condicionC = true; // Esta variable es para saber si se cumple la condici�n C
		
		while (num != -1) { // Mientras el n�mero que introduzca el usuario sea DIFERENTE a -1 se repetir�
			System.out.println("Por favor, introduce un n�mero: "); // Pedimos al usuario que introduzca un dato
			num = teclado.nextInt(); // Guardamos el n�mero del usuario
			contador++; // Sumamos uno al contador
			if (num > 10000) { // Si el n�mero es mayor a 10000, te dar� un mensaje de error
				System.out.println("Introduce el siguiente n�mero: ");
				num = teclado.nextInt();
				System.out.println(
						"El n�mero que ha ingresado es demasiado grande para el programa. Por favor, introduzca otro m�s peque�o:  ");
				num = teclado.nextInt();
			} else if (num <= -2) { // Si el n�mero es menor a -1 te dar� un mensaje de error
				System.out.println(
						"El n�mero que ha ingresado es demasiado peque�o para el programa. Por favor, introduzca otro m�s grande: ");
				num = teclado.nextInt();
			} else if (contador > 10000) { // Si el usuario se pasa de la cantidad de n�meros, salta un mensaje de error
				System.out.println("Se ha pasado de los n�meros para el programa.");
			}

			if (contador % 2 != 0) { // Comprueba si el n�mero introducido por el usuario no est� en un lugar par
				if (num % 7 != 0) { // Comprueba si el n�mero introducdido por el usuario no es divisible entre 7
					System.out.println("El n�mero no es divisible entre 7.");
					condicionB = false; // No cumple la condici�n, por lo tanto se establece en false
				} else {
					numeroLugarImpar = num;
				}
			} else { // Comprueba si el n�mero introducido por el usuario est� en un lugar par
				if (num < numeroLugarPar) { // Si el n�mero introducido por el usuario es par y menor que el anterior (ejemplo, 4 y 2) te salta un mensaje de error				
					System.out.println("El n�mero es menor que el anterior.");
					condicionA = false; // No cumple con la primera condicion, por lo tanto se establece en false
				} else {
					numeroLugarPar = num;
				}
			}

			if (numeroLugarPar + numeroLugarImpar >= 100) { // Comprueba si la suma de los dos �ltimos es mayor o igual
															// a 100
				System.out.println("La suma es mayor a 100");
				condicionC = false; // No cumple con la tercera condici�n, por lo tanto se establece en false
			}

		}

		// Cerramos el teclado
		teclado.close();

		if (condicionA == true && condicionB == true && condicionC == true) { // Comprobamos que todas las condiciones estan en true (son verdaderas), la serie es GUEROPA
			System.out.println("La serie es GUEROPA.");
		} else { // En caso contrario de no tener todas las condiciones en true, no es GUEROPA
			System.out.println("La serie no es GUEROPA.");
		}

		if (condicionA == false) { // La priemera condici�n no se cumple
			System.out.println("No se cumple la condici�n A.");
		}
		if (condicionB == false) { // La segunda condici�n no se cumple
			System.out.println("No se cumple la condici�n B.");
		}
		if (condicionC == false) { // La tercera condici�n no se cumple
			System.out.println("No se cumple la condici�n C.");
		}

	}
}
