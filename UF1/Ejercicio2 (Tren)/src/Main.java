import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		//Creamos las variables
		float velocidadA = 0; //Es el tren A
		float velocidadB = 0; //Es el tren B
		float distancia = 0; //Distancia
		float tiempo = 0; //Tiempo
		float velocidadTotal = 0; //Velocidad total
		
		//indicamos para que se usa este programa
		System.out.println("Este programa sirve para calcular dos velocidades y una distancia");
		
		
		//Creamos el teclado
		Scanner teclado = new Scanner(System.in);
	
		//Pedimos al usuario que introduzca los datos del tren A
		System.out.println("Introduce la velocidad del tren A con numeros enteros y positivos: ");
		velocidadA = teclado.nextFloat();
		
		//Pedimos al usuario que introduzca los datos del tren B
		System.out.println("Introduce la velocidad del tren B con numeros enteros y positivos: ");
		velocidadB = teclado.nextFloat();
		
		//Pedimos al usuario que introduzca la distancia
		System.out.println("Introduce la distancia con numeros enteros y positivos: ");
		distancia = teclado.nextFloat();
		
		teclado.close();
		
		//Calculamos la velocidad total
		
		velocidadTotal = velocidadA + velocidadB;
		
		//Calculamos el tiempo
		
		tiempo = distancia / velocidadTotal;
		
		//Calculamos la Distancia

		distancia = tiempo * velocidadA;
		
		System.out.println("La distancia es: " + distancia);
		
	}
}
