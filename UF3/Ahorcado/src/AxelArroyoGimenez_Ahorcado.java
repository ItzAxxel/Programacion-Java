
/**
 *
 * @author Axel
 *
 */

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class AxelArroyoGimenez_Ahorcado {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		String NomFit = "datos.bin"; // Extensissss mas frecuentes de los ficheros binarios: .dat .bin
		menu(NomFit);
	}

	public static int menu(String NomFit) {
		int opcionUsuario = 0;
		System.out.println();
		System.out.println("**********************************************************************************");
		System.out.println("*                                                                                *");
		System.out.println("*                                COMO JUGAR                                      *");
		System.out.println("*                                                                                *");
		System.out.println("* El programa elegirá una palabra de entre más de 5000 palabras en inglés        *");
		System.out.println("* deberás adivinarla pero solo tendrás 5 intentos, después finalizará la partida *");
		System.out.println("*                                                                                *");
		System.out.println("**********************************************************************************");
		System.out.println();
		System.out.println("Escoge una opción: ");
		System.out.println("1.- Jugar");
		System.out.println("2.- Mostrar ranking ");
		System.out.println("3.- Salir");

		opcionUsuario = teclado.nextInt();

		if (opcionUsuario == 1) {
			ahorcado();
		} else if (opcionUsuario == 2) {
			ranking(NomFit, opcionUsuario, NomFit);
		} else {

		}

		return opcionUsuario;
	}

	public static void ahorcado() {
		BufferedReader lector = null;
		String numeroPalabras[] = new String[174950]; // Cantidad de palabras que hay en el archivo "dictionary.txy"
		String vocabularioAhorcado[] = new String[5000]; // Palabras que se usarán
		String nombreJugador;
		Random rand = new Random();
		int vidas = 5;
		int victoria = 0;
		int puntuacion = 0;
		int contadorBucle = 0;
		int adivinaLetra = 0;
		char letraUsuario;
		boolean enJuego = true;

		System.out.println("¡Bienvenidx! Pon tu nombre jugador: ");
		nombreJugador = teclado.next();

		ingresar(nombreJugador, nombreJugador, nombreJugador);

		// Lee el archivo de "dictionary.txt"

		try {
			lector = new BufferedReader(new FileReader("dictionary.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("El error es: " + e);
		}

		// Ordena las palabras del archivo

		try {
			for (int i = 0; i < numeroPalabras.length; i++) {
				numeroPalabras[i] = lector.readLine();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		for (int i = 0; i < vocabularioAhorcado.length; i++) {
			vocabularioAhorcado[i] = numeroPalabras[rand.nextInt(numeroPalabras.length)];
		}

		// Elije una palabra aleatoria

		String palabraJuego = vocabularioAhorcado[rand.nextInt(5000)];
		
		char letraCorrecta[] = new char[palabraJuego.length()];
		boolean comprobante[] = new boolean[palabraJuego.length()];

		while (vidas != 0 && enJuego == true) {

			// Printar las letras adivinadas y las que le quedan
			for (int i = 0; i < comprobante.length; i++) {
				if (comprobante[i] == true) {
					System.out.print(palabraJuego.charAt(i));
				} else {
					System.out.print("*");
				}
			}

			System.out.println();

			System.out.println("Te quedan: " + vidas + " vida(s)");

			// Pedimos al usuario una letra
			System.out.println("Elije una letra: ");
			letraUsuario = teclado.next().charAt(0);

			// Comprobamos si la letra existe en la variable de "palabraJuego"

			for (int i = 0; i < palabraJuego.length(); i++) {
				for (int j = 0; j < palabraJuego.length(); j++) {
					if (palabraJuego.charAt(i) == letraUsuario && adivinaLetra == 0) {
						letraCorrecta[puntuacion] = letraUsuario;
						puntuacion++;
						adivinaLetra++;

					} else {

					}
				}
			}

			if (adivinaLetra == 0) {
				vidas = vidas - 1;
			}

			adivinaLetra = 0;

			// Saber las posiciones de las letras adivinadas

			for (int i = 0; i < comprobante.length; i++) {
				for (int j = 0; j < comprobante.length; j++) {
					if (palabraJuego.charAt(i) == letraCorrecta[j]) {
						comprobante[i] = true;
					}
				}
			}

			for (int i = 0; i < comprobante.length; i++) {
				if (comprobante[i] == true) {
					contadorBucle++;
				}
				if (contadorBucle == comprobante.length) {
					enJuego = false;
					System.out.println("¡Has ganado la partida, felicidades!");
					System.out.println("La palabra es: " + palabraJuego);
					victoria++;
				}
			}

			contadorBucle = 0;

		}

		if (vidas > 0) {

		} else if (vidas <= 0) {
			System.out.println("¡Has perdido todas las vidas!");
			System.out.println("La palabra era: " + palabraJuego);
			enJuego = false;
		}

	}

	public static void ingresar(String nombre, String ID, String cedula) {
		String temporal = "";

		try {
			FileWriter escritura = new FileWriter("nombreJugador.txt", true);
			BufferedWriter escrituraLinea = new BufferedWriter(escritura);
			PrintWriter imprimir = new PrintWriter(escrituraLinea);

			FileReader lector = new FileReader("nombreJugador.txt");
			BufferedReader lectorLinea = new BufferedReader(lector);

			boolean exist = false; // Controla si existe la linea
			String nuevosDatos = ID + "/ " + nombre + "/" + cedula;
			while ((temporal = lectorLinea.readLine()) != null) {
				if (temporal.equalsIgnoreCase(nuevosDatos)) {// Verifica que la linea exista
					exist = true;
					break; // Si se encuentra al menos una coinciencia detenemos la iteración y cambiamos
							// el estado de exist
				}
			}
			if (!exist) { // Si no existe agregamos la linea
				imprimir.println(nuevosDatos);
				imprimir.flush();
				System.out.println("Eres un nuevo jugador.");
			} else {
				System.out.println("Bienvenidx de nuevo.");
			}
		} catch (IOException e) {
			System.out.println("No se pudo crear el archivo");
		}
	}

	public static void ranking(String Fit, int victoria, String nombreJugador) {
		int victorias;
		String nombreJugadore;
		try {
			// true -> guarda los datos al final del fichero conservando los datos que ya
			// había
			// false o res -> Si el archivo existe lo elimina y escribe el nuevo contenido
			DataOutputStream escribeFichero = new DataOutputStream(new FileOutputStream(Fit, true));
			// Escribimos un entero
			escribeFichero.writeInt(victorias = victoria);
			// Escribimos una cadena
			escribeFichero.writeUTF(nombreJugadore = nombreJugador);
		} catch (IOException e) {
			System.out.println("Error E/S");
		}

		try {
			DataInputStream leeFichero = new DataInputStream(new FileInputStream(Fit));

			do {
				// Leemos un numero y lo mostramos
				System.out.println(leeFichero.readInt());

				// Leemos una cadena y lo mostramos
				System.out.println(leeFichero.readUTF());

			} while (true);

		} catch (IOException e) {
			System.out.println("Error E/S");
		}

	}

}