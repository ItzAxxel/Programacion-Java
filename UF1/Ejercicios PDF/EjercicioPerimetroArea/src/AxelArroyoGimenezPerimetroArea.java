import java.util.Scanner;

public class AxelArroyoGimenezPerimetroArea {
	public static void main(String[] args) {

		/*
		 * Algorisme que demani un número 'r' i calculi el perímetre i l’àrea de la
		 * circumferència de ràdio r (p=2*PI*r, a=PI*r*r)
		 * 
		 */

		// Iniciamos el scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables

		double radio = 0; //La variable del radio del usuario, doble para que pueda usar decimales.
		double perimetro = 0; //La variable para calcular el perimetro. Doble ya que puede llegar a ser muy grande.
		double area = 0; //La variable para calcular la area. Doble ya que puede llegar a ser muy grande.
		double pi = Math.PI; //El numero pi (3,1416...)

		// Pedimos al usuario que introduzca el radio
		System.out.println("Por favor, introduce el radio: ");
		radio = teclado.nextDouble();

		// Empezamos el programa

		perimetro = 2 * pi * radio;
		area = pi * radio * radio;

		// Ponemos el resultado de la operacion

		System.out.println("El perimetro es: " + perimetro);
		System.out.println("La area es: " + area);
		
		//cerramos el teclado
		teclado.close();
	}
}
