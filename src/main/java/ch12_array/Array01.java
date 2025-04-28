package ch12_array;


import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        String[] arr2 = new String[4];
        arr2[0] = "김일";
        arr2[1] = "김이";
        arr2[2] = "김삼";
        arr2[3] = "김사";

        System.out.println(Arrays.toString(arr1));

        for(int i=0; i<arr1.length; i+=2) {
            System.out.println(arr1[i]);
        }
        for(int i=arr2.length-1; i>=0; i--) {
            System.out.println(arr2[i]);
        }
    }
}