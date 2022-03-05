//Axel Arroyo Giménez

import java.util.Random;
import java.util.Scanner;

public class AxelArroyoGimenez_TicTacToe_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos el Scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables necesarias
		Random aleatorio = new Random(); // Creamos una variable para la IA de numeros aleatorios
		int table[][] = new int[3][3]; // Tabla
		int row = 0; // Variable inicializada en -1 para poder hacer el try catch correctamente
		int column = 0;// Variable inicializada en -1 para poder hacer el try catch correctamente
		int UserChoice = 0; // Variable para la elección del usuario
		int rand = 0; // variable para el número aletorio
		boolean TryCatch = true; // Variable para el trycatch
		boolean playing = true; // Variable para saber si se está jugando o no
		String playerOne = " "; // Variable para saber el nombre del jugador 1
		String playerTwo = " "; // Varable para saber el nombre del jugador 2
		boolean playerOneTurn = true; // Variable para el turno del jugador 1
		boolean playerTwoTurn = true; // Variable para el turno del jugador 2

		// Explicamos de que va el programa

		System.out.println("¡Bienvenidx! Este programa sirve para jugar al típico juego de 3 en raya.");
		System.out.println("Puedes jugarlo con un amigx o contra la IA.\n");
		System.out.println("\n¿Jugarás con un amigx o contra la IA?");
		System.out.println("[1] Jugar con un amix | Jugar contra la IA [2]");
		UserChoice = teclado.nextInt();

		System.out.println();

		// Jugador contra jugador
		if (UserChoice == 1) {
			System.out.println("Has selecionado la primera opción de jugar con tu amigx. ¡Que gane el mejor!\n");
			System.out.println("**************************************************************************");
			System.out.println("                                                                          ");
			System.out.println("                              LEYENDA: ");
			System.out.println("                                                                          ");
			System.out.println("- Un 0 supondrá que la casilla está vacía\r\n"
					+ "- Un 1 supondrá que el jugador 1 ha marcado esa casilla\r\n"
					+ "- Un 2 supondrá que el jugador 2 ha marcado esa casilla");
			System.out.println("                                                                           ");
			System.out.println(
					"IMPORTANTE: Si una casilla ya ha sido marcada, no podrás volver a poner esa \nposicion. ");
			System.out.println("                                                                           ");
			System.out.println("**************************************************************************");
			System.out.println();

			System.out.println("Introduce el nombre del primer jugador: ");
			playerOne = teclado.nextLine();

			playerOne = teclado.nextLine();

			System.out.println("Introduce el nombre del segundo jugador: ");
			playerTwo = teclado.nextLine();

			// Mientras la partida está en curso
			while (playing) {
				while (playerOneTurn) { // El turno del jugador 1
					System.out.println("Es el turno de: " + playerOne);
					System.out.println();
					for (int i = 0; i < 3; i++) { // La tabla modificandose
						for (int j = 0; j < 3; j++) {
							System.out.print(table[i][j] + " ");
						}
						System.out.println();
					}

					// Pedimos datos de fila

					while (row < 0 || row > 2) {
						do {
							TryCatch = true;

							try {
								System.out.println("\nIntroduce la fila donde quieras introducir el número: ");
								row = Integer.parseInt(teclado.nextLine());

							} catch (Exception e) {
								System.out.println("Valor incorrecto.");
								TryCatch = false;

							}
						} while (!TryCatch);
					}

					// Pedimos datos de columna

					while (column < 0 || column > 2) {
						do {
							TryCatch = true;
							try {
								System.out.println("Introduce la columna donde quieras introducir el número: ");
								column = Integer.parseInt(teclado.nextLine());

							} catch (Exception e) {
								System.out.println("Valor incorrecto.");
								TryCatch = false;

							}
						} while (!TryCatch);
					}

					// Miramos si la posición está marcada
					while (table[row][column] != 0) {
						System.out.println("Posición marcada, elige de nuevo.");
						System.out.println("Elige la fila: ");
						row = Integer.parseInt(teclado.nextLine());
						System.out.println("Elige la columna: ");
						column = Integer.parseInt(teclado.nextLine());
					}

					// El 1 es el jugador 1
					table[row][column] = 1;
					for (int i = 0; i < 3; i++) {
						for (int j = 0; j < 3; j++) {
							System.out.print(table[i][j] + " ");
						}
						System.out.println();
					}

					// gana el jugador 1
					if (table[0][0] == 1 && table[0][1] == 1 && table[0][2] == 1) {
						System.out.println("Felicidades ha ganado el jugador " + playerOne);
						playing = false;
						playerOneTurn = false;
						playerTwoTurn = false;
					} else if (table[1][0] == 1 && table[1][1] == 1 && table[1][2] == 1) {
						System.out.println("Felicidades ha ganado el jugador " + playerOne);
						playing = false;
						playerOneTurn = false;
						playerTwoTurn = false;

					} else if (table[2][0] == 1 && table[2][1] == 1 && table[2][2] == 1) {
						System.out.println("Felicidades ha ganado el jugador " + playerOne);
						playing = false;
						playerOneTurn = false;
						playerTwoTurn = false;
					} else if (table[0][0] == 1 && table[1][1] == 1 && table[2][2] == 1) {
						System.out.println("Felicidades ha ganado el jugador " + playerOne);
						playing = false;
						playerOneTurn = false;
						playerTwoTurn = false;
					} else if (table[0][2] == 1 && table[1][1] == 1 && table[0][0] == 1) {
						System.out.println("Felicidades ha ganado el jugador " + playerOne);
						playing = false;
						playerOneTurn = false;
						playerTwoTurn = false;
					}

					row = -1; // Volvemos las variables a su estado original
					column = -1; // Volvemos las variables a su estado original

					// Jugador 2
					while (playerTwoTurn) {
						System.out.println("Es el turno de: " + playerTwo);
						for (int i = 0; i < 3; i++) {
							for (int j = 0; j < 3; j++) {

							}
							System.out.println();
						}

						// Pedimos datos de la fila

						while (row < 0 || row > 2) {
							do {
								TryCatch = true;

								try {
									System.out.println("\nIntroduce la fila donde quieras introducir el número: ");
									row = Integer.parseInt(teclado.nextLine());

								} catch (Exception e) {
									System.out.println("Valor incorrecto.");
									TryCatch = false;

								}
							} while (!TryCatch);
						}

						// Pedimos datos de la columna

						while (column < 0 || column > 2) {
							do {
								TryCatch = true;
								try {
									System.out.println("Introduce la columna donde quieras introducir el número: ");
									column = Integer.parseInt(teclado.nextLine());

								} catch (Exception e) {
									System.out.println("Valor incorrecto.");
									TryCatch = false;

								}
							} while (!TryCatch);
						}

						// Miramos si la posición está marcada

						while (table[row][column] != 0) {

							System.out.println("Posición marcada, elige de nuevo.");
							System.out.println("Elige la fila: ");
							row = Integer.parseInt(teclado.nextLine());
							System.out.println("Elige la columna: ");
							column = Integer.parseInt(teclado.nextLine());

						}

						// El jugador 2 es el 2
						table[row][column] = 2;

						for (int i = 0; i < 3; i++) {
							for (int j = 0; j < 3; j++) {
								System.out.print(table[i][j] + " ");
							}
							System.out.println();
						}

						// gana el jugador 2

						if (table[0][0] == 1 && table[0][1] == 1 && table[0][2] == 1) {

							System.out.println("Felicidades ha ganado el jugador " + playerTwo);
							playing = false;
							playerOneTurn = false;
							playerTwoTurn = false;

						} else if (table[1][0] == 1 && table[1][1] == 1 && table[1][2] == 1) {

							System.out.println("Felicidades ha ganado el jugador " + playerTwo);
							playing = false;
							playerOneTurn = false;
							playerTwoTurn = false;

						} else if (table[2][0] == 1 && table[2][1] == 1 && table[2][2] == 1) {
							System.out.println("Felicidades ha ganado el jugador " + playerTwo);
							playing = false;
							playerOneTurn = false;
							playerTwoTurn = false;
						} else if (table[0][0] == 1 && table[1][1] == 1 && table[2][2] == 1) {

							System.out.println("Felicidades ha ganado el jugador " + playerTwo);
							playing = false;
							playerOneTurn = false;
							playerTwoTurn = false;

						} else if (table[0][2] == 1 && table[1][1] == 1 && table[0][0] == 1) {

							System.out.println("Felicidades ha ganado el jugador " + playerTwo);
							playing = false;
							playerOneTurn = false;
							playerTwoTurn = false;

						}

						row = -1; // Volvemos las variables a su estado original
						column = -1; // Volvemos las variables a su estado original

						// Sistema de turnos. El jugador 1 va primero y el jugador 2 va segundo
						playerOneTurn = true;
						playerTwoTurn = false;

					}
				}
			}

			// IA vs Jugador

		} else {

			// Explicamos la leyenda
			System.out.println("Has selecionado la primera opción de jugar con tu amigx. ¡Que gane el mejor!\n");
			System.out.println("**************************************************************************");
			System.out.println("                                                                          ");
			System.out.println("                              LEYENDA: ");
			System.out.println("                                                                          ");
			System.out.println("- Un 0 supondrá que la casilla está vacía\r\n"
					+ "- Un 1 supondrá que el jugador 1 ha marcado esa casilla\r\n"
					+ "- Un 2 supondrá que la IA ha marcado esa casilla");
			System.out.println("                                                                           ");
			System.out.println(
					"IMPORTANTE: Si una casilla ya ha sido marcada, no podrás volver a poner esa \nposicion. ");
			System.out.println("                                                                           ");
			System.out.println("**************************************************************************");
			System.out.println();

			// Mientras la partida esta en curso

			while (playing) {
				while (playerOneTurn) { // Turno del jugador
					System.out.println("Es tu turno!");
					for (int i = 0; i < 3; i++) {
						for (int j = 0; j < 3; j++) {
							System.out.print(table[i][j] + " ");
						}
						System.out.println();
					}

					// Pedimos los datos de la fila
					while (row < 0 || row > 2) {
						do {

							TryCatch = true;

							try {
								System.out.println("\nIntroduce la fila donde quieras introducir el número: ");
								row = Integer.parseInt(teclado.nextLine());

							} catch (Exception e) {
								System.out.println("Valor incorrecto.");
								TryCatch = false;

							}
						} while (!TryCatch);
					}

					// Pedimos los datos de la columna

					while (column < 0 || column > 2) {
						do {
							TryCatch = true;
							try {
								System.out.println("Introduce la columna donde quieras introducir el número: ");
								column = Integer.parseInt(teclado.nextLine());

							} catch (Exception e) {
								System.out.println("Valor incorrecto.");
								TryCatch = false;

							}
						} while (!TryCatch);
					}

					// Miramos si la posición está elegida
					while (table[row][column] != 0) {
						System.out.println("Posición marcada, elige de nuevo.");
						System.out.println("Elige la fila: ");
						row = Integer.parseInt(teclado.nextLine());
						System.out.println("Elige la columna: ");
						column = Integer.parseInt(teclado.nextLine());
					}

					// El 1 es el jugador
					table[row][column] = 1;

					// Printamos la tabla modificando
					for (int i = 0; i < 3; i++) {
						for (int j = 0; j < 3; j++) {
							System.out.print(table[i][j] + " ");
						}
						System.out.println();
					}

					// Comprobamos si gana el jugador
					if (table[0][0] == 1 && table[0][1] == 1 && table[0][2] == 1) {
						System.out.println("¡Felicidades has ganado!");
						playing = false;
						playerOneTurn = false;
						playerTwoTurn = false;
					} else if (table[1][0] == 1 && table[1][1] == 1 && table[1][2] == 1) {
						System.out.println("¡Felicidades has ganado!");
						playing = false;
						playerOneTurn = false;
						playerTwoTurn = false;

					} else if (table[2][0] == 1 && table[2][1] == 1 && table[2][2] == 1) {
						System.out.println("¡Felicidades has ganado!");
						playing = false;
						playerOneTurn = false;
						playerTwoTurn = false;
					} else if (table[0][0] == 1 && table[1][1] == 1 && table[2][2] == 1) {
						System.out.println("¡Felicidades has ganado!");
						playing = false;
						playerOneTurn = false;
						playerTwoTurn = false;
					} else if (table[0][2] == 1 && table[1][1] == 1 && table[0][0] == 1) {
						System.out.println("¡Felicidades has ganado!");
						playing = false;
						playerOneTurn = false;
						playerTwoTurn = false;
					}

					row = -1; // Reiniciamos la variable a su valor original
					column = -1; // Reiniciamos la variable a su valor original
					playerTwoTurn = true; // Turno para la IA

					while (playerTwoTurn) { // Turno de la IA

						System.out.println("Es el turno de la IA!");
						rand = aleatorio.nextInt(3);
						row = rand;
						column = rand;

						// Pone numeros en todas las direcciones
						while (table[row][column] != 0) {
							rand = aleatorio.nextInt(3);
							row = rand;
							rand = aleatorio.nextInt(3);
							column = rand;
						}

						// La IA será el 2
						table[row][column] = 2;

						for (int i = 0; i < 3; i++) {
							for (int j = 0; j < 3; j++) {
								System.out.print(table[i][j] + " ");
							}
							System.out.println();
						}
						row = -1; //
						column = -1;
						playerTwoTurn = false;
					}
				}

				// Gana la IA
				if (table[0][0] == 1 && table[0][1] == 1 && table[0][2] == 1) {
					System.out.println("¡Ganó la IA! Más suerte la próxima");
					playing = false;
					playerOneTurn = false;
					playerTwoTurn = false;

				} else if (table[1][0] == 1 && table[1][1] == 1 && table[1][2] == 1) {
					System.out.println("¡Ganó la IA! Más suerte la próxima");

					playing = false;
					playerOneTurn = false;
					playerTwoTurn = false;

				} else if (table[2][0] == 1 && table[2][1] == 1 && table[2][2] == 1) {
					System.out.println("¡Ganó la IA! Más suerte la próxima");
					playing = false;
					playerOneTurn = false;
					playerTwoTurn = false;

				} else if (table[0][0] == 1 && table[1][1] == 1 && table[2][2] == 1) {
					System.out.println("¡Ganó la IA! Más suerte la próxima");
					playing = false;
					playerOneTurn = false;
					playerTwoTurn = false;

				} else if (table[0][2] == 1 && table[1][1] == 1 && table[0][0] == 1) {
					System.out.println("¡Ganó la IA! Más suerte la próxima");
					playing = false;
					playerOneTurn = false;
					playerTwoTurn = false;
				}

				row = -1; // Volvemos las variables a su estado original
				column = -1; // Volvemos las variables a su estado original

				// Sistema de turnos, el jugador 1 va primero la IA va segunda
				playerOneTurn = true;
				playerTwoTurn = false;

			}

		}

		// Cerramos el teclado
		teclado.close();

	}

}