package LigaDePadel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by joaquin.lopez on 8/2/16.
 */
public class ejercicio {


    public static void main(String[] args) {
        //Creamos las variables
        //ArrayList de ganadores
        ArrayList<String> arrayList = new ArrayList<String>();

        //ArrayList de perdedores
        ArrayList<String> arrayListLoss = new ArrayList<String>();


        //Objeto Scanner, string "fin",contador de fin(para finalizar programas cuando sea igual a dos),variables de resultados para parsear los integers a String.
        Scanner sc = new Scanner(System.in);
        String str2 = "fin";
        String str = "";
        int contaFin = 0;
        int resultado1, resultado2;



        //do while, mientras contaFin sea menor que dos
        //lee una linea,separala por espacios y guardala en un array de Strings.
        //si la longitud del array == 1 y la posicion 0 del array de strings es igual a fin, contador de fin++.
            //sino reinicializar el contaFin a 0
                //si la longitud del array es mayor que 1, parsear la posicion 1 y 3 del array y guardarlos como int en resultado1 y resultado2.
                    //guardamos los resultados segun sea mayor o menor el resultado los jugadores en el arraylist de perdedores o ganadores.
        do {
            str = sc.nextLine();
            String[] arrays = str.split(" ");
            if (arrays.length == 1 && arrays[0].equals(str2)) {

                contaFin++;

            } else {
                contaFin = 0;

                if (arrays.length > 1) {
                    resultado1 = Integer.parseInt(arrays[1]);
                    resultado2 = Integer.parseInt(arrays[3]);
                    if (resultado1 > resultado2) {
                        arrayList.add(arrays[0]);
                        arrayListLoss.add(arrays[2]);

                    } else {
                        arrayList.add(arrays[2]);
                        arrayListLoss.add(arrays[0]);


                    }
                }
            }

        } while (contaFin < 2);









        HashMap<String,String> hashMap = new HashMap<String,String>();
        ArrayList<>
        for (int i : arrayList.toString()) {
            if (hashMap.get(i)==null) {
                hashMap.put(i,2);
            }else{
                hashMap.put(i,hashMap.get(i)+2);
            }

        }


        //   for (int i = 0; i < arrayList.size(); i++) {
        //     if (hashMap.containsValue(arrayList[i])) {
        //       hashMap.put(arrayList[i], +2);
        //  }
        //}
        // System.out.println(arrayList[1]);

    }
}

