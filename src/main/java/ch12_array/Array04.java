package ch12_array;

import java.util.Scanner;

public class Array04 {
    public void writeNames(String[] names) {
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<names.length; i++) {
            System.out.print((i+1) + "번째 이름을 입력 하세요 : ");
            names[i] = scanner.nextLine();
        }
        System.out.println();
    }
    public void printNames(String[] names) {
        for(int i=0; i<names.length; i++) {
            System.out.print((i+1)+"번째 이름 : ");
            System.out.println(names[i]);
        }
        System.out.println();
    }
    void printNames(int[] names) {
        for(int i=0; i<names.length; i++) {
            System.out.print((i+1)+"번째 숫자 : ");
            System.out.println(names[i]);
        }
        System.out.println();
    }






    public static void main(String[] args) {
        Array04 array04 = new Array04();
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 명의 학생을 입력하시겠습니까 : ");

        int numOfStudents = scanner.nextInt();
        String[] names =  new String[numOfStudents];

        array04.writeNames(names);
        array04.printNames(names);

        int[] num = {0,1,2,3,4,5,6,7,8,9};
        array04.printNames(num);
    }
}
