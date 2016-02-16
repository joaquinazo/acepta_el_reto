package numerosAfortunados;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;
/*
Creado por Daniel Blas Rey
* */
public class ejercicio {

    public static void main(String[] args) {
// Inicialización
        Scanner scan = new Scanner(System.in);
        int numero = 0;
        int pasada, pos;
        Stack<Integer> pila = new Stack<Integer>();
        LinkedList<Integer> list;

// Proceso
        numero = scan.nextInt();
// Tratamiento del número
        while (numero != 0) {
// Inicialiazamos la pasada y la lista
            pasada = 2;
            list = new LinkedList<Integer>();
// Pasamos el número a un LinkedList
            for (int i = 1; i < numero + 1; i++) {
                list.add(i);
            }

// Mientras haya números que quitar
            while (pasada < list.size()) {
// Inicializo la pos
                pos = 1;
// Borramos los números de las posiciones m
                Iterator<Integer> it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                    if (pos % (pasada) == 1) {
                        it.remove();
                    }
                    pos++;
                }
// System.out.println("Pasada " + pasada + " da :" + list);
                pasada++;
            }
            pila.addAll(list);
// Hago la salida de la solución
            System.out.print(numero + ": ");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(pila.pop() + " ");
            }
            System.out.println(" ");

            numero = scan.nextInt();
        }

// Presentación
    }

}
