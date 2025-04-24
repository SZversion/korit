package ch09_classes;

import java.util.Scanner;

public class ClassAMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassA classA3 = new ClassA();

        System.out.println("이름을 입력하세요");
        classA3.name = scanner.nextLine();
        System.out.println("번호을 입력하세요");
        classA3.number = scanner.nextInt();
        System.out.println("점수을 입력하세요");
        classA3.score = scanner.nextDouble();

        classA3.displayProfile();
    }
}
