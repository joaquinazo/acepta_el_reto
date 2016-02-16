package abdicacionRey;

import java.util.*;

/**
 * Creado por Javier
 */


public class ejercicio {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numReyes = 0;
        String linea;
        String[] reyes;
        HashMap<String, Integer> dinastia = new HashMap<String, Integer>();
        boolean blFin = false;
        while (!blFin) {

            numReyes = Integer.parseInt(scan.nextLine());
            if (numReyes == 0) {
                blFin = true;
            } else {
                linea = scan.nextLine();
                reyes = linea.split(" ");

                for (int i = 0; i < reyes.length; i++) {
                    int nRey = dinastia.get(reyes[i]);
                    nRey++;
                    dinastia.put(reyes[i], nRey);

                }

            }

        }
        System.out.println(dinastia);
    }

}

