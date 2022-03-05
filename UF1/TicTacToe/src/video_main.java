import java.util.Scanner;

import javax.swing.JOptionPane;

public class video_main {

	public static void main(String[] args) {
		// si hay un 1 representa las x del jugador
		// si el tablero tiene un 2 representa las O del ordenador
		int[][] tablero = new int[3][3];

		reiniciar(tablero);
		int ganador;
		do {
			jugar(tablero);

			ganador = comprobarEstadoJuego(tablero);

			mostrarMensaje(tablero, ganador, "Después del turno del jugador");

			// sino ha ganado nadie aún y no está lleno el tablero seguimos jugando
			if (ganador == 0) {
				jugarOrdenador(tablero);

				ganador = comprobarEstadoJuego(tablero);

				mostrarMensaje(tablero, ganador, "Después del turno del ordenador");
			}
		} while (ganador == 0);
	}

	private static void mostrarMensaje(int[][] tablero, int ganador, String quien) {
		if (ganador == 0) {
			mostrarTablero(tablero, quien);
		} else {
			mostrarMensajeGanador(ganador, tablero);
		}
	}

	private static void jugarOrdenador(int[][] tablero) {
		int i, j;
		boolean tirada = false;
		// esta variable nos dice que cuando ya juegue se pone a true y ya no se puede
		// rellenar
		// ninguna casilla más

		// comprobamos si el ordenador puede ganar
		// el segundo parámetro es que estamos comprobando si las X o las O
		// las X eran 1 y las O eran 2
		tirada = colocarJugada(tablero, 2);

		// comprobamos si puede evitar que el jugador gane
		if (tirada == false) {
			tirada = colocarJugada(tablero, 1);
		}

		if (tirada == false) {
			// sino se puede ganar ni evitar que el jugador gane
			// se pone el primer hueco que encontremos
			// en el momento que rellenemos un hueco paramos el bucle
			// con el boolean tirada
			for (i = 0; i < tablero.length && tirada == false; i++) {
				for (j = 0; j < tablero[i].length && tirada == false; j++) {
					if (tablero[i][j] == 0) {
						tablero[i][j] = 2;
						tirada = true;
					}
				}
			}
		}
	}

	private static boolean colocarJugada(int[][] tablero, int n) {
		boolean tirada = false;
		int i, j;

		// comprobamos para todas las filas todas las posibilidades
		for (i = 0; i < tablero.length && tirada == false; i++) {
			if (tablero[i][0] == n && tablero[i][1] == n && tablero[i][2] == 0) {
				tablero[i][2] = 2;
				tirada = true;
			}
			if (tablero[i][0] == 0 && tablero[i][1] == n && tablero[i][2] == n && tirada == false) {
				tablero[i][0] = 2;
				tirada = true;
			}
			if (tablero[i][0] == n && tablero[i][1] == 0 && tablero[i][2] == n && tirada == false) {
				tablero[i][1] = 2;
				tirada = true;
			}
		}
		// comprobamos para todas las columnas todas las posibilidades
		for (j = 0; j < tablero.length && tirada == false; j++) {
			if (tablero[0][j] == n && tablero[1][j] == n && tablero[2][j] == 0) {
				tablero[2][j] = 2;
				tirada = true;
			}
			if (tablero[0][j] == 0 && tablero[1][j] == n && tablero[2][j] == n && tirada == false) {
				tablero[0][j] = 2;
				tirada = true;
			}
			if (tablero[0][j] == n && tablero[1][j] == 0 && tablero[2][j] == n && tirada == false) {
				tablero[1][j] = 2;
				tirada = true;
			}
		}
		// comprobamos para las diagonales todas las posibilidades
		if (tablero[0][0] == n && tablero[1][1] == n && tablero[2][2] == 0 && tirada == false) {
			tablero[2][2] = 2;
			tirada = true;
		}
		if (tablero[0][0] == 0 && tablero[1][1] == n && tablero[2][2] == n && tirada == false) {
			tablero[0][0] = 2;
			tirada = true;
		}
		if (tablero[0][0] == n && tablero[1][1] == 0 && tablero[2][2] == n && tirada == false) {
			tablero[1][1] = 2;
			tirada = true;
		}
		if (tablero[2][0] == n && tablero[1][1] == n && tablero[0][2] == 0 && tirada == false) {
			tablero[0][2] = 2;
			tirada = true;
		}
		if (tablero[2][0] == 0 && tablero[1][1] == n && tablero[0][2] == n && tirada == false) {
			tablero[2][0] = 2;
			tirada = true;
		}
		if (tablero[2][0] == n && tablero[1][1] == 0 && tablero[0][2] == n && tirada == false) {
			tablero[1][1] = 2;
			tirada = true;
		}
		return tirada;
	}

	private static void mostrarMensajeGanador(int ganador, int[][] tablero) {
		String mensaje = "";
		if (ganador == 1) {
			mensaje = "Has ganado las tres en raya";
		} else if (ganador == 2) {
			mensaje = "El ordenador ha ganado las tres en raya";
		} else {
			mensaje = "No hay ganadores, no hay ningún cuadro libre.";
		}
		mostrarTablero(tablero, mensaje);
	}

