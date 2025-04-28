package ch12_array;

import java.util.Arrays;

public class Array10 {
    public static void main(String[] args) {
        int[][] nums = new int[20][5];

        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums[i].length; j++) {
                nums[i][j] = i*5+(j+1);
            }
        }

        System.out.println(Arrays.deepToString(nums));

        for(int[] num : nums) {
            System.out.println(Arrays.toString(num));
        }
    }
}
