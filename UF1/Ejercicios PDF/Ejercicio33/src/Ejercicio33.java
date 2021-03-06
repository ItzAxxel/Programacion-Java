import java.util.Scanner;

public class Ejercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Algorisme que permeti realitzar descomptes en un comer?, en funci? del total
		 * de compres realitzades per cada client. Per a realitzar aquests descomptes,
		 * s?han de llegir els imports de cada compra parcial d?un client fins a que un
		 * import sigui igual a 0, posteriorment s?escriur? el import total a pagar
		 * tenint en conta que se poden efectuar els seg?ents descomptes: ? Si el import
		 * total de la compra est? entre 300.00 i 800.00 euros, el descompte ?s del 15%.
		 * ? Si el import total de la compra es m?s gran que 800.00 euros el descompte
		 * ?s del 20%. La lectura de clients finalitza despr?s de respondre al missatge
		 * de "M?s clients S/N?", mostrant al final la suma total de tots els imports
		 * cobrats
		 * 
		 */

		// Creamos el scanner
		Scanner teclado = new Scanner(System.in);

		// Creamos las variables necesarias
		int comprasCliente = 1;
		int compraPeque = 0;
		int compraGrande = 0;
		int suma = 0;
		char S = 'S';

		while (S == 'S') {
			while (comprasCliente != 0) {
				System.out.println("Introduce tu importe: ");
				comprasCliente = teclado.nextInt();

				if (S == 'S') {
					if (comprasCliente > 300.00 && comprasCliente < 800.00) {
						comprasCliente = (comprasCliente * 15) / 100;
						compraPeque = comprasCliente;
					} else {
						comprasCliente = (comprasCliente * 20) / 100;
						compraGrande = comprasCliente;
					}
				}
				suma = suma + compraPeque + compraGrande;
			}
			System.out.println("La suma total es de: " + suma + "?");
			System.out.println("?M?s clientes?");
			S = teclado.next().charAt(0);
			comprasCliente = 1;
		}
		
		teclado.close();
	}

}
