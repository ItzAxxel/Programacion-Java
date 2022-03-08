/**
 * @author Axel Arroyo Giménez
 */

public class Libro {

    private String nombreLibro;
    private String autor;
    private int numeroEjemplares;
    private int prestados;


    public Libro(String nombreLibro, String autor, int numeroEjemplares, int prestados) {

        setTitulo(nombreLibro);
        setAutor(autor);
        setEjemplares(numeroEjemplares);
        setPrestados(prestados);

    }

    public Libro() {

        nombreLibro = "Libro ejemplo";
        autor = "Axel";
        numeroEjemplares = 0;
        prestados = 1;

    }

    public String getTitulo() {

        return this.nombreLibro;

    }

    public String getAutor() {

        return this.autor;

    }

    public int getEjemplares() {

        return  this.numeroEjemplares;

    }

    public int getPrestados() {

        return this.prestados;

    }


    public void setTitulo(String titulo) {

        this.nombreLibro = titulo;

    }

    public void setAutor(String autor) {

        this.autor = autor;

    }

    public void setEjemplares(int ejemplares) {

        this.numeroEjemplares = ejemplares;

    }

    public void setPrestados(int prestados){
        this.prestados = prestados;
    }


    public boolean prestamo() {

        setPrestados(getPrestados() + 1);


        return true;

    }

    public boolean devolucion() {

        setEjemplares(getEjemplares() - 1);

        return true;

    }
}
