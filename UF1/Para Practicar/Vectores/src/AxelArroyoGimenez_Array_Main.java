import java.util.Random;

public class AxelArroyoGimenez_Array_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random aleatorio = new Random();
		int vector[] = new int[1000];
		int contPar = 0;
		int contImpar = 0;

		for (int i = 0; i < 1000; i++) {
			vector[i] = aleatorio.nextInt();

			if (vector[i] % 2 == 0) {
				contPar++;
			} else {
				contImpar++;
			}
		}
		System.out.println("Hay: " + contPar + " numeros pares");
		System.out.println("Hay: " + contImpar + " numeros impares");
	}

}
