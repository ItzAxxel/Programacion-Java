import java.util.Scanner;

public class AxelArroyoGimenezEjercicioNumerosHastaQueSean0Suma2Ultimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Algorisme que demani n�meros fins a que un sigui 0. En cada iteraci� (des de
		 * la segona) ha d�imprimir la suma dels dos �ltims n�meros
		 * 
		 */

		// Creamos el Scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos la variable
		int numeroUsuario = 0;
		int segundoNumero = 0;
		int suma = 0;

		System.out.println("Introduce un n�mero: ");
		numeroUsuario = teclado.nextInt();
		
		while (numeroUsuario != 0) {
			suma = segundoNumero + numeroUsuario;
			System.out.println("La suma es: " + suma);
			segundoNumero = numeroUsuario;
			System.out.println("Introduce otro n�mero: ");
			numeroUsuario = teclado.nextInt();
		}
		//Cerramos el teclado
		teclado.close();
	}
}
