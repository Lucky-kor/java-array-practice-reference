package com.choongang;

public class F_GetAllLetters {
    public char[] getAllLetters(String str) {
        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        return arr;
    }
}
