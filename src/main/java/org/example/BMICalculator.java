package org.example;

public class BMICalculator {

    public static String calculateBMI (double weight, double height) {
        double BMIresult =  weight / (height * height);

        if (BMIresult <= 18.5) {
            return "Infrapeso";
        }
        else if (BMIresult <= 25.0) {
            return "Normal";
        }
        else if (BMIresult <= 30.0) {
            return "Sobrepeso";
        }
        else {
            return "Obeso";
        }
    }

    public static void main(String[] args) {

        BMICalculator bmiCalculator = new BMICalculator();

        double weight = 72.5;
        double height = 1.73;

        System.out.println(bmiCalculator.calculateBMI(weight, height));
    }
}
