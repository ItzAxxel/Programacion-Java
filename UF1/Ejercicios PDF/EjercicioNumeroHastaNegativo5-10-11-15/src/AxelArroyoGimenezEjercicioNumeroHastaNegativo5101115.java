import java.util.Scanner;

public class AxelArroyoGimenezEjercicioNumeroHastaNegativo5101115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Algorisme que demani números fins a que s’introdueixi un negatiu i 
		 * conti quants estan entre 5 i 10, quants entre 11 i 15 i quants fora 
		 * d’aquestos intervals
		 * 
		 */
		
		//Creamos el scanner
		Scanner teclado = new Scanner(System.in);
		
		//Creamos las variables
		int numero;
		int primerContador = 0; //5-10
		int segundoContador = 0; //11-15
		int tercerContador = 0; //otros
		
		//Pedimos al usuario que introduzca datos
		System.out.println("Introduce un número: ");
		numero = teclado.nextInt();
		
		while (numero >= 0) {
			if (numero >= 5 && numero <= 10) {
				primerContador++;
			} else if (numero >= 11 && numero <= 15) {
				segundoContador++;
			} else {
				tercerContador++;
			}
			System.out.println("Introduce otro número: ");
			numero = teclado.nextInt();
		}
		
		//Cerramos el teclado
		teclado.close();
		
		System.out.println("En el primer contador tenemos... " + primerContador);
		System.out.println("En el segundo contador tenemos... " + segundoContador);
		System.out.println("En el tercer contador tenemos... " + tercerContador);
	}

}
