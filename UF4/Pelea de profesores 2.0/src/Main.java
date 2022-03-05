/*
 * Hecho por: Axel Arroyo Giménez
 */


public class Main {
    public static void main(String[] args) {
        int contadorRonda = 1;
        int ataque = 0;
        Antonio Antonio = new Antonio(200,"Antonio",120);
        Fonsi Fonsi = new Fonsi(200,"Fonsi",110);
        while (Fonsi.comprobarVivo() && Antonio.comprobarVivo()){
            System.out.println("\nEstáis en la ronda: " + contadorRonda);
            contadorRonda++;
            if(Fonsi.comprobarVivo()){
                System.out.println("--- Es el turno de Fonsi ---");
                ataque = Fonsi.atacar();
                Antonio.perderVida(ataque);
            } else {
                System.out.println("Fonsi ha muerto");
            }
            if (Antonio.comprobarVivo()){
                System.out.println("\n--- Es el turno de Antonio --- ");
                ataque = Antonio.atacar();
                Fonsi.perderVida(ataque);
            } else {
                System.out.println("Antonio ha muerto");
            }
        }
        if (Fonsi.vida > 0){
            System.out.println("\n¡Fonsi ha ganado la batalla!");
        } else {
            System.out.println("¡Antonio ha ganado la batalla!");
        }
    }
}
