<<<<<<< HEAD
import java.util.Random;

public class Profesor {

    public int atacar(int damage) {

        damage = 20;
        return damage;

    }

    public int criticoF(int damage){

        damage = 20;

        Random rand = new Random();
        int random = rand.nextInt(5);

        if (random == 2){

            damage = damage * 2;
            System.out.println("¡Has hecho un ataque crítico!");

        } else {

            System.out.println("¡Has fallado el crítico y pierdes el turno!");
            damage = 0;

        }

        return damage;
    }

    public int criticoA(int damage){

        damage = 20;
        Random rand = new Random();
        int random = rand.nextInt(5);

        if (random == 2){

            damage = damage * 2;
            System.out.println("¡El Antonio ha hecho un crítico!");

        } else {

            System.out.println("¡Antonio ha fallado el crítico y pierde el turno!");
            damage = 0;
        }

        return damage;
    }


    public int perderVidaF(int damage, int vidaFonsi){

        vidaFonsi = vidaFonsi - damage;

        return vidaFonsi;

    }

    public int perderVidaA(int damage, int vidaAntonio){

        vidaAntonio = vidaAntonio - damage;

        return vidaAntonio;

    }

}

=======
import java.util.Random;

public class Profesor {

    public int atacar(int damage) {

        damage = 20;
        return damage;

    }

    public int criticoF(int damage){

        damage = 20;

        Random rand = new Random();
        int random = rand.nextInt(5);

        if (random == 2){

            damage = damage * 2;
            System.out.println("¡Has hecho un ataque crítico!");

        } else {

            System.out.println("¡Has fallado el crítico y pierdes el turno!");
            damage = 0;

        }

        return damage;
    }

    public int criticoA(int damage){

        damage = 20;
        Random rand = new Random();
        int random = rand.nextInt(5);

        if (random == 2){

            damage = damage * 2;
            System.out.println("¡El Antonio ha hecho un crítico!");

        } else {

            System.out.println("¡Antonio ha fallado el crítico y pierde el turno!");
            damage = 0;
        }

        return damage;
    }


    public int perderVidaF(int damage, int vidaFonsi){

        vidaFonsi = vidaFonsi - damage;

        return vidaFonsi;

    }

    public int perderVidaA(int damage, int vidaAntonio){

        vidaAntonio = vidaAntonio - damage;

        return vidaAntonio;

    }

}

>>>>>>> 9a0ba8376c17307f222a97025883c43894e82700
