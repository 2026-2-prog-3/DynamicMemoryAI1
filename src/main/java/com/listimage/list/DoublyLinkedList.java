package com.listimage.list;

import com.listimage.model.Image;
import com.listimage.node.Node;
import java.util.ArrayList;
import java.util.List;

/**
 * Lista doblemente enlazada de imágenes. Mantiene los punteros {@code head} y
 * {@code tail} y el tamaño de la lista para garantizar operaciones de inserción
 * al final y recorridos en orden de llegada.
 */
public class DoublyLinkedList implements ImageList {

    private Node head;

    private Node tail;

    private int size;

    /**
     * Agrega una imagen como nuevo último elemento de la lista, actualizando el
     * puntero {@code tail} y enlazando el antiguo último nodo con el nuevo.
     *
     * @param image la imagen a agregar; no debe ser nula
     * @throws IllegalArgumentException si image es nula
     */
    @Override
    public void addLast(Image image) {
        if (image == null) {
            throw new IllegalArgumentException("La imagen a insertar no puede ser nula");
        }
        Node newNode = new Node(image);
        if (size == 0) {
            head = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
        }
        tail = newNode;
        size++;
    }

    /**
     * Retorna el número de imágenes en la lista.
     *
     * @return tamaño actual de la lista
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Retorna todas las imágenes en orden desde {@code head} hasta {@code tail}.
     *
     * @return lista de imágenes en orden de inserción
     */
    @Override
    public List<Image> getAll() {
        List<Image> images = new ArrayList<>();
        Node current = head;
        while (current != null) {
            images.add(current.getImage());
            current = current.getNext();
        }
        return images;
    }
}