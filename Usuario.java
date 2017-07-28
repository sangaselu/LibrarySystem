package entidades;

public class Usuario {

    private String Id;
    private String Nombres;
    private String Escuela;

    public Usuario(String Id, String Nombres, String Escuela) {
        this.Id = Id;
        this.Nombres = Nombres;
        this.Escuela = Escuela;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getEscuela() {
        return Escuela;
    }

    public void setEscuela(String Escuela) {
        this.Escuela = Escuela;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Id=" + Id + ", Nombres=" + Nombres + ", Escuela=" + Escuela + '}';
    }

}
