import java.util.Scanner;

public class AxelArroyoGimenezEjercicioNumerosHastaQueSePonga0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Algorisme que demani números fins que s’introdueixi un 0. 
		 */
		
		//Creamos el teclado
		Scanner teclado = new Scanner(System.in);
		
		int num = 0;
			
		System.out.println("Introduce un numero: ");
		num = teclado.nextInt();
		
		while (num != 0 ) {
			System.out.println("Introduce otro numero: ");
			num = teclado.nextInt();
		}
		//Cerramos el teclado
		teclado.close();
	}

}
