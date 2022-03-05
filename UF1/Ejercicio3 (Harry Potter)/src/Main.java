import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	//Creamos el teclado
    	Scanner teclado = new Scanner(System.in);
    	
    	//Crearemos las variables necesarias
    	int a�oNacimiento = 0; //Esta variable es para el punto a) El a�o de nacimiento
    	float alturaCentimetros = 0; //Esta variable es para el punto b) La altura en centimetros
    	float pesoKilos = 0; //Esta variable es para el punto b) El peso en kilos
    	float alturaPeso = 0; //Esta variable es para poder hacer la formula matematica de pesoKilos / alturaCentimetros
    	float velocidadEscoba = 0; //Esta variable es para el punto c) La velocidad
    	int comprobacion = 0; //Esta variable es para saber si todas las condiciones impuestas por el ejercicio se cumplen
    	
    	//Explicamos para que sirve el programa
    	System.out.println("�Bienvenidx! Este programa sirve para comprobar las 3 condiciones establecidas por la profesora. Mostrar� por pantalla si el candidato cumple una, dos, tres o ninguna de las condiciones.");
    	
    	//Pedimos al usuario que introduzca el a�o de nacimiento
    	System.out.println("Introduce tu a�o de nacimiento: ");
    	a�oNacimiento = teclado.nextInt();
    	System.out.println("Su a�o de nacimiento es: " + a�oNacimiento);
    	
    	//Pedimos al usuario que introduzca su altura
    	System.out.println("Por favor, introduce tu altura porfavor, usa una coma (,) para separar metros de cent�metros: ");
    	alturaCentimetros = teclado.nextFloat();
    	System.out.println("Su altura es: " + alturaCentimetros + "cm");
    	
    	//Pedimos al usuario que introduzca su peso
    	System.out.println("Por favor, introduce tu peso: ");
    	pesoKilos = teclado.nextFloat();
    	System.out.println("Su peso es de: " + pesoKilos + "kg");
    	
    	//Pedimos al usuario que introduzca la velocidad de su escoba
    	System.out.println("Por favor, introcude la velocidad de tu escoba: ");
    	velocidadEscoba = teclado.nextFloat();
    	System.out.println("La velocidad de su escoba es: " + velocidadEscoba);
    	
    	//Empezamos con el programa
    	//Usaremos el operador %10 para saber el �ltimo digito introducido por el usuario para saber si se cumple o no la primera condicion impuesta en el punto a) ya que esto divide por 10 el n�mero introducido por el usuario
    	if (a�oNacimiento % 10 == 4 || a�oNacimiento % 10 == 5 || a�oNacimiento % 10 == 7 ) {
    		comprobacion++;
    		System.out.println("�Perfecto! Tu fecha de nacimiento es v�lida");
    	} 
    		
    	//Calcularemos la relacion entre altura y peso
    	alturaPeso = (pesoKilos / alturaCentimetros);  
    		
    	if (alturaPeso >= 2.4 || alturaPeso <= 2.51) {
    		comprobacion++;
    			System.out.println("�Perfecto! Tu relaci�n entre la altura y el peso es correcta para el programa");
    	}
    	
    	if(velocidadEscoba >= 100 || velocidadEscoba % 11 == 0) {
    		comprobacion++;
    		System.out.println("�Perfecto! La velocidad de tu escoba es correcta para el programa"); 
    	} 
    	
    	
    	//Comenzamos con la comprobacion del programa
    	if(comprobacion == 0) {
    		System.out.println("No cumples ning�n requisito, lo sentimos");
    	}
    	
    	if(comprobacion == 1) {
    		System.out.println("Solo est�s cumpliendo 1 requisito");
    	}
    	
    	if(comprobacion == 2) {
    		System.out.println("Solo est�s cumpliendo 2 requisitos");
    	}
    	
    	if(comprobacion == 3) {
    		System.out.println("�Felicidades! Cumples todos los requisitos para entrar");
    	} else {
    		System.out.println("Eres bienvenidx a entrar en la academia");
    	}
    	//Cerraremos el teclado
    	teclado.close();
    }
}