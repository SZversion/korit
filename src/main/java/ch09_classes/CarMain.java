package ch09_classes;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        car1.setInfo("노랑", 0, 150);

        car1.drive();
        car1.drive();
        car1.drive();
        car1.brake();
        car1.brake();
        car1.brake();
        car1.displayInfo();
    }
}
