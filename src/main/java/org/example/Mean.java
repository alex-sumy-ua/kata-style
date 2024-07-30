package org.example;

public class Mean {
    //get int array return double
    public double mean(int[] array) {
        // create and initiliase double result
        double result = 0;
        // go through array and sum all the values
        for(int i : array) {
            result += i;
        }
        // calculate result and divide the sum to the array length
        result /= array.length;
        // return result
        return result;

    }
}
