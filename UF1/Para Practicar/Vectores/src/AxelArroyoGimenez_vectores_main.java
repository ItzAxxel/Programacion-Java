import java.util.Scanner;

public class AxelArroyoGimenez_vectores_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int x = 0;

		do {
			try {
				System.out.println("Introdce un numero del 1 al 10");
				x = Integer.parseInt(teclado.nextLine());
			} catch (Exception e) {
				System.out.println("ERROR! El valor es incorrecto!");
				System.out.println(e.getMessage());
			}
		} while (x > 10 || x < 1);

		System.out.println("El valor introducido es correcto! ");
		
		teclado.close();

	}
}