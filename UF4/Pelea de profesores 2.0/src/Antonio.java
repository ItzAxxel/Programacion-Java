/*
 * Hecho por: Axel Arroyo Giménez
 */


import java.util.Random;

public class Antonio extends Profesor{
    Random IA = new Random();
    private String hijo = "Iker";

    public Antonio(int vida, String nombre, int iq) {
        super(vida, nombre, iq);
    }


    public int atacar(){
        int ataque = 0;

        int operacionIa = IA.nextInt(3);

        if (operacionIa == 0){
            ataque = ataqueXML();
        } else if (operacionIa == 1){
            ataque = 30;
            System.out.println("¡Antonio ha usado a " + hijo + " y ha hecho que le pagues por la manutención!\n");
        } else {
            ataque = 10;
            System.out.println("¡Antonio ha lanzado una mirada juzgadora!\n");
        }

        return ataque;
    }

    public int ataqueXML(){
        int ataque = 40;
        System.out.println("¡Antonio ha hecho una página con XML y te agrede porque es demasiado bonita para tus ojos!\n");
        return ataque;
    }
}
