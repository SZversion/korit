package ch07_loops;

import java.util.Scanner;

public class Loop06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();

        for( int i = 0 ; i < row ; i++) {
            for(int j = row ; j > i ; j--) {
                System.out.print("😊");
            }
            System.out.println();
        }
    }
}