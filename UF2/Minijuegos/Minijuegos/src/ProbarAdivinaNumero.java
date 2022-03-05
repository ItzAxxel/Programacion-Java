import java.util.Random;
import java.util.Scanner;

class ProbarAdivinaNumero{

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //TODO Probar adivinar numero

     

        //Funciones

        adivinaElNumeroIA();

    }

    //// FUNCIÓN DEL MINIJUEGO DE ADIVINAR NÚMERO VS IA ////

    public static void adivinaElNumeroIA(){

        System.out.println("Adivina 3 veces el número y serás el vencedor.");
        while (numeroUsuario != IA || IA != numeroAleatorio){



        }

    }

    //// FUNCIÓN PARA QUE LA IA ELIJA EL NÚMERO ////

    public static int elecionNumeroIA(int IA) {
        Random rand = new Random();
        try {
            // Ponemos a "Dormir" el programa durante 2 segundos
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
        IA = rand.nextInt(10) + 1;
        return IA;
    }

}