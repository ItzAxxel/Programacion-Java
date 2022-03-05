public class Main {
	public static void main(String[] args) {
		// Explicacion del programa
		System.out.println("Este programa es una cuenta regresiva de 100 a -100 de dos en dos");
		System.out.println("-----------------------------------------------------------------");

		// Inicializamos el programa
		for (int num = 100; num >= -100; num = num - 2) { //Creamos la variable "num" y hacemos el calculo de que si num es menor o igual a -100, hacemos el calculo que reste -2 a la variable princial, es decir num
			System.out.println(num);
		}
	}
}