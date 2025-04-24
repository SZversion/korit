package ch08_method;

import java.util.Scanner;

public class Method04 {
    public static void main(String[] args) {
        calculate();
    }
// BMI = 체중(kg) / (신장(m)의 제곱)
//    저체중: 18.5 미만
//    정상: 18.5 - 22.9
//    과체중: 23.0 - 24.9
//    비만: 25.0 이상

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("키(cm)를 입력하세요");
        double height = scanner.nextDouble()/100;
        System.out.println("몸무게(kg)를 입력하세요");
        double weight = scanner.nextDouble();

        double bmiScore = weight/(height*height);
        String bmi = "";
        if(bmiScore < 18.5) {
            bmi = "저체중";
        }
        else if(18.5 <= bmiScore && bmiScore < 22.9) {
            bmi = "정상";
        }
        else if(22.9 <= bmiScore && bmiScore < 24.9) {
            bmi = "과체중";
        }
        else if(24.9 <= bmiScore) {
            bmi = "비만";
        }
        System.out.println("당신의 bmi 지수는 " + bmiScore + "이고, " + bmi + "입니다.");
    }
}
