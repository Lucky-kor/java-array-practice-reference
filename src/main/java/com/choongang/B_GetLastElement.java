package com.choongang;

public class B_GetLastElement {
    public int getLastElement(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        return arr[arr.length - 1];
    }
}
