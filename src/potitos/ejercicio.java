package potitos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Joaquin on 8/2/16.
 */
public class ejercicio {
    public static void main(String[] args) {
        int fin = 0;
        int cantidad = 0;

        Scanner sc = new Scanner(System.in);
        String si = "si:";
        String no = "no:";


        TreeSet<String> treeSetLike = new TreeSet<String>();
        TreeSet<String> treeSetUnlike = new TreeSet<String>();
        String line;


        int entrada = sc.nextInt();
        sc.nextLine();

        while (entrada > 0) {
            for (int i = 0; i < entrada; i++) {
                String[] arrayS = sc.nextLine().toLowerCase().split(" ");

                // Caso SI
                if (arrayS[0].equals(si)) {


                    for (int j = 1; j < arrayS.length - 1; j++) {
                        //Meter en ListaSI
                        treeSetLike.add(arrayS[j]);
                        //Sacar en ListaNo
                        treeSetUnlike.remove(arrayS[j]);

                    }



                }
                //Caso NO
                if (arrayS[0].equals(no)) {

                    for (int j = 1; j < arrayS.length - 1; j++) {
                        //Si no está en ListaSI meter en ListaNO
                        if (!treeSetLike.contains(arrayS[j])) {
                            treeSetUnlike.add(arrayS[j]);
                        }
                    }
                }


            }

            for (String str:treeSetUnlike) {
                System.out.print(str + " ");

            }


            entrada = sc.nextInt();
            sc.nextLine();
        }


    }


}
