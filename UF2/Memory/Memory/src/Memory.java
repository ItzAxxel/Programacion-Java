import java.util.Scanner;

public class Memory {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*
		 * 
		 * Bucle n x n = tama�o mapa /dificultad juego tiene que ser par Forma aleatoria
		 * de letras 2 de cada (A, A) Preguntar posicion Validar posiciones Comprobar si
		 * son iguales Si es igual lo dejamos si no a la puta y se ocultan Comprobar si
		 * el mapa est� completo
		 * 
		 * 
		 */

		int numeroUsuario = 0;
		System.out.println("Dame un tama�o y que sea un numero par: ");
		numeroUsuario = teclado.nextInt();
		while (numeroUsuario != 4 && numeroUsuario != 6 && numeroUsuario != 8) {
			System.out.println(
					"El tama�o que has introducido es incorrecto o no es par. \nRecuerda que �nicamente puedes poner los siguientes n�meros: 4, 6 � 8");
			System.out.println("Introduce correctamente el tama�o: ");
			numeroUsuario = teclado.nextInt();
			System.out.println();
		}

		char[][] mapaNoJugable = new char[numeroUsuario][numeroUsuario];
		char[][] mapaJugable = crearMapaVacio(numeroUsuario);
		rellenarMapa(mapaNoJugable);
		printarMapa(mapaJugable);
		System.out.println("Escoge una posici�n: ");
		String[] coordenadaUsuario = teclado.nextLine().split(" ");
		
		
	}

	public static char[][] crearMapaVacio(int tamanoDelMapa) {
		char[][] mapa = new char[tamanoDelMapa][tamanoDelMapa];

		for (int i = 0; i < tamanoDelMapa; i++) {
			for (int j = 0; j < tamanoDelMapa; j++) {
				mapa[i][j] = '?';
			}
		}

		return mapa;

	}
	

	public static void rellenarMapa(char[][] mapa) {
		
		char letraInicial = 'A';
		
		// Tabla con letras
		
		for (int i = 0; i < mapa.length; i++) {
			for (int j = 0; j < mapa[i].length; j += 2) {
				mapa[i][j] = letraInicial;
				mapa[i][j + 1] = letraInicial;
				letraInicial += 1;
			}
		}

	}
	
	public static void printarMapa(char [][] mapa) {
		for (int i = 0; i < mapa.length; i++) {
			for (int j = 0; j < mapa.length; j++) {
				System.out.print(mapa[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int validarPosicion(int [] coordenadaUsuario, char[][] mapaJugable) {
		
		
		return 0;
		
	}
	
	 

}
