package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationsTest {

    @Test
    @DisplayName("Testing sum of array's elements method")
    void sum() {
        Sum mo = new Sum();
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

        @Test
        @DisplayName("Testing mean of array's elements method")
        void mean() {
            Mean me = new Mean();
            int[] array1 = { 1, 2, 3 }; // should return 2
            int[] array2 = { 40, 16, 5, 8 }; // should return 17.25
            double res1 = 2;
            double res2 = 17.25;
            assertEquals(res1, me.mean(array1));
            assertEquals(res2, me.mean(array2));
        }

    @Test
    @DisplayName("Testing sumASCII - the sum of ASCII codes in the input String method")
    void sumASCIITest() {
        SumASCIITotal sa = new SumASCIITotal();
        String str1 = "northcoders"; // should return 1195
        String str2 = "Northcoders"; // should return 1163
        String str3 = "a"; // should return 97
        int res1 = 1195;
        int res2 = 1163;
        int res3 = 97;
        assertEquals(res1, sa.sumASCII(str1));
        assertEquals(res2, sa.sumASCII(str2));
        assertEquals(res3, sa.sumASCII(str3));

    }

    @Test
    @DisplayName("Testing EvaluateLecture.evaluate method")
    void evaluateTest() {
        EvaluateLecture el = new EvaluateLecture();

        PressResult[] prArray1 = new PressResult[] {PressResult.LIKE, PressResult.DISLIKE };
        PressResult[] prArray2 = new PressResult[] {PressResult.LIKE };
        PressResult[] prArray3 = new PressResult[] {PressResult.DISLIKE, PressResult.DISLIKE };

        PressResult return1 = PressResult.NEUTRAL;
        PressResult return2 = PressResult.LIKE;
        PressResult return3 = PressResult.NEUTRAL;

        assertEquals(return1, el.evaluate(prArray1));
        assertEquals(return2, el.evaluate(prArray2));
        assertEquals(return3, el.evaluate(prArray3));

    }

    @Test
    @DisplayName("Testing Rot13.code method")
    void codeTest() {
        Rot13 r13 = new Rot13();
        /*
        "northcoders" // should return "abegupbqref"
        "abegupbqref" // should return "northcoders"
        "I'm sure glad nobody can read my secret ROT13 code." // should return "V'z fher tynq abobql pna ernq zl frperg EBG13 pbqr."
         */
        String input1 = "northcoders";
        String input2 = "abegupbqref";
        String input3 = "I'm sure glad nobody can read my secret ROT13 code.";

        String output1 = "abegupbqref";
        String output2 = "northcoders";
        String output3 = "V'z fher tynq abobql pna ernq zl frperg EBG13 pbqr.";

        assertEquals(output1, r13.code(input1));
        assertEquals(output2, r13.code(input2));
        assertEquals(output3, r13.code(input3));

    }

}