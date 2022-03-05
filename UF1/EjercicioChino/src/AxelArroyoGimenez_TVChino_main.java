import java.util.Scanner;

public class AxelArroyoGimenez_TVChino_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * La TV de Juan tiene 99 canales continuos, desde el canal 1 al canal 99. Hace
		 * algún tiempo, el control remoto se rompió y estos números no funcionaban, por
		 * lo que no podía usarlos para acceder a sus canales favoritos. Al menos los
		 * botones de canal anterior y siguiente siguen activos. No desea que estos
		 * botones se desconecten, por lo que siempre intenta presionar la menor
		 * cantidad de veces.
		 * 
		 * Sabiendo que cuando saltas del 99 al siguiente canal, el televisor salta al 1
		 * y viceversa, ¿cuántas veces tienes que avanzar o retroceder para obtener lo
		 * mejor del canal A al canal B?
		 * 
		 * Entrada
		 * 
		 * La entrada consta de una serie de casos de prueba que constan de dos valores
		 * entre 1 y 99, el primero correspondiente al canal en el que se encuentra y el
		 * segundo correspondiente al canal al que desea acceder. Cuando ambos números
		 * son 0, la entrada finaliza.
		 * 
		 * Exportar Para cada caso de prueba, se escribirá una fila, que mostrará la
		 * cantidad de veces que se debe omitir ese canal para lograr mejor su objetivo.
		 * 
		 * 
		 * Ejemplo de implementación:
		 * 
		 * Canal inicial: 2 Canal final: 5 Número de saltos: 3 Canal inicial: 2 Canal
		 * final: 99 Número de saltos: 2 Canal inicial: 5 Canal final: 63 Número de
		 * saltos: 41 Canalninicial: 63 Canal final: 5 Número de saltos: 41 Canal
		 * inicial: 0 Canal final: 0 Finaliza el programa.
		 * 
		 */

		// Explicamos de qué va el programa:
		System.out.println(
				"¡Bienvenidx! \nEste programa te ayudará a saber cuantos saltos hace el programa entre dos números. \nTen encuenta que si los números que has introducido son lejanos como por ejemplo 2 y 99 contará desde atrás.");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------");

		// Creamos el teclado
		Scanner teclado = new Scanner(System.in);

		// Crearemos las variables necesarias
		int primerNumero = 0;
		int segundoNumero = 0;
		int saltos = 0;

	
		System.out.println("Introduce el primer canal: ");
		primerNumero = teclado.nextInt();

		// Pedimos al usuario que introduzca el número de salida
		System.out.println("Introduce el último canal: ");
		segundoNumero = teclado.nextInt();
		
		for (int i = primerNumero; i > primerNumero && i < segundoNumero; i++) {
			saltos++;
			
			System.out.println("Introduce el primer canal: ");
			primerNumero = teclado.nextInt();

			// Pedimos al usuario que introduzca el número de salida
			System.out.println("Introduce el último canal: ");
			segundoNumero = teclado.nextInt();
			System.out.println("El número de saltos son: " + i);
			
		}
		//if (primerNumero == 0 && segundoNumero == 0) {
			//System.out.println("Ambos números son iguales a 0, el programa termina aquí.");
		//}

	}
}
