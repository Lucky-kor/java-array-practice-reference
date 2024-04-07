package com.choongang;

public class H_GetLongestWord {
    public String getLongestWord(String str) {
        String[] words = str.split(" ");

        String max = words[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > max.length()) {
                max = words[i];
            }
        }

        return max;
    }
}
