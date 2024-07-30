package org.example;

public class Sum {

    public int sum(int[] array) {
        int result = 0;
        if (array == null) return result;
        // create vars max & min
        int min = array[0];
        int max = array[0];
        // go through array & sum all values
        for (int i : array) {
            result += i;
            // determin min and max
            if (min < i) min = i;
            if (max > i) max = i;
        }
        // go through array again & exclude min and max from the result
        for (int i : array) {
            if (min != max) {
                if (i == min) result -= min;
                if (i == max) result -= max;
            } else if (i == min) result -= max;
        }
        return result;
    }
}
