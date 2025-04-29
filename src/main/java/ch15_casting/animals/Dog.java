package ch15_casting.animals;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("개가 짖습니다.");
    }
    public void fetch() {
        System.out.println("개가 공을 물어 옵니다.");
    }
}