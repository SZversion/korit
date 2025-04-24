package ch07_loops;

import java.util.Scanner;

public class Loop08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 줄의 별을 찍겠습니까 : ");
        int row = scanner.nextInt();

        for( int i = 0 ; i < row ; i++) {
            for(int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for(int j = row ; j > i ; j--) {
                System.out.print("😊");
            }
            System.out.println();
        }

        System.out.println();

        for( int i = 0 ; i < row ; i++) {
            for(int k = row; k > i; k--) {
                System.out.print(" ");
            }
            for(int j = 0 ; j < i+1 ; j++) {
                System.out.print("😊");
            }
            System.out.println();
        }
    }
}