//Axel Arroyo Giménez

import java.util.Random; //Importamos esto para la variable de RANDOM
import java.util.Scanner; //Importamos esto para el variable de SCANNER

public class AxelArroyoGimenez_Canicas_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos el scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables de las operaciones lógicas
		int resultadoSuma = 0;
		int resultadoPar = 0;
		int resultadoImpar = 0;
		
		//Creamos las variables de las canicas. Les ponemos el valor de 10 a cada una
		int canicasUsuario = 10;
		int canicasIA = 10;
		
		//Creamos las variables para las eleciones
		int elecionUsuario = 0;
		int elecionIA = 0;
		
		//Creamos las variables para las apuestas
		int apuestaUsuario = 0;
		int apuestaIA = 0;
		
		//Creamos la variable para el mínimo de canicas
		int minimoCanicas = 0;
		
		System.out.println("\n"
				+ "░██████╗░██████╗░██╗░░░██╗██╗██████╗░  ░██████╗░░█████╗░███╗░░░███╗███████╗\n"
				+ "██╔════╝██╔═══██╗██║░░░██║██║██╔══██╗  ██╔════╝░██╔══██╗████╗░████║██╔════╝\n"
				+ "╚█████╗░██║██╗██║██║░░░██║██║██║░░██║  ██║░░██╗░███████║██╔████╔██║█████╗░░\n"
				+ "░╚═══██╗╚██████╔╝██║░░░██║██║██║░░██║  ██║░░╚██╗██╔══██║██║╚██╔╝██║██╔══╝░░\n"
				+ "██████╔╝░╚═██╔═╝░╚██████╔╝██║██████╔╝  ╚██████╔╝██║░░██║██║░╚═╝░██║███████╗\n"
				+ "╚═════╝░░░░╚═╝░░░░╚═════╝░╚═╝╚═════╝░  ░╚═════╝░╚═╝░░╚═╝╚═╝░░░░░╚═╝╚══════╝");
		System.out.println("\n");
		System.out.println("Hola jugadxr, bienvenidx al juego numero 4.\nDeberas jugar contra la maquina al juego de las canicas. \nEl ganador sera aquel que consiga las 10 canicas del contrincante. Suerte, la necesitaras ;)\n");

		//Creamos un bucle donde las canicas del usuario y de la IA sean diferentes a 20, se seguirá repitiendo
		while (canicasUsuario != 20 || canicasIA != 20) {
			
			// Creamos la variable de random
			Random randomApuestaIA = new Random();
			Random randomElecionIA = new Random();
			
			//La variable de apuesta IA es para que introduzca un numero del 1 al 10
			apuestaIA = randomApuestaIA.nextInt(11);
			//La variable de elecionIA es para que introduzca un núemero del 1 al 2
			elecionIA = randomElecionIA.nextInt(3);

			// Decimos de que va el programa
			System.out.println("¿Con que vas a jugar?");
			System.out.println("Par [1] | Impar [2]");
			//Guardamos la elecion del usuario
			elecionUsuario = teclado.nextInt();
			
			if(elecionUsuario > 10 || elecionUsuario <= 0) {
				System.out.println("No puedes apostar esa cantidad! Introduce otra apuesta, por favor: ");
				elecionUsuario = teclado.nextInt();
			}

			//Igualamos la variable de "elecionIA" a 1 haciendo que elija PAR
			if (elecionIA == 0) {
				elecionIA = 1;
			}
			//Igualamos la variable de "apuestaIA" a 1 haciendo que tenga como mínimo un 1
			if (apuestaIA == 0) {
				apuestaIA = 1;
			}
			//Comprobamos si el usuario elije la opción de PAR
			if (elecionUsuario == 1) {
				elecionIA = 2; //Hacemos que por la fuerza la IA elija IMPAR
				System.out.println("Has elegido jugar con: PAR");
				System.out.println("La IA jugara con: IMPAR");
				System.out.println("¿Cual sera tu apuesta?");
				apuestaUsuario = teclado.nextInt();
				apuestaIA = randomApuestaIA.nextInt(11); //Guardamos el número aleatorio que elija la IA
				System.out.println("La IA ha jugado con: " + apuestaIA);
			} else {
				elecionIA = 1; //Hacemos que por la fuerza la IA elija PAR
				System.out.println("Has elegido jugar con: IMPAR");
				System.out.println("La IA jugara con: PAR");
				System.out.println("¿Cual sera tu apuesta?");
				apuestaUsuario = teclado.nextInt();
				apuestaIA = randomApuestaIA.nextInt(11);
				System.out.println("La IA ha jugado con: " + apuestaIA);
			}

			
			//Empezamos con las operaciones lógicas, guardamos el resultado en las 3 variables
			
			//Para comprobar si el resultado es par
			resultadoPar = apuestaUsuario + apuestaIA;
			//Para comprobar si el resultado es impar
			resultadoImpar = apuestaUsuario + apuestaIA;
			//Para la suma
			resultadoSuma = apuestaUsuario + apuestaIA;

			// PAR Y IMPAR USUARIO
			if (resultadoPar % 2 == 0 && elecionUsuario == 1 && elecionIA == 2) {
				System.out.println(
						"El resultado de la suma es: " + resultadoSuma + " por tanto, es PAR y gana el jugador!");
			}
			if (resultadoImpar % 2 == 1 && elecionUsuario == 2 && elecionIA == 1) {
				System.out.println(
						"El resultado de la suma es: " + resultadoSuma + " por tanto, es IMPAR y gana el jugador!");
			}

			// PAR Y IMPAR IA
			if (resultadoPar % 2 == 0 && elecionIA == 1 && elecionUsuario == 2) {
				System.out.println("El resultado de la suma es: " + resultadoSuma + " por tanto, es PAR y gana la IA!");
			}
			if (resultadoImpar % 2 == 1 && elecionIA == 2 && elecionUsuario == 1) {
				System.out
						.println("El resultado de la suma es: " + apuestaUsuario + " + " + apuestaIA + " = " + resultadoSuma + " por tanto, es IMPAR y gana la IA!");
			}
			
			
			//Esta variable es para calcular el mínimo de canicas que se lleva el ganador
			if (apuestaUsuario < apuestaIA) {
				minimoCanicas = apuestaUsuario;
			}
			if (apuestaIA > apuestaUsuario) {
				minimoCanicas = apuestaIA;
			}

			//Ponemos el resultado de la ronda
			System.out.println("El resultado de la ronda es: ");
			canicasIA = apuestaIA + minimoCanicas;
			canicasUsuario = apuestaUsuario + minimoCanicas;
			System.out.println("El jugador tiene: " + canicasUsuario + " canicas");
			System.out.println("La IA tiene: " + canicasIA + " canicas");

		}
		
		if (canicasUsuario == 20) {
			System.out.println("El ganador de la partida es el JUGADOR! FELICIDADES :D");
		}
		if (canicasIA == 20) {
			System.out.println("El ganador de la partida es la IA! Más suerte la próxima!");
			System.out.println("");
		}
		
		//Cerramos el teclado
		teclado.close();
	}

}