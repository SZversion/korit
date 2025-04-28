package ch12_array;

import java.util.Arrays;
import java.util.Comparator;

public class Array09 {
    public static void main(String[] args) {
        Integer[] nums = {5,4,7,6,9,8,2,3,1};

        Arrays.sort(nums);
        Arrays.sort(nums, Comparator.reverseOrder());
        System.out.println(Arrays.toString(nums));
    }
}
