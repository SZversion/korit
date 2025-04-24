package ch09_classes;

public class Car {
    String color;
    int speed;
    int maxSpeed;

    public void setInfo(String color, int speed, int maxSpeed) {
        this.color = color;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }

    public void drive() {
        speed += 50;
        if(speed > maxSpeed) {
            speed = maxSpeed;
        }
        System.out.println("현재 자동차의 속력은 " + speed + "입니다.");
    }

    public void speed(String color, int maxSpeed) {
        System.out.println(color + "색의 자동차가 달리고 있습니다.");
        System.out.println("자동차의 최고 속도는 " + maxSpeed + "입니다.");
    }

    public void brake() {
        speed -= 10;
        System.out.println("현재 자동차의 속력은 " + speed + "입니다.");
    }

    public void displayInfo() {
        System.out.println("이 차의 색깔은" + color + "색이고,");
        System.out.print("최고 속도는" + maxSpeed + "입니다.");

        System.out.println(
                (maxSpeed < 100)
                ? "그럭저럭입니다."
                : "빠릅니다.");
    }
}
