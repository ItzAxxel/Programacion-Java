<<<<<<< HEAD
/*
*
* @author Axel & Siru
*
 */

import java.util.Random;
import java.util.Scanner;

class ProbarAdivinaNumero{

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //TODO Probar adivinar numero
        String jugadorUno = " ";

        System.out.println("¿Cual es tu nombre?");
        jugadorUno = teclado.nextLine();

        //Funciones
        menu(jugadorUno);

    }

    public static int menu(String jugadorUno){
        int opcionUsuario = 0;
        boolean salir = false;


        System.out.println("¡Bievneidx! Elije una opción de nuestro menú: ");
        System.out.println("1. Jugar");
        System.out.println("2.- Información");
        System.out.println("3.- Mostrar puntuaciones");
        System.out.println("4.- Autores");
        System.out.println("5.- Versión");
        System.out.println("6.- Salir");
        opcionUsuario = teclado.nextInt();

            if (opcionUsuario == 1){
                juegos(jugadorUno);
            } else if (opcionUsuario == 2){
                informacion(jugadorUno);

            } else if (opcionUsuario == 3){
                puntuaciones(jugadorUno);

            } else if(opcionUsuario == 4){
                System.out.println("Axel y Siru");
                menu(jugadorUno);

            } else if (opcionUsuario == 5){
                System.out.println("1.1.2");
                menu(jugadorUno);
            } else if (opcionUsuario == 6){
                salir = true;
            }



        return opcionUsuario ;
    }

    public static void informacion(String jugadorUno){

        System.out.println("---------------------- ADIVINA EL NÚMERO ----------------------");
        System.out.println("Quien adivine el número 3 veces, será el ganador de la partida");
        System.out.println("---------------------------------------------------------------");
        System.out.println();
        System.out.println("---------------------- COMBATE POKÉMON -------------------------");
        System.out.println("asdasdasdasdasdasdasdasdasdasdasdasdadasdasdadadsadasdasdasdasdasd");
        System.out.println("---------------------------------------------------------------");


        menu(jugadorUno);
    }

    public static void puntuaciones(String jugadorUno){
        System.out.println("ª");
    }


    public static int juegos(String jugadorUno){
        int opcionUsuario = 0;


        System.out.println("Actualmente disponemos de dos juegos. ¿Cual quieres jugar?");
        System.out.println("1.- Adivina el número");
        System.out.println("2.- Combate pokémon");
        System.out.println("3.- Volver al menú anterior");

        if (opcionUsuario == 1){
            modoDeJuego(jugadorUno, opcionUsuario);
        } else if (opcionUsuario == 2){

        } else if (opcionUsuario == 3){
            menu(jugadorUno);
        }
        return opcionUsuario;
    }

    public static int modoDeJuego(String jugadorUno, int opcionUsuario){

        System.out.println("Disponemos de dos modos actualmente. Jugador contra Jugador y Jugador contra la IA. Elije cual vas a jugar: ");
        System.out.println("1.- Jugador contra Jugador");
        System.out.println("2.- Jugador contra la IA");
        System.out.println("3.- Volver al menú anterior");
        opcionUsuario = teclado.nextInt();

        if (opcionUsuario == 1){
            adivinaElNumeroJugadorVsJugador(jugadorUno);
        } else if (opcionUsuario == 2){
            adivinaElNumeroIA(jugadorUno);
        } else if (opcionUsuario == 3){
            juegos(jugadorUno);
        }
        return opcionUsuario;
    }

    public static void adivinaElNumeroJugadorVsJugador(String jugadorUno){
        String jugadorDos = " ";
        int numeroAleatorio = 0;
        int numeroJugadorUno = 0;
        int numeroJugadorDos = 0;
        int contadorRonda = 0;
        int puntuacionJugadorUno = 0;
        int puntuacionJugadorDos = 0;
        Random rand = new Random();
        boolean turno = true;

        System.out.println("El primer jugador en adivinar el númreo 3 veces será el vencedor.");
        System.out.println("Jugador dos, elije tu nombre: ");
        jugadorDos = teclado.nextLine();

        do{
            turno = turnos(jugadorUno, jugadorDos, turno);
            contadorRonda++;
            numeroAleatorio = rand.nextInt(10) + 1;
            System.out.println("Estáis en la ronda: " + contadorRonda);
            if (turno) {
                System.out.println(jugadorUno + " Elije un número del 1 al 10: ");
                numeroJugadorUno = teclado.nextInt();
                puntuacionJugadorUno = gestorRondaJugadorUno(jugadorUno,numeroJugadorUno,numeroAleatorio,puntuacionJugadorUno);
            }else{
                System.out.println(jugadorDos + " Elije un número del 1 al 10: ");
                numeroJugadorDos = teclado.nextInt();
                puntuacionJugadorDos = gestorRondaJugadorDos(jugadorDos,numeroJugadorDos,numeroAleatorio,puntuacionJugadorDos);
            }
        } while(ganadorPartida(puntuacionJugadorUno, puntuacionJugadorDos, jugadorUno,jugadorDos));

    }


    public static boolean turnos(String jugadorUno,String jugadorDos, boolean jugador){

        jugador =! jugador;

        if (jugador){
            System.out.println("¡Es el turno de " + jugadorUno + "!");
        } else {
            System.out.println("¡Es el turno de " + jugadorDos + "!");

        }

        return jugador;
    }

    public static int gestorRondaJugadorUno(String jugadorUno,int numeroJugadorUno,int numeroAleatorio, int puntuacionJugadorUno){

        if (numeroJugadorUno == numeroAleatorio){
            System.out.println("!" + jugadorUno + " has ganado esta ronda!");
            puntuacionJugadorUno++;
        }
        return puntuacionJugadorUno;

    }
    public static int gestorRondaJugadorDos(String jugadorDos,int numeroJugadorDos, int numeroAleatorio, int puntuacionJugadorDos){

        if(numeroJugadorDos == numeroAleatorio) {
            System.out.println("!" + jugadorDos + " has ganado esta ronda!");
            puntuacionJugadorDos++;
        }
        return puntuacionJugadorDos;
    }


    //// FUNCIÓN DEL MINIJUEGO DE ADIVINAR NÚMERO VS IA ////

    public static void adivinaElNumeroIA(String nombreJugador){
        //Variables

        int numeroUsuario = 0;
        int IA = 0;
        int contadorRonda = 0;
        int puntuacionUsuario = 0;
        int puntuacionIA = 0;
        Random rand = new Random();
        int numeroAleatorio;

        System.out.println("Adivina 3 veces el número y serás el vencedor.");

        do {
            contadorRonda++;
            numeroAleatorio = rand.nextInt(10) + 1;
            System.out.println("Estás en la ronda: " + contadorRonda);
            System.out.println(nombreJugador + " elije un número del 1 al 10: ");
            numeroUsuario = teclado.nextInt();
            while(numeroUsuario > 10 || numeroUsuario < 0){
                System.out.println("¡El número que has introducido es incorrecto! Recuerda que debe de ser entre 1 y 10");
                numeroUsuario = teclado.nextInt();
            }
            System.out.println("La IA está eligiendo número...");
            IA = elecionNumeroIA(IA);
            System.out.println("La IA ha elegido el número: " + IA);

            /// COMPROBACIÓN SI HA GANADO LA RONDA ///

            puntuacionUsuario = gestorRondaU(numeroUsuario,numeroAleatorio,puntuacionUsuario);
            puntuacionIA = gestorRondaI(IA,numeroAleatorio,puntuacionIA);
        } while (ganadorPartida(puntuacionUsuario,puntuacionIA, nombreJugador, "IA"));

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

    public static int gestorRondaU(int numeroUsuario,int numeroAleatorio, int puntuacionUsuario){

        if (numeroUsuario == numeroAleatorio){
            System.out.println("¡Has ganado esta ronda!");
            puntuacionUsuario++;
        }
        return puntuacionUsuario;

    }
    public static int gestorRondaI(int IA,int numeroAleatorio, int puntuacionIA){

         if(IA == numeroAleatorio) {
            System.out.println("¡La IA ha ganado la ronda!");
            puntuacionIA++;
        }
        return puntuacionIA;
    }

    public static boolean ganadorPartida(int puntuacionUsuario, int puntuacionUsuario2, String name1, String name2){

        if (puntuacionUsuario == 3) {
            System.out.println("¡"+name1+" Has ganado la partida!");
            return false;
        }
        else if(puntuacionUsuario2 == 3){
            System.out.println("¡"+name2+" Has ganado la partida!");
            return false;
        }
        return true;
    }

}
=======
/*
*
* @author Axel & Siru
*
 */

