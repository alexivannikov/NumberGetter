package com.company;

import java.util.Random;

/*Класс возвращает число в соответствии с его весом*/
public class NumberGetter {
    private int [] numbers;
    private double [] weights;

    public NumberGetter(int [] numbers, double [] weights){
        this.numbers = numbers;
        this.weights = weights;
    }

    public int getNumber(){
        Random rand = new Random();
        double [] intervals = new double [weights.length + 1];
        int currentSum = 0, resultNumber = 0;
        double randomNumber = 0;
        boolean conditionIsMet = false;

        intervals[0] = 0;

        for(int i = 0; i < weights.length; i++){
            currentSum += weights[i];

            intervals[i + 1] = currentSum;
        }

        randomNumber = rand.nextDouble() * currentSum;

        for(int i = 0; i < intervals.length - 1; i++){
            if(randomNumber > intervals[i] && randomNumber <= intervals[i + 1]){
                conditionIsMet = true;
                resultNumber = numbers[i];

                break;
            }
        }

        if(conditionIsMet == false){
            System.err.println("Неизвестная ошибка");
        }

        return resultNumber;
    }
}
