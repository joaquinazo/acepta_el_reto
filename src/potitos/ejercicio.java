package potitos;

import java.util.ArrayList;
import java.util.Scanner;

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
        ArrayList<String> like = new ArrayList<String>();
        ArrayList<String> unlike = new ArrayList<String>();

        do {
            cantidad = sc.nextInt();
            if (cantidad > 0) {
                for (int i = 0; i < cantidad; i++) {

                    String str = sc.nextLine().toLowerCase();
                    String[] arrayS = str.split(" ");
                    if (arrayS[0].equals(si)) {
                        for (int j = 1; j < arrayS[1].length() + 1; j++) {
                            like.add(arrayS[j]);
                        }

                    } else {
                        for (int j = 0; j < arrayS[1].length() + 1; j++) {
                            unlike.add(arrayS[j]);
                        }
                    }
                }
            }else{
                fin++;
            }


        } while (fin > 0);
    }


}