	private static void mostrarTablero(int[][] tablero, String quien) {
		int i, j;
		String mensaje = quien + "\n\n";

		for (i = 0; i < tablero.length; i++) {
			for (j = 0; j < tablero[i].length; j++) {
				if (tablero[i][j] == 1) {
					mensaje += "|   X   ";
				} else if (tablero[i][j] == 2) {
					mensaje += "|   O   ";
				} else {
					mensaje += "|         ";
				}
				if (j == tablero[i].length - 1) {
					mensaje += "|";
				}
			}
			mensaje += "\n";
			if (i != tablero.length - 1) {
				mensaje += "_____________\n";
			} else {
				mensaje += "\n";
			}
		}

		JOptionPane.showMessageDialog(null, mensaje);
	}

	// si el juego ha terminado devuelve el numero de quien ha ganado
	// 1 para jugador 2 para ordenador
	// sino imprime el estado del tablero
	private static int comprobarEstadoJuego(int[][] tablero) {
		int ganador = 0;

		// comprobamos filas
		ganador = comprobarFilas(tablero);
		if (ganador == 0) {
			// comprobamos columnas
			ganador = comprobarColumnas(tablero);
		}
		if (ganador == 0) {
			// comprobamos diagonales
			ganador = comprobarDiagonales(tablero);
		}
		// si no hay ganaadores comprobamos si están todas las casillas ocupadas
		if (ganador == 0) {
			// comprobamos si está ocupado todos los cuadros y si es así el ganador es -1
			ganador = comprobarOcupado(tablero);
		}
		return ganador;
	}

	// suponemos que todas las casillas está ocupadas y tienen un 1 o un 2
	// en el momento que encontremos una que no es así devolvemos un 0 en la
	// variable ganador
	private static int comprobarOcupado(int[][] tablero) {
		int ganador = -1;

		int i, j;
		for (i = 0; i < tablero.length; i++) {
			for (j = 0; j < tablero[i].length; j++) {
				if (tablero[i][j] == 0) {
					ganador = 0;
				}

			}
		}
		return ganador;
	}

	private static int comprobarDiagonales(int[][] tablero) {
		int diagonal = 0;
		int n;
		for (n = 1; n <= 2; n++) {
			if (tablero[0][0] == n && tablero[1][1] == n && tablero[2][2] == n) {
				diagonal = n;
			}
			if (tablero[0][2] == n && tablero[1][1] == n && tablero[2][0] == n) {
				diagonal = n;
			}
		}
		return diagonal;
	}

	private static int comprobarColumnas(int[][] tablero) {
		int j;
		int col = 0;
		int n;

		for (n = 1; n <= 2; n++) {
			for (j = 0; j < tablero.length && col == 0; j++) {
				if (tablero[0][j] == n && tablero[1][j] == n && tablero[2][j] == n) {
					col = n;
				}
			}
		}
		return col;
	}

	// comprobamos filas si hay 3 valores de valor n seguidos hay 3 en raya en una
	// fila
	// el valor de n es 1 para jugador y 2 para ordenador
	private static int comprobarFilas(int[][] tablero) {
		int i;
		int n;
		int linea = 0;

		for (n = 1; n <= 2; n++) {
			for (i = 0; i < tablero.length && linea == 0; i++) {
				if (tablero[i][0] == n && tablero[i][1] == n && tablero[i][2] == n) {
					linea = n;
				}
			}
		}
		return linea;
	}

	// mensaje para introducir las coordenadas, si ya están ocupadas imprime un
	// mensaje
	// sino se registra la jugada en el tablero poniendolo a 1
	private static void jugar(int[][] tablero) {
		String coordenadas;
		int x, y;
		boolean ocupado = false;

		do {
			ocupado = false;
			do {
				coordenadas = JOptionPane.showInputDialog("Jugador introduce las coordenadas x");
				x = Integer.parseInt(coordenadas);
				coordenadas = JOptionPane.showInputDialog("Jugador introduce las coordenadas y");
				y = Integer.parseInt(coordenadas);
				if (x < 0 || x > 2 || y < 0 || y > 2) {
					JOptionPane.showMessageDialog(null, "Tienes que introducir coordenadas entre 0 y 2");
				}
			} while (x < 0 || x > 2 || y < 0 || y > 2);

			if (tablero[x][y] == 1 || tablero[x][y] == 2) {
				ocupado = true;
				JOptionPane.showMessageDialog(null, "Esa posición ya está ocupada.Selecciona otra.");
			} else {
				tablero[x][y] = 1;
			}
		} while (ocupado == true);
	}

	// ponemos a 0 todas las posiciones del tablero
	private static void reiniciar(int[][] tablero) {
		int i, j;

		for (i = 0; i < tablero.length; i++) {
			for (j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = 0;
			}
		}

	}

}
