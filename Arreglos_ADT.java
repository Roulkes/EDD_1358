//Tenorio Castilla Carlos Yael
/*Fecha de entrega: 26 de agosto de 2022
Propósito: 
Escribir el código fuente del ADT arreglo con las siguientes características:
- Los elementos del arreglo deben ser accesibles por un índice.
- Los elementos deben ser de cualquier tipo.
- Debe contener los siguientes métodos específicos:
    - Array( tamaño ) - Constructor de un tamaño específico del arreglo.
    - getItem( index ) - Obtener el elemento den la posición específica.
    - setItem( dato, index ) - Establecer un elemento en la posición establecida.
    - getLength() - Obtener el tamaño del arreglo.
    - clear( dato ) - Establece todos los valores del ADT al valor enviado en dato.
    - getIterator - Regresa el iterador del ADT.
 */
package com.urbenia.arreglos_adt;

import java.util.ArrayList;

/**
 * @author Tenorio Castilla Carlos Yael (Torrente)
 * @param <T>
 */
public class Arreglos_ADT<T> {

    public static void main(String[] args) {
        Arreglos_ADT febrero = new Arreglos_ADT(5);
        febrero.setItem("Esdadsad", 0);
        febrero.setItem(1, 1);
        febrero.setItem("_", 2);
        febrero.setItem(333333, 3);

        for (int p = 0; p < febrero.getLenght(); p++) {
            System.out.println("El elemento que se encuentra en el índice "
                    + p + " es: " + febrero.getItem(p));
        }
    }

    int rozmiar; //Rozmiar es tamaño en polaco.
    private final ArrayList<T> datos;

    public Arreglos_ADT(int rozmiar) { //Constructo
        this.rozmiar = rozmiar;
        this.datos = new ArrayList<>(rozmiar);
        //datos = new ArrayList();
        for (int j = 0; j < rozmiar; j++) {
            datos.add(null);
        }
    }

    public T getItem(int Indice) { //Getter
        if (Indice >= 0 && Indice < this.rozmiar) {
            return datos.get(Indice);
        }
        return null;
    }

    public void setItem(T Elemento, int Indice) { //Setter
        if (Indice >= 0 && Indice < this.rozmiar) {
            datos.set(Indice, Elemento);
        }
    }

    public int getLenght() { //Get Lenght
        return datos.size();
    }

    public void clear(T Elemento) { //Clear
        for (int i = 0; i < datos.size(); i++) {
            datos.set(i, Elemento);
        }
    }

}
