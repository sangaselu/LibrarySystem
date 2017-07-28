package accesoDatos;

import entidades.*;
import java.util.ArrayList;

public class ListaUsuario {

    ArrayList<Usuario> lista;

    public ListaUsuario() {
        lista = new ArrayList<>();
    }

    public void agregarUsuario(Usuario Us) {
        lista.add(Us);
    }

    public int size() {
        return lista.size();
    }
    
    public Usuario get(int i){
        return lista.get(i);
    } 

    public ArrayList<Usuario> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Usuario> lista) {
        this.lista = lista;
    }
    
    
    public Usuario getUsuarioxID(String ID){
        Usuario us = null;
        for(int i = 0; i < size(); i++){
            if(ID.equals(lista.get(i).getId())){
                us = lista.get(i);
            }
        }
        return us;
    }
    
    public Usuario getUsuarioxNombre(String nombre){
        Usuario us = null;
        for(int i = 0; i < size(); i++){
            if(nombre.equals(lista.get(i).getNombres())){
                us = lista.get(i);
            }
        }
        return us;
    }

}
