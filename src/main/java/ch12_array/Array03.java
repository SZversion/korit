package ch12_array;

import java.util.Arrays;
import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[4];
        for(int i=0; i< names.length; i++) {
            System.out.print("이름을 입력하세요 : ");
            names[i] = scanner.nextLine();
        }

        System.out.println(Arrays.toString(names));
    }
}
