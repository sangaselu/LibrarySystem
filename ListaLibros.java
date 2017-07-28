package accesoDatos;

import entidades.*;
import java.util.ArrayList;

public class ListaLibros {

    ArrayList<Libro> lista;

    public ListaLibros() {
        lista = new ArrayList<>();
    }

    public void agregarLibro(Libro Lb) {
        lista.add(Lb);

    }

    public int size() {
        return lista.size();
    }

    public Libro get(int i) {
        return lista.get(i);
    }

    public Libro set(int index, Libro element) {
        return lista.set(index, element);
    }

    public ArrayList<Libro> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Libro> lista) {
        this.lista = lista;
    }

    public Libro getLibroxtitulo(String titulo) {
        Libro lib = null;
        for (int i = 0; i < size(); i++) {
            if (titulo.equals(lista.get(i).getTitulo())) {
                lib = lista.get(i);
            }
        }
        return lib;
    }

    public int getIndexLibroxtitulo(String titulo) {
        int pos = -1;
        for (int i = 0; i < size(); i++) {
            if (titulo.equals(lista.get(i).getTitulo())) {
                pos = i;
            }
        }
        return pos;
    }

    public void removeLibroxtitulo(String titulo) {
        for (int i = 0; i < size(); i++) {
            if (titulo.equals(lista.get(i).getTitulo())) {
                lista.remove(i);
            }
        }
    }
}
