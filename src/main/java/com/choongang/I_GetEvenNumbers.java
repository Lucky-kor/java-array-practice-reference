package com.choongang;

import java.util.Arrays;

import static java.util.Arrays.*;

public class I_GetEvenNumbers {
    public int[] getEvenNumbers(int[] arr) {
        int[] concatArray = new int[]{};

        if(arr.length == 0) {
            return new int[]{};
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                concatArray = copyOf(concatArray, concatArray.length + 1);
                concatArray[concatArray.length - 1] = arr[i];
            }
        }

        return concatArray;
    }
    // # 방법 2
    // 짝수의 개수만큼의 크기를 가진 배열을 선언한 후, 하나씩 입력하는 방법입니다.
	/*
	public int[] getEvenNumbers(int[] arr) {
		int count = 0;

		if(arr.length == 0) {
			return new int[]{};
		}

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				count++;
			}
		}

    int[] result = new int[count];
		count = 0;

		for(int j = 0; j < arr.length; j++) {
			if(arr[j] % 2 == 0) {
				result[count] = arr[j];
				count++;
			}
		}

		return result;
	}
	*/
}
