<<<<<<< HEAD
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		saludar();
		mostrarPersona("Juan", 23);
		despedirse();
		
		Scanner teclado = new Scanner(System.in);
		int numeroA = 0;
		int numeroB = 0;
		int resultado = 0;
		
		System.out.println("Introduce dos numeros: ");
		numeroA = teclado.nextInt();
		numeroB = teclado.nextInt();
		
		suma(numeroA, numeroB, resultado);
		resta(numeroA, numeroB, resultado);
		multiplicacion(numeroA, numeroB, resultado);
		division(numeroA, numeroB, resultado);
		
	}
	
	public static void mostrarPersona(String nombre, int edad) {
		System.out.println(nombre + " tiene " + edad + " años");
	}

	public static void saludar() {
		System.out.println("Hola mundo!");
	}
	
	public static void despedirse() {
		System.out.println("Adiós!");
	}
	
	public static int suma(int numeroA, int numeroB, int resultado) {
		resultado = numeroA + numeroB;
		return resultado;
		
	}
	public static void resta(int numeroA, int numeroB, int resultado) {
		resultado = numeroA - numeroB;
		System.out.println("El resultado de la resta es: " + resultado);
	}
	public static void multiplicacion(int numeroA, int numeroB, int resultado) {
		resultado = numeroA * numeroB;
		System.out.println("El resultado de la multiplicacion es: " + resultado);
	}
	public static void division(int numeroA, int numeroB, int resultado) {
		resultado = numeroA / numeroB;
		System.out.println("El resultado de la division es: " + resultado);
	}
	
}
=======
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		saludar();
		mostrarPersona("Juan", 23);
		despedirse();
		
		Scanner teclado = new Scanner(System.in);
		int numeroA = 0;
		int numeroB = 0;
		int resultado = 0;
		
		System.out.println("Introduce dos numeros: ");
		numeroA = teclado.nextInt();
		numeroB = teclado.nextInt();
		
		suma(numeroA, numeroB, resultado);
		resta(numeroA, numeroB, resultado);
		multiplicacion(numeroA, numeroB, resultado);
		division(numeroA, numeroB, resultado);
		
	}
	
	public static void mostrarPersona(String nombre, int edad) {
		System.out.println(nombre + " tiene " + edad + " años");
	}

	public static void saludar() {
		System.out.println("Hola mundo!");
	}
	
	public static void despedirse() {
		System.out.println("Adiós!");
	}
	
	public static int suma(int numeroA, int numeroB, int resultado) {
		resultado = numeroA + numeroB;
		return resultado;
		
	}
	public static void resta(int numeroA, int numeroB, int resultado) {
		resultado = numeroA - numeroB;
		System.out.println("El resultado de la resta es: " + resultado);
	}
	public static void multiplicacion(int numeroA, int numeroB, int resultado) {
		resultado = numeroA * numeroB;
		System.out.println("El resultado de la multiplicacion es: " + resultado);
	}
	public static void division(int numeroA, int numeroB, int resultado) {
		resultado = numeroA / numeroB;
		System.out.println("El resultado de la division es: " + resultado);
	}
	
}
>>>>>>> 178b56d6c02bf5ea4e473864071db91da0318772
