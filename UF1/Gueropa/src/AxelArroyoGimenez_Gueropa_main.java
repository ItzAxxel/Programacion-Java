import java.util.Scanner;

public class AxelArroyoGimenez_Gueropa_main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*
		 * Una serie de nÃºmeros es GUEROPA cuando cumple las siguientes condiciones:
		 * 
		 * a) Los nÃºmeros que ocupan un lugar par se comportan como una serie
		 * creciente.
		 * 
		 * b) Los nÃºmeros que ocupan un lugar impar son divisibles por 7.
		 * 
		 * c) La suma de dos nÃºmeros consecutivos siempre es inferior a 100.
		 * 
		 * El programa terminara de pedir nÃºmeros cuando le entremos un -1. El rango de
		 * valores que puede aceptar una serie GUEROPA serÃ¡ 0<N<10000.
		 * 
		 * Realiza un programa que dada una serie de nÃºmeros escritos desde teclado nos
		 * diga si es una serie GUEROPA o si no lo es. En caso, de que no lo sea, que
		 * nos informe de la condiciÃ³n o condiciones que no se ha cumplido.
		 * 
		 */

		// Decimos al usuario para que sirve el programa
		System.out.println(
				"¡Bienvenidx! Este programa sirve para saber si una serie de números es GUEROPA, \nen caso de que no sea una serie GUEROPA te indica que condiciones deben ser.");
		System.out.println("------------------------------------------------------------------------------");

		// Creamos el Scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables enteras 
		int num = 0; // Esta variable es para el número que introduzca el usuario
		int numeroLugarPar = 0; // Esta variable es para saber si está en un lugar par o no
		int numeroLugarImpar = 0; // Esta variable es para saber si está en un lugar impar o no
		int contador = 0; // Iniciamos un contador para saber si el lugar del número introducido por el usuario es par o no

		//Variables booleanas
		boolean condicionA = true; // Esta variable es para saber si se cumple la condición A
		boolean condicionB = true; // Esta variable es para saber si se cumple la condición B
		boolean condicionC = true; // Esta variable es para saber si se cumple la condición C
		
		while (num != -1) { // Mientras el número que introduzca el usuario sea DIFERENTE a -1 se repetirá
			System.out.println("Por favor, introduce un número: "); // Pedimos al usuario que introduzca un dato
			num = teclado.nextInt(); // Guardamos el número del usuario
			contador++; // Sumamos uno al contador
			if (num > 10000) { // Si el número es mayor a 10000, te dará un mensaje de error
				System.out.println("Introduce el siguiente número: ");
				num = teclado.nextInt();
				System.out.println(
						"El número que ha ingresado es demasiado grande para el programa. Por favor, introduzca otro más pequeño:  ");
				num = teclado.nextInt();
			} else if (num <= -2) { // Si el número es menor a -1 te dará un mensaje de error
				System.out.println(
						"El número que ha ingresado es demasiado pequeño para el programa. Por favor, introduzca otro más grande: ");
				num = teclado.nextInt();
			} else if (contador > 10000) { // Si el usuario se pasa de la cantidad de números, salta un mensaje de error
				System.out.println("Se ha pasado de los números para el programa.");
			}

			if (contador % 2 != 0) { // Comprueba si el número introducido por el usuario no está en un lugar par
				if (num % 7 != 0) { // Comprueba si el número introducdido por el usuario no es divisible entre 7
					System.out.println("El número no es divisible entre 7.");
					condicionB = false; // No cumple la condición, por lo tanto se establece en false
				} else {
					numeroLugarImpar = num;
				}
			} else { // Comprueba si el número introducido por el usuario está en un lugar par
				if (num < numeroLugarPar) { // Si el número introducido por el usuario es par y menor que el anterior (ejemplo, 4 y 2) te salta un mensaje de error				
					System.out.println("El número es menor que el anterior.");
					condicionA = false; // No cumple con la primera condicion, por lo tanto se establece en false
				} else {
					numeroLugarPar = num;
				}
			}

			if (numeroLugarPar + numeroLugarImpar >= 100) { // Comprueba si la suma de los dos últimos es mayor o igual
															// a 100
				System.out.println("La suma es mayor a 100");
				condicionC = false; // No cumple con la tercera condición, por lo tanto se establece en false
			}

		}

		// Cerramos el teclado
		teclado.close();

		if (condicionA == true && condicionB == true && condicionC == true) { // Comprobamos que todas las condiciones estan en true (son verdaderas), la serie es GUEROPA
			System.out.println("La serie es GUEROPA.");
		} else { // En caso contrario de no tener todas las condiciones en true, no es GUEROPA
			System.out.println("La serie no es GUEROPA.");
		}

		if (condicionA == false) { // La priemera condición no se cumple
			System.out.println("No se cumple la condición A.");
		}
		if (condicionB == false) { // La segunda condición no se cumple
			System.out.println("No se cumple la condición B.");
		}
		if (condicionC == false) { // La tercera condición no se cumple
			System.out.println("No se cumple la condición C.");
		}

	}
}
