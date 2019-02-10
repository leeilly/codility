package com.demo.codility.fibonacci;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ladder {
    public static void main(String[] args){
        int[] A = {4, 4, 5, 5, 1};
        int[] B = {3, 2, 4, 3, 1};
        int[] result = solution(A, B);
    }

    private static int[] solution(int[] A, int[] B) {

        int numberOfRequest = A.length;

        int maxFibIndex = 0;
        for(int i = 0; i < numberOfRequest; i++){
            if(maxFibIndex < A[i]) maxFibIndex = A[i];
        }
        int[] fibonacci = new int[maxFibIndex+1];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i <= maxFibIndex; i++) {
            fibonacci[i] = (fibonacci[i-1] + fibonacci[i-2]) % (1 << 30);
            // 1 << 3 -> bit operation 2^3
            // 2^30 = 1,073,741,824 (is under Integer.MAX_VALUE 2,147,483,647)
        }

        int[] result = new int[numberOfRequest];
        for (int i = 0; i < numberOfRequest; i++) {
            result[i] = fibonacci[A[i]] % (1 << B[i]);
        }

        return result;
    }
}
