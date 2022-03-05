//Programa hecho por Axel y Siru

import java.util.Random;
import java.util.Scanner;

public class Minijuegos {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Adivina el numero y Combate
		 * 
		 */

		menu(false, 0);

	}

	public static int menu(boolean salir, int opcion) {

		while (!salir) {
			System.out.println(" Elige una opci�n: ");
			System.out.println(" 1.- Jugar");
			System.out.println(" 2.- Informaci�n");
			System.out.println(" 3.- Mostrar puntuaciones");
			System.out.println(" 4.- Autores");
			System.out.println(" 5.- Versi�n");
			System.out.println(" 6.- Salir");
			opcion = teclado.nextInt();

			if (opcion == 1) {
				elegirJuego();
			} else if (opcion == 2) {
				informacion();
				menu(salir, opcion);
			} else if (opcion == 3) {
				mostrarPuntuaciones();
				menu(salir, opcion);
			} else if (opcion == 4) {
				System.out.println("Axel y Siru");
				menu(salir, opcion);
			} else if (opcion == 5) {
				System.out.println("1.1.1");
				menu(salir, opcion);
			} else {
				salir = true;
			}
		}

		return opcion;
	}

	public static int elegirJuego() {
		int opcionJuego = 0;

		System.out.println(" Disponemos de dos juegos actualmente, �Cual quieres jugar?");
		System.out.println(" 1.- Adivina el n�mero ");
		System.out.println(" 2.- Combate ");
		System.out.println(" 3.- Volver al men� principal");
		opcionJuego = teclado.nextInt();
		if (opcionJuego == 1) {
			modoDeJuego();
			adivinaElNumeroIA(opcionJuego, opcionJuego);
		} else if (opcionJuego == 2) {
			modoDeJuego();
		} else {
			menu(false, opcionJuego);
		}
		return opcionJuego;

	}

	public static void informacion() {
		System.out.println("------------------------------------ Adivina el número ------------------------------");
		System.out.println("En este minijuego, deber�s adivinar 3 veces el n�mero aleatorio para ganar la partida");
		System.out.println("---------------------------------------------------------------------------------------");
	}

	public static int modoDeJuego() {
		System.out.println(" Ahora debes elegir el modo de juego: ");
		System.out.println(" 1.- Jugador contra jugador ");
		System.out.println(" 2.- Jugador contra IA");
		System.out.println(" 3.- Volver al men� anterior");
		int elecionModoDeJuego = teclado.nextInt();
		if (elecionModoDeJuego == 1) {
			adivinaElNumeroJugadorContraJugador();

		} else if (elecionModoDeJuego == 2) {
			adivinaElNumeroIA(elecionModoDeJuego, elecionModoDeJuego);
		} else {
			menu(false, elecionModoDeJuego);
		}

		return elecionModoDeJuego;
	}

	public static void adivinaElNumeroJugadorContraJugador() {

	}

	public static void adivinaElNumeroIA(int puntuacionUsuario, int puntuacionIA) {
		int contadorRonda = 0;
		int numeroUsuario = 0;
		int IA = 0;
		Random rand = new Random();
		int numeroAleatorio = rand.nextInt(10) + 1;
		while (contadorRonda < 3) {
			contadorRonda++;

			IA = elecionNumeroIA(IA);
			numeroAleatorio = rand.nextInt(10) + 1;
			System.out.println(numeroAleatorio + " numero aleatorio probar");

			System.out.println("Estas en la ronda: " + contadorRonda);
			System.out.println("Elige un n�mero del 1 al 10: ");
			numeroUsuario = teclado.nextInt();

			System.out.println();
			System.out.println("La IA est� eligiendo n�mero...");
			System.out.println("Ha elegido el n�mero: " + IA);

			puntuacionUsuarioAdivinaElNumero(numeroUsuario, numeroAleatorio, puntuacionUsuario);
			puntuacionIAAdivinaElNumero(IA, numeroAleatorio, puntuacionIA);
			ganaUsuario(puntuacionUsuario);
			ganaIA(puntuacionIA);

		}
	}

	public static int elecionNumeroIA(int IA) {
		Random rand = new Random();
		try {
			// Ponemos a "Dormir" el programa durante 2 segundos
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
		}
		IA = rand.nextInt(10) + 1;
		return IA;
	}

	public static int puntuacionUsuarioAdivinaElNumero(int numeroUsuario, int numeroAleatorio, int puntuacionUsuario) {
		if (numeroUsuario == numeroAleatorio) {
			System.out.println("�Has ganado la ronda!");
			puntuacionUsuario++;
		}

		return puntuacionUsuario;
	}

	public static int puntuacionIAAdivinaElNumero(int IA, int numeroAleatorio, int puntuacionIA) {
		if (IA == numeroAleatorio) {
			System.out.println("�La IA ha ganado la ronda!");
			puntuacionIA++;
		}

		return puntuacionIA;
	}

	public static void mostrarPuntuaciones() {

	}

	public static void ganaUsuario(int puntuacionUsuario) {
		if (puntuacionUsuario == 3) {
			System.out.println("�Felicidades has ganado la partida!");
			menu(false, puntuacionUsuario);
		}

	}

	public static void ganaIA(int puntuacionIA) {
		if (puntuacionIA == 3) {
			System.out.println("�La IA ha ganado la partida!");
			menu(false, puntuacionIA);
		}

	}

}
