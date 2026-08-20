package com.listimage.node;

import com.listimage.model.Image;
import lombok.Getter;
import lombok.Setter;

/**
 * Elemento individual de la lista doblemente enlazada. Encapsula una referencia
 * a una {@link Image} y los punteros al nodo anterior y al nodo siguiente.
 */
@Getter
@Setter
public class Node {

    private final Image image;

    private Node next;

    private Node previous;

    /**
     * Construye un nodo con la imagen indicada, inicializando los punteros
     * {@code next} y {@code previous} como {@code null}.
     *
     * @param image imagen almacenada en el nodo; no debe ser nula
     * @throws IllegalArgumentException si image es nula
     */
    public Node(Image image) {
        if (image == null) {
            throw new IllegalArgumentException("La imagen del nodo no puede ser nula");
        }
        this.image = image;
        this.next = null;
        this.previous = null;
    }
}