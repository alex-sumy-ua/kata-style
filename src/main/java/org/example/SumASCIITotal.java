package org.example;

public class SumASCIITotal {

    public int sumASCII(String str) {
        int result = 0;
        // convert input String to char []
        char[] array = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = str.charAt(i);
        }
        // go through str, convert chars to int & sum them
        for (char ch : array) result += (int) ch;
        return result;
    }
}
