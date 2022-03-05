import java.util.Scanner;

public class AxelArroyoGimenezNumeroHabitantes20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * Algorisme que llegeixi el número d’habitants de 20 poblacions i mostri el
		 * percentatge (sobre el total d’habitants) d’habitants que pertanyin a: Una
		 * població petita (menys de 2.000 habitants). Una població mitja (entre 2.000 i
		 * 300.000 habitants). Una població gran (més de 300.000 habitants).
		 * 
		 */

		// Creamos el scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables
		int habitantesUsuario = 0;

		for (int i = 0; i < 20; i++) {
			System.out.println("Introduce una cantidad de habitantes: ");
			habitantesUsuario = teclado.nextInt();
			if (habitantesUsuario < 2000) {
				System.out.println("Es una ciudad chiquita con: " + habitantesUsuario + " habitantes");
			} else if (habitantesUsuario < 300000) {
				System.out.println("Es una ciudad mediana con: " + habitantesUsuario + " habitantes");
			} else {
				System.out.println("Es una ciudad grande con: " + habitantesUsuario + " habitantes");
			}

		}

		//Cerramos el teclado
		teclado.close();
		
	}

}
