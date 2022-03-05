//Axel Arroyo Gimenez

import java.util.Scanner;

public class AxelArroyoGimenez_DiaDeLaSemana_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos el Scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos la variables
		int numeroSemana = 0;
		String dia = "a";

		// Pedimos al usuario que introduzca el n�mero
		System.out.println("Introduce un n�mero: ");
		numeroSemana = teclado.nextInt(); // Guardamos el n�mero

		// Comprobamos que sea un d�a del 1 al 7
		while (numeroSemana > 7 || numeroSemana <= 0) {
			System.out.println("Valor incorrecto. Introduce de nuevo el n�mero de 1 a 7: ");
			numeroSemana = teclado.nextInt();
		}

		// Cerramos el teclado
		teclado.close();

		// Llamamos al dia
		dia = dias(numeroSemana);

		// Mostramos que dia es
		System.out.println("El n�mero que has introducido corresponde con el d�a: " + dia);
	}

	public static String dias(int numeroSemana) {
		String dia = "A";
		if (numeroSemana == 1) { // Si el dia es 1, es Lunes
			dia = "Lunes";
		} else if (numeroSemana == 2) { // Si el dia es 2, es Martes
			dia = "Martes";
		} else if (numeroSemana == 3) { // Si el dia es 3, es Miercoles
			dia = "Miercoles";
		} else if (numeroSemana == 4) { // Si el dia es 4, es Jueves
			dia = "Jueves";
		} else if (numeroSemana == 5) { // Si el dia es 5, es Viernes
			dia = "Viernes";
		} else if (numeroSemana == 6) {// Si el dia es 6, es Sabado
			dia = "S�bado";
		} else if (numeroSemana == 7) {// Si el dia es 7, es Domingo
			dia = "Domingo";
		}

		return dia;

	}

}
