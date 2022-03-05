/*
 * Hecho por: Axel Arroyo Giménez
 */

public class Profesor {

    protected int vida;
    protected String nombre;
    protected int iq;

    public Profesor(int vida, String nombre, int iq) {

        setVida(vida);
        setNombre(nombre);
        setIq(iq);

    }

    public int getVida(){
        return this.vida;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getIq(){
        return this.iq;
    }

    public void setIq(int iq){
        this.iq = iq;
    }


    public void perderVida(int ataque){

        this.vida = this.vida - ataque;
        System.out.println(this.nombre + " ha perdido: " + ataque);
        System.out.println(this.nombre + " le queda: " + this.vida);

    }

    public boolean comprobarVivo(){

        if (this.vida > 0){
            return true;
        } else {
            return false;
        }

    }

}
