import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		//Creamos las variables principales
		Random aleatorio = new Random();
		int numero = 0;

		for (int i = 0; i < 20; i++) { //Creamos el bucle for. Por cada vez que i sea menor que 20 se repetirá. Una vez ya supere el 20 se para. El 0 cuenta
			numero = aleatorio.nextInt(11);
			if (numero < 4) {
				System.out.println("¡Lo sentimos! Has suspendido con la nota de: " + numero);
			} else if (numero < 6) {
				System.out.println(
						"Has aprobado! Tu nota es de: " + numero + " Por lo tanto, tienes un bien sigue esforzandote");
			} else if (numero < 8) {
				System.out.println("Has aprobado! Tu nota es de: " + numero + " Casi llegas al sobresaliente");
			} else {
				System.out.println("Has aprobado! Tu nota es de: " + numero + " Tienes un sobresaliente!");
			} 
		}
	}
}
