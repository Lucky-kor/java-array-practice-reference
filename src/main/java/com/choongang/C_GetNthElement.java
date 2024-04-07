package com.choongang;

public class C_GetNthElement {
    public int getNthElement(int[] arr, int index) {
        if (arr.length == 0) {
            return -1;
        } else if (arr.length - 1 < index) {
            return -2;
        } else {
            return arr[index];
        }
    }
}
