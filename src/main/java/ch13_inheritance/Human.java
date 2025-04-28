package ch13_inheritance;
/*
*   1.Animal 클래스를 상속 받으시오
*   2. 기본 생성자를 이용하여 main 에서 human1 객체를 생성하시오
*   3. setter를 활용하여 animalName에 여러분 이름 / animalAge에 여러분 나이를 작성하시오.
*   4. getter를 재정의하여 getAnimalName()을 호출했을 때,
*       안녕하세요. 제 이름은 ___ 입니다. 라고 출력 될 수 있도록 작성
*   5. getter를 재정의하여 getAnimalAge()를 호출 했을 때,
*       올해 제 나이는 _살입니다. 내년에는 _+1살이 됩니다. 라고 출력 될 수 있도록 작성
*   6. move() 매서드를 재정의하여
*       사람이 두 발로 걷습니다. 라고 출력 되도록 작성
*   7. Human 클래스의 고유 매서드인 read() 매서드를 call2() 유형으로 정의
*       human1.read("자바의 기초") 라고 실행 했을 시
*       ___은 자바의 기초를 읽는 중입니다. 라고 출력 될 수 있도록 작성
*/
public class Human extends Animal{
    Animal animal = new Animal();
    public Human() {

    }
    @Override
    public String getAnimalName() {
        System.out.println("안녕하세요 제 이름은 " + super.getAnimalName() + "입니다.");
        return super.getAnimalName();
    }
    @Override
    public int getAnimalAge() {
        System.out.println("제 나이는 " + super.getAnimalAge() + "살 입니다. 내년에는 " + (super.getAnimalAge()+1) + "살이 됩니다.");
        return super.getAnimalAge();
    }
    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }
    public void read(String book) {
        System.out.println(super.getAnimalName()+ "은 자바의 기초를 읽는 중입니다.");
    }
}
