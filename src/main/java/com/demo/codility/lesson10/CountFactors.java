package com.demo.codility.lesson10;

import java.util.*;

/*
 * Prime And Composite Number.
 * Prime Number: 소수: 1과 자기 자신의 곱으로만 자신을 표현할 수 있는 수 (ex. 3 = 1 x 3 , 5 = 1 x 5, ..)
 * Composite Number: 합성수: 1과 자기 자신이 아닌 다른 자연수의 곱으로 나타낼 수 있는 자연수.
 * 소인수분해= 약수 구하기.
 * 약수의 개수 == 소인수분해한 결과, (지수+1) * (지수+1) * ..
 */
public class CountFactors {

    public static void main(String[] args){

        int result =  solution2(16);
        System.out.println("result: " + result);
    }


    //92%
    public static int solution2(int N){
        int count = 0;
        int candidate = 1;

        while(candidate * candidate <= N){
            if( N % candidate == 0 ){
                if( candidate * candidate == N ) count = count + 1;
                else count = count + 2;
            }
            candidate = candidate + 1;

        }


        return count;
    }


    //85%
    public static int solution(int N){


        int num = N;
        int d = 2;
        Map<Integer, Integer> map = new HashMap<>();
        while(num != 1){

            if( num % d  != 0 ) d++;

            if( num % d  == 0 ) {
                num = num/d;

                if ( map.containsKey(d) ) map.put(d, map.get(d) + 1);
                else map.put(d, 1);
            }
        }

        int count = 1;
        Iterator<Integer> it =  map.keySet().iterator();
        while(it.hasNext()){
            int key = it.next();
            count = count * (map.get(key) + 1);
        }

        return count;
    }
}
