package entidades;

public class Ejemplar {

    private String numero;
    private String estado;
    String nombreLibro;
    private Libro libro;

    public Ejemplar(String numero, String estado, String nombreLibro) {
        this.numero = numero;
        this.estado = estado;
        this.nombreLibro = nombreLibro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

}
