package com.choongang;

import java.util.Arrays;

public class O_GetAllElementsButFirst {
    public int[] getAllElementsButFirst(int[] arr) {
        if(arr.length == 0) {
            return new int[]{};
        }
        int[] result = Arrays.copyOfRange(arr, 1, arr.length);
        return result;
    }
}
