package ch15_casting.control;

public class LED implements Power{
    @Override
    public void on() {
        System.out.println("화면을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("화면을 끕니다.");
    }

    public void changeColor() {
        System.out.println("조명 색깔을 변경합니다.");
    }
}
