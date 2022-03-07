/**
 * @author Axel Arroyo Giménez
 */
public class Cuenta {

    private String nombreCliente;
    private String numeroCuenta;
    private double tipoInteres;
    private int saldo;


    public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, int saldo) {

        setNombre(nombreCliente);
        setNumeroCuenta(numeroCuenta);
        setTipoInteres(tipoInteres);
        setSaldo(saldo);

    }

    public Cuenta(Cuenta cuenta1) {

        this.nombreCliente = cuenta1.nombreCliente;
        this.numeroCuenta = cuenta1.numeroCuenta;
        this.tipoInteres = cuenta1.tipoInteres;
        this.saldo = cuenta1.saldo;

    }

    public Cuenta() {

        nombreCliente = "Francisco";
        numeroCuenta = "56431287465198549874";
        tipoInteres = 1.80;
        saldo = 800;

    }

    public String getNombre() {

        return this.nombreCliente;
    }

    public String getNumeroCuenta() {

        return this.numeroCuenta;

    }

    public double getTipoInteres() {

        return this.tipoInteres;

    }

    public int getSaldo() {

        return this.saldo;

    }

    public void setNombre(String nombre) {

        this.nombreCliente = nombre;

    }

    public void setNumeroCuenta(String numero) {

        this.numeroCuenta = numero;

    }

    public void setTipoInteres(double tipo) {

        this.tipoInteres = tipo;

    }

    public void setSaldo(double importe) {

        this.saldo = (int) importe;

    }



    public void ingreso(int i) {

        if (i < 0){
            System.out.println("No puedes poner valores menores a 1.");
        } else {
            this.saldo += i;
        }


    }

    public void transferencia(Cuenta cuenta2, int i) {

        if(i > 0){
            System.out.println("No puedes poner valores menores a 1.");
        } else {
           setSaldo(cuenta2.getSaldo() + i);
        }

    }

    public boolean reintegro(double tipoInteres) {
        boolean reintegroCorrecto = true;
        if (tipoInteres < 0) {
            reintegroCorrecto = false;
        } else if (saldo >= tipoInteres) {
            saldo -= tipoInteres;
        } else {
            reintegroCorrecto = false;
        }
        return reintegroCorrecto;
    }


}
