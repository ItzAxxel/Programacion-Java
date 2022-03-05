import java.util.Scanner;

public class AxelArroyoGimenezEjercicioParejaDeNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Algorisme que demani parelles de números fins a que siguin iguals o un d’ells
		 * sigui 0.
		 * 
		 */

		// Creamos el Scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos la variable
		int primerNumero;
		int segundoNumero;

		System.out.println("Introduce una pareja de numeros: ");
		primerNumero = teclado.nextInt();
		segundoNumero = teclado.nextInt();
		// Pedimos al usuario que introduzca la pareja de numeros

		while (primerNumero != 0 && segundoNumero != 0 && primerNumero != segundoNumero) {
			System.out.println("Introduce una pareja de numeros: ");
			primerNumero = teclado.nextInt();
			segundoNumero = teclado.nextInt();
		}

		if (primerNumero == 0 || segundoNumero == 0) {
			System.out.println("Un número es 0 ");
		}
		if (primerNumero == segundoNumero) {
			System.out.println("Ambos números son iguales el programa ha terminado.");
		}

		teclado.close();
	}

}
