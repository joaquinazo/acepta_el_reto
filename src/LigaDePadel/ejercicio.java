package LigaDePadel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by joaquin.lopez on 8/2/16.
 */
public class ejercicio {


    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String str2 = "fin";
        String str = "";
        int contaFin = 0;
        int resultado1, resultado2;
        do {
            str = sc.nextLine();
            String[] arrays = str.split(" ");
            if (arrays.length == 1 && arrays[0].equals(str2)) {

                contaFin++;

            } else {
                contaFin=0;

                if (arrays.length > 1) {
                    resultado1 = Integer.parseInt(arrays[1]);
                    resultado2 = Integer.parseInt(arrays[3]);
                    if (resultado1 > resultado2) {
                        arrayList.add(arrays[0]);

                    } else {
                        arrayList.add(arrays[2]);
                    }
                }
            }

        } while (contaFin < 2);
        HashMap<String> hasmap = new HashMap<Integer>();

       // for (int i = 0; i < arrayList.size() ; i++) {
         //   if ()
           // hasmap.put()
       // }
        System.out.println(arrayList[1]);

    }
}

