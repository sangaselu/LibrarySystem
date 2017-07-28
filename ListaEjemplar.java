package accesoDatos;

import entidades.*;
import java.util.ArrayList;

public class ListaEjemplar {

    ArrayList<Ejemplar> lista;

    public ListaEjemplar() {
        lista = new ArrayList<>();
    }

    public void agregarEjemplar(Ejemplar Ej) {
        lista.add(Ej);
    }

    public int size() {
        return lista.size();
    }

    public Ejemplar get(int i) {
        return lista.get(i);
    }

    public ArrayList<Ejemplar> getLista() {
        return lista;
    }

    public Ejemplar getEjemplarxCodigo(String cod) {
        Ejemplar e = null;
        for (int i = 0; i < lista.size(); i++) {
            if (cod.equals(lista.get(i).getNumero())) {
                e = lista.get(i);
            }
        }
        return e;
    }

}
