package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String [] args) {
        int [] numbers = {1, 4, 10, 2};
        double [] weights = {5, 1, 4, 6};
        int[] quantityOfNumbers = new int [numbers.length];
        double [] percentOfNumbers = new double[numbers.length];
        int i = 0, numberOfIterations = 10, resultNumber = 0;

        NumberGetter numberGetter = new NumberGetter(numbers, weights);

        do{
            resultNumber = numberGetter.getNumber();

            for(int j = 0; j < numbers.length; j++){
                if(resultNumber == numbers[j]){
                    quantityOfNumbers[j] = quantityOfNumbers[j] + 1;

                    break;
                }
            }

            i++;
        }while (i < numberOfIterations);

        for(int j = 0; j < percentOfNumbers.length; j++){
            percentOfNumbers[j] = quantityOfNumbers[j] * 100 / numberOfIterations;

           System.out.println("Число " + numbers[j] + " выпало " + quantityOfNumbers[j] + " раз из " + numberOfIterations + " (" + percentOfNumbers[j] + "%)");
       }
    }
}
