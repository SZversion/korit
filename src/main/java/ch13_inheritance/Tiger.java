package ch13_inheritance;
/*
*   super 키워드의 두가지 사용 방식
*   1. super() : 부모 클래스의 생성자를 호출하는 키워드 / 기본 생성자라면 () 내부에 아무런 값이 없고, 매개변수 생성자라면 () 내에 매개변수들이 포함됨
*   2. super.매서드명() : 부모 클래스의 매서드를 호출하는 키워드
* */

public class Tiger extends Animal{
    //부모의 필드를 그대로 사용 할 수 있지만 자ㅣㄱ 클래스만의 고유한 필드를 가질 수도 있습니다.
    private boolean striped;

    public boolean isStriped() {
        return striped;
    }

    public Tiger() {
    }

    public Tiger(String animalName, int animalAge, boolean striped) {
        super(animalAge, animalName);  
        this.striped = striped;
    }

    public void setStriped(boolean striped) {
        this.striped = striped;
    }

    @Override
    public void move() {
        super.move();
        System.out.println("네 발로 걷습니다.");
        //super는 부모 클래스의 객체를 의미함
        //위 코드는 부모 클래스인 Animal 클래스의 move()매서드를 호출한다는 의미로 볼 수 있음
    }

    public void hunt() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}
