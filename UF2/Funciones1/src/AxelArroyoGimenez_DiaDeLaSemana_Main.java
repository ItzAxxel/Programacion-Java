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

		// Pedimos al usuario que introduzca el número
		System.out.println("Introduce un número: ");
		numeroSemana = teclado.nextInt(); // Guardamos el número

		// Comprobamos que sea un día del 1 al 7
		while (numeroSemana > 7 || numeroSemana <= 0) {
			System.out.println("Valor incorrecto. Introduce de nuevo el número de 1 a 7: ");
			numeroSemana = teclado.nextInt();
		}

		// Cerramos el teclado
		teclado.close();

		// Llamamos al dia
		dia = dias(numeroSemana);

		// Mostramos que dia es
		System.out.println("El número que has introducido corresponde con el día: " + dia);
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
			dia = "Sábado";
		} else if (numeroSemana == 7) {// Si el dia es 7, es Domingo
			dia = "Domingo";
		}

		return dia;

	}

}
