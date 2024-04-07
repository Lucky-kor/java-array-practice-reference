package com.choongang;

public class K_AddToBack {
    public int[] addToBack(int[] arr, int el) {
        int[] result = new int[arr.length + 1];
        result[arr.length] = el;

        System.arraycopy(arr, 0, result, 0, arr.length);

        return result;
    }

}
