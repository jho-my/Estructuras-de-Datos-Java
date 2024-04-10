package com.mycompany;

/**
 *
 * @author Jhonatan
 */
public class ListaSimple {

    protected Nodo inicio, fin;

    //constructor
    public ListaSimple() {
        this.inicio = null;
        this.fin = null;
    }

    //metodo para agregar al inicio 
    public String agregarInicio(String elemento) {
        inicio = new Nodo(elemento, inicio);
        if (fin == null) {
            fin = inicio;
        }
        return "Elemento Insertado al Inicio";
    }

    //metodo para agregar al final
    public String agregarFinal(String dato) {
        if (!estaVacia()) {
            //creamos el nodo 
            fin.siguiente = new Nodo(dato);
            fin = fin.siguiente;
        } else {
            inicio = fin = new Nodo(dato);
        }
        return "Elemento insertado al Final";
    }

    //metodo para saber si la lista esta vacia
    public boolean estaVacia() {
        return inicio == null;
    }

}
