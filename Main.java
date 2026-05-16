package com.estructuras.arboles;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        int[] values = {50, 30, 70, 20, 40, 60, 80};
        System.out.println("Insertando valores en el Arbol Binario de Busqueda:");
        for (int value : values) {
            tree.insert(value);
            System.out.println("Insertado: " + value);
        }

        System.out.println("\nRecorridos iniciales:");
        tree.printInOrder();
        tree.printPreOrder();
        tree.printPostOrder();

        System.out.println("\nBusquedas:");
        System.out.println("Existe 40? " + tree.search(40));
        System.out.println("Existe 100? " + tree.search(100));

        System.out.println("\nEliminando nodo hoja 20:");
        tree.delete(20);
        tree.printInOrder();

        System.out.println("\nEliminando nodo con un hijo 30:");
        tree.delete(30);
        tree.printInOrder();

        System.out.println("\nEliminando nodo con dos hijos 50:");
        tree.delete(50);
        tree.printInOrder();

        System.out.println("\nPrograma finalizado correctamente.");
    }
}
