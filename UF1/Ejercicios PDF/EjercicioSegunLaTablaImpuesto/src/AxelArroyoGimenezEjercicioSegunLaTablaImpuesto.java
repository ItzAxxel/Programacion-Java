import java.util.Scanner;

public class AxelArroyoGimenezEjercicioSegunLaTablaImpuesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * Algorisme que calculi, segons la seg?ent taula, el impost a pagar segons el
		 * salari anual. Es demanaran com a dades al usuari el salari mensual i el
		 * n?mero de pagues. Salari anual Percentatge d?impost -------------
		 * ---------------------- < 1000000 5% 1000000-2500000 12% 2500001-3800000 15%
		 * 3800001-6000000 22% > 6000000 30%
		 * 
		 * 
		 */

		// Creamos el Scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables

		int paga = 0;
		int anual = 0;
		int pagos = 0;
		int impuesto = 0;

		// Pedimos al usuario que introduzca los datos:

		System.out.println("Por favor, introduce tu paga: ");
		paga = teclado.nextInt();

		System.out.println("Por favor, introduce tu numero de pagas: "); 
		pagos = teclado.nextInt();

		// Cerramos el teclado
		teclado.close();

		anual = paga * pagos;

		if (anual < 1000000) {
			impuesto = (anual * 5) / 100;
			System.out.println("El impuesto que ha pagar es de: " + impuesto);
		}

		if (anual >= 1000000 || anual <= 2500000) {
			impuesto = (anual * 12) / 100;
			System.out.println("El impuesto que ha pagar es de: " + impuesto);

		} else if (anual >= 2500001 || anual <= 3800000) {
			impuesto = (anual * 15) / 100;
			System.out.println("El impuesto que ha pagar es de: " + impuesto);

		} else if (anual >= 3800001 || anual <= 6000000) {
			impuesto = (anual * 22) / 100;
			System.out.println("El impuesto que ha pagar es de: " + impuesto);

		} else if (anual > 6000000) {
			impuesto = (anual * 30) / 100;
			System.out.println("El impuesto que ha pagar es de: " + impuesto);
		}
	}

}
