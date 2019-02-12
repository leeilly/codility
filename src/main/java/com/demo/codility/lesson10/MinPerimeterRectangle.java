package com.demo.codility.lesson10;

//rectangle: 직사각형
//perimeter: 둘레
public class MinPerimeterRectangle {

    public static void main(String[] args){

        int result =  solution(1000000000);
        System.out.println("result: " + result);
    }


    public static int solution(int N){

        int minPerimeter = 0;
        int A = 1;

        while( A <= N/A  ){

            if( N % A == 0) {
                int perimeter = 2 * (A + N/A);

                if (A == 1) minPerimeter = perimeter;
                else {

                    if (minPerimeter > perimeter) minPerimeter = perimeter;
                }
            }

            A++;
        }

        return minPerimeter;
    }
}
