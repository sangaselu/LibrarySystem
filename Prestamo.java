package entidades;

public class Prestamo {

    private String FechaInicio;
    private String FechaFin;
    private Usuario usuario;
    private Ejemplar ejemplar;

    public Prestamo(String FechaInicio, String FechaFin, Usuario usuario, Ejemplar ejemplar) {
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.usuario = usuario;
        this.ejemplar = ejemplar;
    }

    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public String getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(String FechaFin) {
        this.FechaFin = FechaFin;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }
}
