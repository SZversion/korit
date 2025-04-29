package ch15_casting.control;

public class Mouse implements Power{
    @Override
    public void on() {
        System.out.println("마우스를 켭니다");
    }

    @Override
    public void off() {
        System.out.println("마우스를 끕니다");
    }

    public void move() {
        System.out.println("마우스가 움직입니다.");
    }
}
