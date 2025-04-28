package ch12_array;
/*
*   배열의 출력
*   print(arr)의 형태로 배열을 출력하게 되면 배열은 참조변수이기 때문에 주소값만 출력됨
*   하지만 배열 전체를 확인하는 방법은 없음
*
*   Arrays 클래스를 사용해 정적 매서드 .toString()을 사용하면 배열 전체 출력 가능
* */

import java.util.Arrays;

public class Array08 {
    public static void main(String[] args) {
        String[] arr01 = {"김영","김일","김이","김삼"};
        double[][] arr02 = {{100.0, 99.4}, {64.2, 47.1}};

        System.out.println(Arrays.toString(arr02 ));        //1차 배열만 출력 가능
        System.out.println(Arrays.deepToString(arr02));     //다차원 배열 출력 가능
    }
}
