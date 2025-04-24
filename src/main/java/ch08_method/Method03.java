package ch08_method;

import java.util.Scanner;

public class Method03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몇 과목의 점수를 입력하시겠습니까");
        int counter = scanner.nextInt();

        float total = score(counter);
        System.out.println("총합은 " + total + "이며, 평균은 " + total/3 + "입니다.");
    }
    public static float score(int counter) {
        float sum=0;

        Scanner scanner = new Scanner(System.in);

        for(int i =0; i<counter; i++) {
            System.out.println((i+1)+"과목의 점수를 입력하세요");
            sum += scanner.nextFloat();
        }

        return sum;
    }
}
