import java.util.Scanner;

public class exejmplo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x = 0;

		System.out.println("Introduce numero: ");
		x = teclado.nextInt();

		for (int i = 0; i < x; i++) {
			System.out.print("0" + " ");
		}
		teclado.close();
	}

}
