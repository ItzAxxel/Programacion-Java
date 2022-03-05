import java.util.Random;

public class Main {
	public static void main(String[] args) {

		// Creacion de las variables
		Random aleatorio = new Random(); // Creamos la variable de random denominandola "aleatorio"
		int numero = 0; // Iniciamos la variable principal a 0
		
		//Decimos para que se usa el programa
		System.out.println("Este programa sirve para generar numeros aleatorios y que te den una nota");
		System.out.println("");
		
		// Ponemos la cantidad de numeros que queremos generar
		numero = aleatorio.nextInt(11);

		// Iniciamos el programa

		if (numero <= 4) {
			System.out.println("Tu nota ha sido de: " + numero + " Por tanto, has suspendido. ¡Haber estudiao!");
		} else if (numero <= 6) {
			System.out.println("Tu nota ha sido de: " + numero + " Por tanto, ¡Has aprobado! Pero sigue esforzándote.");
		} else if (numero <= 8) {
			System.out.println("Tu nota ha sido de: " + numero + " Por tanto, ¡Has aprobado! Sigue así y llegarás al sobresaliente!");
		} else {
			System.out.println("Tu nota ha sido de: " + numero + " Por tanto, ¡Has aprobado y te llevas un sobresaliente! Bien hecho guapisimx.");
		}
	}
}
