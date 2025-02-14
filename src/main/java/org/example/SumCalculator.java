package org.example;

public class SumCalculator {

    public static int sumCalculatorDigits (int num) {

        int result = 0;

        //Si el número es 0, retorna 0
        if (num == 0) {
            return 0;
        } else {

            //Recorremos desde 1 hasta n
            for (int i = 1; i <= num; i++) {

                //Almacenamos la posicion (numero actual) en una variable temporal
                int n = i;

                //Descomponemos el numero en sus digitos para sumarlos
                while (n > 0) {

                    //Obtenemos el último numero del digito y lo sumamos a resultado
                    result += n % 10;

                    //Eliminamos el ultimo digito del numero
                    n /= 10;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        SumCalculator sumCalculator = new SumCalculator();

        int num = 4;

        System.out.println(sumCalculator.sumCalculatorDigits(num));
    }
}