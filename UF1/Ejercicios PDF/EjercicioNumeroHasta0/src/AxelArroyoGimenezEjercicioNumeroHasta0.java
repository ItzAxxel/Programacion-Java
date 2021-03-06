import java.util.Scanner;

public class AxelArroyoGimenezEjercicioNumeroHasta0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Algorisme que demani n?meros fins que s?introdueixi un 0. Aleshores s?ha de
		 * imprimir la suma i la mitja de tots els n?meros introdu?ts.
		 * 
		 */

		// Creamos el Scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables
		int numero = 1; // Iniciamos la variable a 1 para ir directamente al bucle
		int suma = 0; // Variable para la suma
		int cantidad = 0; // Variable para contar la de veces que el usuario introduce un n?mero
		int media = 0; // Variable para poder hacer la media

		while (numero != 0) { // Mientras que el numero sea diferente a 0, el programa se repetir?
			System.out.println("Introduce un numero: ");
			numero = teclado.nextInt();
			suma += numero; // Aqui estamos haciendo la suma de los numeros impuestos por el usuario
			cantidad++; // Aqui estamos calculando la de veces que se ponen los numeros introducidos por
						// el usuario
		}

		// Cerramos el teclado
		teclado.close();

		media = suma / (cantidad - 1); // Aqui estamos haciendo la media, puse el -1 para no interferir con el programa
										// ya que si no seria									
										// Dividir por 0
		
		// Imprimmimos por pantalla la suma de todos los numeros y la media
		System.out.println("--------------------");
		System.out.println("La suma es: " + suma);
		System.out.println("La media es: " + media);
	}
}
