package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeros {

    public static void moveZeros(Object[] array) {

        //Convertimos el array a ArrayList para su manipulacion
        List<Object> arrayList = new ArrayList<>(Arrays.asList(array));

        //Variable para llevaar la cuenta de los ceros existentes
        int zeroCount = 0;

        //Recorremos el arraylist
        for (int i = 0; i < arrayList.size(); i++) {

            //Si el elemento es 0...
            if (arrayList.get(i).equals(0)) {

                //Borramos el elemento
                arrayList.remove(i);

                //Reajustamos el indice del bucle
                i--;

                //Incrementamos la cuenta de ceros
                zeroCount++;
            }
        }

        //Añadimos el numero de 0s correspondientes al final del arraylist
        for (int j = 0; j < zeroCount; j++) {
            arrayList.add(0);
        }

        //Transformamos de nuevo el arraylist a array
        Object[] result = arrayList.toArray(new Object[arrayList.size()]);

        System.out.println(Arrays.toString(result));
    }

    
    public static void main(String[] args) {

        Object [] array = {false, 1, 0, 1, 2, 0, 1, 3, "a"};
        moveZeros(array);

    }
}