import java.util.Random;
import java.util.Scanner;

class ProbarAdivinaNumero{

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //TODO Probar adivinar numero
        String jugadorUno = " ";

        System.out.println("¿Cual es tu nombre?");
        jugadorUno = teclado.nextLine();

        //Funciones
        menu(jugadorUno);

    }

    public static int menu(String jugadorUno){
        int opcionUsuario = 0;
        boolean salir = false;


        System.out.println("¡Bievneidx! Elije una opción de nuestro menú: ");
        System.out.println("1. Jugar");
        System.out.println("2.- Información");
        System.out.println("3.- Mostrar puntuaciones");
        System.out.println("4.- Autores");
        System.out.println("5.- Versión");
        System.out.println("6.- Salir");
        opcionUsuario = teclado.nextInt();

            if (opcionUsuario == 1){
                juegos(jugadorUno);
            } else if (opcionUsuario == 2){
                informacion(jugadorUno);

            } else if (opcionUsuario == 3){
                puntuaciones(jugadorUno);

            } else if(opcionUsuario == 4){
                System.out.println("Axel y Siru");
                menu(jugadorUno);

            } else if (opcionUsuario == 5){
                System.out.println("1.1.2");
                menu(jugadorUno);
            } else if (opcionUsuario == 6){
                salir = true;
            }



        return opcionUsuario ;
    }

    public static void informacion(String jugadorUno){

        System.out.println("---------------------- ADIVINA EL NÚMERO ----------------------");
        System.out.println("Quien adivine el número 3 veces, será el ganador de la partida");
        System.out.println("---------------------------------------------------------------");
        System.out.println();
        System.out.println("---------------------- COMBATE POKÉMON -------------------------");
        System.out.println("asdasdasdasdasdasdasdasdasdasdasdasdadasdasdadadsadasdasdasdasdasd");
        System.out.println("---------------------------------------------------------------");


        menu(jugadorUno);
    }

    public static void puntuaciones(String jugadorUno){
        System.out.println("ª");
    }


    public static int juegos(String jugadorUno){
        int opcionUsuario = 0;


        System.out.println("Actualmente disponemos de dos juegos. ¿Cual quieres jugar?");
        System.out.println("1.- Adivina el número");
        System.out.println("2.- Combate pokémon");
        System.out.println("3.- Volver al menú anterior");

        if (opcionUsuario == 1){
            modoDeJuego(jugadorUno, opcionUsuario);
        } else if (opcionUsuario == 2){

        } else if (opcionUsuario == 3){
            menu(jugadorUno);
        }
        return opcionUsuario;
    }

    public static int modoDeJuego(String jugadorUno, int opcionUsuario){

        System.out.println("Disponemos de dos modos actualmente. Jugador contra Jugador y Jugador contra la IA. Elije cual vas a jugar: ");
        System.out.println("1.- Jugador contra Jugador");
        System.out.println("2.- Jugador contra la IA");
        System.out.println("3.- Volver al menú anterior");
        opcionUsuario = teclado.nextInt();

        if (opcionUsuario == 1){
            adivinaElNumeroJugadorVsJugador(jugadorUno);
        } else if (opcionUsuario == 2){
            adivinaElNumeroIA(jugadorUno);
        } else if (opcionUsuario == 3){
            juegos(jugadorUno);
        }
        return opcionUsuario;
    }

    public static void adivinaElNumeroJugadorVsJugador(String jugadorUno){
        String jugadorDos = " ";
        int numeroAleatorio = 0;
        int numeroJugadorUno = 0;
        int numeroJugadorDos = 0;
        int contadorRonda = 0;
        int puntuacionJugadorUno = 0;
        int puntuacionJugadorDos = 0;
        Random rand = new Random();
        boolean turno = true;

        System.out.println("El primer jugador en adivinar el númreo 3 veces será el vencedor.");
        System.out.println("Jugador dos, elije tu nombre: ");
        jugadorDos = teclado.nextLine();

        do{
            turno = turnos(jugadorUno, jugadorDos, turno);
            contadorRonda++;
            numeroAleatorio = rand.nextInt(10) + 1;
            System.out.println("Estáis en la ronda: " + contadorRonda);
            if (turno) {
                System.out.println(jugadorUno + " Elije un número del 1 al 10: ");
                numeroJugadorUno = teclado.nextInt();
                puntuacionJugadorUno = gestorRondaJugadorUno(jugadorUno,numeroJugadorUno,numeroAleatorio,puntuacionJugadorUno);
            }else{
                System.out.println(jugadorDos + " Elije un número del 1 al 10: ");
                numeroJugadorDos = teclado.nextInt();
                puntuacionJugadorDos = gestorRondaJugadorDos(jugadorDos,numeroJugadorDos,numeroAleatorio,puntuacionJugadorDos);
            }
        } while(ganadorPartida(puntuacionJugadorUno, puntuacionJugadorDos, jugadorUno,jugadorDos));

    }


    public static boolean turnos(String jugadorUno,String jugadorDos, boolean jugador){

        jugador =! jugador;

        if (jugador){
            System.out.println("¡Es el turno de " + jugadorUno + "!");
        } else {
            System.out.println("¡Es el turno de " + jugadorDos + "!");

        }

        return jugador;
    }

    public static int gestorRondaJugadorUno(String jugadorUno,int numeroJugadorUno,int numeroAleatorio, int puntuacionJugadorUno){

        if (numeroJugadorUno == numeroAleatorio){
            System.out.println("!" + jugadorUno + " has ganado esta ronda!");
            puntuacionJugadorUno++;
        }
        return puntuacionJugadorUno;

    }
    public static int gestorRondaJugadorDos(String jugadorDos,int numeroJugadorDos, int numeroAleatorio, int puntuacionJugadorDos){

        if(numeroJugadorDos == numeroAleatorio) {
            System.out.println("!" + jugadorDos + " has ganado esta ronda!");
            puntuacionJugadorDos++;
        }
        return puntuacionJugadorDos;
    }


    //// FUNCIÓN DEL MINIJUEGO DE ADIVINAR NÚMERO VS IA ////

    public static void adivinaElNumeroIA(String nombreJugador){
        //Variables

        int numeroUsuario = 0;
        int IA = 0;
        int contadorRonda = 0;
        int puntuacionUsuario = 0;
        int puntuacionIA = 0;
        Random rand = new Random();
        int numeroAleatorio;

        System.out.println("Adivina 3 veces el número y serás el vencedor.");

        do {
            contadorRonda++;
            numeroAleatorio = rand.nextInt(10) + 1;
            System.out.println("Estás en la ronda: " + contadorRonda);
            System.out.println(nombreJugador + " elije un número del 1 al 10: ");
            numeroUsuario = teclado.nextInt();
            while(numeroUsuario > 10 || numeroUsuario < 0){
                System.out.println("¡El número que has introducido es incorrecto! Recuerda que debe de ser entre 1 y 10");
                numeroUsuario = teclado.nextInt();
            }
            System.out.println("La IA está eligiendo número...");
            IA = elecionNumeroIA(IA);
            System.out.println("La IA ha elegido el número: " + IA);

            /// COMPROBACIÓN SI HA GANADO LA RONDA ///

            puntuacionUsuario = gestorRondaU(numeroUsuario,numeroAleatorio,puntuacionUsuario);
            puntuacionIA = gestorRondaI(IA,numeroAleatorio,puntuacionIA);
        } while (ganadorPartida(puntuacionUsuario,puntuacionIA, nombreJugador, "IA"));

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

    public static int gestorRondaU(int numeroUsuario,int numeroAleatorio, int puntuacionUsuario){

        if (numeroUsuario == numeroAleatorio){
            System.out.println("¡Has ganado esta ronda!");
            puntuacionUsuario++;
        }
        return puntuacionUsuario;

    }
    public static int gestorRondaI(int IA,int numeroAleatorio, int puntuacionIA){

         if(IA == numeroAleatorio) {
            System.out.println("¡La IA ha ganado la ronda!");
            puntuacionIA++;
        }
        return puntuacionIA;
    }

    public static boolean ganadorPartida(int puntuacionUsuario, int puntuacionUsuario2, String name1, String name2){

        if (puntuacionUsuario == 3) {
            System.out.println("¡"+name1+" Has ganado la partida!");
            return false;
        }
        else if(puntuacionUsuario2 == 3){
            System.out.println("¡"+name2+" Has ganado la partida!");
            return false;
        }
        return true;
    }

}
>>>>>>> 178b56d6c02bf5ea4e473864071db91da0318772
