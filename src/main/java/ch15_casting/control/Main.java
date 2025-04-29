package ch15_casting.control;

public class Main {
    public static void main(String[] args) {
        LED led1 = new LED();
        Mouse mouse1 = new Mouse();
        Computer computer1 = new Computer();
        CentralControl control = new CentralControl(new Power[5]);
        // CentralControl control = new CentralControl({led1, mouse1, computer1});
        // 생성자의 argument로 빈 배열을 집어넣는 것은 가능하지만 곧장 집어넣는데는 실패
        // element가 있는 배열을 바로 넣지는 못하니까
        // Power의 자식 클래스의 인스턴스들을 집어넣는 매서드를 정의  (CentralControl 에서)
        
        // Power[] powers = {led1, mouse1, computer1};
        // CentralControl control2 = new CentralControl(powers);
        // 이렇게 생성도 가능
        // 하지만 이 경우는 control2 객체를 만들자 마자 default 값이 들어가 있는것이므로 범용성이 떨어짐
        // Power를 상속받는 모든 클래스를 사용 가능하게 만드는게 목적이므로

        control.addDevice(computer1);
        control.addDevice(mouse1);
        control.addDevice(led1);
        control.powerOn();
        control.powerOff();

    }
}
