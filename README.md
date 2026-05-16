# Proyecto: Fichas Tecnicas de Estructuras Arboreas y Arbol Binario de Busqueda

Universidad Da Vinci de Guatemala  
Curso: Estructuras de Datos
Emilio Lima
Carné: 202500147
## Descripcion

Este proyecto contiene la investigacion de cinco estructuras arboreas y una implementacion practica en Java de un Arbol Binario de Busqueda (BST) que almacena numeros enteros.

## Estructuras investigadas

- Arbol Binario de Busqueda (BST)
- Arbol Balanceado AVL
- Arbol B / B+
- Trie o Arbol de Prefijos
- Heap o Monticulo Min/Max

## Metodos implementados en Java

La clase `BinarySearchTree` incluye:

- `insert(int value)`: inserta valores respetando la regla del BST.
- `search(int value)`: retorna `true` o `false` si el valor existe.
- `delete(int value)`: elimina nodos considerando los tres casos criticos:
  - nodo sin hijos,
  - nodo con un hijo,
  - nodo con dos hijos.
- `printInOrder()`: imprime los valores en orden ascendente.
- `printPreOrder()`: imprime primero la raiz y luego subarboles.
- `printPostOrder()`: imprime primero subarboles y al final la raiz.

## Como ejecutar

Desde la carpeta raiz del proyecto:

```bash
javac -d out src/main/java/com/estructuras/arboles/*.java
java -cp out com.estructuras.arboles.Main
```

## Salida esperada resumida

El programa inserta los valores `50, 30, 70, 20, 40, 60, 80`, muestra los recorridos, realiza busquedas y elimina tres nodos para demostrar los casos principales del metodo `delete`.

## Enlace del video

https://www.youtube.com/watch?v=LULYZEFbexk

## Explicacion breve de complejidad

La busqueda en un BST depende de la altura del arbol. En promedio, cuando el arbol esta relativamente balanceado, la complejidad es `O(log n)`, porque en cada comparacion se descarta una parte del arbol. En el peor caso, si el arbol queda muy inclinado como una lista, la busqueda puede llegar a `O(n)`.
