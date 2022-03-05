
import java.util.Scanner;

public class AxelArroyoGimenez_Prova2_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos el Scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables necesarias
		int elecionUsuario = 0;
		String datos;
		int contadorConsonante = 0;

		// Explicamos de que va el programa

		System.out.println("¡Bienvenidx a este programa! Por favor seleciona que quieres hacer: ");
		System.out.println("Strings [1] | Arrays [2] | Salir [3]");
		elecionUsuario = teclado.nextInt();

		// Bucle para que se haga todo hasta que le usuario ponga un 3
		while (elecionUsuario != 3) {
			if (elecionUsuario == 4) { // Volvemos a emeprezar
				System.out.println("¡Bienvenidx a este programa! Por favor seleciona que quieres hacer: ");
				System.out.println("Strings [1] | Arrays [2] | Salir [3]");
				elecionUsuario = teclado.nextInt();
			}
			// Strings
			if (elecionUsuario == 1) {
				System.out.println("Has elegido la primera opción, Strings.");
				System.out.println("Por favor, escribe tu nombre y apellidos: ");
				// Limpiamos buffer
				teclado.nextLine();
				datos = teclado.nextLine();

				// Comprobamos si tiene consonantes
				for (int i = 0; i < datos.length(); i++) {
					if (datos.charAt(i) >= 'a' && datos.charAt(i) <= 'z') {
						contadorConsonante++;
					}
				}

				System.out.println("El nombre que has escrito tiene: " + contadorConsonante + " consonantes");

				// Arrays
			} else {
				System.out.println("Has elegido la 2 opción, Arrays.");

			}
			// Preguntamos si quiere continuar
			System.out.println("¿Quieres seguir en el programa?");
			System.out.println("Sí [4] | No [3]");
			elecionUsuario = teclado.nextInt();
		}

		// Cerramos el teclado
		teclado.close();

	}

}
