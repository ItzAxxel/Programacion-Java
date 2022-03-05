import java.util.Scanner;

public class AxelArroyoGimenezHasta100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Algorisme que demani números mentre que siguin més grans que 100.  
		 */
		
		//Creamos el teclado
		Scanner teclado = new Scanner(System.in);
		
		int num = 0;
			
		
		System.out.println("Introduce un numero: ");
		num = teclado.nextInt();
		
		while (num > 100 ) {
			System.out.println("Introduce otro numero: ");
			num = teclado.nextInt();
		}
		teclado.close();
	}

}
