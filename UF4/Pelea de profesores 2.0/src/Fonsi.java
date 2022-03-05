<<<<<<< HEAD
/*
 * Hecho por: Axel Arroyo Giménez
 */

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Fonsi extends Profesor{

    Random critico = new Random();
    private int furgoneta;
    private boolean tryCatch = true;

    public Fonsi(int vida, String nombre, int iq){
        super(vida, nombre, iq);
    }

    public int atacar(){
        int ataque;
        Scanner teclado = new Scanner(System.in);

        int opcionAtaque = 0;
        do {
            try{
                System.out.println("Elije tu ataque: ");
                System.out.println("[1] Atropellar con la furgo");
                System.out.println("[2] Corregir ejercicios");
                System.out.println("[3] Lanzar algo");

                opcionAtaque = teclado.nextInt();
                tryCatch = false;
            } catch (InputMismatchException ex){
                while(opcionAtaque > 3 ||opcionAtaque < 1){
                    System.out.println("¡Has introducido un valor incorrecto! Recuerda que las opciones que tienes son: ");
                    System.out.println("[1] Atropellar con la furgo");
                    System.out.println("[2] Corregir ejercicios");
                    System.out.println("[3] Lanzar algo");
                    teclado.next();
                    opcionAtaque = teclado.nextInt();
                    tryCatch = true;
                }
            }

        } while (tryCatch);

        if (opcionAtaque == 1) {
            System.out.println("¡Has elegido atropellar a Antonio!\n");
            ataque = 40;
            if (critico.nextInt(3) == 1){
                ataque = ataque * 2;
                System.out.println("¡La furgoneta ha acelerado y has hecho un ataque crítico!\n");
            }
        } else if (opcionAtaque == 2){
            System.out.println("¡Has hecho que Antonio corrija todos los ejercicios de tus alumnos!\n");
            ataque = 30;
        } else {
            System.out.println("¡Has lanzado algo!\n");
            ataque = 10;
        }
        return ataque;
    }



}
=======
/*
 * Hecho por: Axel Arroyo Giménez
 */

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Fonsi extends Profesor{

    Random critico = new Random();
    private int furgoneta;
    private boolean tryCatch = true;

    public Fonsi(int vida, String nombre, int iq){
        super(vida, nombre, iq);
    }

    public int atacar(){
        int ataque;
        Scanner teclado = new Scanner(System.in);

        int opcionAtaque = 0;
        do {
            try{
                System.out.println("Elije tu ataque: ");
                System.out.println("[1] Atropellar con la furgo");
                System.out.println("[2] Corregir ejercicios");
                System.out.println("[3] Lanzar algo");

                opcionAtaque = teclado.nextInt();
                tryCatch = false;
            } catch (InputMismatchException ex){
                while(opcionAtaque > 3 ||opcionAtaque < 1){
                    System.out.println("¡Has introducido un valor incorrecto! Recuerda que las opciones que tienes son: ");
                    System.out.println("[1] Atropellar con la furgo");
                    System.out.println("[2] Corregir ejercicios");
                    System.out.println("[3] Lanzar algo");
                    teclado.next();
                    opcionAtaque = teclado.nextInt();
                    tryCatch = true;
                }
            }

        } while (tryCatch);

        if (opcionAtaque == 1) {
            System.out.println("¡Has elegido atropellar a Antonio!\n");
            ataque = 40;
            if (critico.nextInt(3) == 1){
                ataque = ataque * 2;
                System.out.println("¡La furgoneta ha acelerado y has hecho un ataque crítico!\n");
            }
        } else if (opcionAtaque == 2){
            System.out.println("¡Has hecho que Antonio corrija todos los ejercicios de tus alumnos!\n");
            ataque = 30;
        } else {
            System.out.println("¡Has lanzado algo!\n");
            ataque = 10;
        }
        return ataque;
    }



}
>>>>>>> 9a0ba8376c17307f222a97025883c43894e82700
