import java.util.Scanner;

public class AxelArroyoGimenezNTablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Algorisme que demani al usuari un n�mero n i mostri la taula de multiplicar
		 * de aquest n�mero.
		 * 
		 */

		// Creamos el scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables
		int numero = 0;
		int contador = 0;

		System.out.println("Dime un numero y te dire su tabla de multiplicar :D");
		numero = teclado.nextInt();

		// Cerramos el teclado
		teclado.close();

		for (contador = 1; contador <= 10; contador++) {
			System.out.println(numero * contador);
		}

	}

}
