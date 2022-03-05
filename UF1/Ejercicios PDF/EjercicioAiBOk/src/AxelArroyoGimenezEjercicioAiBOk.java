import java.util.Scanner;

public class AxelArroyoGimenezEjercicioAiBOk {
	
	public static void main(String[] args) {
		
		/* 
		 * Algorisme que demani dos números a i b e imprimeixi 'OK' si tots 
		 * dos són positius o 'a' es positiu. Ha de imprimir 'NO' en qualsevol
		 * altre cas
		 * 
		 */
		
		//Creamos el scanner
		
		Scanner teclado = new Scanner(System.in);
		
		//Creamos las variables
		
		int numeroA = 0;
		int numeroB = 0;
		
		//Pedimos al usuario que introduzca los numeros
		
		System.out.println("Por favor, introduce un numero: ");
		numeroA = teclado.nextInt();
		
		System.out.println("Por favor, introduce otro numero: ");
		numeroB = teclado.nextInt();
		
		//Empezamos con el programa
		if (numeroA > 0 && numeroB > 0) {
			System.out.println("OK");
		} else if (numeroA > 0) {
			System.out.println("OK");
		} else {
			System.out.println("NO");
		}
		
		//Cerramos el teclado
		teclado.close();
	}
}
