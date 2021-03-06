//Axel Arroyo Gim?nez

import java.util.Random;
import java.util.Scanner;

public class AxelArroyoGimenez_ThreeStonesGamming_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos el Scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos la variable de random
		Random randomApuestaIA = new Random();
		Random randomElecionIA = new Random();

		// Creamos las variables necesarias
		int elecionUsuario = 0; // Para que el usuario elija las piedras
		int elecionIA = 0; // Para que la IA elija las piedras
		int apuestaUsuario = 0; // Para la apuesta del usuario
		int apuestaIA = 0; // La apuesta de la IA
		int numeroRondas = 0; // Para saber el numero de rondas
		int rondaActual = 0; // Para saber en que ronda estamos
		int puntosUsuario = 0; // Los puntos del usuario
		int puntosIA = 0; // Los puntos de la IA
		int resultado = 0; // El resultado de la suma
		int jugarDeNuevo = 1; // Para jugar de nuevo, igualado a 1 para que cumpla el bucle

		// Explicamos de que va el programa
		System.out.println("?Bienvenidx! Este programa esta hecho para jugar al juego de las piedras.\n");
		System.out.println(
				"El juego funciona de la siguiente manera: Hay dos jugadores, el usuario y el ordenador. \nCada usuario tiene 3 piedras, y coge 0, 1, 2 o 3 en cada turno. \nEntonces, sin ver las del otro, debe decirse un numero al azar para acertar el total de piedras.");
		System.out.println("\nIntroduce el numero de rondas que quieras jugar:  ");
		numeroRondas = teclado.nextInt();
		System.out.println("\n");

		// Mientras "Jugar de nuevo" sea diferente de 0 se repetira
		while (jugarDeNuevo != 0) {

			for (int i = 0; i < numeroRondas; i++) { // Para que se repita las veces que haya introducido el usuario
				rondaActual++;

				System.out.println("Inicio de la ronda " + rondaActual);

				System.out.println("?Cuantas piedras quieres apostar? Recueda que solo puedes apostar 3!");
				elecionUsuario = teclado.nextInt();

				while (elecionUsuario > 3 || elecionUsuario <= -1) { // Si el usuario elije m?s de 3 o menos de 0
					System.out.println(
							"No puedes apostar mas de tres piedras o menos! Introduce de nuevo cuantas quieres apostar: ");
					elecionUsuario = teclado.nextInt();
				}

				System.out.println("?Cual crees que sera el resultado de la suma?");
				apuestaUsuario = teclado.nextInt();
				System.out.println("\n");

				elecionIA = randomElecionIA.nextInt(4);

				// Si la IA elije el 4, se iguala a 3
				if (elecionIA == 4) {
					elecionIA = 3;
				}

				apuestaIA = randomApuestaIA.nextInt(4);

				// Si la IA elije el 0, se iguala a 1 porque es lo minimo que puede apostar
				if (apuestaIA == 0) {
					apuestaIA = 1;
				}

				// Si la IA elije el 4, se iguala a 3
				if (apuestaIA == 4) {
					apuestaIA = 3;
				}

				// Decimos lo que pone la IA
				System.out.println("La IA ha apostado: " + elecionIA);
				System.out.println("La IA cree que el resultado de la suma sera: " + apuestaIA);
				System.out.println("\n");

				// El resultado de la operacion
				resultado = apuestaUsuario + apuestaIA;

				// El resultado es
				System.out.println("El resultado es: " + apuestaUsuario + " (Apuesta del usuario)" + " + " + apuestaIA
						+ " (Apuesta de la IA)" + " = " + resultado);

				// GANA IA
				if (resultado != apuestaUsuario && resultado == apuestaIA) {
					System.out.println("La IA ha ganado esta ronda!");
					puntosIA++;
				}
				// GANA USUARIO
				if (resultado == apuestaUsuario && resultado != apuestaIA) {
					System.out.println("Has ganado esta ronda!");
					puntosUsuario++;
				}

				// EMPATE
				if (resultado == apuestaUsuario && resultado == apuestaIA) {
					System.out.println("Ambos jugadores han quedado en empate. ?Nadie gana puntos!");
				}

				// DIFERENTE
				if (resultado != apuestaUsuario && resultado != apuestaIA) {
					System.out.println("Ninguno ha hacertado! Nadie gana puntos esta ronda.");
				}

				// Mostramos el ganador de la ronda
				if (puntosUsuario > puntosIA) {
					System.out.println("Has ganado tu con: " + puntosUsuario + " punto(s)");
				} else if (puntosIA > puntosUsuario) {
					System.out.println("Ha ganado la IA con: " + puntosIA + " punto(s)");
				}

				System.out.println("?Quieres jugar de nuevo?");
				System.out.println("Si [9] | No [0]");
				jugarDeNuevo = teclado.nextInt();

			}

		}

		// Cerramos el teclado
		teclado.close();
	}

}
