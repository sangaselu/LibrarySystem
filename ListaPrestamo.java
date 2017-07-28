package accesoDatos;

import entidades.*;
import java.util.ArrayList;

public class ListaPrestamo {

    private ArrayList<Prestamo> lista;

    public ListaPrestamo() {
        lista = new ArrayList<>();
    }

    public void agregarPrestamo(Prestamo Pr) {
        lista.add(Pr);
    }

    public int size() {
        return lista.size();
    }

    public Prestamo get(int i) {
        return lista.get(i);
    }

    public ArrayList<Prestamo> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Prestamo> lista) {
        this.lista = lista;
    }

    public Prestamo getPrestamoxEjemplar(Ejemplar e) {
        Prestamo p = null;
        for (int i = 0; i < size(); i++) {
            if (e.equals(get(i).getEjemplar())) {
                p = get(i);
            }
        }
        return p;

    }
}
