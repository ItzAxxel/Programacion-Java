//Axel Arroyo Giménez

import java.util.Random;

public class FuncionesMaximoMinimo_AxelArroyoGimenez_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random aleatorio = new Random();
		int[] numbers = new int[100];
		int maximos = 0;
		int minimos = 0;
		maximos = maximos(numbers, maximos, aleatorio);
		System.out.println("El valor máximo es: " + maximos);
		minimos = minimos(numbers, minimos, aleatorio);
		System.out.println("El valor minimo es: " + minimos);

	}

	public static int maximos(int numbers[], int max, Random aleatorio) {
		int maximos = 0;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = aleatorio.nextInt(100);
			if (maximos < numbers[i]) {
				maximos = numbers[i];
			}
		}

		return maximos;

	}

	public static int minimos(int numbers[], int min, Random aleatorio) {
		int minimos = 0;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = aleatorio.nextInt(100);
			if (minimos > numbers[i]) {
				minimos = numbers[i];
			}
		}

		return minimos;
	}

}
