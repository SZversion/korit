package ch12_array;

import java.util.Arrays;

/*
*   다차원 배열(Multi Demensional Array)중 2차원 배열 :
*   다차원 배열은 2차원 배열 이상을 의미하지만, 개발 환경 상 2차원 배열 이상을 다루는 경우는 극히 드물다
*
*   형식 :
*   int[][] arr01 = new int[10][10];
*   int[][] arr01 = new int[10][];
*   int[][] arr01 = {{1,2,3},{4,5,6},{7,8,9}};
*
*   2차원 배열 선언 시, 열(column)의 크기는 지정하지 않아도 되지만, 행(row)의 크기는 항상 지정해야 함
* */
public class Array07 {
    public static void main(String[] args) {
        int[][] arr01 = {
                {1,2},
                {3,4},
                {5,6}
        };

        System.out.println(Arrays.toString(arr01[2]));
    }
}
