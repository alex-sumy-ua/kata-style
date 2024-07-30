package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationsTest {

    @Test
    @DisplayName("Testing sum of array's elements method")
    void sum() {
        MathOperations mo = new MathOperations();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 25};
        int result = 44;
        assertEquals(result, mo.sum(array));

        int[] arr1 = {5, 2, 6, 10, 22 }; // should return 21 (5 + 6 + 10)
        int[] arr2 = {1, 2, 3, 4, 5 }; // should return 9 (2 + 3 + 4)
        int[] arr3 = { 1 }; // should return 0
        int[] arr4 = null; // should return 0
        int[] arr5 = { 1, 2 }; // should return 0
        int[] arr6 = {1, 2, 3}; // should return 2
        int res1 = 21;
        int res2 = 9;
        int res3 = 0;
        int res4 = 0;
        int res5 = 0;
        int res6 = 2;
        assertEquals(res1, mo.sum(arr1));
        assertEquals(res2, mo.sum(arr2));
        assertEquals(res3, mo.sum(arr3));
        assertEquals(res4, mo.sum(arr4));
        assertEquals(res5, mo.sum(arr5));
        assertEquals(res6, mo.sum(arr6));

    }
}