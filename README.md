# DynamicMemoryAI1

Aplicación Java de escritorio para gestionar y visualizar imágenes cargadas en memoria usando una lista doblemente enlazada.

El proyecto genera imágenes de prueba en tiempo de ejecución, las almacena en una estructura propia y permite navegar entre ellas desde una interfaz gráfica sencilla basada en Swing.

## Características

- Generación automática de 5 imágenes de prueba en memoria.
- Almacenamiento de imágenes mediante una lista doblemente enlazada.
- Servicio de gestión para agregar, contar y recuperar imágenes.
- Interfaz gráfica con botones para navegar entre imágenes.
- Pruebas unitarias y property-based testing con JUnit 5 y jqwik.

## Tecnologías utilizadas

- Java 19
- Maven
- Swing
- Lombok
- JUnit 5
- jqwik
- Mockito

## Estructura del proyecto

- `src/main/java/com/listimage/Main.java`: punto de entrada de la aplicación.
- `src/main/java/com/listimage/model/Image.java`: entidad de dominio para una imagen en memoria.
- `src/main/java/com/listimage/node/Node.java`: nodo de la lista doblemente enlazada.
- `src/main/java/com/listimage/list/DoublyLinkedList.java`: implementación de la lista doblemente enlazada.
- `src/main/java/com/listimage/list/ImageList.java`: contrato de la estructura de datos.
- `src/main/java/com/listimage/service/ImageService.java`: contrato del servicio de imágenes.
- `src/main/java/com/listimage/service/ImageManager.java`: implementación del servicio.
- `src/main/java/com/listimage/ui/SwingView.java`: interfaz gráfica para navegar imágenes.
- `src/main/java/com/listimage/util/ImageFactory.java`: generador de imágenes de prueba.

## Funcionamiento

1. `Main` crea el generador de imágenes.
2. Se crean 5 imágenes de prueba en memoria.
3. Las imágenes se agregan a una `DoublyLinkedList` a través de `ImageManager`.
4. `SwingView` muestra la primera imagen y permite moverse hacia adelante o hacia atrás.

## Requisitos

- Java 19 o superior.
- Maven 3.8 o superior.

## Cómo ejecutar

### Ejecutar pruebas

```bash
mvn test
```

### Generar el JAR

```bash
mvn clean package
```

### Ejecutar la aplicación

```bash
java -jar target/DynamicMemoryAI1-1.0-SNAPSHOT.jar
```

## Pruebas incluidas

El repositorio incluye pruebas para:

- `Image`
- `Node`
- `DoublyLinkedList`
- `ImageFactory`
- `ImageManager`
- `SwingView`
- pruebas de integración

## Notas

- Las imágenes se generan programáticamente, por lo que no se requieren archivos externos.
- La navegación gráfica muestra el identificador de la imagen y su posición dentro del conjunto.
