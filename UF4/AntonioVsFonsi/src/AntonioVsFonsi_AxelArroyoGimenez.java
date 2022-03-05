/*
 *
 *  Hecho por: Axel Arroyo Giménez
 *
 */

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class AntonioVsFonsi_AxelArroyoGimenez {
    public static void main(String[] args) {

        //Historia

        historia("Han pasado varios años, desde que la promoción del 21 - 23, dejó el centro de ILERNA, para poder trabajar y prosperar como \"programadores\" \n(Es decir, trabajar en el Mc'donalds).");
        historia("Hay dos profesores que extrañan a ese grupo. Aunque eran bastante raros y unos otakus, se les terminaba por coger cariño rápidamente...");
        historia("Lo que nadie sabía es que uno de estos dos profesores, tenía un secreto oscuro...\n");

        historia("Fonsi: *En la sala de profesores viendo una fotografia de la clase* ");
        historia("Antonio: *Entra en la sala de profesores y ve a Fonsi, automaticamente pasa a estar nervioso* F-Fonsi... No te esperaba por aquí...");
        historia("Fonsi: Trabajo contigo");
        historia("Antonio: Ah, cierto...");
        historia("Fonsi: Ayer te vi cerca de donde estaba aparcada mi furgoneta...");
        historia("Antonio: *Traga saliva*");
        historia("Fonsi: Alguien me la ralló...");
        historia("Antonio: *Se pone más nervioso*");
        historia("Fonsi: Te lo diré solo una vez. ¿Has sido tú?");
        historia("Antonio: He de alargar más las prácticas de los alumnos nuevos, no puedo quedarme aquí de chachara. *Como buen drama king, fue a su pórtatil*\n");

        historia("Terminaron la jornada laboral. Estaba lloviendo, Antonio no llevaba paraguas, pero Fonsi sí.");
        historia("Ambos se quedaron mirando, Fonsi alargó el brazo para proteger a Antonio de la lluvia, pero él se alejó.");
        historia("Antonio: Ya no lo aguanto más Fonsi. ¡He sido yo! ¡Yo rallé tu furgoneta!");
        historia("Fonsi: ... ¿Después de tantos años de amistad y me haces esto? Yo... ¡TE MATO!");
        historia("*Fonsi se avalanzó contra Antonio empezando a luchar*\n");


        int damage = 20;
        int vidaFonsi = 200;
        int vidaAntonio = 200;
        boolean tryCatch = true;

        Profesor Fonsi = new Profesor();
        Profesor Antonio = new Profesor();

        Scanner teclado = new Scanner(System.in);
        int opcionUsuario = 0;
        Random randomIA = new Random();
        int IA;
        boolean turnoFonsi = true;

        while(vidaAntonio > 0 && vidaFonsi > 0) {

            //Turno Fonsi

            if(turnoFonsi){

                do{
                    try {

                        historia("Fonsi, es tu turno. Elije que haras: ");
                        System.out.println("[1] Ataque basico");
                        System.out.println("[2] Ataque critico");
                        opcionUsuario = teclado.nextInt();

                        while (opcionUsuario > 2 || opcionUsuario < 1){
                            System.out.println("Solo hay dos opciones. Recuerda que son las siguientes: ");
                            System.out.println("[1] Ataque basico");
                            System.out.println("[2] Ataque critico");
                            opcionUsuario = teclado.nextInt();
                        }

                        tryCatch = false;

                    } catch (InputMismatchException ex){

                        System.out.println("¡Has introducido un valor erróneo!");
                        teclado.next();
                        tryCatch = true;

                    }
                } while (tryCatch);

                if(opcionUsuario == 1){

                    damage = Fonsi.atacar(damage);

                } else {

                    damage = Fonsi.criticoF(damage);

                }

                vidaAntonio = Antonio.perderVidaA(damage, vidaAntonio);
                turnoFonsi = false;

            } else {

                //Turno Antonio

                IA = randomIA.nextInt(2) - 1;
                System.out.println();
                System.out.println("Es el turno de Antonio \n");

                if(IA == 1){

                    damage = Antonio.atacar(damage);
                    vidaFonsi = Fonsi.perderVidaF(damage, vidaFonsi);
                    historia("Antonio ha hecho un ataque normal y te ha quitado:" + damage + "\n");

                } else if (IA == 0) {

                    damage = Antonio.criticoA(damage);
                    vidaFonsi = Fonsi.perderVidaF(damage, vidaFonsi);
                    historia("Antonio ha hecho un ataque crítico y te ha quitado: " + damage + "\n");

                }

                historia("Fonsi te queda: " + vidaFonsi + "\n");
                historia("Antonio le queda: " + vidaAntonio + "\n");

                turnoFonsi = true;
            }

        }

        if (vidaFonsi <= 0){

            historia("Antonio: Al fin podré tener tu furgoneta.");
            historia("Antonio ha sido el vencedor\n");

        } else {

            historia("Fonsi: Mi furgoneta no se toca.");
            historia("Fonsi ha sido el vencedor\n");
        }

        finalSecreto();

        teclado.close();

    }

    public static void historia(String txt){

        try {

            Thread.sleep(900);

        } catch (InterruptedException e) {

        }

        System.out.println(txt);

    }

    public static void finalSecreto(){

        Random random = new Random();
        int finalSec;
        finalSec = random.nextInt(100);

        if(finalSec == 42){

            System.out.println("¡Has desbloqueado un final secreto!\n");
            System.out.println("Antonio: Fonsi, espera...");
            System.out.println("Fonsi: ¿Qué quieres?");
            System.out.println("Antonio: A ti...");
            System.out.println("Fonsi: *Confundido* ¿A qué te refieres?");
            System.out.println("Antonio: Que me da igual la furgoneta, te quiero a ti.");
            System.out.println("Fonsi: ...");
            System.out.println("Antonio: ¿Amigos? *Le extiende el brazo*");
            System.out.println("Fonsi: *Le abraza* Me debes una furgoneta.");
            System.out.println("Antonio: *Se rie* Te la pagaré.");
            System.out.println("Y así, ambos profesores se recoinciliaron.");

        }

    }
}
