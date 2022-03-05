import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		//Creamos el teclado
		Scanner teclado = new Scanner(System.in);
		
		//Creamos la variables
		int numeroColumnas = 0;
		int numeroFilas = 0;
		
		//Pedimos al usuario que introduzca el numero de columnas
		
		System.out.println("Por favor, introduce el numero de columnas que desea: ");
		numeroColumnas = teclado.nextInt();
		
		//Pedimos al usuario que introduzca el numero de filas
		
		System.out.println("Por favor, introduce el numero de filas que desea: ");
		numeroFilas = teclado.nextInt();
		
		//Iniciamos el programa 
	
	}
}
