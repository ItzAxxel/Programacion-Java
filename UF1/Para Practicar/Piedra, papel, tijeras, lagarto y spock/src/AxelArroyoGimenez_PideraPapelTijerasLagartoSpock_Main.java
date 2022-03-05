import java.util.Random;
import java.util.Scanner;

public class AxelArroyoGimenez_PideraPapelTijerasLagartoSpock_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * �Puedes ayudar a Sheldon a programar su nuevo juego para jugar contra el
		 * ordenador?
		 * 
		 * Jugar contra la IA Primero se pedira el número de partidas que se van a
		 * jugar.
		 * 
		 * Se jugaran cada una de las partidas y se ira mostrando las puntuaciones del
		 * jugador y de la máquina.
		 * 
		 * Al finalizar se muestra quien es el ganador.
		 * 
		 * Cuando acabe la partida, se ofrecera al usuario la posibilidad de volver a
		 * jugar.
		 * 
		 * Puntos Bonus: 200.
		 * 
		 */

		// Crearemos el scanner
		Scanner teclado = new Scanner(System.in);

		// Crearemos las variables necesarias
		int numeroPartidas = 0;
		int elecionUsuario = 0;
		int elecionIA = 0;
		int puntuacionIA = 0;
		int puntuacionUsuario = 0;
		int jugarDeNuevo = 0;

		// Creamos la variable para el numero aleatorio
		Random IA = new Random();

		// Dice por pantalla de que vea el programa
		System.out.println(
				"�Bienvenidx! Este programa esta hecho para jugar al mitico juego de Pidera, Papel, Tijeras, Lagarto, Spock. \nEmpecemos con el numero de rondas que quieres jugar: ");
		numeroPartidas = teclado.nextInt(); // Guardamos lo que ponga el usuario en la variable "numeroPartidas"

		// Hacemos que mientras la variable "jugarDeNuevo" sea diferente que 2 se repita
		while (jugarDeNuevo != 2) {
			for (int i = 0; i < numeroPartidas; i++) { // Creamos el bucle para saber cuantas rondas van a ser
				elecionIA = IA.nextInt(6); // Iniciamos el numero aleatorio en 6 ya que el 0 tambi�n cuenta
				System.out.println("�Con que vas a jugar?");
				System.out.println("Las opciones son: ");
				System.out.print("Piedra [1] | Papel [2] | Tijeras [3] | Lagarto [4] | Spock [5]\n");
				elecionUsuario = teclado.nextInt();

				// Hacemos que si el usuario elije algo mayor a 5 introduzca otro n�mero
				if (elecionUsuario > 5) {
					System.out.println("No hay tantas opciones disponibles! Introduce otro numero: ");
					elecionUsuario = teclado.nextInt();
				}
				// Hacemos que si el usuario elije algo menor a 1 introduzca otro numero
				if (elecionUsuario < 1) {
					System.out.println("El numero no es correcto, introdue otro: ");
					elecionUsuario = teclado.nextInt();
				}

				// Decimos con que va a jugar el usuario
				System.out.println("---------------------");
				System.out.println("Has elegido jugar con: ");
				if (elecionUsuario == 1) {
					System.out.print("Piedra \n");
				} else if (elecionUsuario == 2) {
					System.out.print("Papel \n");
				} else if (elecionUsuario == 3) {
					System.out.println("Tijeras \n");
				} else if (elecionUsuario == 4) {
					System.out.println("Lagarto \n");
				} else {
					System.out.println("Spock \n");
				}

				// Decimos con que va a jugar la IA
				System.out.println("La IA ha jugado con: ");
				if (elecionIA == 1) {
					System.out.print("Piedra \n");
				} else if (elecionIA == 2) {
					System.out.print("Papel \n");
				} else if (elecionIA == 3) {
					System.out.println("Tijeras \n");
				} else if (elecionIA == 4) {
					System.out.println("Lagarto \n");
				} else {
					System.out.println("Spock \n");
				}

				// Ya que el 0 cuenta, lo igualamos a 1 haciendo que la elecion de la IA sea
				// Piedra
				if (elecionIA == 0) {
					elecionIA = 1;
				}

				// En caso de que diera 6, lo igualamos a 5 haciendo que la elecion de la IA sea
				// Spock
				if (elecionIA == 6) {
					elecionIA = 5;
				}

				// En caso de empatar, salta un mensaje
				if (elecionUsuario == elecionIA) {
					System.out.println("Hay un empate! Ningun jugador gana puntos.");
				}

				// Empezamos el programa con la elecion de piedra
				if (elecionUsuario == 1) {
					if (elecionIA == 2) { // PAPEL
						System.out.println("Ha ganado la IA con la elecion de: PAPEL! (Papel tapa a piedra)");
						puntuacionIA++;
						System.out.println("La IA lleva: " + puntuacionIA + " punto(s)");
					}
					if (elecionIA == 3) { // TIJERAS
						System.out.println("Has ganado tu con la elecion de: PIEDRA! (Piedra aplasta a tijeras)");
						puntuacionUsuario++;
						System.out.println("Tu llevas: " + puntuacionUsuario + " punto(s)");
					}
					if (elecionIA == 4) { // LAGARTO
						System.out.println("Has ganado tu con la elecion de PIEDRA! (Piedra aplasta a Lagarto)");
						puntuacionUsuario++;
						System.out.println("Tu llevas: " + puntuacionUsuario + " punto(s)");
					}
					if (elecionIA == 5) { // SPOCK
						System.out.println("Ha ganado la IA con la elecion de: SPOCK! (Spock vaporiza Piedra)");
						puntuacionIA++;
						System.out.println("La IA lleva: " + puntuacionIA + " punto(s)");
					}

					// Empezamos el programa con la elecion de papel
				} else if (elecionUsuario == 2) {
					if (elecionIA == 1) { // PIEDRA
						System.out.println("Has ganado tu con la elecion de: PAPEL! (Papel tapa a Piedra)");
						puntuacionUsuario++;
						System.out.println("Tu llevas: " + puntuacionUsuario + " punto(s)");
					}
					if (elecionIA == 3) { // TIJERAS
						System.out.println("Ha ganado la IA con la elecion de: TIJERAS! (Tijeras cortan Papel)");
						puntuacionIA++;
						System.out.println("La IA lleva: " + puntuacionIA + " punto(s)");
					}
					if (elecionIA == 4) { // LAGARTO
						System.out.println("Ha ganado la IA con la opcion de: LAGARTO! (Lagarto devora Papel)");
						puntuacionIA++;
						System.out.println("La IA lleva: " + puntuacionIA + " punto(s)");
					}
					if (elecionIA == 5) { // SPOCK
						System.out.println("Has ganado tu con la opcion de: PAPEL! (Papel desautoriza a Spock)");
						puntuacionUsuario++;
						System.out.println("Tu llevas: " + puntuacionUsuario + " punto(s)");
					}
					// Empezamos el programa con la elecion de Tijeras
				} else if (elecionUsuario == 3) {
					if (elecionIA == 1) { // PIEDRA
						System.out.println("Ha ganado la IA con la elecion de: PIEDRA! (Piedra aplasta a tijeras)");
						puntuacionIA++;
						System.out.println("La IA lleva: " + puntuacionIA + " punto(s)");
					}
					if (elecionIA == 2) { // PAPEL
						System.out.println("Has ganado tu con la elecion de: TIJERAS! (Tijeras cortan Papel)");
						puntuacionUsuario++;
						System.out.println("Tu llevas: " + puntuacionUsuario + " punto(s)");
					}
					if (elecionIA == 4) { // LAGARTO
						System.out.println("Has ganado t� con la elecion de: TIJERAS! (Tijeras decapitan Lagarto)");
						puntuacionUsuario++;
						System.out.println("Tu llevas: " + puntuacionUsuario + " punto(s)");
					}
					if (elecionIA == 5) { // SPOCK
						System.out.println("Ha ganado la IA con la elecion de: SPOCK! (Spock vaporiza Piedra)");
						puntuacionIA++;
						System.out.println("La IA lleva: " + puntuacionIA + " punto(s)");
					}

					// Empezamos el programa con la elecion de LAGARTO
				} else if (elecionUsuario == 4) {
					if (elecionIA == 1) { // PIEDRA
						System.out.println("Ha ganado la IA con la elecion de: PIEDRA! (Piedra aplasta a Lagarto)");
						puntuacionIA++;
						System.out.println("La IA lleva: " + puntuacionIA + " punto(s)");
					}
					if (elecionIA == 2) { // PAPEL
						System.out.println("Has ganado tu con la elecion de: LAGARTO! (Lagarto devora Papel)");
						puntuacionUsuario++;
						System.out.println("Tu llevas: " + puntuacionUsuario + " punto(s)");
					}
					if (elecionIA == 3) { // TIJERAS
						System.out.println("Ha ganado la IA con la elecion de: TIJERAS! (Tijeras decapitan Lagarto)");
						puntuacionIA++;
						System.out.println("La IA lleva: " + puntuacionIA + " punto(s)");
					}
					if (elecionIA == 5) { // SPOCK
						System.out.println("Has ganado tu con la elecion de: LAGARTO! (Lagarto envenena a Spock)");
						puntuacionUsuario++;
						System.out.println("Tu llevas: " + puntuacionUsuario + " punto(s)");
					}
					// Empezamos el programa con la elecion de SPOCK
				} else if (elecionUsuario == 5) {
					if (elecionIA == 1) { // PIEDRA
						System.out.println("Has ganado t� con la elecion de: SPOCK! (Spock vaporiza Piedra)");
						puntuacionUsuario++;
						System.out.println("Tu llevas: " + puntuacionUsuario + " punto(s)");
					}
					if (elecionIA == 2) { // PAPEL
						System.out.println("Ha ganado la IA con la elecion de: PAPEL! (Papel desautoriza Spock)");
						puntuacionIA++;
						System.out.println("La IA lleva: " + puntuacionIA + " punto(s)");
					}
					if (elecionIA == 3) { // TIJERAS
						System.out.println("Has ganado tu con la opcion de: SPOCK! (Spock rompe Tijeras)");
						puntuacionUsuario++;
						System.out.println("Tu llevas: " + puntuacionUsuario + " punto(s)");
					}
					if (elecionIA == 4) { // LAGARTO
						System.out.println("Ha ganado la IA con la elecion de: LAGARTO! (Lagarto envenena a Spock)");
						puntuacionIA++;
						System.out.println("La IA lleva: " + puntuacionIA + " punto(s)");
					}
				}
			}

			// Pedimos al usuario si quiere jugar de nuevo
			System.out.println("�Quieres jugar de nuevo?");
			System.out.println("Si [1] | No [2]\n");
			jugarDeNuevo = teclado.nextInt();
			// Si el usuario introduce un n�mero erroneo, se le vuelve a pedir
			if (jugarDeNuevo > 2 || jugarDeNuevo < 1) {
				System.out.println(
						"No es una opcionn valida! Recuerda, para jugar de nuevo debes elegir entre: \nSi [1] | No [2]\n");
				jugarDeNuevo = teclado.nextInt();
			}

			// Mostramos por pantalla al ganador
			if (jugarDeNuevo == 2) {
				if (puntuacionUsuario > puntuacionIA) {
					System.out.println("Has ganado con: " + puntuacionUsuario + " punto(s)\n");
				} else  if (puntuacionUsuario == puntuacionIA){
					System.out.println("¡Ambos jugadores quedan en empate!");
					System.out.println("La IA quedo con: " + puntuacionIA + " punto(s)");
					System.out.println("Tu has quedado con: " + puntuacionUsuario + " punto(s)");
				} else {
					System.out.println("Ha ganado la IA con: " + puntuacionIA + " punto(s)\n");
				}
			}
		}

		// Cerramos el teclado
		teclado.close();
	}
}
