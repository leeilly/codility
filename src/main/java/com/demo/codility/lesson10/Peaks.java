package com.demo.codility.lesson10;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//peaks 봉우리
public class Peaks {

    public static void main(String[] args){

        int[] A = {1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};

        int result =  solution(A);
        System.out.println("result: " + result);
    }


    /*
     *  균등하게 나누려면 약수로 나눠야 함.
     *  피크의 위치를 구하고..
     *  약수로 나누면서, 피크가 하나라도 있는지 확인
     */
    public static int solution(int[] A) {

        List<Integer> peakIndexList = new ArrayList<>();

        for(int i=1; i<A.length-1; i++){
            if(A[i-1] < A[i] && A[i] > A[i+1]) peakIndexList.add(i);
        }

        List<Integer> devideNumberList = new ArrayList<>();

        int all = A.length;
        int n = 2;
        while( n <= all/n ){
            if(all % n == 0) {
                devideNumberList.add(n);
                devideNumberList.add(all / n);
            }
            n++;
        }

        int findCount = 0;

        Object[] groupNumberArr = devideNumberList.toArray();
        Arrays.sort(groupNumberArr);
        int pre = 0;
        for(Object groupNumber : groupNumberArr ){

            int[] sub = Arrays.copyOfRange(A, pre, (Integer) groupNumber);
            if( )




        }



        System.out.println();


        return 0;
    }
}
