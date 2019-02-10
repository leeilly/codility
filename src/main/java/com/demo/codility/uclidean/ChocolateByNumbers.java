package com.demo.codility.uclidean;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.HashMap;
import java.util.Map;

public class ChocolateByNumbers {
    public static void main(String[] args){
        int N = 10;
        int M = 4;
        int result = solution(N, M);
        System.out.print(result);
    }

    private static int solution(int N, int M) {
        int count = 0;

        if( N <= 0 || M <= 0 ) return count;

        int nTarget = N;
        while( N % M != 0 ){
            N = N % M;
            int temp = N;
            N = M;
            M = temp;  // gcd
        }
        count = nTarget / M;
        return count;
    }

}
