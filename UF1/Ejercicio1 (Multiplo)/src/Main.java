import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos la variable
		int x = 0;

		// El usuario introduce el numero
		System.out.println("Escribe un numero");
		// creamos el teclado
		Scanner teclado = new Scanner(System.in);
		// El programa recoge el numero
		x = teclado.nextInt();

		// El programa indica si es par o no
		if (x % 2 == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
		}
		// El programa indica si es multiplo de 7
		if (x % 7 == 0) {
			System.out.println("El Multiple de 7");
		}
		teclado.close();
	}
}