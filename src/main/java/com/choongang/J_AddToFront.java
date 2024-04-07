package com.choongang;

public class J_AddToFront {
    public int[] addToFront(int[] arr, int el) {
        int[] result = new int[arr.length + 1];
        result[0] = el;

        System.arraycopy(arr, 0, result, 1, arr.length);

        return result;
    }
}
