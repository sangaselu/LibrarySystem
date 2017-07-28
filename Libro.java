package entidades;

public class Libro {
    private String Codigo;
    private String Titulo;
    private String Categoria;
    private String Autor;
    private int Cantidad;
    private Ejemplar ejemplar;
    public Libro(String Codigo, String Titulo, String Categoria, String Autor, int Cantidad) {
        this.Codigo = Codigo;
        this.Titulo = Titulo;
        this.Categoria = Categoria;
        this.Autor = Autor;
        this.Cantidad = Cantidad;
        
    }
    
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
}
