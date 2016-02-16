package tortitas;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created por Javier
 */


public class ejercicio {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int volteos = 0, tortitas = 0;
        boolean Fin = false;
        String linea, linea2;
        String[] lineaLeida, linea2Leida;

        while (!Fin) {

            Stack<Integer> pila = new Stack<Integer>();
            ArrayBlockingQueue<Integer> colaAux = new ArrayBlockingQueue<Integer>(20);

			/*
             * Leo la primera linea que pide el numero de tortitas, la linea se
			 * almacena en un String linea y luego se separan los elementos
			 * entre si gracias al split
			 */

            linea = scan.nextLine();
            lineaLeida = linea.split(" ");


				/*
                 * Este for recorre el string de la linea leida y lo va almacenando
				 * en la pila, de forma que el primer elemento que entra es el
				 * ultimo que sale
				 */

            for (int i = 0; i < lineaLeida.length - 1; i++) {
                pila.push(Integer.parseInt(lineaLeida[i]));
            }

				/*
				 * Si el tamaÒo de la pila es = 1 y la primera posicion de esa pila
				 * es un -1, eso quiere decir que el programa acaba
				 */


            if (lineaLeida.length == 1 && lineaLeida[0].equals("-1")) {
                Fin = true;
                System.out.println(0);
            }

				/*
				 * Si el tamao de la pila es > 1 quiere decir que el programa debe
				 * leer la siguiente linea que es la que dice el numero de volteos
				 * que se le van a dar a las tortitass y el nÔøΩmero de tortitas que
				 * se va a coger en cada volteo. El proceso de lectura es igual que
				 * en el caso anterior, lo ÔøΩnico que cambia es que ahora en vez de
				 * almacenar los nÔøΩmeros en una pila se almacenan en un ArrayList
				 */

            else if (pila.size() >= 1) {
                ArrayList<Integer> lista = new ArrayList<Integer>();
                linea2 = scan.nextLine();
                linea2Leida = linea2.split(" ");

					/*
					 * Este bulce for tiene el mismo funcionamiento que el anterior,
					 * va almacenando los nÔøΩmeros en el ArrayList
					 */

                for (int i = 0; i < linea2Leida.length; i++) {
                    lista.add(Integer.parseInt(linea2Leida[i]));

                }

					/*
					 * Sabemos que el primer numero de esta linea va a ser igual al
					 * numero de volteos que se van a hacer a la pila de tortitas
					 */
                volteos = Integer.parseInt(linea2Leida[0]);



					/*
					 * Sacamos los valores que equivaldrian al numero de tortitas
					 * que se cogen por volteo, que se encuentran a partir de la
					 * primera posiciÔøΩn (de ahÔøΩ i = 1)
					 */
                for (int i = 1; i <= volteos; i++) {
                    tortitas = Integer.parseInt(linea2Leida[i]);

						/*
						 * Este for va sacando elementos de la pila y los va
						 * metiendo en una queue. saca tantos elementos de la pila
						 * como nÔøΩmero de tortitas se cogen por volteo
						 */
                    for (int k = 0; k < tortitas; k++) {
                        Integer y = pila.pop();

                        colaAux.add(y);
                    }

						/*
						 * ahora los elementos que se han metido en la queue se
						 * sacan por el lado contrario, de tal forma que el nÔøΩmero
						 * que entrÔøΩ primero saldrÔøΩ el ÔøΩltimo. Los elementos que se
						 * van sacando se vuelven a introducir en la pila.
						 */
                    while (colaAux.size() > 0) {

                        pila.push(colaAux.poll());
                    }


                }
                System.out.println(pila.peek());
            }
        }
    }

}


