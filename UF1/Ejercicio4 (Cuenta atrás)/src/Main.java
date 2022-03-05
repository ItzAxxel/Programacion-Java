public class Main {
	public static void main(String[] args) {
		// Explicacion del programa
		System.out.println("Este programa es una cuenta regresiva de 100 a -100 de dos en dos");
		System.out.println("-----------------------------------------------------------------");

		// Inicializamos el programa
		for (int num = 100; num <= -100; num = -2) {
			System.out.println(num);
		}
	}
}