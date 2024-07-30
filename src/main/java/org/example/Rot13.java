package org.example;

public class Rot13 {

    public String code(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            sb.append(codeChar(input.charAt(i)));
        }
        return sb.toString();
    }

    private char codeChar(char ch) {
        int tmp;
        tmp = (int) ch;
        if (tmp >= 65 && tmp <= 90) {
            tmp += 13;
            if (tmp > 90) tmp -= 26;
        }
        if (tmp >= 97 && tmp <= 122) {
            tmp += 13;
            if (tmp > 122) tmp -= 26;
        }
        return (char)tmp;
    }

}
