package ch08_method;

import java.util.Scanner;

public class Method02 {
    public static void introduce() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하고 엔터를 누르세요");
        String name = scanner.nextLine();
        System.out.println("주소를 입력하고 엔터를 누르세요");
        String address = scanner.nextLine();
    }
    public static void registerStudent(int counter) {
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<counter; i++) {
            System.out.println("학번을 입력하고 엔터를 누르세요");
            String stdNum = scanner.nextLine();
            System.out.println("이름을 입력하고 엔터를 누르세요");
            String name = scanner.nextLine();

            System.out.println("학번 : " + stdNum);
            System.out.println("이름 : " + name);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몇명의 학생을 등록하시겠습니까");
        int counter = scanner.nextInt();
        registerStudent(counter);
    }
}
