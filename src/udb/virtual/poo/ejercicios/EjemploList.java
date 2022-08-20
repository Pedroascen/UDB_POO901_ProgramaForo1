package udb.virtual.poo.ejercicios;

import java.util.*;

public class EjemploList {

    public static void main(String[] args) {
        //List 
        //¿Como se declara el list?
        //Se declaran utilizando la palabra clave list, por ejemplo list.add
        System.out.println("¿Como se declaran?");
        List<String> lista = new ArrayList();
        lista.add("Obama");
        lista.add("Putin");
        lista.add("Biden\n");

        for(String elemento : lista) {
            System.out.println("" + elemento);
        }
        //¿Como se asignan valores ? Utilizando  list = new ArrayList<>(); Ejemplo
        System.out.println("¿Como se asignan valores?");
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println(list+"\n");

        //¿Como se elimina valores utilizando el mètodo remove Ejemplo MyStack.remove("Mango")
        System.out.println("¿Como se elimina valores utilizando el mètodo remove?");
        Stack myStack = new Stack();
        myStack.add("Mango");
        myStack.remove("Sandia");
        myStack.add("Pera");
        System.out.println("Fruta favorita: " + myStack);

    }
}
