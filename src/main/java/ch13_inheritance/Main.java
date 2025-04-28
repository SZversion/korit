package ch13_inheritance;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAnimalName("김호섭");
        human1.setAnimalAge(27);
        human1.getAnimalName();
        human1.getAnimalAge();
        human1.move();
        human1.read("자바의 기초");
    }
}
