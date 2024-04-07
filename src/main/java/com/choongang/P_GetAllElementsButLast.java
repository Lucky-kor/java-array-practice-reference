package com.choongang;

import java.util.Arrays;

public class P_GetAllElementsButLast {
    public int[] getAllElementsButLast(int[] arr) {
        if(arr.length == 0) {
            return new int[]{};
        }
        int[] result = Arrays.copyOfRange(arr, 0, arr.length - 1);
        return result;
    }
}
