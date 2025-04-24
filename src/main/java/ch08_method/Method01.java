package ch08_method;

import java.util.Scanner;

public class Method01 {
    public static void call1() {
        System.out.println("[ x | x ]");
        System.out.println("call1() 타입의 method가 호출되었습니다.");
        System.out.println("수정되었습니다.");
    }
    public static void call2(String strExample) {
        System.out.println("[ o | x ]");
        System.out.println("오늘의 다짐 " + strExample);
    }
    public static String call3() {
        System.out.println("[ x | o ]");
        String result = "";
        for( int i = 0 ; i < 3 ; i++) {
            for(int j = 0 ; j < i+1 ; j++) {
                result += "😊";
            }
            result += "\n";
        }

        return result;
    }
    public static String call4(int year, int month, int date, String day) {
        System.out.println("[ o | o ]");
        return  year + "년 " + month + "월 " + date + "일 " + day + "요일";
    }
    public static String introduce(String name, int age) {
        return "제 이름은 " + name + "입니다. 나이는 " + age + "살 입니다." + "\n"
                + "내년에는 " + (age+1) + "살이 됩니다.";
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하고 엔터를 누르세요");
        String name = scanner.nextLine();
        System.out.println("나이를 입력하고 엔터를 누르세요");
        int age = scanner.nextInt();

        call1();
        call2("asdf");
        call3();
        System.out.println(call3());
        System.out.println(call4(2025,4,23,"목"));
        System.out.println(introduce(name, age));
    }
}