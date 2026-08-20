package com.listimage.list;

import com.listimage.model.Image;
import java.util.List;

/**
 * Contrato para la estructura de lista de imágenes.
 */
public interface ImageList {

    /**
     * Agrega una imagen al final de la lista.
     *
     * @param image la imagen a agregar; no debe ser nula
     * @throws IllegalArgumentException si image es nula
     */
    void addLast(Image image);

    /**
     * Retorna el número de imágenes en la lista.
     *
     * @return tamaño actual de la lista
     */
    int size();

    /**
     * Retorna todas las imágenes en orden de inserción (head → tail).
     *
     * @return lista de imágenes en orden de inserción
     */
    List<Image> getAll();
}