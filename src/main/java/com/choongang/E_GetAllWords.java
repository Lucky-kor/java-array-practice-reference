package com.choongang;

public class E_GetAllWords {
    public String[] getAllWords(String str) {
        if (str.isEmpty()) {
            return new String[]{};
        }

        return str.split(" ");
    }
}
