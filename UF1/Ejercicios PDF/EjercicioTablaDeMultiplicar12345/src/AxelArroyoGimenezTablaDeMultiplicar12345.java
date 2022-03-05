
public class AxelArroyoGimenezTablaDeMultiplicar12345 {
	public static void main(String[] args) {

		/*
		 * Algorisme que mostri la taula de multiplicar dels números 1,2,3,4 i 5.
		 * 
		 */

		for (int contador1 = 1; contador1 <= 5; contador1++) {
			System.out.println("Tabla del: " + contador1);
			for (int contador2 = 1; contador2 <= 10; contador2++) {
				System.out.println(contador1 + " x " + contador2 + " = " + contador1 * contador2);
			}
			System.out.println("----------------------------------------------------------------------------------");
		}

	}
}
