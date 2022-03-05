<<<<<<< HEAD
/**
 * @author Axel y Siru
 */

import java.util.Random;
import java.util.Scanner;

public class AxelArroyoGimenez_Siru_Minijuegos {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        //Variables
        String cyan = "\033[36m";
        String reset = "\u001B[0m";
        String blue = "\033[34m";
        String yellow = "\033[33m";
        //POKEMON
        int pokemon = 0;
        //PERSONAJES
        int ai = 0;
        int amigo = 0;
        //RESPUESTAS
        int respuesta = 0, accion_ai = 0, accion_amigo = 0;
        //BATALLA IA
        int vida_pokemon = 10, vida_pok_ai = 10, def_pokemon = 10, def_pok_ai = 10;
        //BATALLA JUGADOR CONTRA JUGADOR
        int vida_pok_amigo = 10, def_pok_amigo = 10;
        String jugadorUno = " ";
        System.out.println("¿Cual es tu nombre?");
        jugadorUno = teclado.nextLine();

        //Funciones
        menu(jugadorUno);
    }

    public static int menu(String jugadorUno) {

        //************************************************************************************
        //** Nombre de la función: menu
        //** Explicación del que hace la función: el menú para gestionar a que juego jugará el usuario
        //** Parámetros de entrada: jugadorUno
        //** Parámetros de salida: opcionUsuario
        //************************************************************************************

        int opcionUsuario = 0;

        System.out.println("¡Bievneidx! Elije una opción de nuestro menú: ");
        System.out.println("1. Jugar");
        System.out.println("2.- Información");
        System.out.println("3.- Mostrar puntuaciones");
        System.out.println("4.- Autores");
        System.out.println("5.- Versión");
        System.out.println("6.- Salir");
        opcionUsuario = teclado.nextInt();

        if (opcionUsuario == 1) {
            juegos(jugadorUno);
        } else if (opcionUsuario == 2) {
            informacion(jugadorUno);

        } else if (opcionUsuario == 3) {
            puntuaciones(opcionUsuario, opcionUsuario, jugadorUno, jugadorUno);

        } else if (opcionUsuario == 4) {
            System.out.println("Axel y Siru");
            menu(jugadorUno);

        } else if (opcionUsuario == 5) {
            System.out.println("1.2.3");
            menu(jugadorUno);
        } else if (opcionUsuario == 6) {

        }

        return opcionUsuario;
    }

    public static void informacion(String jugadorUno) {

        //************************************************************************************
        //** Nombre de la función: informacion
        //** Explicación del que hace la función: Para informar de que va cada juego
        //** Parámetros de entrada: jugadorUno
        //** Parámetros de salida: volver al menú anterior "menu(jugadorUno)"
        //************************************************************************************

        System.out.println("---------------------- ADIVINA EL NÚMERO ----------------------");
        System.out.println("Quien adivine el número 3 veces, será el ganador de la partida");
        System.out.println("---------------------------------------------------------------");
        System.out.println();
        System.out.println("---------------------- COMBATE POKÉMON -------------------------");
        System.out.println("Deberás derrotar al pokemon de tu oponente para ganar la partida");
        System.out.println("----------------------------------------------------------------");

        menu(jugadorUno);
    }


    public static int juegos(String jugadorUno) {
        //************************************************************************************
        //** Nombre de la función: juegos
        //** Explicación del que hace la función: Preguntar al usuario que juego jugará
        //** Parámetros de entrada: jugadorUno
        //** Parámetros de salida: opcionUsuario
        //************************************************************************************

        int opcionUsuario = 0;

        System.out.println("Actualmente disponemos de dos juegos. ¿Cual quieres jugar?");
        System.out.println("1.- Adivina el número");
        System.out.println("2.- Combate pokémon");
        System.out.println("3.- Volver al menú anterior");
        opcionUsuario = teclado.nextInt();

        if (opcionUsuario == 1) {
            modoDeJuegoAdivinaElNumero(jugadorUno, opcionUsuario);
        } else if (opcionUsuario == 2) {
            modoDeJuegoCombatePokemon(jugadorUno, opcionUsuario);
        } else if (opcionUsuario == 3) {
            menu(jugadorUno);
        }
        return opcionUsuario;
    }

    public static int modoDeJuegoAdivinaElNumero(String jugadorUno, int opcionUsuario) {

        //************************************************************************************
        //** Nombre de la función: modoDeJuegoAdivinaElNumero
        //** Explicación del que hace la función: Gestiona si el usuario elije adivina el número que modo querrá. Jcj o JcIa
        //** Parámetros de entrada: jugadorUno, opcionUsuario
        //** Parámetros de salida: opcionUsuario
        //************************************************************************************

        System.out.println("Disponemos de dos modos actualmente. Jugador contra Jugador y Jugador contra la IA. Elije cual vas a jugar: ");
        System.out.println("1.- Jugador contra Jugador");
        System.out.println("2.- Jugador contra la IA");
        System.out.println("3.- Volver al menú anterior");
        opcionUsuario = teclado.nextInt();

        if (opcionUsuario == 1) {
            adivinaElNumeroJugadorVsJugador(jugadorUno);
        } else if (opcionUsuario == 2) {
            adivinaElNumeroIA(jugadorUno);
        } else if (opcionUsuario == 3) {
            juegos(jugadorUno);
        }
        return opcionUsuario;
    }

    public static int modoDeJuegoCombatePokemon(String jugadorUno, int opcionUsuario) {

        //************************************************************************************
        //** Nombre de la función: modoDeJuegoCombatePokemon
        //** Explicación del que hace la función: Gestiona si el usuario elije combate pokemon que modo querrá. Jcj o JcIa
        //** Parámetros de entrada: jugadorUno, opcionUsuario
        //** Parámetros de salida: opcionUsuario
        //************************************************************************************

        System.out.println("Disponemos de dos modos actualmente. Jugador contra Jugador y Jugador contra la IA. Elije cual vas a jugar: ");
        System.out.println("1.- Jugador contra Jugador");
        System.out.println("2.- Jugador contra la IA");
        System.out.println("3.- Volver al menú anterior");
        opcionUsuario = teclado.nextInt();

        if (opcionUsuario == 1) {
            combatePokemonJugadorVsJugador(opcionUsuario, opcionUsuario, opcionUsuario, opcionUsuario, opcionUsuario, opcionUsuario, opcionUsuario, opcionUsuario, opcionUsuario, opcionUsuario);
        } else if (opcionUsuario == 2) {
            combatePokemonContraIA(opcionUsuario, opcionUsuario, opcionUsuario, opcionUsuario, opcionUsuario, opcionUsuario, opcionUsuario, opcionUsuario, jugadorUno, jugadorUno);
        } else if (opcionUsuario == 3) {
            juegos(jugadorUno);
        }
        return opcionUsuario;
    }

    public static void adivinaElNumeroJugadorVsJugador(String jugadorUno) {

        //************************************************************************************
        //** Nombre de la función: adivinaElNumeroJugadorVsJugador
        //** Explicación del que hace la función: Juego de adivinar el número de jugador contra jugador
        //** Parámetros de entrada: jugadorUno
        //** Parámetros de salida:
        //************************************************************************************

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
        String jugadorDos = teclado.next();

        do {
            turno = turnos(jugadorUno, jugadorDos, turno);
            contadorRonda++;
            numeroAleatorio = rand.nextInt(10) + 1;
            System.out.println("Estáis en la ronda: " + contadorRonda);
            if (turno) {
                System.out.println(jugadorUno + " Elije un número del 1 al 10: ");
                numeroJugadorUno = teclado.nextInt();
                while(numeroJugadorUno> 10 ||numeroJugadorUno <= 0) {
                    System.out.println("¡El número que has introducido es incorrecto! Recuerda que debe de ser un número del 1 al 10");
                    numeroJugadorUno = teclado.nextInt();
                }
                puntuacionJugadorUno = gestorRondaJugadorUno(jugadorUno, numeroJugadorUno, numeroAleatorio, puntuacionJugadorUno);
            } else {
                System.out.println(jugadorDos + " Elije un número del 1 al 10: ");
                numeroJugadorDos = teclado.nextInt();
                while(numeroJugadorDos> 10 ||numeroJugadorDos <= 0) {
                    System.out.println("¡El número que has introducido es incorrecto! Recuerda que debe de ser un número del 1 al 10");
                    numeroJugadorDos = teclado.nextInt();
                }
                puntuacionJugadorDos = gestorRondaJugadorDos(jugadorDos, numeroJugadorDos, numeroAleatorio, puntuacionJugadorDos);
            }
        } while (ganadorPartida(puntuacionJugadorUno, puntuacionJugadorDos, jugadorUno, jugadorDos));

    }


    public static boolean turnos(String jugadorUno, String jugadorDos, boolean jugador) {

        //************************************************************************************
        //** Nombre de la función: turnos
        //** Explicación del que hace la función: Gestiona los turnos del modo de juego de jugador contra jugador
        //** Parámetros de entrada: jugadorUno, jugadorDos, jugador
        //** Parámetros de salida: jugador
        //************************************************************************************

        jugador = !jugador;

        if (jugador) {
            System.out.println("¡Es el turno de " + jugadorUno + "!");
        } else {
            System.out.println("¡Es el turno de " + jugadorDos + "!");

        }

        return jugador;
    }

    public static int gestorRondaJugadorUno(String jugadorUno, int numeroJugadorUno, int numeroAleatorio, int puntuacionJugadorUno) {

        //************************************************************************************
        //** Nombre de la función: gestorRondaJugadorUno
        //** Explicación del que hace la función: Gestiona la ronda para saber si darle un punto al jugador uno o no
        //** Parámetros de entrada: jugadorUno, numeroJugadorUno, numeroAleatorio, puntuacionJugadorUno
        //** Parámetros de salida: puntuacionJugadorUno
        //************************************************************************************

        if (numeroJugadorUno == numeroAleatorio) {
            System.out.println("!" + jugadorUno + " has ganado esta ronda!");
            puntuacionJugadorUno++;
        }
        return puntuacionJugadorUno;

    }

    public static int gestorRondaJugadorDos(String jugadorDos, int numeroJugadorDos, int numeroAleatorio, int puntuacionJugadorDos) {

        //************************************************************************************
        //** Nombre de la función: gestorRondaJugadorDos
        //** Explicación del que hace la función: Gestiona la ronda para saber si darle un punto al jugador uno o no
        //** Parámetros de entrada: jugadorDos, numeroJugadorDos, numeroAleatorio, puntuacionJugadorDos
        //** Parámetros de salida: puntuacionJugadorDos
        //************************************************************************************

        if (numeroJugadorDos == numeroAleatorio) {
            System.out.println("!" + jugadorDos + " has ganado esta ronda!");
            puntuacionJugadorDos++;
        }
        return puntuacionJugadorDos;
    }

    //// FUNCIÓN DEL MINIJUEGO DE ADIVINAR NÚMERO VS IA ////

    public static void adivinaElNumeroIA(String jugadorUno) {

        //************************************************************************************
        //** Nombre de la función:adivinaElNumeroIA
        //** Explicación del que hace la función: Gestiona el juego de adivinar el número contra la IA
        //** Parámetros de entrada: jugadorUno
        //** Parámetros de salida:
        //************************************************************************************

        //Variables

        int numeroUsuario = 0;
        int IA = 0;
        int contadorRonda = 0;
        int puntuacionUsuario = 0;
        int puntuacionIA = 0;
        Random rand = new Random();
        int numeroAleatorio;

        System.out.println("Adivina 3 veces el número y serás el vencedor. Cada ronda el número cambiará.");
        numeroAleatorio = rand.nextInt(10) + 1;
        do {
            contadorRonda++;
            numeroAleatorio = rand.nextInt(10) + 1;
            System.out.println("Estás en la ronda: " + contadorRonda);
            System.out.println(jugadorUno + " elije un número del 1 al 10: ");
            numeroUsuario = teclado.nextInt();
            while (numeroUsuario > 10 || numeroUsuario <= 0) {
                System.out.println("¡El número que has introducido es incorrecto! Recuerda que debe de ser entre 1 y 10");
                numeroUsuario = teclado.nextInt();
            }
            System.out.println("La IA está eligiendo número...");
            IA = elecionNumeroIA(IA);
            System.out.println("La IA ha elegido el número: " + IA);

            /// COMPROBACIÓN SI HA GANADO LA RONDA ///

            puntuacionUsuario = gestorRondaU(numeroUsuario, numeroAleatorio, puntuacionUsuario);
            puntuacionIA = gestorRondaI(IA, numeroAleatorio, puntuacionIA);
        } while (ganadorPartida(puntuacionUsuario, puntuacionIA, jugadorUno, "IA"));
        menu(jugadorUno);

    }

    //// FUNCIÓN PARA QUE LA IA ELIJA EL NÚMERO ////

    public static int elecionNumeroIA(int IA) {

        //************************************************************************************
        //** Nombre de la función: elecionNumeroIA
        //** Explicación del que hace la función: Pone en pausa a la función durante unos segundos para simular que la IA está pensando un número
        //** Parámetros de entrada: IA
        //** Parámetros de salida: IA
        //************************************************************************************

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

    public static int gestorRondaU(int numeroUsuario, int numeroAleatorio, int puntuacionUsuario) {

        //************************************************************************************
        //** Nombre de la función: gestorRondaU
        //** Explicación del que hace la función: Verifica si el usuario ha ganado la ronda
        //** Parámetros de entrada: numeroUsuario, numeroAleatorio, puntuacionUsuario
        //** Parámetros de salida: puntuacionUsuario
        //************************************************************************************

        if (numeroUsuario == numeroAleatorio) {
            System.out.println("¡Has ganado esta ronda!");
            puntuacionUsuario++;
        }
        return puntuacionUsuario;

    }

    public static int gestorRondaI(int IA, int numeroAleatorio, int puntuacionIA) {

        //************************************************************************************
        //** Nombre de la función: gestorRondaI
        //** Explicación del que hace la función: Verifica si la IA ha ganado la ronda
        //** Parámetros de entrada: IA, numeroAleatorio, puntuacionIA
        //** Parámetros de salida: puntuacionIA
        //************************************************************************************

        if (IA == numeroAleatorio) {
            System.out.println("¡La IA ha ganado la ronda!");
            puntuacionIA++;
        }
        return puntuacionIA;
    }


    public static boolean ganadorPartida(int puntuacionUsuario, int puntuacionUsuario2, String name1, String name2) {

        //************************************************************************************
        //** Nombre de la función: ganadorPartida
        //** Explicación del que hace la función: Verifica quien ha ganado la partida
        //** Parámetros de entrada:  puntuacionUsuario, puntuacionUsuario2, name1, name2
        //** Parámetros de salida: vuelve al menú principal
        //************************************************************************************

        if (puntuacionUsuario == 3) {
            System.out.println("¡" + name1 + " Has ganado la partida!");
            return false;
        } else if (puntuacionUsuario2 == 3) {
            System.out.println("¡" + name2 + " Has ganado la partida!");

            return false;

        }
        return true;
    }

    public static void puntuaciones(int puntuacionUsuario, int puntuacionUsuario2, String jugadorUno, String name2) {

        //************************************************************************************
        //** Nombre de la función: puntuaciones
        //** Explicación del que hace la función: muestra por pantalla las puntuaciones obtenidas
        //** Parámetros de entrada: puntuacionUsuario, puntuacionUsuario2, jugadorUno, name2
        //** Parámetros de salida: menu(jugadorUno)
        //************************************************************************************

        System.out.println("El jugador " + jugadorUno + " lleva una puntuacion de: " + puntuacionUsuario + " en el juego de adivinar número.");
        System.out.println("El jugador: " + name2 + " lleva una puntuación de: " + puntuacionUsuario2 + " en el juego de adivinar número.");
        menu(jugadorUno);
    }

    /// COMBATE POKÉMON CONTRA LA IA ///

    public static void combatePokemonContraIA(int pokemon, int ai, int respuesta, int accion_ai, int vida_pokemon, int vida_pok_ai, int def_pokemon, int def_pok_ai, String reset, String yellow) {

        //************************************************************************************
        //** Nombre de la función: combatePokemonContraIA
        //** Explicación del que hace la función: Gestiona el combate pokemon contra la IA
        //** Parámetros de entrada: pokemon, ai, respuesta, accion_ai, vida_pokemon, vida_pok_ai, def_pokemon, def_pok_ai, reset, yellow
        //** Parámetros de salida:
        //************************************************************************************

        ai = POKEMON(ai);
        pokemon = POKEMON2(pokemon);
        PROFESORA(pokemon, respuesta);

        while (vida_pokemon > 0 && vida_pok_ai > 0 && def_pokemon > 0 && def_pok_ai > 0) {

            respuesta = BATALLA_1(pokemon, def_pok_ai);
            accion_ai = BATALLA_2(ai, accion_ai);

            if (accion_ai == 0) {
                vida_pokemon -= 2;
            } else if (accion_ai == 1) {
                def_pokemon -= 3;
                vida_pok_ai -= 1;
            }

            if (respuesta == 0) {
                vida_pok_ai -= 2;
            } else if (respuesta == 1) {
                def_pok_ai -= 3;
                vida_pokemon -= 1;
            }

            System.out.println(yellow + "te quedan " + vida_pokemon + " de vida");
            System.out.println("le quedan " + vida_pok_ai + " de vida");
            System.out.println("te quedan " + def_pokemon + " de defensa");
            System.out.println("le quedan " + def_pok_ai + " de defensa" + reset);
        }

        FINAL(vida_pokemon, def_pokemon, vida_pok_ai, def_pok_ai);
    }

    public static int POKEMON(int ai) {

        //************************************************************************************
        //** Nombre de la función: POKEMON
        //** Explicación del que hace la función: Gestiona la elecion de la ia de pokemons
        //** Parámetros de entrada: ai
        //** Parámetros de salida: ai
        //************************************************************************************

        Random rdm = new Random();

        String green = "\033[32m";
        String reset = "\u001B[0m";
        String yellow = "\033[33m";

        System.out.println(yellow + "TU AMIGO ESCOJERÁ UNO DE LOS TRES PRIMEROS POKEMONS QUE SE DAN PARA ESCOGER");
        System.out.println();
        ai = rdm.nextInt(3);
        if (ai == 0) {
            System.out.println(green + " TU AMIGO ESCOGIÓ A SNIVY" + reset);
        } else if (ai == 1) {
            System.out.println(green + "TU AMIGO ESCOGIÓ A TEPIG" + reset);
        } else if (ai == 2) {
            System.out.println(green + "TU AMIGO ESCOGIÓ A OSHAWOTT" + reset);
        }
        return ai;
    }

    public static int POKEMON2(int pokemon) {

        //************************************************************************************
        //** Nombre de la función: POKEMON2
        //** Explicación del que hace la función: Gestiona la elecion de pokemon del usuario
        //** Parámetros de entrada: pokemon
        //** Parámetros de salida: resultado
        //************************************************************************************

        Scanner scr = new Scanner(System.in);

        int resultado = 0;
        String green = "\033[32m";
        String reset = "\u001B[0m";
        String yellow = "\033[33m";


        System.out.println(yellow + "Es tu momento para que tengas tu primer pokemon, escoge bien porque el será tu amigo de aventuras");
        System.out.println("SI QUIERES A SNIVY ESCRIBA 0, el es un pokemon de tipo planta, es muy eficaz contra los de tipo agua");
        System.out.println("SI QUIERES A TEPIG ESCRIBA 1, el es un pokemon de tipo fuego, es muy eficaz contra los de tipo planta");
        System.out.println("SI QUIERES A OSHAWOTT ESCRIBA 2, el es un pokemon de tipo agua, es muy eficaz contra los de tipo fuego" + reset);
        pokemon = scr.nextInt();
        resultado = pokemon;
        if (pokemon == 0) {
            System.out.println(green + "FELICIDADES SNIVY SERÁ TU COMPAÑERO DE AVENTURAS" + reset);
        } else if (pokemon == 1) {
            System.out.println(green + "FELICIDADES TEPIG SERÁ TU COMPAÑERO DE AVENTURAS" + reset);
        } else if (pokemon == 2) {
            System.out.println(green + "FELICIDADES OSHAWOTT SERÁ TU COMPAÑERO DE AVENTURAS" + reset);
        }

        return resultado;
    }

    public static void PROFESORA(int pokemon, int respuesta) {

        //************************************************************************************
        //** Nombre de la función: PROFESROA
        //** Explicación del que hace la función: Empieza la batalla pokemon despues de hablar con ella
        //** Parámetros de entrada: pokemon, respuesta
        //** Parámetros de salida:
        //************************************************************************************

        Scanner scr = new Scanner(System.in);

        String green = "\033[32m";
        String reset = "\u001B[0m";
        String yellow = "\033[33m";
        String purple = "\033[35m";


        System.out.println("***********************************");
        System.out.println(yellow + "ELLA ES LA PROFESORA ENCINA" + reset);
        System.out.println(purple + "-Hola bienvenido a este mundo, al parecer ya cada uno tiene su compañero. Aqui teneis buestras pokeballs y una pokedex" + reset);
        System.out.println();
        System.out.println(yellow + "OBTUVISTE 5 POKEBALLS Y UNA POKEDEX");
        System.out.println("ESCOGE UNA DE ESTAS TRES RESPUESTAS:");
        System.out.println("1- ¡Que bién obtuve mi primer pokemon!");
        System.out.println("2- Con " + pokemon + " seré el mejor entrenador de pokemon");
        System.out.println("3- Con mi aventura conoceré a más pokemons y le ayudaré a obtener información de todos los pokemons profesora Encinas" + reset);
        respuesta = scr.nextInt();
        if (respuesta == 1) {
            System.out.println(green + "¡Que bién obtuve mi primer pokemon!" + reset);
        } else if (respuesta == 2) {
            System.out.println(green + "Con " + pokemon + " seré el mejor entrenador de pokemon" + reset);
        } else if (respuesta == 3) {
            System.out.println(green + "Con mi aventura conoceré a más pokemons y le ayudaré a obtener información de todos los pokemons profesora Encinas" + reset);
        }
        System.out.println(yellow + "TU AMIGO QUIERE RETARTE, EMPEZARÁS TU" + reset);

    }

    public static int BATALLA_1(int pokemon, int respuesta) {

        //************************************************************************************
        //** Nombre de la función: BATALLA_1
        //** Explicación del que hace la función: Gestiona la batalla por parte del usuario
        //** Parámetros de entrada: pokemon, respuesta
        //** Parámetros de salida: respuesta
        //************************************************************************************

        Scanner scr = new Scanner(System.in);

        String green = "\033[32m";
        String reset = "\u001B[0m";
        String yellow = "\033[33m";

        if (pokemon == 0) {
            System.out.println(yellow + "SNIVY TIENE LOS SIGUIENTES ATAQUES:" + reset);
            System.out.println(yellow + "PLACAJE [0] Y MALICIOSOA [1]" + reset);
            System.out.println(yellow + "¿QUE ATAQUE USARÁS?" + reset);
            respuesta = scr.nextInt(2);
            if (respuesta == 0) {
                System.out.println(green + "ESCOJISTE PLACAJE" + reset);
            } else if (respuesta == 1) {
                System.out.println(green + "ESCOJISTE MALICIOSA" + reset);
            }
        } else if (pokemon == 1) {
            System.out.println(yellow + "TEPIG TIENE LOS SIGUIENTES ATAQUES:" + reset);
            System.out.println(yellow + "PLACAJE [0] Y LÁTIGO [1]");
            System.out.println(yellow + "¿QUE ATAQUE USARÁS?" + reset);
            respuesta = scr.nextInt(2);
            if (respuesta == 0) {
                System.out.println(green + "ESCOJISTE PLACAJE" + reset);
            } else if (respuesta == 1) {
                System.out.println(green + "ESCOJISTE LÁTIGO" + reset);
            }
        } else if (pokemon == 2) {
            System.out.println(yellow + "OSHAWOTT TIENE LOS SIGUIENTES ATAQUES:" + reset);
            System.out.println(yellow + "PLACAJE [0] Y LÁTIGO [1]" + reset);
            System.out.println(yellow + "¿QUE ATAQUE USARÁS?" + reset);
            respuesta = scr.nextInt(2);
            if (respuesta == 0) {
                System.out.println(green + "ESCOJISTE PLACAJE" + reset);
            } else if (respuesta == 1) {
                System.out.println(green + "ESCOJISTE LÁTIGO" + reset);
            }
        }
        return respuesta;
    }

    public static int BATALLA_2(int ai, int accion_ai) {

        //************************************************************************************
        //** Nombre de la función: BATALLA_2
        //** Explicación del que hace la función: Gestiona la batalla por parte de la IA
        //** Parámetros de entrada: ai, accion_ai
        //** Parámetros de salida: accion_ai
        //************************************************************************************

        Random rdm = new Random();

        String green = "\033[32m";
        String reset = "\u001B[0m";
        String yellow = "\033[33m";

        System.out.println(yellow + "LE TOCA A TU AMIGO" + reset);
        System.out.println();
        if (ai == 0) {
            System.out.println(yellow + "SNIVY TIENE LOS SIGUIENTES ATAQUES:" + reset);
            System.out.println(yellow + "PLACAJE [0] Y MALICIOSOA [1]" + reset);
            System.out.println(yellow + "¿QUE ATAQUE USARÁS?" + reset);
            accion_ai = rdm.nextInt(2);
            if (accion_ai == 0) {
                System.out.println(green + "TU AMIGO ATACA CON PLACAJE" + reset);
            } else if (accion_ai == 1) {
                System.out.println(green + "TU AMIGO ATACA CON MALICIOSA" + reset);
            }
        } else if (ai == 1) {
            System.out.println(yellow + "TEPIG TIENE LOS SIGUIENTES ATAQUES:" + reset);
            System.out.println(yellow + "PLACAJE [0] Y LÁTIGO [1]");
            System.out.println(yellow + "¿QUE ATAQUE USARÁS?" + reset);
            accion_ai = rdm.nextInt(2);
            if (accion_ai == 0) {
                System.out.println(green + "TU AMIGO ATACA CON PLACAJE" + reset);
            } else if (accion_ai == 1) {
                System.out.println(green + "TU AMIGO ATACA CON LÁTIGO" + reset);
            }
        } else if (ai == 2) {
            System.out.println(yellow + "OSHAWOTT TIENE LOS SIGUIENTES ATAQUES:" + reset);
            System.out.println(yellow + "PLACAJE [0] Y LÁTIGO [1]" + reset);
            System.out.println(yellow + "¿QUE ATAQUE USARÁS?" + reset);
            accion_ai = rdm.nextInt(2);
            if (accion_ai == 0) {
                System.out.println(green + "TU AMIGO ATACA CON PLACAJE" + reset);
            } else if (accion_ai == 1) {
                System.out.println(green + "TU AMIGO ATACA CON LÁTIGO" + reset);
            }
        }
        return accion_ai;
    }

    public static void FINAL(int vida_pokemon, int vida_pok_ai, int def_pokemon, int def_pok_ai) {

        //************************************************************************************
        //** Nombre de la función: FINAL
        //** Explicación del que hace la función: Gestiona la vida de los pokemons y determina quien es el ganador
        //** Parámetros de entrada: vida_pokemon, vida_pok_ai, def_pokemon, def_pok_ai
        //** Parámetros de salida:
        //************************************************************************************

        String yellow = "\033[33m";


        if (vida_pokemon <= 0 && vida_pok_ai <= 0 || vida_pokemon <= 0 && def_pok_ai <= 0 || def_pok_ai <= 0 && def_pokemon <= 0) {
            System.out.println(yellow + "EMPATE");
        } else if (vida_pok_ai <= 0 || def_pok_ai <= 0) {
            System.out.println("GANAS");
        } else if (vida_pokemon <= 0 || def_pokemon <= 0) {
            System.out.println("GANA IA");
        }
    }


    //COMBATE POKEMON JUGADOR VS JUGADOR

    public static void combatePokemonJugadorVsJugador(int pokemon, int def_pokemon, int vida_pokemon, int respuesta, int amigo, int reset, int vida_pok_amigo, int def_pok_amigo, int accion_amigo, int yellow) {

        //************************************************************************************
        //** Nombre de la función: combatePokemonJugadorVsJugador
        //** Explicación del que hace la función: Gestiona el combate de jugador contra jugador
        //** Parámetros de entrada: pokemon, def_pokemon, vida_pokemon, respuesta, amigo, vida_pok_amigo, def_pok_amigo, accion_amigo, yellow
        //** Parámetros de salida:
        //************************************************************************************

        amigo = POKEMON_ELECCION((amigo));
        pokemon = POKEMON3(pokemon);
        PROFESORA_JUGADORCONTRAJUGADOR(pokemon, respuesta);

        while (vida_pokemon > 0 && vida_pok_amigo > 0 && def_pokemon > 0 && def_pok_amigo > 0) {

            respuesta = BATALLA_1_JUGADORCONTRAJUGADOR(pokemon, def_pok_amigo);
            accion_amigo = BATALLA_2_JUGADORCONTRAJUGADOR(amigo, accion_amigo);

            if (accion_amigo == 0) {
                vida_pokemon -= 2;
            } else if (accion_amigo == 1) {
                def_pokemon -= 3;
                vida_pok_amigo -= 1;
            }

            if (respuesta == 0) {
                vida_pok_amigo -= 2;
            } else if (respuesta == 1) {
                def_pok_amigo -= 3;
                vida_pokemon -= 1;
            }

            System.out.println(yellow + "te quedan " + vida_pokemon + " de vida");
            System.out.println("le quedan " + vida_pok_amigo + " de vida");
            System.out.println("te quedan " + def_pokemon + " de defensa");
            System.out.println("le quedan " + def_pok_amigo + " de defensa" + reset);
        }

        FINAL_JUGADORCONTRAJUGADOR(vida_pokemon, def_pokemon, vida_pok_amigo, def_pok_amigo);
    }

    public static int POKEMON_ELECCION(int amigo) {

        //************************************************************************************
        //** Nombre de la función: OKEMON_ELECCION
        //** Explicación del que hace la función: Elecion de pokemon del segundo jugador
        //** Parámetros de entrada: amigo
        //** Parámetros de salida: resultado
        //************************************************************************************

        Scanner scr = new Scanner(System.in);

        int resultado = 0;
        String green = "\033[32m";
        String reset = "\u001B[0m";
        String yellow = "\033[33m";


        System.out.println(yellow + "TU AMIGO ESCOJERÁ UNO DE LOS TRES PRIMEROS POKEMONS QUE SE DAN PARA ESCOGER");
        System.out.println("SI QUIERES A SNIVY ESCRIBA 0, el es un pokemon de tipo planta, es muy eficaz contra los de tipo agua");
        System.out.println("SI QUIERES A TEPIG ESCRIBA 1, el es un pokemon de tipo fuego, es muy eficaz contra los de tipo planta");
        System.out.println("SI QUIERES A OSHAWOTT ESCRIBA 2, el es un pokemon de tipo agua, es muy eficaz contra los de tipo fuego" + reset);
        System.out.println(" ");
        amigo = scr.nextInt();
        resultado = amigo;
        if (amigo == 0) {
            System.out.println(green + " TU AMIGO ESCOGIÓ A SNIVY" + reset);
        } else if (amigo == 1) {
            System.out.println(green + "TU AMIGO ESCOGIÓ A TEPIG" + reset);
        } else if (amigo == 2) {
            System.out.println(green + "TU AMIGO ESCOGIÓ A OSHAWOTT" + reset);
        }
        return resultado;
    }

    public static int POKEMON3(int pokemon) {

        //************************************************************************************
        //** Nombre de la función: POKEMON3
        //** Explicación del que hace la función: Elecion del pokemon del jugador uno
        //** Parámetros de entrada: pokemon
        //** Parámetros de salida: resultado
        //************************************************************************************

        Scanner scr = new Scanner(System.in);

        int resultado = 0;
        String green = "\033[32m";
        String reset = "\u001B[0m";
        String yellow = "\033[33m";


        System.out.println(yellow + "Es tu momento para que tengas tu primer pokemon, escoge bien porque el será tu amigo de aventuras");
        System.out.println("SI QUIERES A SNIVY ESCRIBA 0, el es un pokemon de tipo planta, es muy eficaz contra los de tipo agua");
        System.out.println("SI QUIERES A TEPIG ESCRIBA 1, el es un pokemon de tipo fuego, es muy eficaz contra los de tipo planta");
        System.out.println("SI QUIERES A OSHAWOTT ESCRIBA 2, el es un pokemon de tipo agua, es muy eficaz contra los de tipo fuego" + reset);
        pokemon = scr.nextInt();
        resultado = pokemon;
        if (pokemon == 0) {
            System.out.println(green + "FELICIDADES SNIVY SERÁ TU COMPAÑERO DE AVENTURAS" + reset);
        } else if (pokemon == 1) {
            System.out.println(green + "FELICIDADES TEPIG SERÁ TU COMPAÑERO DE AVENTURAS" + reset);
        } else if (pokemon == 2) {
            System.out.println(green + "FELICIDADES OSHAWOTT SERÁ TU COMPAÑERO DE AVENTURAS" + reset);
        }

        return resultado;
    }

    public static void PROFESORA_JUGADORCONTRAJUGADOR(int pokemon, int respuesta) {

        //************************************************************************************
        //** Nombre de la función: PROFESORA_JUGADORCONTRAJUGADOR
        //** Explicación del que hace la función: Inicio del combate jugador contra jugador
        //** Parámetros de entrada: pokemon, respuesta
        //** Parámetros de salida:
        //************************************************************************************


        Scanner scr = new Scanner(System.in);

        String green = "\033[32m";
        String reset = "\u001B[0m";
        String yellow = "\033[33m";
        String purple = "\033[35m";


        System.out.println("***********************************");
        System.out.println(yellow + "ELLA ES LA PROFESORA ENCINA" + reset);
        System.out.println(purple + "-Hola bienvenido a este mundo, al parecer ya cada uno tiene su compañero. Aqui teneis buestras pokeballs y una pokedex" + reset);
        System.out.println();
        System.out.println(yellow + "OBTUVISTE 5 POKEBALLS Y UNA POKEDEX");
        System.out.println("ESCOGE UNA DE ESTAS TRES RESPUESTAS:");
        System.out.println("1- ¡Que bién obtuve mi primer pokemon!");
        System.out.println("2- Con " + pokemon + " seré el mejor entrenador de pokemon");
        System.out.println("3- Con mi aventura conoceré a más pokemons y le ayudaré a obtener información de todos los pokemons profesora Encinas" + reset);
        respuesta = scr.nextInt();
        if (respuesta == 1) {
            System.out.println(green + "¡Que bién obtuve mi primer pokemon!" + reset);
        } else if (respuesta == 2) {
            System.out.println(green + "Con " + pokemon + " seré el mejor entrenador de pokemon" + reset);
        } else if (respuesta == 3) {
            System.out.println(green + "Con mi aventura conoceré a más pokemons y le ayudaré a obtener información de todos los pokemons profesora Encinas" + reset);
        }
        System.out.println(yellow + "TU AMIGO QUIERE RETARTE, EMPEZARÁS TU" + reset);

    }

    public static int BATALLA_1_JUGADORCONTRAJUGADOR(int pokemon, int respuesta) {

        //************************************************************************************
        //** Nombre de la función: BATALLA_1_JUGADORCONTRAJUGADOR
        //** Explicación del que hace la función: Gestiona el primer turno del primer jugador
        //** Parámetros de entrada: pokemon, respuesta
        //** Parámetros de salida: respuesta
        //************************************************************************************

        Scanner scr = new Scanner(System.in);

        String green = "\033[32m";
        String reset = "\u001B[0m";
        String yellow = "\033[33m";

        if (pokemon == 0) {
            System.out.println(yellow + "SNIVY TIENE LOS SIGUIENTES ATAQUES:" + reset);
            System.out.println(yellow + "PLACAJE [0] Y MALICIOSOA [1]" + reset);
            System.out.println(yellow + "¿QUE ATAQUE USARÁS?" + reset);
            respuesta = scr.nextInt(2);
            if (respuesta == 0) {
                System.out.println(green + "ESCOJISTE PLACAJE" + reset);
            } else if (respuesta == 1) {
                System.out.println(green + "ESCOJISTE MALICIOSA" + reset);
            }
        } else if (pokemon == 1) {
            System.out.println(yellow + "TEPIG TIENE LOS SIGUIENTES ATAQUES:" + reset);
            System.out.println(yellow + "PLACAJE [0] Y LÁTIGO [1]");
            System.out.println(yellow + "¿QUE ATAQUE USARÁS?" + reset);
            respuesta = scr.nextInt(2);
            if (respuesta == 0) {
                System.out.println(green + "ESCOJISTE PLACAJE" + reset);
            } else if (respuesta == 1) {
                System.out.println(green + "ESCOJISTE LÁTIGO" + reset);
            }
        } else if (pokemon == 2) {
            System.out.println(yellow + "OSHAWOTT TIENE LOS SIGUIENTES ATAQUES:" + reset);
            System.out.println(yellow + "PLACAJE [0] Y LÁTIGO [1]" + reset);
            System.out.println(yellow + "¿QUE ATAQUE USARÁS?" + reset);
            respuesta = scr.nextInt(2);
            if (respuesta == 0) {
                System.out.println(green + "ESCOJISTE PLACAJE" + reset);
            } else if (respuesta == 1) {
                System.out.println(green + "ESCOJISTE LÁTIGO" + reset);
            }
        }
        return respuesta;
    }

    public static int BATALLA_2_JUGADORCONTRAJUGADOR(int amigo, int accion_amigo) {

        //************************************************************************************
        //** Nombre de la función: BATALLA_2_JUGADORCONTRAJUGADOR
        //** Explicación del que hace la función: El turno del segundo jugador
        //** Parámetros de entrada: amigo, accion_amigo
        //** Parámetros de salida: accion_amigo
        //************************************************************************************

        Scanner scr = new Scanner(System.in);

        String green = "\033[32m";
        String reset = "\u001B[0m";
        String yellow = "\033[33m";

        System.out.println(yellow + "LE TOCA A TU AMIGO" + reset);
        System.out.println();
        if (amigo == 0) {
            System.out.println(yellow + "SNIVY TIENE LOS SIGUIENTES ATAQUES:" + reset);
            System.out.println(yellow + "PLACAJE [0] Y MALICIOSOA [1]" + reset);
            System.out.println(yellow + "¿QUE ATAQUE USARÁS?" + reset);
            accion_amigo = scr.nextInt(2);
            if (accion_amigo == 0) {
                System.out.println(green + "TU AMIGO ATACA CON PLACAJE" + reset);
            } else if (accion_amigo == 1) {
                System.out.println(green + "TU AMIGO ATACA CON MALICIOSA" + reset);
            }
        } else if (amigo == 1) {
            System.out.println(yellow + "TEPIG TIENE LOS SIGUIENTES ATAQUES:" + reset);
            System.out.println(yellow + "PLACAJE [0] Y LÁTIGO [1]");
            System.out.println(yellow + "¿QUE ATAQUE USARÁS?" + reset);
            accion_amigo = scr.nextInt(2);
            if (accion_amigo == 0) {
                System.out.println(green + "TU AMIGO ATACA CON PLACAJE" + reset);
            } else if (accion_amigo == 1) {
                System.out.println(green + "TU AMIGO ATACA CON LÁTIGO" + reset);
            }
        } else if (amigo == 2) {
            System.out.println(yellow + "OSHAWOTT TIENE LOS SIGUIENTES ATAQUES:" + reset);
            System.out.println(yellow + "PLACAJE [0] Y LÁTIGO [1]" + reset);
            System.out.println(yellow + "¿QUE ATAQUE USARÁS?" + reset);
            accion_amigo = scr.nextInt(2);
            if (accion_amigo == 0) {
                System.out.println(green + "TU AMIGO ATACA CON PLACAJE" + reset);
            } else if (accion_amigo == 1) {
                System.out.println(green + "TU AMIGO ATACA CON LÁTIGO" + reset);
            }
        }
        return accion_amigo;
    }

    public static void FINAL_JUGADORCONTRAJUGADOR(int vida_pokemon, int vida_pok_amigo, int def_pokemon, int def_pok_amigo) {

        //************************************************************************************
        //** Nombre de la función: FINAL_JUGADORCONTRAJUGADOR
        //** Explicación del que hace la función: Define quien ha ganado la partida
        //** Parámetros de entrada: vida_pokemon, vida_pok_amigo, def_pokemon, def_pok_amigo
        //** Parámetros de salida:
        //************************************************************************************

        String yellow = "\033[33m";

        if (vida_pokemon <= 0 && vida_pok_amigo <= 0 || vida_pokemon <= 0 && def_pok_amigo <= 0 || def_pok_amigo <= 0 && def_pokemon <= 0) {
            System.out.println(yellow + "EMPATE");
        } else if (vida_pok_amigo <= 0 || def_pok_amigo <= 0) {
            System.out.println("GANAS");
        } else if (vida_pokemon <= 0 || def_pokemon <= 0) {
            System.out.println("GANA IA");
        }
    }
=======
/**
 * @author Axel y Siru
 */

import java.util.Random;
import java.util.Scanner;

public class AxelArroyoGimenez_Siru_Minijuegos {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        //Variables
        String cyan = "\033[36m";
        String reset = "\u001B[0m";
        String blue = "\033[34m";
        String yellow = "\033[33m";
        //POKEMON
        int pokemon = 0;
        //PERSONAJES
        int ai = 0;
        int amigo = 0;
        //RESPUESTAS
        int respuesta = 0, accion_ai = 0, accion_amigo = 0;
        //BATALLA IA
        int vida_pokemon = 10, vida_pok_ai = 10, def_pokemon = 10, def_pok_ai = 10;
        //BATALLA JUGADOR CONTRA JUGADOR
        int vida_pok_amigo = 10, def_pok_amigo = 10;
        String jugadorUno = " ";
        System.out.println("¿Cual es tu nombre?");
        jugadorUno = teclado.nextLine();

        //Funciones
        menu(jugadorUno);
    }

    public static int menu(String jugadorUno) {

        //************************************************************************************
        //** Nombre de la función: menu
        //** Explicación del que hace la función: el menú para gestionar a que juego jugará el usuario
        //** Parámetros de entrada: jugadorUno
        //** Parámetros de salida: opcionUsuario
        //************************************************************************************

        int opcionUsuario = 0;

        System.out.println("¡Bievneidx! Elije una opción de nuestro menú: ");
        System.out.println("1. Jugar");
        System.out.println("2.- Información");
        System.out.println("3.- Mostrar puntuaciones");
        System.out.println("4.- Autores");
        System.out.println("5.- Versión");
        System.out.println("6.- Salir");
        opcionUsuario = teclado.nextInt();

        if (opcionUsuario == 1) {
            juegos(jugadorUno);
        } else if (opcionUsuario == 2) {
            informacion(jugadorUno);

        } else if (opcionUsuario == 3) {
            puntuaciones(opcionUsuario, opcionUsuario, jugadorUno, jugadorUno);

        } else if (opcionUsuario == 4) {
            System.out.println("Axel y Siru");
            menu(jugadorUno);

        } else if (opcionUsuario == 5) {
            System.out.println("1.2.3");
            menu(jugadorUno);
        } else if (opcionUsuario == 6) {

        }

        return opcionUsuario;
    }

    public static void informacion(String jugadorUno) {

        //************************************************************************************
        //** Nombre de la función: informacion
        //** Explicación del que hace la función: Para informar de que va cada juego
        //** Parámetros de entrada: jugadorUno
        //** Parámetros de salida: volver al menú anterior "menu(jugadorUno)"
        //************************************************************************************

        System.out.println("---------------------- ADIVINA EL NÚMERO ----------------------");
        System.out.println("Quien adivine el número 3 veces, será el ganador de la partida");
        System.out.println("---------------------------------------------------------------");
        System.out.println();
        System.out.println("---------------------- COMBATE POKÉMON -------------------------");
        System.out.println("Deberás derrotar al pokemon de tu oponente para ganar la partida");
        System.out.println("----------------------------------------------------------------");

        menu(jugadorUno);
    }


    public static int juegos(String jugadorUno) {
        //************************************************************************************
        //** Nombre de la función: juegos
        //** Explicación del que hace la función: Preguntar al usuario que juego jugará
        //** Parámetros de entrada: jugadorUno
        //** Parámetros de salida: opcionUsuario
        //************************************************************************************

        int opcionUsuario = 0;

        System.out.println("Actualmente disponemos de dos juegos. ¿Cual quieres jugar?");
        System.out.println("1.- Adivina el número");
        System.out.println("2.- Combate pokémon");
        System.out.println("3.- Volver al menú anterior");
        opcionUsuario = teclado.nextInt();

        if (opcionUsuario == 1) {
            modoDeJuegoAdivinaElNumero(jugadorUno, opcionUsuario);
        } else if (opcionUsuario == 2) {
            modoDeJuegoCombatePokemon(jugadorUno, opcionUsuario);
        } else if (opcionUsuario == 3) {
            menu(jugadorUno);
        }
        return opcionUsuario;
    }

    public static int modoDeJuegoAdivinaElNumero(String jugadorUno, int opcionUsuario) {

        //************************************************************************************
        //** Nombre de la función: modoDeJuegoAdivinaElNumero
        //** Explicación del que hace la función: Gestiona si el usuario elije adivina el número que modo querrá. Jcj o JcIa
        //** Parámetros de entrada: jugadorUno, opcionUsuario
        //** Parámetros de salida: opcionUsuario
        //************************************************************************************

        System.out.println("Disponemos de dos modos actualmente. Jugador contra Jugador y Jugador contra la IA. Elije cual vas a jugar: ");
        System.out.println("1.- Jugador contra Jugador");
        System.out.println("2.- Jugador contra la IA");
        System.out.println("3.- Volver al menú anterior");
        opcionUsuario = teclado.nextInt();

        if (opcionUsuario == 1) {
            adivinaElNumeroJugadorVsJugador(jugadorUno);
        } else if (opcionUsuario == 2) {
            adivinaElNumeroIA(jugadorUno);
        } else if (opcionUsuario == 3) {
            juegos(jugadorUno);
        }
        return opcionUsuario;
    }

    public static int modoDeJuegoCombatePokemon(String jugadorUno, int opcionUsuario) {

        //************************************************************************************
        //** Nombre de la función: modoDeJuegoCombatePokemon
        //** Explicación del que hace la función: Gestiona si el usuario elije combate pokemon que modo querrá. Jcj o JcIa
        //** Parámetros de entrada: jugadorUno, opcionUsuario
        //** Parámetros de salida: opcionUsuario
        //************************************************************************************

        System.out.println("Disponemos de dos modos actualmente. Jugador contra Jugador y Jugador contra la IA. Elije cual vas a jugar: ");
        System.out.println("1.- Jugador contra Jugador");
        System.out.println("2.- Jugador contra la IA");
        System.out.println("3.- Volver al menú anterior");
        opcionUsuario = teclado.nextInt();

        if (opcionUsuario == 1) {
            combatePokemonJugadorVsJugador(opcionUsuario, opcionUsuario, opcionUsuario, opcionUsuario, opcionUsuario, opcionUsuario, opcionUsuario, opcionUsuario, opcionUsuario, opcionUsuario);
        } else if (opcionUsuario == 2) {
            combatePokemonContraIA(opcionUsuario, opcionUsuario, opcionUsuario, opcionUsuario, opcionUsuario, opcionUsuario, opcionUsuario, opcionUsuario, jugadorUno, jugadorUno);
        } else if (opcionUsuario == 3) {
            juegos(jugadorUno);
        }
        return opcionUsuario;
    }

    public static void adivinaElNumeroJugadorVsJugador(String jugadorUno) {

        //************************************************************************************
        //** Nombre de la función: adivinaElNumeroJugadorVsJugador
        //** Explicación del que hace la función: Juego de adivinar el número de jugador contra jugador
        //** Parámetros de entrada: jugadorUno
        //** Parámetros de salida:
        //************************************************************************************

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
        String jugadorDos = teclado.next();

        do {
            turno = turnos(jugadorUno, jugadorDos, turno);
            contadorRonda++;
            numeroAleatorio = rand.nextInt(10) + 1;
            System.out.println("Estáis en la ronda: " + contadorRonda);
            if (turno) {
                System.out.println(jugadorUno + " Elije un número del 1 al 10: ");
                numeroJugadorUno = teclado.nextInt();
                while(numeroJugadorUno> 10 ||numeroJugadorUno <= 0) {
                    System.out.println("¡El número que has introducido es incorrecto! Recuerda que debe de ser un número del 1 al 10");
                    numeroJugadorUno = teclado.nextInt();
                }
                puntuacionJugadorUno = gestorRondaJugadorUno(jugadorUno, numeroJugadorUno, numeroAleatorio, puntuacionJugadorUno);
            } else {
                System.out.println(jugadorDos + " Elije un número del 1 al 10: ");
                numeroJugadorDos = teclado.nextInt();
                while(numeroJugadorDos> 10 ||numeroJugadorDos <= 0) {
                    System.out.println("¡El número que has introducido es incorrecto! Recuerda que debe de ser un número del 1 al 10");
                    numeroJugadorDos = teclado.nextInt();
                }
                puntuacionJugadorDos = gestorRondaJugadorDos(jugadorDos, numeroJugadorDos, numeroAleatorio, puntuacionJugadorDos);
            }
        } while (ganadorPartida(puntuacionJugadorUno, puntuacionJugadorDos, jugadorUno, jugadorDos));

    }


    public static boolean turnos(String jugadorUno, String jugadorDos, boolean jugador) {

        //************************************************************************************
        //** Nombre de la función: turnos
        //** Explicación del que hace la función: Gestiona los turnos del modo de juego de jugador contra jugador
        //** Parámetros de entrada: jugadorUno, jugadorDos, jugador
        //** Parámetros de salida: jugador
        //************************************************************************************

        jugador = !jugador;

        if (jugador) {
            System.out.println("¡Es el turno de " + jugadorUno + "!");
        } else {
            System.out.println("¡Es el turno de " + jugadorDos + "!");

        }

        return jugador;
    }

    public static int gestorRondaJugadorUno(String jugadorUno, int numeroJugadorUno, int numeroAleatorio, int puntuacionJugadorUno) {

        //************************************************************************************
        //** Nombre de la función: gestorRondaJugadorUno
        //** Explicación del que hace la función: Gestiona la ronda para saber si darle un punto al jugador uno o no
        //** Parámetros de entrada: jugadorUno, numeroJugadorUno, numeroAleatorio, puntuacionJugadorUno
        //** Parámetros de salida: puntuacionJugadorUno
        //************************************************************************************

        if (numeroJugadorUno == numeroAleatorio) {
            System.out.println("!" + jugadorUno + " has ganado esta ronda!");
            puntuacionJugadorUno++;
        }
        return puntuacionJugadorUno;

    }

    public static int gestorRondaJugadorDos(String jugadorDos, int numeroJugadorDos, int numeroAleatorio, int puntuacionJugadorDos) {

        //************************************************************************************
        //** Nombre de la función: gestorRondaJugadorDos
        //** Explicación del que hace la función: Gestiona la ronda para saber si darle un punto al jugador uno o no
        //** Parámetros de entrada: jugadorDos, numeroJugadorDos, numeroAleatorio, puntuacionJugadorDos
        //** Parámetros de salida: puntuacionJugadorDos
        //************************************************************************************

        if (numeroJugadorDos == numeroAleatorio) {
            System.out.println("!" + jugadorDos + " has ganado esta ronda!");
            puntuacionJugadorDos++;
        }
        return puntuacionJugadorDos;
    }

    //// FUNCIÓN DEL MINIJUEGO DE ADIVINAR NÚMERO VS IA ////

    public static void adivinaElNumeroIA(String jugadorUno) {

        //************************************************************************************
        //** Nombre de la función:adivinaElNumeroIA
        //** Explicación del que hace la función: Gestiona el juego de adivinar el número contra la IA
        //** Parámetros de entrada: jugadorUno
        //** Parámetros de salida:
        //************************************************************************************

        //Variables

        int numeroUsuario = 0;
        int IA = 0;
        int contadorRonda = 0;
        int puntuacionUsuario = 0;
        int puntuacionIA = 0;
        Random rand = new Random();
        int numeroAleatorio;

        System.out.println("Adivina 3 veces el número y serás el vencedor. Cada ronda el número cambiará.");
        numeroAleatorio = rand.nextInt(10) + 1;
        do {
            contadorRonda++;
            numeroAleatorio = rand.nextInt(10) + 1;
            System.out.println("Estás en la ronda: " + contadorRonda);
            System.out.println(jugadorUno + " elije un número del 1 al 10: ");
            numeroUsuario = teclado.nextInt();
            while (numeroUsuario > 10 || numeroUsuario <= 0) {
                System.out.println("¡El número que has introducido es incorrecto! Recuerda que debe de ser entre 1 y 10");
                numeroUsuario = teclado.nextInt();
            }
            System.out.println("La IA está eligiendo número...");
            IA = elecionNumeroIA(IA);
            System.out.println("La IA ha elegido el número: " + IA);

            /// COMPROBACIÓN SI HA GANADO LA RONDA ///

            puntuacionUsuario = gestorRondaU(numeroUsuario, numeroAleatorio, puntuacionUsuario);
            puntuacionIA = gestorRondaI(IA, numeroAleatorio, puntuacionIA);
        } while (ganadorPartida(puntuacionUsuario, puntuacionIA, jugadorUno, "IA"));
        menu(jugadorUno);

    }

    //// FUNCIÓN PARA QUE LA IA ELIJA EL NÚMERO ////

    public static int elecionNumeroIA(int IA) {

        //************************************************************************************
        //** Nombre de la función: elecionNumeroIA
        //** Explicación del que hace la función: Pone en pausa a la función durante unos segundos para simular que la IA está pensando un número
        //** Parámetros de entrada: IA
        //** Parámetros de salida: IA
        //************************************************************************************

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

    public static int gestorRondaU(int numeroUsuario, int numeroAleatorio, int puntuacionUsuario) {

        //************************************************************************************
        //** Nombre de la función: gestorRondaU
        //** Explicación del que hace la función: Verifica si el usuario ha ganado la ronda
        //** Parámetros de entrada: numeroUsuario, numeroAleatorio, puntuacionUsuario
        //** Parámetros de salida: puntuacionUsuario
        //************************************************************************************

        if (numeroUsuario == numeroAleatorio) {
            System.out.println("¡Has ganado esta ronda!");
            puntuacionUsuario++;
        }
        return puntuacionUsuario;

    }

    public static int gestorRondaI(int IA, int numeroAleatorio, int puntuacionIA) {

        //************************************************************************************
        //** Nombre de la función: gestorRondaI
        //** Explicación del que hace la función: Verifica si la IA ha ganado la ronda
        //** Parámetros de entrada: IA, numeroAleatorio, puntuacionIA
        //** Parámetros de salida: puntuacionIA
        //************************************************************************************

        if (IA == numeroAleatorio) {
            System.out.println("¡La IA ha ganado la ronda!");
            puntuacionIA++;
        }
        return puntuacionIA;
    }


    public static boolean ganadorPartida(int puntuacionUsuario, int puntuacionUsuario2, String name1, String name2) {

        //************************************************************************************
        //** Nombre de la función: ganadorPartida
        //** Explicación del que hace la función: Verifica quien ha ganado la partida
        //** Parámetros de entrada:  puntuacionUsuario, puntuacionUsuario2, name1, name2
        //** Parámetros de salida: vuelve al menú principal
        //************************************************************************************

        if (puntuacionUsuario == 3) {
            System.out.println("¡" + name1 + " Has ganado la partida!");
            return false;
        } else if (puntuacionUsuario2 == 3) {
            System.out.println("¡" + name2 + " Has ganado la partida!");

            return false;

        }
        return true;
    }

    public static void puntuaciones(int puntuacionUsuario, int puntuacionUsuario2, String jugadorUno, String name2) {

        //************************************************************************************
        //** Nombre de la función: puntuaciones
        //** Explicación del que hace la función: muestra por pantalla las puntuaciones obtenidas
        //** Parámetros de entrada: puntuacionUsuario, puntuacionUsuario2, jugadorUno, name2
        //** Parámetros de salida: menu(jugadorUno)
        //************************************************************************************

        System.out.println("El jugador " + jugadorUno + " lleva una puntuacion de: " + puntuacionUsuario + " en el juego de adivinar número.");
        System.out.println("El jugador: " + name2 + " lleva una puntuación de: " + puntuacionUsuario2 + " en el juego de adivinar número.");
        menu(jugadorUno);
    }

    /// COMBATE POKÉMON CONTRA LA IA ///

    public static void combatePokemonContraIA(int pokemon, int ai, int respuesta, int accion_ai, int vida_pokemon, int vida_pok_ai, int def_pokemon, int def_pok_ai, String reset, String yellow) {

        //************************************************************************************
        //** Nombre de la función: combatePokemonContraIA
        //** Explicación del que hace la función: Gestiona el combate pokemon contra la IA
        //** Parámetros de entrada: pokemon, ai, respuesta, accion_ai, vida_pokemon, vida_pok_ai, def_pokemon, def_pok_ai, reset, yellow
        //** Parámetros de salida:
        //************************************************************************************

        ai = POKEMON(ai);
        pokemon = POKEMON2(pokemon);
        PROFESORA(pokemon, respuesta);

        while (vida_pokemon > 0 && vida_pok_ai > 0 && def_pokemon > 0 && def_pok_ai > 0) {

            respuesta = BATALLA_1(pokemon, def_pok_ai);
            accion_ai = BATALLA_2(ai, accion_ai);

            if (accion_ai == 0) {
                vida_pokemon -= 2;
            } else if (accion_ai == 1) {
                def_pokemon -= 3;
                vida_pok_ai -= 1;
            }

            if (respuesta == 0) {
                vida_pok_ai -= 2;
            } else if (respuesta == 1) {
                def_pok_ai -= 3;
                vida_pokemon -= 1;
            }

            System.out.println(yellow + "te quedan " + vida_pokemon + " de vida");
            System.out.println("le quedan " + vida_pok_ai + " de vida");
            System.out.println("te quedan " + def_pokemon + " de defensa");
            System.out.println("le quedan " + def_pok_ai + " de defensa" + reset);
        }

        FINAL(vida_pokemon, def_pokemon, vida_pok_ai, def_pok_ai);
    }

    public static int POKEMON(int ai) {

        //************************************************************************************
        //** Nombre de la función: POKEMON
        //** Explicación del que hace la función: Gestiona la elecion de la ia de pokemons
        //** Parámetros de entrada: ai
        //** Parámetros de salida: ai
        //************************************************************************************

        Random rdm = new Random();

        String green = "\033[32m";
        String reset = "\u001B[0m";
        String yellow = "\033[33m";

        System.out.println(yellow + "TU AMIGO ESCOJERÁ UNO DE LOS TRES PRIMEROS POKEMONS QUE SE DAN PARA ESCOGER");
        System.out.println();
        ai = rdm.nextInt(3);
        if (ai == 0) {
            System.out.println(green + " TU AMIGO ESCOGIÓ A SNIVY" + reset);
        } else if (ai == 1) {
            System.out.println(green + "TU AMIGO ESCOGIÓ A TEPIG" + reset);
        } else if (ai == 2) {
            System.out.println(green + "TU AMIGO ESCOGIÓ A OSHAWOTT" + reset);
        }
        return ai;
    }

    public static int POKEMON2(int pokemon) {

        //************************************************************************************
        //** Nombre de la función: POKEMON2
        //** Explicación del que hace la función: Gestiona la elecion de pokemon del usuario
        //** Parámetros de entrada: pokemon
        //** Parámetros de salida: resultado
        //************************************************************************************

        Scanner scr = new Scanner(System.in);

        int resultado = 0;
        String green = "\033[32m";
        String reset = "\u001B[0m";
        String yellow = "\033[33m";


        System.out.println(yellow + "Es tu momento para que tengas tu primer pokemon, escoge bien porque el será tu amigo de aventuras");
        System.out.println("SI QUIERES A SNIVY ESCRIBA 0, el es un pokemon de tipo planta, es muy eficaz contra los de tipo agua");
        System.out.println("SI QUIERES A TEPIG ESCRIBA 1, el es un pokemon de tipo fuego, es muy eficaz contra los de tipo planta");
        System.out.println("SI QUIERES A OSHAWOTT ESCRIBA 2, el es un pokemon de tipo agua, es muy eficaz contra los de tipo fuego" + reset);
        pokemon = scr.nextInt();
        resultado = pokemon;
        if (pokemon == 0) {
            System.out.println(green + "FELICIDADES SNIVY SERÁ TU COMPAÑERO DE AVENTURAS" + reset);
        } else if (pokemon == 1) {
            System.out.println(green + "FELICIDADES TEPIG SERÁ TU COMPAÑERO DE AVENTURAS" + reset);
        } else if (pokemon == 2) {
            System.out.println(green + "FELICIDADES OSHAWOTT SERÁ TU COMPAÑERO DE AVENTURAS" + reset);
        }

        return resultado;
    }

    public static void PROFESORA(int pokemon, int respuesta) {

        //************************************************************************************
        //** Nombre de la función: PROFESROA
        //** Explicación del que hace la función: Empieza la batalla pokemon despues de hablar con ella
        //** Parámetros de entrada: pokemon, respuesta
        //** Parámetros de salida:
        //************************************************************************************

        Scanner scr = new Scanner(System.in);

        String green = "\033[32m";
        String reset = "\u001B[0m";
        String yellow = "\033[33m";
        String purple = "\033[35m";


        System.out.println("***********************************");
        System.out.println(yellow + "ELLA ES LA PROFESORA ENCINA" + reset);
        System.out.println(purple + "-Hola bienvenido a este mundo, al parecer ya cada uno tiene su compañero. Aqui teneis buestras pokeballs y una pokedex" + reset);
        System.out.println();
        System.out.println(yellow + "OBTUVISTE 5 POKEBALLS Y UNA POKEDEX");
        System.out.println("ESCOGE UNA DE ESTAS TRES RESPUESTAS:");
        System.out.println("1- ¡Que bién obtuve mi primer pokemon!");
        System.out.println("2- Con " + pokemon + " seré el mejor entrenador de pokemon");
        System.out.println("3- Con mi aventura conoceré a más pokemons y le ayudaré a obtener información de todos los pokemons profesora Encinas" + reset);
        respuesta = scr.nextInt();
        if (respuesta == 1) {
            System.out.println(green + "¡Que bién obtuve mi primer pokemon!" + reset);
        } else if (respuesta == 2) {
            System.out.println(green + "Con " + pokemon + " seré el mejor entrenador de pokemon" + reset);
        } else if (respuesta == 3) {
            System.out.println(green + "Con mi aventura conoceré a más pokemons y le ayudaré a obtener información de todos los pokemons profesora Encinas" + reset);
        }
        System.out.println(yellow + "TU AMIGO QUIERE RETARTE, EMPEZARÁS TU" + reset);

    }

    public static int BATALLA_1(int pokemon, int respuesta) {

        //************************************************************************************
        //** Nombre de la función: BATALLA_1
        //** Explicación del que hace la función: Gestiona la batalla por parte del usuario
        //** Parámetros de entrada: pokemon, respuesta
        //** Parámetros de salida: respuesta
        //************************************************************************************

        Scanner scr = new Scanner(System.in);

        String green = "\033[32m";
        String reset = "\u001B[0m";
        String yellow = "\033[33m";

        if (pokemon == 0) {
            System.out.println(yellow + "SNIVY TIENE LOS SIGUIENTES ATAQUES:" + reset);
            System.out.println(yellow + "PLACAJE [0] Y MALICIOSOA [1]" + reset);
            System.out.println(yellow + "¿QUE ATAQUE USARÁS?" + reset);
            respuesta = scr.nextInt(2);
            if (respuesta == 0) {
                System.out.println(green + "ESCOJISTE PLACAJE" + reset);
            } else if (respuesta == 1) {
                System.out.println(green + "ESCOJISTE MALICIOSA" + reset);
            }
        } else if (pokemon == 1) {
            System.out.println(yellow + "TEPIG TIENE LOS SIGUIENTES ATAQUES:" + reset);
            System.out.println(yellow + "PLACAJE [0] Y LÁTIGO [1]");
            System.out.println(yellow + "¿QUE ATAQUE USARÁS?" + reset);
            respuesta = scr.nextInt(2);
            if (respuesta == 0) {
                System.out.println(green + "ESCOJISTE PLACAJE" + reset);
            } else if (respuesta == 1) {
                System.out.println(green + "ESCOJISTE LÁTIGO" + reset);
            }
        } else if (pokemon == 2) {
            System.out.println(yellow + "OSHAWOTT TIENE LOS SIGUIENTES ATAQUES:" + reset);
            System.out.println(yellow + "PLACAJE [0] Y LÁTIGO [1]" + reset);
            System.out.println(yellow + "¿QUE ATAQUE USARÁS?" + reset);
            respuesta = scr.nextInt(2);
            if (respuesta == 0) {
                System.out.println(green + "ESCOJISTE PLACAJE" + reset);
            } else if (respuesta == 1) {
                System.out.println(green + "ESCOJISTE LÁTIGO" + reset);
            }
        }
        return respuesta;
    }

    public static int BATALLA_2(int ai, int accion_ai) {

        //************************************************************************************
        //** Nombre de la función: BATALLA_2
        //** Explicación del que hace la función: Gestiona la batalla por parte de la IA
        //** Parámetros de entrada: ai, accion_ai
        //** Parámetros de salida: accion_ai
        //************************************************************************************

        Random rdm = new Random();

        String green = "\033[32m";
        String reset = "\u001B[0m";
        String yellow = "\033[33m";

        System.out.println(yellow + "LE TOCA A TU AMIGO" + reset);
        System.out.println();
        if (ai == 0) {
            System.out.println(yellow + "SNIVY TIENE LOS SIGUIENTES ATAQUES:" + reset);
            System.out.println(yellow + "PLACAJE [0] Y MALICIOSOA [1]" + reset);
            System.out.println(yellow + "¿QUE ATAQUE USARÁS?" + reset);
            accion_ai = rdm.nextInt(2);
            if (accion_ai == 0) {
                System.out.println(green + "TU AMIGO ATACA CON PLACAJE" + reset);
            } else if (accion_ai == 1) {
                System.out.println(green + "TU AMIGO ATACA CON MALICIOSA" + reset);
            }
        } else if (ai == 1) {
            System.out.println(yellow + "TEPIG TIENE LOS SIGUIENTES ATAQUES:" + reset);
            System.out.println(yellow + "PLACAJE [0] Y LÁTIGO [1]");
            System.out.println(yellow + "¿QUE ATAQUE USARÁS?" + reset);
            accion_ai = rdm.nextInt(2);
            if (accion_ai == 0) {
                System.out.println(green + "TU AMIGO ATACA CON PLACAJE" + reset);
            } else if (accion_ai == 1) {
                System.out.println(green + "TU AMIGO ATACA CON LÁTIGO" + reset);
            }
        } else if (ai == 2) {
            System.out.println(yellow + "OSHAWOTT TIENE LOS SIGUIENTES ATAQUES:" + reset);
            System.out.println(yellow + "PLACAJE [0] Y LÁTIGO [1]" + reset);
            System.out.println(yellow + "¿QUE ATAQUE USARÁS?" + reset);
            accion_ai = rdm.nextInt(2);
            if (accion_ai == 0) {
                System.out.println(green + "TU AMIGO ATACA CON PLACAJE" + reset);
            } else if (accion_ai == 1) {
                System.out.println(green + "TU AMIGO ATACA CON LÁTIGO" + reset);
            }
        }
        return accion_ai;
    }

    public static void FINAL(int vida_pokemon, int vida_pok_ai, int def_pokemon, int def_pok_ai) {

        //************************************************************************************
        //** Nombre de la función: FINAL
        //** Explicación del que hace la función: Gestiona la vida de los pokemons y determina quien es el ganador
        //** Parámetros de entrada: vida_pokemon, vida_pok_ai, def_pokemon, def_pok_ai
        //** Parámetros de salida:
        //************************************************************************************

        String yellow = "\033[33m";


        if (vida_pokemon <= 0 && vida_pok_ai <= 0 || vida_pokemon <= 0 && def_pok_ai <= 0 || def_pok_ai <= 0 && def_pokemon <= 0) {
            System.out.println(yellow + "EMPATE");
        } else if (vida_pok_ai <= 0 || def_pok_ai <= 0) {
            System.out.println("GANAS");
        } else if (vida_pokemon <= 0 || def_pokemon <= 0) {
            System.out.println("GANA IA");
        }
    }


    //COMBATE POKEMON JUGADOR VS JUGADOR

    public static void combatePokemonJugadorVsJugador(int pokemon, int def_pokemon, int vida_pokemon, int respuesta, int amigo, int reset, int vida_pok_amigo, int def_pok_amigo, int accion_amigo, int yellow) {

        //************************************************************************************
        //** Nombre de la función: combatePokemonJugadorVsJugador
        //** Explicación del que hace la función: Gestiona el combate de jugador contra jugador
        //** Parámetros de entrada: pokemon, def_pokemon, vida_pokemon, respuesta, amigo, vida_pok_amigo, def_pok_amigo, accion_amigo, yellow
        //** Parámetros de salida:
        //************************************************************************************

        amigo = POKEMON_ELECCION((amigo));
        pokemon = POKEMON3(pokemon);
        PROFESORA_JUGADORCONTRAJUGADOR(pokemon, respuesta);

        while (vida_pokemon > 0 && vida_pok_amigo > 0 && def_pokemon > 0 && def_pok_amigo > 0) {

            respuesta = BATALLA_1_JUGADORCONTRAJUGADOR(pokemon, def_pok_amigo);
            accion_amigo = BATALLA_2_JUGADORCONTRAJUGADOR(amigo, accion_amigo);

            if (accion_amigo == 0) {
                vida_pokemon -= 2;
            } else if (accion_amigo == 1) {
                def_pokemon -= 3;
                vida_pok_amigo -= 1;
            }

            if (respuesta == 0) {
                vida_pok_amigo -= 2;
            } else if (respuesta == 1) {
                def_pok_amigo -= 3;
                vida_pokemon -= 1;
            }

            System.out.println(yellow + "te quedan " + vida_pokemon + " de vida");
            System.out.println("le quedan " + vida_pok_amigo + " de vida");
            System.out.println("te quedan " + def_pokemon + " de defensa");
            System.out.println("le quedan " + def_pok_amigo + " de defensa" + reset);
        }

        FINAL_JUGADORCONTRAJUGADOR(vida_pokemon, def_pokemon, vida_pok_amigo, def_pok_amigo);
    }

    public static int POKEMON_ELECCION(int amigo) {

        //************************************************************************************
        //** Nombre de la función: OKEMON_ELECCION
        //** Explicación del que hace la función: Elecion de pokemon del segundo jugador
        //** Parámetros de entrada: amigo
        //** Parámetros de salida: resultado
        //************************************************************************************

        Scanner scr = new Scanner(System.in);

        int resultado = 0;
        String green = "\033[32m";
        String reset = "\u001B[0m";
        String yellow = "\033[33m";


        System.out.println(yellow + "TU AMIGO ESCOJERÁ UNO DE LOS TRES PRIMEROS POKEMONS QUE SE DAN PARA ESCOGER");
        System.out.println("SI QUIERES A SNIVY ESCRIBA 0, el es un pokemon de tipo planta, es muy eficaz contra los de tipo agua");
        System.out.println("SI QUIERES A TEPIG ESCRIBA 1, el es un pokemon de tipo fuego, es muy eficaz contra los de tipo planta");
        System.out.println("SI QUIERES A OSHAWOTT ESCRIBA 2, el es un pokemon de tipo agua, es muy eficaz contra los de tipo fuego" + reset);
        System.out.println(" ");
        amigo = scr.nextInt();
        resultado = amigo;
        if (amigo == 0) {
            System.out.println(green + " TU AMIGO ESCOGIÓ A SNIVY" + reset);
        } else if (amigo == 1) {
            System.out.println(green + "TU AMIGO ESCOGIÓ A TEPIG" + reset);
        } else if (amigo == 2) {
            System.out.println(green + "TU AMIGO ESCOGIÓ A OSHAWOTT" + reset);
        }
        return resultado;
    }

    public static int POKEMON3(int pokemon) {

        //************************************************************************************
        //** Nombre de la función: POKEMON3
        //** Explicación del que hace la función: Elecion del pokemon del jugador uno
        //** Parámetros de entrada: pokemon
        //** Parámetros de salida: resultado
        //************************************************************************************

        Scanner scr = new Scanner(System.in);

        int resultado = 0;
        String green = "\033[32m";
        String reset = "\u001B[0m";
        String yellow = "\033[33m";


        System.out.println(yellow + "Es tu momento para que tengas tu primer pokemon, escoge bien porque el será tu amigo de aventuras");
        System.out.println("SI QUIERES A SNIVY ESCRIBA 0, el es un pokemon de tipo planta, es muy eficaz contra los de tipo agua");
        System.out.println("SI QUIERES A TEPIG ESCRIBA 1, el es un pokemon de tipo fuego, es muy eficaz contra los de tipo planta");
        System.out.println("SI QUIERES A OSHAWOTT ESCRIBA 2, el es un pokemon de tipo agua, es muy eficaz contra los de tipo fuego" + reset);
        pokemon = scr.nextInt();
        resultado = pokemon;
        if (pokemon == 0) {
            System.out.println(green + "FELICIDADES SNIVY SERÁ TU COMPAÑERO DE AVENTURAS" + reset);
        } else if (pokemon == 1) {
            System.out.println(green + "FELICIDADES TEPIG SERÁ TU COMPAÑERO DE AVENTURAS" + reset);
        } else if (pokemon == 2) {
            System.out.println(green + "FELICIDADES OSHAWOTT SERÁ TU COMPAÑERO DE AVENTURAS" + reset);
        }

        return resultado;
    }

    public static void PROFESORA_JUGADORCONTRAJUGADOR(int pokemon, int respuesta) {

        //************************************************************************************
        //** Nombre de la función: PROFESORA_JUGADORCONTRAJUGADOR
        //** Explicación del que hace la función: Inicio del combate jugador contra jugador
        //** Parámetros de entrada: pokemon, respuesta
        //** Parámetros de salida:
        //************************************************************************************


        Scanner scr = new Scanner(System.in);

        String green = "\033[32m";
        String reset = "\u001B[0m";
        String yellow = "\033[33m";
        String purple = "\033[35m";


        System.out.println("***********************************");
        System.out.println(yellow + "ELLA ES LA PROFESORA ENCINA" + reset);
        System.out.println(purple + "-Hola bienvenido a este mundo, al parecer ya cada uno tiene su compañero. Aqui teneis buestras pokeballs y una pokedex" + reset);
        System.out.println();
        System.out.println(yellow + "OBTUVISTE 5 POKEBALLS Y UNA POKEDEX");
        System.out.println("ESCOGE UNA DE ESTAS TRES RESPUESTAS:");
        System.out.println("1- ¡Que bién obtuve mi primer pokemon!");
        System.out.println("2- Con " + pokemon + " seré el mejor entrenador de pokemon");
        System.out.println("3- Con mi aventura conoceré a más pokemons y le ayudaré a obtener información de todos los pokemons profesora Encinas" + reset);
        respuesta = scr.nextInt();
        if (respuesta == 1) {
            System.out.println(green + "¡Que bién obtuve mi primer pokemon!" + reset);
        } else if (respuesta == 2) {
            System.out.println(green + "Con " + pokemon + " seré el mejor entrenador de pokemon" + reset);
        } else if (respuesta == 3) {
            System.out.println(green + "Con mi aventura conoceré a más pokemons y le ayudaré a obtener información de todos los pokemons profesora Encinas" + reset);
        }
        System.out.println(yellow + "TU AMIGO QUIERE RETARTE, EMPEZARÁS TU" + reset);

    }

    public static int BATALLA_1_JUGADORCONTRAJUGADOR(int pokemon, int respuesta) {

        //************************************************************************************
        //** Nombre de la función: BATALLA_1_JUGADORCONTRAJUGADOR
        //** Explicación del que hace la función: Gestiona el primer turno del primer jugador
        //** Parámetros de entrada: pokemon, respuesta
        //** Parámetros de salida: respuesta
        //************************************************************************************

        Scanner scr = new Scanner(System.in);

        String green = "\033[32m";
        String reset = "\u001B[0m";
        String yellow = "\033[33m";

        if (pokemon == 0) {
            System.out.println(yellow + "SNIVY TIENE LOS SIGUIENTES ATAQUES:" + reset);
            System.out.println(yellow + "PLACAJE [0] Y MALICIOSOA [1]" + reset);
            System.out.println(yellow + "¿QUE ATAQUE USARÁS?" + reset);
            respuesta = scr.nextInt(2);
            if (respuesta == 0) {
                System.out.println(green + "ESCOJISTE PLACAJE" + reset);
            } else if (respuesta == 1) {
                System.out.println(green + "ESCOJISTE MALICIOSA" + reset);
            }
        } else if (pokemon == 1) {
            System.out.println(yellow + "TEPIG TIENE LOS SIGUIENTES ATAQUES:" + reset);
            System.out.println(yellow + "PLACAJE [0] Y LÁTIGO [1]");
            System.out.println(yellow + "¿QUE ATAQUE USARÁS?" + reset);
            respuesta = scr.nextInt(2);
            if (respuesta == 0) {
                System.out.println(green + "ESCOJISTE PLACAJE" + reset);
            } else if (respuesta == 1) {
                System.out.println(green + "ESCOJISTE LÁTIGO" + reset);
            }
        } else if (pokemon == 2) {
            System.out.println(yellow + "OSHAWOTT TIENE LOS SIGUIENTES ATAQUES:" + reset);
            System.out.println(yellow + "PLACAJE [0] Y LÁTIGO [1]" + reset);
            System.out.println(yellow + "¿QUE ATAQUE USARÁS?" + reset);
            respuesta = scr.nextInt(2);
            if (respuesta == 0) {
                System.out.println(green + "ESCOJISTE PLACAJE" + reset);
            } else if (respuesta == 1) {
                System.out.println(green + "ESCOJISTE LÁTIGO" + reset);
            }
        }
        return respuesta;
    }

    public static int BATALLA_2_JUGADORCONTRAJUGADOR(int amigo, int accion_amigo) {

        //************************************************************************************
        //** Nombre de la función: BATALLA_2_JUGADORCONTRAJUGADOR
        //** Explicación del que hace la función: El turno del segundo jugador
        //** Parámetros de entrada: amigo, accion_amigo
        //** Parámetros de salida: accion_amigo
        //************************************************************************************

        Scanner scr = new Scanner(System.in);

        String green = "\033[32m";
        String reset = "\u001B[0m";
        String yellow = "\033[33m";

        System.out.println(yellow + "LE TOCA A TU AMIGO" + reset);
        System.out.println();
        if (amigo == 0) {
            System.out.println(yellow + "SNIVY TIENE LOS SIGUIENTES ATAQUES:" + reset);
            System.out.println(yellow + "PLACAJE [0] Y MALICIOSOA [1]" + reset);
            System.out.println(yellow + "¿QUE ATAQUE USARÁS?" + reset);
            accion_amigo = scr.nextInt(2);
            if (accion_amigo == 0) {
                System.out.println(green + "TU AMIGO ATACA CON PLACAJE" + reset);
            } else if (accion_amigo == 1) {
                System.out.println(green + "TU AMIGO ATACA CON MALICIOSA" + reset);
            }
        } else if (amigo == 1) {
            System.out.println(yellow + "TEPIG TIENE LOS SIGUIENTES ATAQUES:" + reset);
            System.out.println(yellow + "PLACAJE [0] Y LÁTIGO [1]");
            System.out.println(yellow + "¿QUE ATAQUE USARÁS?" + reset);
            accion_amigo = scr.nextInt(2);
            if (accion_amigo == 0) {
                System.out.println(green + "TU AMIGO ATACA CON PLACAJE" + reset);
            } else if (accion_amigo == 1) {
                System.out.println(green + "TU AMIGO ATACA CON LÁTIGO" + reset);
            }
        } else if (amigo == 2) {
            System.out.println(yellow + "OSHAWOTT TIENE LOS SIGUIENTES ATAQUES:" + reset);
            System.out.println(yellow + "PLACAJE [0] Y LÁTIGO [1]" + reset);
            System.out.println(yellow + "¿QUE ATAQUE USARÁS?" + reset);
            accion_amigo = scr.nextInt(2);
            if (accion_amigo == 0) {
                System.out.println(green + "TU AMIGO ATACA CON PLACAJE" + reset);
            } else if (accion_amigo == 1) {
                System.out.println(green + "TU AMIGO ATACA CON LÁTIGO" + reset);
            }
        }
        return accion_amigo;
    }

    public static void FINAL_JUGADORCONTRAJUGADOR(int vida_pokemon, int vida_pok_amigo, int def_pokemon, int def_pok_amigo) {

        //************************************************************************************
        //** Nombre de la función: FINAL_JUGADORCONTRAJUGADOR
        //** Explicación del que hace la función: Define quien ha ganado la partida
        //** Parámetros de entrada: vida_pokemon, vida_pok_amigo, def_pokemon, def_pok_amigo
        //** Parámetros de salida:
        //************************************************************************************

        String yellow = "\033[33m";

        if (vida_pokemon <= 0 && vida_pok_amigo <= 0 || vida_pokemon <= 0 && def_pok_amigo <= 0 || def_pok_amigo <= 0 && def_pokemon <= 0) {
            System.out.println(yellow + "EMPATE");
        } else if (vida_pok_amigo <= 0 || def_pok_amigo <= 0) {
            System.out.println("GANAS");
        } else if (vida_pokemon <= 0 || def_pokemon <= 0) {
            System.out.println("GANA IA");
        }
    }
>>>>>>> 178b56d6c02bf5ea4e473864071db91da0318772
}